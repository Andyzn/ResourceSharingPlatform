package com.andy.resourcesharingplatform.dao.impl;

import com.andy.resourcesharingplatform.dao.IUserDao;
import com.andy.resourcesharingplatform.domain.user.User;
import org.springframework.stereotype.Repository;

/**
 * @author Andy
 * @date 2017/11/07 11:12
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements IUserDao{

    @Override
    public int insertUser(User user) {
        return sqlSession.insert("IUserDao.insertUser",user);
    }

    @Override
    public int updateUser(User user) {
        return sqlSession.update("IUserDao.updateUser",user);
    }

    @Override
    public User queryUser(User user) {
        User result = null;
        try {
            result = sqlSession.selectOne("IUserDao.queryUser",user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
