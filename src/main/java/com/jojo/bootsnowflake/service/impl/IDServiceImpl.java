package com.jojo.bootsnowflake.service.impl;

import com.jojo.bootsnowflake.componet.IDGenaretorSnowFlake;
import com.jojo.bootsnowflake.service.IDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Easy
 * @date 2023/3/24 10:47
 * @revision 0.1 version
 */
@Service
public class IDServiceImpl implements IDService {

  @Autowired
  private IDGenaretorSnowFlake idGenaretor;

  @Override
  public Long getUniqueIdBySnowFlake() {

    return idGenaretor.snowFlakeId();
  }
}
