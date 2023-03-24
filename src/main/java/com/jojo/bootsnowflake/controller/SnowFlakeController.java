package com.jojo.bootsnowflake.controller;

import com.jojo.bootsnowflake.service.IDService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Easy
 * @date 2023/3/24 10:43
 * @revision 0.1 version
 */
@RestController
@Slf4j
public class SnowFlakeController {

  @Autowired
  private IDService service;

  @GetMapping("/uniqueId")
  public Long createUniqueId(){
      return service.getUniqueIdBySnowFlake();
  }
}
