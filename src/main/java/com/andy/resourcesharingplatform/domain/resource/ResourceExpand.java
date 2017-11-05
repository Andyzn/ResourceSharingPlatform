package com.andy.resourcesharingplatform.domain.resource;


import com.andy.resourcesharingplatform.domain.Uri;

/**
 * 资源扩展名
 * @author Andy
 * @date 2017/11/05 22:49
 */
public class ResourceExpand {
    /**
     * 资源扩展名ID
     */
    private int id;
    /**
     * 资源扩展名后缀
     */
    private String name;
    /**
     * 扩展名图标URI
     */
    private Uri icoURI;

    @Override
    public String toString() {
        return "ResourceExpand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icoURI=" + icoURI +
                '}';
    }
}
