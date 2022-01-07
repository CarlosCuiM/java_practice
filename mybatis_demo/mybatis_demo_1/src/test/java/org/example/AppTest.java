package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.session.SqlSession;
import org.example.pojo.Product;
import org.example.pojo.User;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSeesion();
        Product product =new Product(1,"car",10000);
//        Product product = new Product();
//        product.setId(1);
//        product.setName("car");
//        product.setPrice(10000);
        sqlSession.insert("addProduct",product);
        sqlSession.commit();
    }
}

