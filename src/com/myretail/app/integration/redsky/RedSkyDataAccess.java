package com.myretail.app.integration.redsky;

import com.myretail.app.core.RestCoreService;

public class RedSkyDataAccess {
	
	public static String getProductNameById(String productId) throws Exception
	{
		String sessionUrl = RedSkyRestUrlBuilder.getFinalUrl(productId);
		try {
			RedSkyProductResponse response = (RedSkyProductResponse) RestCoreService.getResponse(sessionUrl, RedSkyProductResponse.class);
			//Should do appropriate null chekcs in production
			return response.getProduct().getItem().getProduct_description().getTitle();
			
		} catch (Exception e) {
			// Log the exception and throw some custom exception
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
	// Write all the methods here that integrate with RedSky Source as single entry data point.

}
