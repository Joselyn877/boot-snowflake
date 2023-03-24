package com.jojo.bootsnowflake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot集成HuTool工具包+Twitter雪花算法生成全局唯一ID
 */
@SpringBootApplication
public class BootSnowflakeApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootSnowflakeApplication.class, args);
  }

}
