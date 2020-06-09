package com.invoice.service;

import java.util.List;

import com.invoicing.dto.Invoice;

import Exceptions.AddInvoiceException;
import Exceptions.InvoiceNotFoundException;
import Exceptions.ViewAllInvoiceException;

public interface InvoiceService {
	public Invoice addInvoice(Invoice invoice) throws AddInvoiceException;
	public Invoice searchInvoice(int id) throws InvoiceNotFoundException;
	public List<Invoice> listInvoice() throws ViewAllInvoiceException;
	
}
