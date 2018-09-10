package com.zjc.springbootdemoserver.service.impl;

import com.zjc.springbootdemoserver.entity.InfoKk;
import com.zjc.springbootdemoserver.mapper.InfoKkMapper;
import com.zjc.springbootdemoserver.service.InfoKkServie;
import com.zjc.springbootdemoserver.util.RedisUtil;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.web.server.LocalManagementPort;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Log
@Service
public class InfoKkServieImpl implements InfoKkServie {
	@Resource
	private InfoKkMapper infoKkMapper;
	@Resource
	private RedisUtil redisUtil;

	@Override
	public int deleteByPrimaryKey(String id) {
		return 0;
	}

	@Override
	public int insert(InfoKk record) {
		return 0;
	}

	@Override
	public int insertSelective(InfoKk record) {
		return 0;
	}

	@Override
	public InfoKk selectByPrimaryKey(String id) {
		String key = "kk_" + id;
//缓存不存在
		boolean haskey = redisUtil.hasKey(key);
		if (haskey) {
			InfoKk infoKk = (InfoKk) redisUtil.get(key);
			log.info("##op=start_selectByPrimaryKey>>从缓存读取" + infoKk.toString());
			return infoKk;
		}
		InfoKk infoKk = infoKkMapper.selectByPrimaryKey(id);
		if (infoKk != null) {
			redisUtil.set(key, infoKk);
			log.info("##op=start_selectByPrimaryKey>>插入缓存" + infoKk.toString());
		}
		return infoKk;
	}

	@Override
	public int updateByPrimaryKeySelective(InfoKk record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(InfoKk record) {
		return 0;
	}
}
