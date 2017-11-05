package com.andy.resourcesharingplatform.domain.resource;

/**
 * 资源类型
 * @author Andy
 * @date 2017/11/05 22:47
 */
public class ResourceType {
    /**
     * 资源类型ID
     */
    private int id;
    /**
     * 资源类型名
     */
    private String name;

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

    @Override
    public String toString() {
        return "ResourceType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
