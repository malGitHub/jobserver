package com.mal.repository;

import com.mal.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 2018/5/30.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
