package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.dao.ProductDao;
import com.product.entity.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDao dao;

	@RequestMapping("/getproduct")
	public String getProduct(Integer id, ModelMap map) {

		Product product = dao.getProduct(id);

		map.addAttribute("product", product);

		return "product";

	}

	@RequestMapping("/getproducts")
	public String getProducts(ModelMap map) {

		List<Product> products = dao.getProducts(0, 100);

		if (products.isEmpty())
			return null;

		map.addAttribute("products", products);
		
		return "products";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}