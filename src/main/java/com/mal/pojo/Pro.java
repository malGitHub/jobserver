package com.mal.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 2018/5/28.
 */
@Component
@ConfigurationProperties(prefix = "pro")
public class Pro {
    private String pro1;

    private Integer pro2;

    public String getPro1() {
        return pro1;
    }

    public void setPro1(String pro1) {
        this.pro1 = pro1;
    }

    public Integer getPro2() {
        return pro2;
    }

    public void setPro2(Integer pro2) {
        this.pro2 = pro2;
    }
}
