package com.indian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.indian.model.Shop;

@Controller
@RequestMapping("/kfc/brands")
public class JSONcontroller {  
	@RequestMapping(value="{name}" ,method=RequestMethod.GET)
public @ResponseBody
Shop getShopInJSON(@PathVariable String name){
		Shop shop=new Shop();
		shop.setName(new String[]{"mkyoung1","mkyoung2"});
		return shop;
	}
}
