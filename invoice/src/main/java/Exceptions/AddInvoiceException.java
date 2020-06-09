package Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import java.lang.Exception;

@SuppressWarnings("serial")
@ControllerAdvice
public class AddInvoiceException extends Exception {
	
	public AddInvoiceException() {
		super();
		//System.out.println("Cannot Add the invoice");
	}
	
	public AddInvoiceException(String arg0) {
		super(arg0);
	}
	
	public AddInvoiceException(Throwable arg0) {
		super(arg0);
	}
	

}
