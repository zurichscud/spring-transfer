package com.demo1.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 10:54
 * @Description: TODO
 */

public interface AccountService {
    @Transactional(rollbackFor = IOException.class)
    void transferMoney(Integer gUser, Integer tUser, Integer money) throws Exception;
}
