package com.zjc.springbootdemoserver.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.wordnik.swagger.annotations.*;
import com.zjc.springbootdemoapi.User;
import com.zjc.springbootdemoserver.dubbo.UserDubboService;
import com.zjc.springbootdemoserver.entity.InfoKk;
import com.zjc.springbootdemoserver.service.InfoKkServie;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.web.server.LocalManagementPort;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.bind.annotation.*;

@RestController
@Log
@RequestMapping("/infokk")
@Api(value="用户controller",description="用户操作")
public class TestController {
	@Autowired
	private InfoKkServie servie;

	@ApiOperation("获取用户信息")
	@GetMapping("/test")
	public String test() {
		User user = new User();
		return user.toString();
	}
	@ApiOperation(value = "根据id查询学生的信息",notes = "查询数据库中某个学生的信息")
	@GetMapping(value = "test/{id}")
	public InfoKk getInfoKk(@ApiParam(value = "id") @PathVariable("id") String id) {
		return servie.selectByPrimaryKey(id);
	}

}
