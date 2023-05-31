package com.miniProggram.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: huangS
 * @ClassName: MiniProggramBackSystemApplication
 * @Description: TODO
 * @DateTime: 2023/5/31-10:40
 * @Version: 1.0
 **/
@SpringBootApplication(scanBasePackages = "com.miniProggram")
@MapperScan("com.miniProggram.dao.mapper")
public class MiniProgramBackSystemApplication {
    public static void main(String[] args) {
        try{
            SpringApplication.run(MiniProgramBackSystemApplication.class,args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
