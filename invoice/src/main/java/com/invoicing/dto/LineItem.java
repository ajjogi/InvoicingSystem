package com.invoicing.dto;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;

import org.hibernate.annotations.Entity;

@Entity
public class LineItem {

	@GeneratedValue
	private Long id;
	private Long quantity;
	private String description;
	private BigDecimal unitPrice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public BigDecimal getLineItemTotal() {
		return unitPrice;
	}
}
