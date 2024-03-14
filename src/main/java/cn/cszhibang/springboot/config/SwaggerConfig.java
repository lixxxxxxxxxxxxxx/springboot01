package cn.cszhibang.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
@EnableOpenApi
public class SwaggerConfig {
     /**
      * 创建API应用
      * apiInfo() 增加API相关信息
      * @return
      */
     @Bean
     public Docket createRestApi() {
         return new Docket(DocumentationType.OAS_30)	// 定义文档格式
                 // 通过调用自定义方法apiInfo，获得文档的主要信息
                 .apiInfo(apiInfo())
                 // 接口前缀
                 .pathMapping("/")
                 // 通过select()返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现
                 // 选择那些路径和api会生成document
                 .select()
                 // 扫描所有包中的Swagger注解，对所有API进行监控
                 .apis(RequestHandlerSelectors.any())
                 // 扫描指定包中的Swagger注解，对反映定包中的API进行监控
                 //.apis(RequestHandlerSelectors.basePackage("com.manubao.demo.controller"))
                 // 对所有路径进行监控
                 .paths(PathSelectors.any())
                 // 使用正则表达式匹配规则，去掉Swagger界面上的basic-error-controller
                 // negate()表示否定
                 .paths(PathSelectors.regex("/error").negate())
                 .build();
     }


     /**
      * 创建该API的基本信息（这些基本信息会展现在文档页面中）
      * 访问地址：http://项目实际地址/doc.html
      * @return
      */
     private ApiInfo apiInfo() {
         return new ApiInfoBuilder()
                 // 接口文档标题
                 .title("接口文档")
                 // 接口文档的相关描述
                 .description("接口文档描述")
                 // 接口文档联系人(用户名，URL，邮箱)
                 .contact(new Contact("旭哥", "http://www.manubao.com", "4977332@qq.com"))
                 // 版本
                 .version("1.0")
                 // 服务条款URL
                 // .termsOfServiceUrl("")
                 // 许可证
                 // .license("证666666")
                 // 许可证URL
                 .licenseUrl("http://localhost:8082/")
                 .build();
     }
}