package com.andy.resourcesharingplatform.dao;

import com.andy.resourcesharingplatform.MySpringBootTest;
import com.andy.resourcesharingplatform.domain.user.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Andy
 * @date 2017/11/07 15:02
 */
public class IUserDaoTest extends MySpringBootTest {

    @Autowired
    private IUserDao userDao;

    @Test
    @Transactional
    public void insertUser() throws Exception {
        User paramUser = new User();
        paramUser.setUsername("123");
        paramUser.setPassword("321");
        paramUser.setMailAddress("123@qq.com");
        int result = userDao.insertUser(paramUser);
        assertEquals(true,paramUser.getId() > 0);
    }

    @Test
    @Transactional
    public void updateUser() throws Exception {
        User paramUser = new User();
        paramUser.setId(2);
        paramUser.setUsername("qwe");
        paramUser.setPassword("12awd3");
        paramUser.setMailAddress("32aa1@qq.com");
        int result = userDao.updateUser(paramUser);
        User user = userDao.queryUser(paramUser);
        assertArrayEquals(new Object[]{
                1,
                paramUser.getId(),
                paramUser.getUsername(),
                paramUser.getPassword(),
                paramUser.getMailAddress()
        },new Object[]{
                result,
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getMailAddress()
        });
    }

    @Test
    public void queryUser() throws Exception {
        User paramUser = new User();
        paramUser.setId(1);
        User user = userDao.queryUser(paramUser);
        assertEquals(paramUser.getId(),user.getId());
    }

}