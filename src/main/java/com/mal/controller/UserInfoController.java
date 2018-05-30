package com.mal.controller;

import com.mal.entity.UserInfo;
import com.mal.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by user on 2018/5/28.
 */
@RestController
//@Controller
//@ResponseBody
public class UserInfoController {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping(value = "/getAllUserInfo")
    public List<UserInfo> getUserInfo(){
        return userInfoRepository.findAll();
    }

    @PostMapping(value = "/saveUserInfo")
     public UserInfo saveUserInfo(@RequestParam("name") String name, @RequestParam("age") Integer age){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(age);
        userInfo.setName(name);
        return userInfoRepository.save(userInfo);
    }

    @GetMapping(value = "/getFindOne/{id}")
    public UserInfo getFindOne(@PathVariable("id") Integer id){
        return userInfoRepository.findOne(id);
    }

    @PutMapping(value = "/updateById/{id}")
    public UserInfo updateById(@PathVariable("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setAge(age);
        userInfo.setName(name);
        return userInfoRepository.save(userInfo);
    }

    @DeleteMapping(value = "/delById/{id}")
    public void delById(@PathVariable("id") Integer id){
        userInfoRepository.delete(id);
    }
}
