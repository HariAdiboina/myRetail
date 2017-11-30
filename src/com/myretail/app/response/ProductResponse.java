package com.myretail.app.response;

import com.myretail.app.model.Pricing;

public class ProductResponse extends BaseResponse {
	
	private String id;
	
	private String name;
	
	private Pricing current_price;

	public ProductResponse() {
		super();
	}
	
	public ProductResponse(String id, String name, Pricing current_price) {
		super();
		this.id = id;
		this.name = name;
		this.current_price = current_price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pricing getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(Pricing current_price) {
		this.current_price = current_price;
	}

	@Override
	public String toString() {
		return "ProductResponse [id=" + id + ", name=" + name
				+ ", current_price=" + current_price + "]";
	}
}
