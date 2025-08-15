package org.example.javaapr25springcontroller.repository;

import org.example.javaapr25springcontroller.entity.Product;
import org.example.javaapr25springcontroller.util.SqlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class ProductRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Product> getAllProducts() {

		RowMapper rowMapper = new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				Product product = new Product();
				product.setProductId(rs.getInt("PRODUCT_ID"));
				product.setProductName(rs.getString("PRODUCT_NAME"));
				product.setProductDesc(rs.getString("PRODUCT_DESC"));

				return product;
			}
		};

		List<Product> products = jdbcTemplate.query(SqlConstants.FETCH_PRODUCT, rowMapper);
		return products;
	}
}