package com.myretail.app.model;

import java.math.BigDecimal;

public class Pricing {

	private BigDecimal value;

	private String currency_code;

	public Pricing() {
		super();
	}

	public Pricing(BigDecimal value, String currency_code) {
		super();
		this.value = value;
		this.currency_code = currency_code;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	@Override
	public String toString() {
		return "Pricing [value=" + value + ", currency_code=" + currency_code
				+ "]";
	}
}
