package com.vishal.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vishal.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product p = new Product();
		p.setId(1);
		p.setName("Iphone");
		p.setDescription("It's costly");
		p.setPrice(850);
		dao.create(p);
		Product p1 = dao.read(1);

		assertNotNull(p1);
		assertEquals(1, p1.getId());

	}

}
