package com.myretail.client.testcases;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.myretail.app.core.RestCoreService;
import com.myretail.app.model.Pricing;
import com.myretail.app.response.BaseResponse;
import com.myretail.app.response.ProductResponse;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyRetailTest {
	
	private static final String URL = "http://localhost:8084/api/v1/products";

	@Before
	public void setup() {
		// TODO
	}

	@Test
	public void testgetProductById() throws Exception {
		String GET_URL = URL+"/13860428";
		
		ProductResponse response = (ProductResponse) RestCoreService.getResponse(GET_URL, ProductResponse.class);
		Assert.assertNotNull(response);
		Assert.assertEquals("Product Title Matches", "The Big Lebowski (Blu-ray)",response.getName());
	}
	
	@Test
	public void testupdateProductById() throws Exception {
		String GET_URL = URL+"/13860428";
		Pricing pricing = new Pricing();
		pricing.setValue(new BigDecimal(23.56));
		pricing.setCurrency_code("EU");
		BaseResponse response = (BaseResponse) RestCoreService.putResponse(GET_URL, pricing, BaseResponse.class);
		Assert.assertNotNull(response);
		ProductResponse getResponse = (ProductResponse) RestCoreService.getResponse(GET_URL, ProductResponse.class);
		Assert.assertNotNull(getResponse);
		Assert.assertEquals("Product Title Matches", "The Big Lebowski (Blu-ray)",getResponse.getName());
		Assert.assertEquals("Price Matches",23.56, getResponse.getCurrent_price().getValue().doubleValue(),0.0001);
	}

}
