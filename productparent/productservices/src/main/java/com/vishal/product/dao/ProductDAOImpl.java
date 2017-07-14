package com.vishal.product.dao;

import java.util.*;

import com.vishal.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {

	Map<Integer, Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);

	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {

	}

	@Override
	public void delete(int id) {

	}

}
