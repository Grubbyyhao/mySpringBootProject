package com.xiong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihao
 * @date 2020/12/22
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public Object index() {
        return "{'name':'熊哥', 'desc':'帅哥一个'}";
    }
}
