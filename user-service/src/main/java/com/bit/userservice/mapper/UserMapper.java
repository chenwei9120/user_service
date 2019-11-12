package com.bit.userservice.mapper;

import org.springframework.stereotype.Repository;
import com.bit.model.DevUser;
/**
 * UserMapper继承基类
 */
@Repository
public interface UserMapper extends MyBatisBaseMapper<DevUser, Integer> {
}