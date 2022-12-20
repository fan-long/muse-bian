/*A formal request to pay an amount of money owed for delivered goods or services.   

What is invoiced should be conformant to 
- what is agreed in a customer agreement and 
- applicable regulations. 
- Good or services. 

*/
package org.museframework.bian.classes;

public class Invoice {
    /**/
    private String invoiceIdentifier;

    /**/
    private String invoiceType;

    /**/
    private String invoiceDueDate;

    /*Specifies the period covered by an invoice for instance for recurring services. (ISO20022)*/
    private String invoicePeriod;

    /**/
    private String invoiceAssignedDocument;

    /*The address used to send the invoice to.*/
    private String invoiceAdress;

    /*Amount of invoice.

ISO20022 has defined different type of amount for an invoice:

- InvoiceTotalAmount: Total amount of the invoice, being the sum of total invoice lines amounts, total invoice additional amounts (allowances and charges) and total tax amounts.

- InvoiceTaxAmount: Sum of all tax amounts related to the invoice. It is derived from the association between line item and tax.

- InvoicePrepaidAmount: Monetary value of the total prepaid amount being reported for this settlement.

- InvoiceNetAmount: Total amount after taxes, adjustments and charges
*/
    private String invoiceAmount;

    /**/
    private String invoiceStatus;

    public void setInvoiceIdentifier(String invoiceIdentifier) {
        this.invoiceIdentifier = invoiceIdentifier;
    }

    public String getInvoiceIdentifier() {
        return invoiceIdentifier;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceDueDate(String invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public String getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoicePeriod(String invoicePeriod) {
        this.invoicePeriod = invoicePeriod;
    }

    public String getInvoicePeriod() {
        return invoicePeriod;
    }

    public void setInvoiceAssignedDocument(String invoiceAssignedDocument) {
        this.invoiceAssignedDocument = invoiceAssignedDocument;
    }

    public String getInvoiceAssignedDocument() {
        return invoiceAssignedDocument;
    }

    public void setInvoiceAdress(String invoiceAdress) {
        this.invoiceAdress = invoiceAdress;
    }

    public String getInvoiceAdress() {
        return invoiceAdress;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }
}