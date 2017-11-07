package com.andy.resourcesharingplatform;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Andy
 * @date 2017/11/07 20:29
 */
// SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
// 指定我们SpringBoot工程的Application启动类
@org.springframework.boot.test.context.SpringBootTest(classes = ResourceSharingPlatformApplication.class)
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
//@WebAppConfiguration
public class MySpringBootTest {
}
