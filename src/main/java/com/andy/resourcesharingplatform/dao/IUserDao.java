package com.andy.resourcesharingplatform.dao;

import com.andy.resourcesharingplatform.domain.user.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户持久接口
 * @author Andy
 * @date 2017/11/06 16:57
 */
public interface IUserDao {
    /**
     * 插入用户
     * @param user 用户对象
     * @return
     */
    int insertUser(User user);
    /**
     * 更新用户
     * @param user 更新的用户信息
     * @return
     */
    int updateUser(User user);
    /**
     * 查询用户
     * @param user 用户查询参数集
     * @return
     */
    User queryUser(User user);
}
