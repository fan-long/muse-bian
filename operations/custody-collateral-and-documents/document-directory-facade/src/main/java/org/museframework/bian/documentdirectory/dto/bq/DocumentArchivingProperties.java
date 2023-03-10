/*The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties*/
package org.museframework.bian.documentdirectory.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DocumentArchivingProperties {
    /*The required status/situation before the property is valid/meaningful*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    @MetaField(0)
    private String schedule;

    /*The version reference for the property value*/
    @MetaField(0)
    private String versionNumber;

    /*The Document Archiving Properties specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Document Archiving Properties*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry documentDirectoryEntryReference;

    /*Reference to Document Archiving Properties*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentArchivingPropertiesReference;

    /*The type of Document Archiving Properties*/
    @MetaField(0)
    private String documentArchivingPropertiesType;

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

    public void setDocumentArchivingPropertiesReference(org.museframework.bian.classes.Object documentArchivingPropertiesReference) {
        this.documentArchivingPropertiesReference = documentArchivingPropertiesReference;
    }

    public org.museframework.bian.classes.Object getDocumentArchivingPropertiesReference() {
        return documentArchivingPropertiesReference;
    }

    public void setDocumentArchivingPropertiesType(String documentArchivingPropertiesType) {
        this.documentArchivingPropertiesType = documentArchivingPropertiesType;
    }

    public String getDocumentArchivingPropertiesType() {
        return documentArchivingPropertiesType;
    }
}