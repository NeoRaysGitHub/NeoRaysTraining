package com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.rest.bean.Product;

@Path("products")
public class ProductResource {
	@GET 
	@Produces("application/json")
	@Path("searchProduct")
	public Product searchProduct(){
		Product product = new Product();
		product.setPid(100);
		product.setPname("Pen");
		product.setPrice(50);
		return product;
	}
}
