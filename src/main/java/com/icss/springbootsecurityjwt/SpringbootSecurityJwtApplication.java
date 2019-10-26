package com.icss.springbootsecurityjwt;



import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.icss.springbootsecurityjwt.mapper")
public class SpringbootSecurityJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurityJwtApplication.class, args);
    }

}
