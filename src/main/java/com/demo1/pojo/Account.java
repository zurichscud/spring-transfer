package com.demo1.pojo;

import org.springframework.stereotype.Component;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 10:48
 * @Description: TODO
 */
@Component("account")
public class Account {
    private Integer userId;
    private Integer money;

    public Account() {
    }

    public Account(Integer userId, Integer money) {
        this.userId = userId;
        this.money = money;
    }

    /**
     * 获取
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * @return money
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    public String toString() {
        return "Account{userId = " + userId + ", money = " + money + "}";
    }
}
