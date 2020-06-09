package com.invoice.dao;

import javax.persistence.PersistenceContexts;
import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import com.invoicing.dto.Invoice;

import Exceptions.AddInvoiceException;
import Exceptions.InvoiceNotFoundException;
import Exceptions.ViewAllInvoiceException;

@Repository("invoiceDAO")
public class InvoiceDAOImpl implements InvoiceDAO{

	@javax.persistence.PersistenceContext
	EntityManager entityManager;
	
	@Override
	public Invoice addInvoice(Invoice invoice) throws AddInvoiceException{
		try {
			entityManager.persist(invoice);
		} catch (Exception e) {
			throw new AddInvoiceException();
		}
		return null;
	}

	@Override
	public Invoice searchInvoice(int id) throws InvoiceNotFoundException {
		Invoice invoice = null;
		try {
			invoice = entityManager.find(Invoice.class, id);
		} catch (Exception e) {
			throw new InvoiceNotFoundException("Can Not fetch the User");
		}
		
		try {
			if(invoice==null){
				throw new InvoiceNotFoundException("No entry present");
			}
		} catch (Exception e) {
			throw new InvoiceNotFoundException(e.getMessage());
		}
		
		return invoice;
	}

	@Override
	public List<Invoice> listInvoice() throws ViewAllInvoiceException {
		List<Invoice> invoiceList;
		try {
			Query query = entityManager.createQuery("FROM invoicemaster");
			invoiceList = query.getResultList();
		} catch (Exception e) {
			throw new ViewAllInvoiceException("Cannot list all the invoices");
		}
		return invoiceList;
		
	}

}
