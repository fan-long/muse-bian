/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.leaandoppman.dto.bq;

public class Development {
    /*Employees involved in progressing the lead/opportunity*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to a contact event log*/
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*Reference to the correspondence generated and received*/
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Correspondence content - messages sent to and received from involved parties*/
    private String correspondenceContent;

    /*The document reference for associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Document copy/content - legal or significant documents created & referenced*/
    private String documentContent;

    /*Work documentation, forms and schedules produced and referenced during the lead development*/
    private String leadDevelopmentWorkProducts;

    /*The outcome of the lead development workstep*/
    private String leadDevelopmentTaskResult;

    /*Date and time and the location the lead/opportunity was developed*/
    private String dateTimeLocation;

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerContactRecordReference(org.museframework.bian.classes.Object customerContactRecordReference) {
        this.customerContactRecordReference = customerContactRecordReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordReference() {
        return customerContactRecordReference;
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

    public void setLeadDevelopmentWorkProducts(String leadDevelopmentWorkProducts) {
        this.leadDevelopmentWorkProducts = leadDevelopmentWorkProducts;
    }

    public String getLeadDevelopmentWorkProducts() {
        return leadDevelopmentWorkProducts;
    }

    public void setLeadDevelopmentTaskResult(String leadDevelopmentTaskResult) {
        this.leadDevelopmentTaskResult = leadDevelopmentTaskResult;
    }

    public String getLeadDevelopmentTaskResult() {
        return leadDevelopmentTaskResult;
    }

    public void setDateTimeLocation(String dateTimeLocation) {
        this.dateTimeLocation = dateTimeLocation;
    }

    public String getDateTimeLocation() {
        return dateTimeLocation;
    }
}