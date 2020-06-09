package com.invoice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.invoicing.dto.Invoice;

import Exceptions.AddInvoiceException;
import Exceptions.InvoiceNotFoundException;
import Exceptions.ViewAllInvoiceException;

@Repository
public interface InvoiceDAO{

	public Invoice addInvoice(Invoice invoice) throws AddInvoiceException;
	public Invoice searchInvoice(int id) throws InvoiceNotFoundException;
	public List<Invoice> listInvoice() throws ViewAllInvoiceException;
	

}
