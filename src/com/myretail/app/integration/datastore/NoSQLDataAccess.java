package com.myretail.app.integration.datastore;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.myretail.app.model.Pricing;

public class NoSQLDataAccess {
	
	private static Map<String,Pricing> productPricings = new HashMap<>();
	
	static {
		productPricings.put("13860428", new Pricing(new BigDecimal(13.79),"USD"));
		productPricings.put("16483589", new Pricing(new BigDecimal(14.79),"USD"));
		productPricings.put("16696652", new Pricing(new BigDecimal(15.79),"USD"));
		productPricings.put("16752456", new Pricing(new BigDecimal(16.79),"USD"));
		productPricings.put("15643793", new Pricing(new BigDecimal(17.79),"USD"));
		productPricings.put("15898654", new Pricing(new BigDecimal(18.79),"USD"));
		productPricings.put("17856874", new Pricing(new BigDecimal(19.79),"USD"));
		productPricings.put("14587985", new Pricing(new BigDecimal(20.79),"USD"));
	}
	
	// If it's oracle, we look up for the datasource and perform sql operations
	// here.

	public static Pricing getPricingInfo(String productId) {
		// Lookup for NoSQL data source and peform the necessary select operation from the database.
		Pricing pricing = productPricings.get(productId);
		return pricing;
	}
	
	public static void updatePricingInfo(String productId, Pricing pricing) {
		productPricings.put(productId, pricing);
	}

}
