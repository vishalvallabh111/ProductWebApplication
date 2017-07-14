package com.vishal.products.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.vishal.product.bo.ProductBO;
import com.vishal.product.dto.Product;

/**
 * Servlet implementation class DisplayProductsServlet
 */
@WebServlet
public class DisplayProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		ProductBO bo = (ProductBO) context.getBean("productbo");
		Product p = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product ID:" + p.getId());
		out.print("Product Name:" + p.getName());
		out.print("Product Description:" + p.getDescription());
		out.print("Product Price:" + p.getPrice());
	}

}
