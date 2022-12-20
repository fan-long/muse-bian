/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customerbilling.dto.bq;

public class Invoicing {
    /*The customer invoice record*/
    private String customerInvoiceRecord;

    /*The date the invoice is issued*/
    private String invoiceDate;

    /*The document reference for the sent invoice*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the correspondence that generated the dispatch*/
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*The content of the invoice (in any suitable media of format)*/
    private String invoice;

    /*Work documentation, forms and schedules produced and referenced during the analysis (for future reference)*/
    private String invoicingWorkProduct;

    public void setCustomerInvoiceRecord(String customerInvoiceRecord) {
        this.customerInvoiceRecord = customerInvoiceRecord;
    }

    public String getCustomerInvoiceRecord() {
        return customerInvoiceRecord;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCorrespondenceInstanceReference(org.museframework.bian.classes.Object correspondenceInstanceReference) {
        this.correspondenceInstanceReference = correspondenceInstanceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceInstanceReference() {
        return correspondenceInstanceReference;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoicingWorkProduct(String invoicingWorkProduct) {
        this.invoicingWorkProduct = invoicingWorkProduct;
    }

    public String getInvoicingWorkProduct() {
        return invoicingWorkProduct;
    }
}