package com.andy.resourcesharingplatform.domain.resource;


import com.andy.resourcesharingplatform.domain.Uri;

import java.util.UUID;

/**
 * 资源类
 * @author Andy
 * @date 2017/11/05 22:44
 */
public class Resource {
    /**
     * 资源ID，UUID表示
     */
    private int id;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 资源描述
     */
    private ResourceInfo resourceInfo;
    /**
     * 资源类型
     */
    private ResourceType resourceType;
    /**
     * 资源扩展名
     */
    private ResourceExpand resourceExpand;
    /**
     * 资源URI
     */
    private Uri uri;

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

    public ResourceInfo getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(ResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceExpand getResourceExpand() {
        return resourceExpand;
    }

    public void setResourceExpand(ResourceExpand resourceExpand) {
        this.resourceExpand = resourceExpand;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", resourceInfo=" + resourceInfo +
                ", resourceType=" + resourceType +
                ", resourceExpand=" + resourceExpand +
                ", uri=" + uri +
                '}';
    }
}
