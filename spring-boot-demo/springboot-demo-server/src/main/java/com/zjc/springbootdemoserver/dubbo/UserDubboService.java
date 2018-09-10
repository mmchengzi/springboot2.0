package com.zjc.springbootdemoserver.dubbo;

import com.zjc.springbootdemoserver.entity.InfoKk;

public interface UserDubboService {
	InfoKk getInfoKk(String id);
}
