package com.qltc.quanlitieccuoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.qltc.quanlitieccuoi.*")
@SpringBootApplication
public class  QuanLiTiecCuoiApplication{

    public static void main(String[] args) {
        SpringApplication.run(QuanLiTiecCuoiApplication.class, args);
    }

}
