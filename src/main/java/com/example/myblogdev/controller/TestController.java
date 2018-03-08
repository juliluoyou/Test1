package com.example.myblogdev.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myblogdev.entity.t_attach;
import com.example.myblogdev.service.impl.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Resource
	TestService testService;
	
	@ResponseBody
	@RequestMapping("/t")
	public t_attach test(){
		t_attach t1 = testService.test(1);
		return t1;
	}

}
