package com.invoice.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.invoice.service.InvoiceService;
import com.invoicing.dto.Invoice;

import Exceptions.AddInvoiceException;
import Exceptions.InvoiceNotFoundException;
import Exceptions.ViewAllInvoiceException;

@RestController
public class InvoiceController {
	
	@Resource(name = "InvoiceService")
	InvoiceService invoiceService;

	@RequestMapping(method = RequestMethod.POST, value = "/invoices")
	public Invoice addInvoice(Invoice invoice) throws AddInvoiceException {
		return invoiceService.addInvoice(invoice);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/invoices")
	public List<Invoice> listInvoice() throws ViewAllInvoiceException {
		return invoiceService.listInvoice();
	}
	@RequestMapping(method = RequestMethod.GET, value = "/invoices/{id}")
	public Invoice searchInvoice(int id) throws InvoiceNotFoundException {
		Invoice invoice = invoiceService.searchInvoice(id);
		return invoice;
	}
}
