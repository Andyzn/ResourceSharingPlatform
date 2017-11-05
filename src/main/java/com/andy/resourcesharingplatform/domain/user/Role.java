package com.andy.resourcesharingplatform.domain.user;

/**
 * 用户角色
 * @author Andy
 * @date 2017/11/05 23:18
 */
public class Role {
    /**
     * 角色ID
     */
    private int id;
    /**
     * 角色名称
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
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
