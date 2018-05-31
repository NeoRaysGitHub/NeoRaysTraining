package com.neorays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.neorays.beans.Product;

@Path("products")
public class ProductResource {
	
	@GET
	@Produces("application/json")
	public Product searchProducts(){
		
		Product product=new Product();
		product.setPid(101);
		product.setPname("mouse");
		product.setPrice(1200);
		return product;
		
		
	}

}
