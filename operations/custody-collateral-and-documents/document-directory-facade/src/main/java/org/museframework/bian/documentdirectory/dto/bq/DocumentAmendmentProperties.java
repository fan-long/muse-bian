/*The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties*/
package org.museframework.bian.documentdirectory.dto.bq;

public class DocumentAmendmentProperties {
    /*The required status/situation before the property is valid/meaningful*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    private String schedule;

    /*The version reference for the property value*/
    private String versionNumber;

    /*The Document Amendment Properties specific  Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Document Amendment Properties*/
    private org.museframework.bian.classes.DirectoryEntry documentDirectoryEntryReference;

    /*Reference to Document Amendment Properties*/
    private org.museframework.bian.classes.Object documentAmendmentPropertiesReference;

    /*The type of Document Amendment Properties*/
    private String documentAmendmentPropertiesType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setDocumentDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry documentDirectoryEntryReference) {
        this.documentDirectoryEntryReference = documentDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getDocumentDirectoryEntryReference() {
        return documentDirectoryEntryReference;
    }

    public void setDocumentAmendmentPropertiesReference(org.museframework.bian.classes.Object documentAmendmentPropertiesReference) {
        this.documentAmendmentPropertiesReference = documentAmendmentPropertiesReference;
    }

    public org.museframework.bian.classes.Object getDocumentAmendmentPropertiesReference() {
        return documentAmendmentPropertiesReference;
    }

    public void setDocumentAmendmentPropertiesType(String documentAmendmentPropertiesType) {
        this.documentAmendmentPropertiesType = documentAmendmentPropertiesType;
    }

    public String getDocumentAmendmentPropertiesType() {
        return documentAmendmentPropertiesType;
    }
}