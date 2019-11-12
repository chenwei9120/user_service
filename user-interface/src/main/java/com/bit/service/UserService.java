package com.bit.service;

import com.bit.model.DevUser;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2019年11月12日 22:16:00
 */
public interface UserService {
    DevUser getUserById(Long id);
}