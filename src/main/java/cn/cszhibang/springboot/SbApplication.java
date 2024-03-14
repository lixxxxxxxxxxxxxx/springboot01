package cn.cszhibang.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@MapperScan("cn.cszhibang.springboot.mapper")
@ComponentScan("cn.cszhibang")
@EnableWebMvc
@EnableOpenApi
public class SbApplication {
    public static void main(String[] args) {
        SpringApplication.run(SbApplication.class,args);
    }

}
