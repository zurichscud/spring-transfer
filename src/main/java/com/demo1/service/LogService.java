package com.demo1.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 12:05
 * @Description: TODO
 */

public interface LogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(Integer outUser, Integer inUser, Integer money, Boolean flag);
}
