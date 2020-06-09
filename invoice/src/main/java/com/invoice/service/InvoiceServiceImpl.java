package com.invoice.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.invoice.dao.InvoiceDAOImpl;
import com.invoicing.dto.Invoice;

import Exceptions.AddInvoiceException;
import Exceptions.InvoiceNotFoundException;
import Exceptions.ViewAllInvoiceException;

@Service("invoiceService")
public class InvoiceServiceImpl implements InvoiceService{
	
	@Resource(name = "invoiceDAOImpl")
	InvoiceDAOImpl invoiceDAOImpl;
	@Override
	public Invoice addInvoice(Invoice invoice) throws AddInvoiceException {
		return invoiceDAOImpl.addInvoice(invoice);
	}
	@Override
	public Invoice searchInvoice(int id) throws InvoiceNotFoundException {
		Invoice invoice = invoiceDAOImpl.searchInvoice(id);
		return invoice;
	}
	@Override
	public List<Invoice> listInvoice() throws ViewAllInvoiceException {
		List<Invoice> invoice = invoiceDAOImpl.listInvoice();
		return invoice;
	}

}
