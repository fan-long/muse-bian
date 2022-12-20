/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.delacchan.dto.bq;

public class Contact {
    /*Reference to a contact established with the customer*/
    private String customerDelinquentAccountContactRecord;

    /*Content of the reminder message*/
    private String contactMessage;

    /*The date and time of the contact*/
    private String contactDate;

    /*Any response arising from the contact*/
    private String contactResult;

    /*The document reference for associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Document copy/content*/
    private String documentContent;

    /*Reference to the correspondence generated and received*/
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Correspondence content*/
    private String correspondenceContent;

    /*The result of the tracking and reminder activity*/
    private String delinquentAccountContactResult;

    /*Work documentation, forms and schedules produced and referenced during the task*/
    private String delinquentAccountContactWorkProduct;

    public void setCustomerDelinquentAccountContactRecord(String customerDelinquentAccountContactRecord) {
        this.customerDelinquentAccountContactRecord = customerDelinquentAccountContactRecord;
    }

    public String getCustomerDelinquentAccountContactRecord() {
        return customerDelinquentAccountContactRecord;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactResult(String contactResult) {
        this.contactResult = contactResult;
    }

    public String getContactResult() {
        return contactResult;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setCorrespondenceInstanceReference(org.museframework.bian.classes.Object correspondenceInstanceReference) {
        this.correspondenceInstanceReference = correspondenceInstanceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceInstanceReference() {
        return correspondenceInstanceReference;
    }

    public void setCorrespondenceContent(String correspondenceContent) {
        this.correspondenceContent = correspondenceContent;
    }

    public String getCorrespondenceContent() {
        return correspondenceContent;
    }

    public void setDelinquentAccountContactResult(String delinquentAccountContactResult) {
        this.delinquentAccountContactResult = delinquentAccountContactResult;
    }

    public String getDelinquentAccountContactResult() {
        return delinquentAccountContactResult;
    }

    public void setDelinquentAccountContactWorkProduct(String delinquentAccountContactWorkProduct) {
        this.delinquentAccountContactWorkProduct = delinquentAccountContactWorkProduct;
    }

    public String getDelinquentAccountContactWorkProduct() {
        return delinquentAccountContactWorkProduct;
    }
}