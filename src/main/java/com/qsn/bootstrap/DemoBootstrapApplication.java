package com.qsn.bootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qsn.bootstrap.modules.dao")
@SpringBootApplication
public class DemoBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBootstrapApplication.class, args);
    }

}
