/*The Option Instrument property properties that represent a discrete aspect of the Option Instrument property*/
package org.museframework.bian.fininsrefdatman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OptionInstrumentproperty {
    /*The required status/situation before the property is valid/meaningful*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing for which the property value is valid*/
    @MetaField
    private String schedule;

    /*The version reference for the property value*/
    @MetaField
    private String versionNumber;

    /*The Option Instrument property specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Option Instrument property*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry financialInstrumentDirectoryEntryReference;

    /*Reference to Option Instrument property*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object optionInstrumentpropertyReference;

    /*The type of Option Instrument property*/
    @MetaField
    private String optionInstrumentpropertyType;

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

    public void setOptionInstrumentpropertyReference(org.museframework.bian.classes.Object optionInstrumentpropertyReference) {
        this.optionInstrumentpropertyReference = optionInstrumentpropertyReference;
    }

    public org.museframework.bian.classes.Object getOptionInstrumentpropertyReference() {
        return optionInstrumentpropertyReference;
    }

    public void setOptionInstrumentpropertyType(String optionInstrumentpropertyType) {
        this.optionInstrumentpropertyType = optionInstrumentpropertyType;
    }

    public String getOptionInstrumentpropertyType() {
        return optionInstrumentpropertyType;
    }
}