package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.SiteSetting;
import com.Lyu.LyuBlog.service.SiteSettingService;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class SiteSettingServiceImpl implements SiteSettingService {
    @Override
    public Map<String, List<SiteSetting>> getList() {
        return null;
    }

    @Override
    public Map<String, Object> getSiteInfo() {
        return null;
    }

    @Override
    public String getWebTitleSuffix() {
        return null;
    }

    @Override
    public void updateSiteSetting(List<LinkedHashMap> siteSettings, List<Integer> deleteIds) {

    }
}
