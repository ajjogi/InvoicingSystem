package Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@SuppressWarnings("serial")
@ControllerAdvice
public class InvoiceNotFoundException extends Exception{
	
	public InvoiceNotFoundException() {
		super();
		//System.out.println("Invoice Not Found");
	}
	
	public InvoiceNotFoundException(String arg0) {
		super(arg0);
	}
	
	public InvoiceNotFoundException(Throwable arg0) {
		super(arg0);
	}

}
