package com.example.myblogdev.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myblogdev.entity.t_attach;
import com.example.myblogdev.service.impl.TestService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/")
public class TestController {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());  
    protected final ObjectMapper objectMapper = new ObjectMapper();  
	
	@Resource
	TestService testService;
	
	@ResponseBody
	@RequestMapping("/t")
	public t_attach test(){
		logger.trace("I am trace log.");  
        logger.debug("I am debug log.");  
        logger.warn("I am warn log.");  
        logger.error("I am error log.");  
		t_attach t1 = testService.test(1);
		return t1;
	}
	
	@RequestMapping("index")
	public String index(Map<String, Object> map){
		map.put("hello", "this is a thymeleaf test");
        return "/index";
	}

}
