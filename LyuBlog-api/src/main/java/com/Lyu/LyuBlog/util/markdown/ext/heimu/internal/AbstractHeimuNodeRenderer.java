package com.Lyu.LyuBlog.util.markdown.ext.heimu.internal;

import com.Lyu.LyuBlog.util.markdown.ext.heimu.Heimu;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;

import java.util.Collections;
import java.util.Set;

public class AbstractHeimuNodeRenderer implements NodeRenderer {
    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        return Collections.<Class<? extends Node>>singleton(Heimu.class);
    }

    @Override
    public void render(Node node) {

    }


}
