package com.zjc.springbootdemoserver.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjc.springbootdemoserver.dubbo.UserDubboService;
import com.zjc.springbootdemoserver.entity.InfoKk;
import com.zjc.springbootdemoserver.service.InfoKkServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = UserDubboService.class,retries = 0)
@Component
public class UserDubboServiceImpl implements UserDubboService {
	@Autowired
	private InfoKkServie servie;

	@Override
	public InfoKk getInfoKk(String id) {
		return servie.selectByPrimaryKey(id);
	}
}
