/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customerbilling.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Invoicing {
    /*The customer invoice record*/
    @MetaField(0)
    private String customerInvoiceRecord;

    /*The date the invoice is issued*/
    @MetaField(0)
    private String invoiceDate;

    /*The document reference for the sent invoice*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the correspondence that generated the dispatch*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*The content of the invoice (in any suitable media of format)*/
    @MetaField(0)
    private String invoice;

    /*Work documentation, forms and schedules produced and referenced during the analysis (for future reference)*/
    @MetaField(0)
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