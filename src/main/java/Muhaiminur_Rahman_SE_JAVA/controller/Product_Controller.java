package Muhaiminur_Rahman_SE_JAVA.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Muhaiminur_Rahman_SE_JAVA.model.Product_Info;
import Muhaiminur_Rahman_SE_JAVA.repository.Product_Info_Rep;

@RestController
@RequestMapping("/customer")
public class Product_Controller {
	
	@Autowired
	Product_Info_Rep rp;
	
	@RequestMapping("/findall")
    @ResponseBody
	public List<Product_Info> findall(){
		return rp.findAll();
	}
	

}
