package com.monster.mybatis;

import com.monster.mybatis.mapper.UserMapper;
import com.monster.mybatis.model.SysRole;
import com.monster.mybatis.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @Author wuhan
 * @Date 2019/12/5 17:41
 */
public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testSelectById() {
        SqlSession sqlSession = getSqlSession();

        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = userMapper.selectById(1l);
            Assert.assertNotNull(user);
            Assert.assertEquals("admin", user.getUserName());
            System.out.println("result:" + user);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();

        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysUser> userList = userMapper.selectAll();
            Assert.assertNotNull(userList);
            Assert.assertTrue(userList.size() > 0);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectRoleByUserId() {
        SqlSession sqlSession = getSqlSession();

        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysRole> userList = userMapper.selectRoleByUserId(1l);
            Assert.assertNotNull(userList);
            Assert.assertTrue(userList.size() > 0);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testInsert() {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = new SysUser();
            user.setUserName("test1");
            user.setUserPassword("123456");
            user.setUserEmail("test@monster.cn");
            user.setUserInfo("test info");
            user.setHeadImg(new byte[]{1,2,3});
            user.setCreateTime(new Date());
            //执行的SQL影响的行数
            int result = userMapper.insert(user);
            //只插入1条数据
            Assert.assertEquals(1, result);
            //id 为 null ，没有给 id 赋佳，并且没有配直回写 id 的值
            Assert.assertNull(user.getId());
        } finally {
            // sqlSession.rollback();
            sqlSession.close();
        }
    }
}
