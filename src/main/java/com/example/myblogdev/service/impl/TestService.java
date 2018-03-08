package com.example.myblogdev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myblogdev.entity.t_attach;
import com.example.myblogdev.mapper.t_attachMapper;

@Service
public class TestService {
	
	@Autowired
	t_attachMapper taMapper;
	
	public t_attach test(Integer id){
		return taMapper.selectByPrimaryKey(id);
	}

}
