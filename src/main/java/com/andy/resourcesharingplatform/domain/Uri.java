package com.andy.resourcesharingplatform.domain;

/**
 * 资源定位标识对象
 * @author Andy
 * @date 2017/11/05 22:51
 */
public class Uri {
    /**
     * 资源标识UUID
     */
    private String id;
    /**
     * 资源路径
     */
    private String path;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Uri{" +
                "id='" + id + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
