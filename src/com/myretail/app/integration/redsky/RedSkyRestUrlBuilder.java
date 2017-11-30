package com.myretail.app.integration.redsky;


public class RedSkyRestUrlBuilder {
	
	public static String getRedSkyProductNameUrl(String productId){
		StringBuilder sb = new StringBuilder();
		sb.append(RedSkyPropertiesConfig.getServerURL());
		sb.append(productId);
		return sb.toString();
	}
	
	public static String getRedSkyProductNameWithExclusionsUrl(String productId, String[] exclusions){
		StringBuilder sb = new StringBuilder();
		sb.append(RedSkyPropertiesConfig.getServerURL());
		sb.append(productId);
		//TODO: Convert the string array to comma separated exclusions list
		sb.append("?excludes=").append(exclusions.toString());
		return sb.toString();
	}
	
	public static String getFinalUrl(String productId) {
		StringBuilder sb = new StringBuilder();
		sb.append(RedSkyPropertiesConfig.getServerURL());
		sb.append(productId);
		sb.append("?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics");
		return sb.toString();
	}
}
