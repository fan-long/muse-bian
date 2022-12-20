/*The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties*/
package org.museframework.bian.documentdirectory.dto.bq;

public class DocumentVersionProperties {
    /*The required status/situation before the property is valid/meaningful*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    private String schedule;

    /*The version reference for the property value*/
    private String versionNumber;

    /*The Document Version Properties specific  Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Document Version Properties*/
    private org.museframework.bian.classes.DirectoryEntry documentDirectoryEntryReference;

    /*Reference to Document Version Properties*/
    private org.museframework.bian.classes.Object documentVersionPropertiesReference;

    /*The type of Document Version Properties*/
    private String documentVersionPropertiesType;

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

    public void setDocumentVersionPropertiesReference(org.museframework.bian.classes.Object documentVersionPropertiesReference) {
        this.documentVersionPropertiesReference = documentVersionPropertiesReference;
    }

    public org.museframework.bian.classes.Object getDocumentVersionPropertiesReference() {
        return documentVersionPropertiesReference;
    }

    public void setDocumentVersionPropertiesType(String documentVersionPropertiesType) {
        this.documentVersionPropertiesType = documentVersionPropertiesType;
    }

    public String getDocumentVersionPropertiesType() {
        return documentVersionPropertiesType;
    }
}