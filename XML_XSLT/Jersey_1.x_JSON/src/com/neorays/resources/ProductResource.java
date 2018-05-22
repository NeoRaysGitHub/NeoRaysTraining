package com.neorays.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.neorays.beans.Product;

@Path("products")
public class ProductResource {
	
	@GET
	@Produces("application/json")
	@Path("searchProduct")
	public Product searchProducts(){
		
		Product product=new Product();
		product.setPid(101);
		product.setPname("Harishankar");
		product.setPrice(123.0);
		
		return product;
	}
}
