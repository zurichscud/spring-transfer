package com.demo1.service;

import com.demo1.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 12:05
 * @Description: TODO
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper mapper;

    @Override
    public void log(Integer outUser, Integer inUser, Integer money, Boolean flag) {
        mapper.addLog("转账操作：" + outUser + "-->" + inUser + "金额：" + money, flag);
    }
}
