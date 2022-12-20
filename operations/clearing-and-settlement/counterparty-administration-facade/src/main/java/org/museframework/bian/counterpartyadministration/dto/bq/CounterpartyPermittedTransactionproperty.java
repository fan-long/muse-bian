/*The Counterparty Entity Reference property properties that represent a discrete aspect of the Counterparty Entity Reference property*/
package org.museframework.bian.counterpartyadministration.dto.bq;

public class CounterpartyPermittedTransactionproperty {
    /*The required status/situation before the property is valid/meaningful*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    private String schedule;

    /*The version reference for the property value*/
    private String versionNumber;

    /*The Counterparty Permitted Transaction property specific  Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Counterparty Permitted Transaction property*/
    private org.museframework.bian.classes.DirectoryEntry counterpartyDirectoryEntryReference;

    /*Reference to Counterparty Permitted Transaction property*/
    private org.museframework.bian.classes.Object counterpartyPermittedTransactionpropertyReference;

    /*The type of Counterparty Permitted Transaction property*/
    private String counterpartyPermittedTransactionpropertyType;

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

    public void setCounterpartyPermittedTransactionpropertyReference(org.museframework.bian.classes.Object counterpartyPermittedTransactionpropertyReference) {
        this.counterpartyPermittedTransactionpropertyReference = counterpartyPermittedTransactionpropertyReference;
    }

    public org.museframework.bian.classes.Object getCounterpartyPermittedTransactionpropertyReference() {
        return counterpartyPermittedTransactionpropertyReference;
    }

    public void setCounterpartyPermittedTransactionpropertyType(String counterpartyPermittedTransactionpropertyType) {
        this.counterpartyPermittedTransactionpropertyType = counterpartyPermittedTransactionpropertyType;
    }

    public String getCounterpartyPermittedTransactionpropertyType() {
        return counterpartyPermittedTransactionpropertyType;
    }
}