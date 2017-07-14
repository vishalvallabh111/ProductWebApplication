package com.vishal.product.bo;

import com.vishal.product.dto.Product;

public interface ProductBO {

	void create(Product p);
	Product findProduct(int id);
}
