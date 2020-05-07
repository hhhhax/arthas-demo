package com.hax.demo.config;

import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.hax.demo.mapper","com.hax.demo.mapperExtend"})
//@org.mybatis.spring.annotation.MapperScan({"com.yoe.app.mapper.**"})
public class MyBatisConfig {

}
