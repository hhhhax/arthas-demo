package com.hax.demo.mapperExtend;

import com.hax.demo.core.mapper.Mapper;
import com.hax.demo.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface ExtUserMapper {

    @Select("select * from  user where id=#{id}")
    User selectById(Integer id);
}