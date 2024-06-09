package com.Lyu.LyuBlog.config;

import com.Lyu.LyuBlog.entity.LoginLog;
import com.Lyu.LyuBlog.entity.User;
import com.Lyu.LyuBlog.exception.BadRequestException;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.LoginLogService;
import com.Lyu.LyuBlog.util.IpAddressUtils;
import com.Lyu.LyuBlog.util.JacksonUtils;
import com.Lyu.LyuBlog.util.JwtUtils;
import com.Lyu.LyuBlog.util.StringUtils;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class JwtLoginFilter extends AbstractAuthenticationProcessingFilter {
    LoginLogService loginLogService;
    ThreadLocal<String> currentUsername = new ThreadLocal<String>();


    protected JwtLoginFilter(String defaultFilterProcessesUrl, AuthenticationManager authenticationManager, LoginLogService loginLogService) {
        super(new AntPathRequestMatcher(defaultFilterProcessesUrl));
        setAuthenticationManager(authenticationManager);
        this.loginLogService = loginLogService;}

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        try {
            if (!"POST".equals(httpServletRequest.getMethod())) {
                throw new BadRequestException("请求方法错误");
            }
            User user = JacksonUtils.readValue(httpServletRequest.getInputStream(), User.class);
            currentUsername.set(user.getUsername());
            return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        } catch (BadRequestException exception) {
            httpServletResponse.setContentType("application/json;charset=utf-8");
            Result result = Result.create(400, "非法请求");
            PrintWriter out = httpServletResponse.getWriter();
            out.write(JacksonUtils.writeValueAsString(result));
            out.flush();
            out.close();
        }
        return null;
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        String jwt = JwtUtils.generateToken(authResult.getName(), authResult.getAuthorities());
        response.setContentType("application/json;charset=utf-8");
        User user = (User) authResult.getPrincipal();
        user.setPassword(null);
        Map<String, Object> map = new HashMap<>(4);
        map.put("user", user);
        map.put("token", jwt);
        Result result = Result.ok("登录成功", map);
        PrintWriter out = response.getWriter();
        out.write(JacksonUtils.writeValueAsString(result));
        out.flush();
        out.close();
        LoginLog log = handleLog(request, true, "登录成功");
        loginLogService.saveLoginLog(log);
    }



    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                              AuthenticationException exception) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        String msg = exception.getMessage();
        //登录不成功时，会抛出对应的异常
        if (exception instanceof LockedException) {
            msg = "账号被锁定";
        } else if (exception instanceof CredentialsExpiredException) {
            msg = "密码过期";
        } else if (exception instanceof AccountExpiredException) {
            msg = "账号过期";
        } else if (exception instanceof DisabledException) {
            msg = "账号被禁用";
        } else if (exception instanceof BadCredentialsException) {
            msg = "用户名或密码错误";
        }
        PrintWriter out = response.getWriter();
        out.write(JacksonUtils.writeValueAsString(Result.create(401, msg)));
        out.flush();
        out.close();
        LoginLog log = handleLog(request, false, StringUtils.substring(msg, 0, 50));
        loginLogService.saveLoginLog(log);
    }

    private LoginLog handleLog(HttpServletRequest request, boolean status, String description) {
        String username = currentUsername.get();
        currentUsername.remove();
        String ip = IpAddressUtils.getIpAddress(request);
        String userAgent = request.getHeader("User-Agent");
        LoginLog log = new LoginLog(username, ip, status, description, userAgent);
        return log;
    }
}
