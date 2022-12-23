/*The Option Instrument property properties that represent a discrete aspect of the Option Instrument property*/
package org.museframework.bian.fininsrefdatman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class WarrantInstrumentproperty {
    /*The required status/situation before the property is valid/meaningful*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    @MetaField
    private String schedule;

    /*The version reference for the property value*/
    @MetaField
    private String versionNumber;

    /*The Warrant Instrument property specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Warrant Instrument property*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry financialInstrumentDirectoryEntryReference;

    /*Reference to Warrant Instrument property*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object warrantInstrumentpropertyReference;

    /*The type of Warrant Instrument property*/
    @MetaField
    private String warrantInstrumentpropertyType;

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

    public void setFinancialInstrumentDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry financialInstrumentDirectoryEntryReference) {
        this.financialInstrumentDirectoryEntryReference = financialInstrumentDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getFinancialInstrumentDirectoryEntryReference() {
        return financialInstrumentDirectoryEntryReference;
    }

    public void setWarrantInstrumentpropertyReference(org.museframework.bian.classes.Object warrantInstrumentpropertyReference) {
        this.warrantInstrumentpropertyReference = warrantInstrumentpropertyReference;
    }

    public org.museframework.bian.classes.Object getWarrantInstrumentpropertyReference() {
        return warrantInstrumentpropertyReference;
    }

    public void setWarrantInstrumentpropertyType(String warrantInstrumentpropertyType) {
        this.warrantInstrumentpropertyType = warrantInstrumentpropertyType;
    }

    public String getWarrantInstrumentpropertyType() {
        return warrantInstrumentpropertyType;
    }
}