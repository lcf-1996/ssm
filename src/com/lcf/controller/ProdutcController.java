package com.lcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lcf.pojo.Product;
import com.lcf.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProdutcController {
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/list.do")
	public ModelAndView list() {
		Product product = productService.list(6);
		ModelAndView mv = new ModelAndView();	
		mv.addObject("product", product);
		mv.setViewName("product/list");
		return mv;
	}
}
