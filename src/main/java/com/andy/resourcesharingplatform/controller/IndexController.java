package com.andy.resourcesharingplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页面控制器
 * @author Andy
 * @date 2017/11/07 11:26
 */
@Controller()
@RequestMapping("/")
public class IndexController {

    /**
     * 主页直接跳转到登陆界面
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "page/account/login.html";
    }
}
