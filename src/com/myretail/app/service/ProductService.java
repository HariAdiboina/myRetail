package com.myretail.app.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.myretail.app.integration.datastore.NoSQLDataAccess;
import com.myretail.app.integration.redsky.RedSkyDataAccess;
import com.myretail.app.model.Pricing;
import com.myretail.app.response.BaseResponse;
import com.myretail.app.response.ProductResponse;

@Path("/api/v1/products")
public class ProductService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public ProductResponse getProductById(@PathParam("id") String id) {
		ProductResponse response = new ProductResponse();

		try {
			String productName = RedSkyDataAccess.getProductNameById(id);
			Pricing price = NoSQLDataAccess.getPricingInfo(id);

			response.setId(id);
			response.setName(productName);
			response.setCurrent_price(price);

		} catch (Exception e) {
			// log the exception here
			e.printStackTrace();
			// return Error Response
			response.setErrorCode(1);
			response.setErrorMessage(e.getMessage());
		}
		return response;
	}

	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public BaseResponse updateProductById(@PathParam("id") String id, Pricing pricing) {
		BaseResponse response = new BaseResponse();
		try {
			NoSQLDataAccess.updatePricingInfo(id, pricing);
		} catch (Exception e) {
			// log the exception here
			e.printStackTrace();
			// return Error Response
			response.setErrorCode(1);
			response.setErrorMessage(e.getMessage());
		}

		return response;
	}
}
