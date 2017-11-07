package com.andy.resourcesharingplatform.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Mybatis数据访问超类
 * @author Andy
 * @date 2017/11/07 11:13
 */
public abstract class BaseDao implements InitializingBean{
    @Autowired
    protected SqlSessionFactory sqlSessionFactory;
    /**
     * Mybatis数据库会话对象
     */
    protected SqlSession sqlSession;

    /**
     * 初始化该Bean时即对sqlSession赋值
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        sqlSession = sqlSessionFactory.openSession();
    }
}
