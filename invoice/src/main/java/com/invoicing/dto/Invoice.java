package com.invoicing.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Invoice {
	
	@Id
	@GeneratedValue
	private Long id;
	private String client;
	private Long varRate;
	private Date invoiceDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Long getVarRate() {
		return varRate;
	}
	public void setVarRate(Long varRate) {
		this.varRate = varRate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	public BigDecimal getSubTotal() {
		return null;		
	}
	
	public BigDecimal getVat() {
		return null;		
	}
	
	public BigDecimal getTotal() {
		return null;		
	}
	
	
}
