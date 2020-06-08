# InvoicingSystem
InvoicingSystem
URL endpoints:
1) POST request to add the invoice: 
          URL: http://localhost:8080/invoices
          Body in JSON: 
[
    {
        "id": 01,
        "client": "abc technologies",
        "varRate": "2100100",
        "invoiceDate": "2020-01-01"
     }
 ]


2) GET request to view all the invoices : http://localhost:8080/invoices

3) GET request to view invoice on the basis of id : http://localhost:8080/invoices?id=01
