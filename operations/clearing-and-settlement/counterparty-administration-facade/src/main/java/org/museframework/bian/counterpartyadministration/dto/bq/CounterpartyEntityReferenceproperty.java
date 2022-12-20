/*The Counterparty Entity Reference property properties that represent a discrete aspect of the Counterparty Entity Reference property*/
package org.museframework.bian.counterpartyadministration.dto.bq;

public class CounterpartyEntityReferenceproperty {
    /*The required status/situation before the property is valid/meaningful*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    private String schedule;

    /*The version reference for the property value*/
    private String versionNumber;

    /*The Counterparty Entity Reference property specific  Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Counterparty Entity Reference property*/
    private org.museframework.bian.classes.DirectoryEntry counterpartyDirectoryEntryReference;

    /*Reference to Counterparty Entity Reference property*/
    private org.museframework.bian.classes.Object counterpartyEntityReferencepropertyReference;

    /*The type of Counterparty Entity Reference property*/
    private String counterpartyEntityReferencepropertyType;

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

    public void setCounterpartyDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry counterpartyDirectoryEntryReference) {
        this.counterpartyDirectoryEntryReference = counterpartyDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getCounterpartyDirectoryEntryReference() {
        return counterpartyDirectoryEntryReference;
    }

    public void setCounterpartyEntityReferencepropertyReference(org.museframework.bian.classes.Object counterpartyEntityReferencepropertyReference) {
        this.counterpartyEntityReferencepropertyReference = counterpartyEntityReferencepropertyReference;
    }

    public org.museframework.bian.classes.Object getCounterpartyEntityReferencepropertyReference() {
        return counterpartyEntityReferencepropertyReference;
    }

    public void setCounterpartyEntityReferencepropertyType(String counterpartyEntityReferencepropertyType) {
        this.counterpartyEntityReferencepropertyType = counterpartyEntityReferencepropertyType;
    }

    public String getCounterpartyEntityReferencepropertyType() {
        return counterpartyEntityReferencepropertyType;
    }
}