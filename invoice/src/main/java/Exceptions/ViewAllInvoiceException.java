package Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@SuppressWarnings("serial")
@ControllerAdvice
public class ViewAllInvoiceException extends Exception{
		
		public ViewAllInvoiceException() {
			super();
			//System.out.println("Unable to list all the Invoices");
		}
		
		public ViewAllInvoiceException(String arg0) {
			super(arg0);
		}
		
		public ViewAllInvoiceException(Throwable arg0) {
			super(arg0);
		}


}
