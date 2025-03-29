package com.demo.shop.shopdemoserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mtx
 */
@SpringBootApplication
@MapperScan("com.demo.shop.shopdemoserver.DAO")
public class ShopDemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopDemoServerApplication.class, args);
    }

}
