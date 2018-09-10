package com.zjc.springbootdemoserver.service;

import com.zjc.springbootdemoserver.entity.InfoKk;
import org.springframework.stereotype.Service;

public interface InfoKkServie {
    int deleteByPrimaryKey(String id);

    int insert(InfoKk record);

    int insertSelective(InfoKk record);

    InfoKk selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InfoKk record);

    int updateByPrimaryKey(InfoKk record);
}