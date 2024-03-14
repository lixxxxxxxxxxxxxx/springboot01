package cn.cszhibang.springboot.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class User {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;

}
