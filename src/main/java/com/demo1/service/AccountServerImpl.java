package com.demo1.service;

import com.demo1.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 10:59
 * @Description: TODO
 */
@Service
public class AccountServerImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private LogService logService;

    @Override
    public void transferMoney(Integer inUser, Integer outUser, Integer money) throws Exception {
        boolean flag = false;
        try {
            accountMapper.inMoney(inUser, money);
//            if (true) throw new IOException();
            accountMapper.outMoney(outUser, money);
            flag = true;
        } finally {
            logService.log(outUser, inUser, money, flag);
        }

    }
}
