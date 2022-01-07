package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.pojo.Product;
import org.example.pojo.User;
import org.example.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SqlSession sqlSession = MybatisUtils.getSqlSeesion();
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        map.put("price",20000);
        sqlSession.update("updateProductPrice",map);
        sqlSession.commit();
    }
}
