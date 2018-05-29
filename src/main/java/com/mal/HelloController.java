package com.mal;

import com.mal.pojo.Pro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2018/5/28.
 */
@RestController
public class HelloController {
    @Value("${size}")
    private String size;
    @Value("${content}")
    private String content;
    @Autowired
    private Pro pro;

    @RequestMapping(value = "/hello")
    public String Say(){
//        return size;
//        return content;
        return pro.getPro1();
    }
}
