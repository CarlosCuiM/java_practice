package com.helloworld.demo1;



import com.helloworld.demo1.controller.HelloController;
import com.helloworld.demo1.pojo.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;

@SpringBootTest
class Demo1ApplicationTests {
    @Test
    void contextLoads() {
        Person px = new Person();
        px.setAge(10);
        px.setName("px");
        System.out.println(px.toString());
    }

}
