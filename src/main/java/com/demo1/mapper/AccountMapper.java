package com.demo1.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 10:49
 * @Description: TODO
 */
@Repository
public interface AccountMapper {
    @Update("update account set money=money+ #{money} where userid=#{userid}")
    void inMoney(@Param("userid") Integer id, @Param("money") Integer money);

    @Update("update account set money=money- #{money} where userid=#{userid}")
    void outMoney(@Param("userid") Integer id, @Param("money") Integer money);
}
