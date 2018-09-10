package com.zjc.springbootdemoserver.mapper;

import com.zjc.springbootdemoserver.entity.InfoKk;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@SuppressWarnings("rawtypes")
@Repository
public interface InfoKkMapper {
    int deleteByPrimaryKey(String id);

    int insert(InfoKk record);

    int insertSelective(InfoKk record);

    InfoKk selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InfoKk record);

    int updateByPrimaryKey(InfoKk record);
}