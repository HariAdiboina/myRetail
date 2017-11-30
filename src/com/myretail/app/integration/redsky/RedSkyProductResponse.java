package com.myretail.app.integration.redsky;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedSkyProductResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RedSkyProductSubResponse product;

	public RedSkyProductSubResponse getProduct() {
		return product;
	}

	public void setProduct(RedSkyProductSubResponse product) {
		this.product = product;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class RedSkyProductSubResponse implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private RedSkyItemResponse item;

		public RedSkyItemResponse getItem() {
			return item;
		}

		public void setItem(RedSkyItemResponse item) {
			this.item = item;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class RedSkyItemResponse implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private RedSkyItemDescription product_description;

		public RedSkyItemDescription getProduct_description() {
			return product_description;
		}

		public void setProduct_description(RedSkyItemDescription product_description) {
			this.product_description = product_description;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class RedSkyItemDescription implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

}
