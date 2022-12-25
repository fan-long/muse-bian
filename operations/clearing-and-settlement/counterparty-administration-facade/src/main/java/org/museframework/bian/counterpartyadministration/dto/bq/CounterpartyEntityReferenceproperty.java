/*The Counterparty Entity Reference property properties that represent a discrete aspect of the Counterparty Entity Reference property*/
package org.museframework.bian.counterpartyadministration.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CounterpartyEntityReferenceproperty {
    /*The required status/situation before the property is valid/meaningful*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    @MetaField(0)
    private String schedule;

    /*The version reference for the property value*/
    @MetaField(0)
    private String versionNumber;

    /*The Counterparty Entity Reference property specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Counterparty Entity Reference property*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry counterpartyDirectoryEntryReference;

    /*Reference to Counterparty Entity Reference property*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object counterpartyEntityReferencepropertyReference;

    /*The type of Counterparty Entity Reference property*/
    @MetaField(0)
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