package com.mal.controller;

import com.mal.pojo.Pro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by user on 2018/5/28.
 */
@RestController
//@Controller
//@ResponseBody
public class ProController {
    @Autowired
    private Pro pro;

    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
//    @PostMapping
    public String Say(@RequestParam(value = "id", required = false, defaultValue = "0") String id){
//        return size;
//        return content;
        return pro.getPro1();
    }
}
