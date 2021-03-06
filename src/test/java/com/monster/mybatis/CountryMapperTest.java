package com.monster.mybatis;

import com.monster.mybatis.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author wuhan
 * @Date 2019/12/5 14:32
 */
public class CountryMapperTest extends BaseMapperTest {

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> countryList = sqlSession.selectList("com.monster.mybatis.mapper.CountryMapper.selectAll");
            printCountryList(countryList);
        } finally {
            sqlSession.close();
        }
    }

    private void printCountryList(List<Country> countryList) {
        for (Country country: countryList) {
            System.out.printf("%-2d%5s%5s\n", country.getId(), country.getCountryName(), country.getCountryCode());
        }
    }
}
