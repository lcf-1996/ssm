package com.lcf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcf.mapper.ProductMapper;
import com.lcf.pojo.Product;
import com.lcf.service.IProductService;
import com.lcf.util.MyBatisUtil;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public Product list(int id) {
		return productMapper.list(id);
	}

}
