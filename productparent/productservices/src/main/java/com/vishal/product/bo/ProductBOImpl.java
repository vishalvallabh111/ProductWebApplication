package com.vishal.product.bo;

import com.vishal.product.dao.ProductDAO;
import com.vishal.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	ProductDAO dao;
	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public void create(Product p) {
		dao.create(p);	
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
