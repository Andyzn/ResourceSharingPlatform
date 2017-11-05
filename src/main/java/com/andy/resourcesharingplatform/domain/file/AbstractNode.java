package com.andy.resourcesharingplatform.domain.file;

/**
 * 树节点
 * @author Andy
 * @date 2017/11/05 22:53
 */
public abstract class AbstractNode {
    /**
     * 树节点ID
     */
    private int id;
    /**
     * 树节点名称
     */
    private String name;
    /**
     * 父节点
     */
    private AbstractNode parent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractNode getParent() {
        return parent;
    }

    public void setParent(AbstractNode parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "AbstractNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent=" + parent +
                '}';
    }
}
