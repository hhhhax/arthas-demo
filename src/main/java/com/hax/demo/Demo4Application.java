package com.hax.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo4Application {


    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
        new Thread(() -> {
            try {
                MathGame.start();
            } catch (InterruptedException e) {
                System.out.println("抛出异常！！！！！！！");
            }
        }).run();
        log.info("DEMO服务启动成功！温馨提示：代码千万行，注释第一行，命名不规范，同事泪两行");
    }


}
