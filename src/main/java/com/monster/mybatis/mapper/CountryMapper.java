package com.monster.mybatis.mapper;

import com.monster.mybatis.model.Country;

import java.util.List;

/**
 * @Author wuhan
 * @Date 2019/12/5 15:04
 */
public interface CountryMapper {

    List<Country> selectAll();
}
