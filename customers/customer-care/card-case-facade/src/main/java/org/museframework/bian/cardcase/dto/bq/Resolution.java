/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcase.dto.bq;

public class Resolution {
    /*Reference to the card transaction for the resolution*/
    private org.museframework.bian.classes.Object resolutionCardTransactionRecordReference;

    /*The record of a specific resolution task*/
    private String resolutionTaskRecord;

    /*Reference to the correspondence generated and received*/
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Correspondence content - messages sent to and received from involved parties*/
    private String correspondenceContent;

    /*The document reference for associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Document copy/content - legal or significant documents created & referenced*/
    private String documentContent;

    /*Business unit responsible for the card case resolution actions*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the resolution payment order when financial adjustments are required to resolve the card case*/
    private org.museframework.bian.classes.Object paymentOrderReference;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    private String resolutionTaskWorkProducts;

    /*The outcome of the authentication workstep*/
    private String resolutionTaskResult;

    public void setResolutionCardTransactionRecordReference(org.museframework.bian.classes.Object resolutionCardTransactionRecordReference) {
        this.resolutionCardTransactionRecordReference = resolutionCardTransactionRecordReference;
    }

    public org.museframework.bian.classes.Object getResolutionCardTransactionRecordReference() {
        return resolutionCardTransactionRecordReference;
    }

    public void setResolutionTaskRecord(String resolutionTaskRecord) {
        this.resolutionTaskRecord = resolutionTaskRecord;
    }

    public String getResolutionTaskRecord() {
        return resolutionTaskRecord;
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

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setPaymentOrderReference(org.museframework.bian.classes.Object paymentOrderReference) {
        this.paymentOrderReference = paymentOrderReference;
    }

    public org.museframework.bian.classes.Object getPaymentOrderReference() {
        return paymentOrderReference;
    }

    public void setResolutionTaskWorkProducts(String resolutionTaskWorkProducts) {
        this.resolutionTaskWorkProducts = resolutionTaskWorkProducts;
    }

    public String getResolutionTaskWorkProducts() {
        return resolutionTaskWorkProducts;
    }

    public void setResolutionTaskResult(String resolutionTaskResult) {
        this.resolutionTaskResult = resolutionTaskResult;
    }

    public String getResolutionTaskResult() {
        return resolutionTaskResult;
    }
}