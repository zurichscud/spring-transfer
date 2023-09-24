package com.demo1.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 12:03
 * @Description: TODO
 */
@Repository
public interface LogMapper {
    @Insert("insert into log(message,date,type) values(#{message},now(),#{flag})")
    void addLog(@Param("message") String message, @Param("flag") Boolean flag);
}
