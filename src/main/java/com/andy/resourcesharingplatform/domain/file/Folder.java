package com.andy.resourcesharingplatform.domain.file;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹节点
 * @author Andy
 * @date 2017/11/05 22:55
 */
public class Folder extends AbstractNode {
    /**
     * 子节点集合
     */
    private List<AbstractNode> children = new ArrayList();

    public List<AbstractNode> getChildren() {
        return children;
    }

    public void setChildren(List<AbstractNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "children=" + children +
                '}';
    }
}
