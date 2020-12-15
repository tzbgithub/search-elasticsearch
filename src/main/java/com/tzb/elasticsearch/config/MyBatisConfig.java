package com.tzb.elasticsearch.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * Create by zhatang on 2020/12/8.
 */
@Component
@MapperScan({"com.tzb.elasticsearch.mapper","com.tzb.elasticsearch.dao"})
public class MyBatisConfig {
}
