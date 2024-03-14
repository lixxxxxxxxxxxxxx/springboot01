package cn.cszhibang.springboot.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestPropertySource("classpath:application.yml")
class AccountTest {

    @Value("${user.name}")
    private String name;

    @Test
    public void show(){
//        User user = new User();
        System.out.println(name);
    }

}