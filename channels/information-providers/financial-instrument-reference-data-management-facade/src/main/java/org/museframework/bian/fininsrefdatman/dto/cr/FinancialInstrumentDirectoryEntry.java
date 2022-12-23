/*Capture and maintain reference information about some type of entitity within Financial Instrument Reference Data Management.*/
package org.museframework.bian.fininsrefdatman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialInstrumentDirectoryEntry extends org.museframework.bian.classes.FinancialInstrumentDirectoryEntry {
    /*Documentation of Financial Instrument Directory Entry*/
    @MetaField
    private String financialInstrumentDirectoryEntryDescription;

    /*The timetable to capture and maintain Financial Instrument Directory Entry*/
    @MetaField
    private String financialInstrumentDirectoryEntrySchedule;

    /*The version of Financial Instrument Directory Entry*/
    @MetaField
    private String financialInstrumentDirectoryEntryVersion;

    /*The status of Financial Instrument Directory Entry*/
    @MetaField
    private String financialInstrumentDirectoryEntryStatus;

    /*Reference to the log of (usage) ativities/events  of Financial Instrument Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log financialInstrumentDirectoryEntryUsageLog;

    /*Reference to the log of (update) ativities/events of Financial Instrument Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log financialInstrumentDirectoryEntryUpdateLog;

    /*The configuration of Financial Instrument Directory Entry*/
    @MetaField
    private String financialInstrumentDirectoryEntryServiceConfiguration;

    /*An unique reference to an item or an occurrence of Financial Instrument Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry financialInstrumentDirectoryEntryReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialInstrument financialInstrumentReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialMarket financialMarketReference;

    public void setFinancialInstrumentDirectoryEntryDescription(String financialInstrumentDirectoryEntryDescription) {
        this.financialInstrumentDirectoryEntryDescription = financialInstrumentDirectoryEntryDescription;
    }

    public String getFinancialInstrumentDirectoryEntryDescription() {
        return financialInstrumentDirectoryEntryDescription;
    }

    public void setFinancialInstrumentDirectoryEntrySchedule(String financialInstrumentDirectoryEntrySchedule) {
        this.financialInstrumentDirectoryEntrySchedule = financialInstrumentDirectoryEntrySchedule;
    }

    public String getFinancialInstrumentDirectoryEntrySchedule() {
        return financialInstrumentDirectoryEntrySchedule;
    }

    public void setFinancialInstrumentDirectoryEntryVersion(String financialInstrumentDirectoryEntryVersion) {
        this.financialInstrumentDirectoryEntryVersion = financialInstrumentDirectoryEntryVersion;
    }

    public String getFinancialInstrumentDirectoryEntryVersion() {
        return financialInstrumentDirectoryEntryVersion;
    }

    public void setFinancialInstrumentDirectoryEntryStatus(String financialInstrumentDirectoryEntryStatus) {
        this.financialInstrumentDirectoryEntryStatus = financialInstrumentDirectoryEntryStatus;
    }

    public String getFinancialInstrumentDirectoryEntryStatus() {
        return financialInstrumentDirectoryEntryStatus;
    }

    public void setFinancialInstrumentDirectoryEntryUsageLog(org.museframework.bian.classes.Log financialInstrumentDirectoryEntryUsageLog) {
        this.financialInstrumentDirectoryEntryUsageLog = financialInstrumentDirectoryEntryUsageLog;
    }

    public org.museframework.bian.classes.Log getFinancialInstrumentDirectoryEntryUsageLog() {
        return financialInstrumentDirectoryEntryUsageLog;
    }

    public void setFinancialInstrumentDirectoryEntryUpdateLog(org.museframework.bian.classes.Log financialInstrumentDirectoryEntryUpdateLog) {
        this.financialInstrumentDirectoryEntryUpdateLog = financialInstrumentDirectoryEntryUpdateLog;
    }

    public org.museframework.bian.classes.Log getFinancialInstrumentDirectoryEntryUpdateLog() {
        return financialInstrumentDirectoryEntryUpdateLog;
    }

    public void setFinancialInstrumentDirectoryEntryServiceConfiguration(String financialInstrumentDirectoryEntryServiceConfiguration) {
        this.financialInstrumentDirectoryEntryServiceConfiguration = financialInstrumentDirectoryEntryServiceConfiguration;
    }

    public String getFinancialInstrumentDirectoryEntryServiceConfiguration() {
        return financialInstrumentDirectoryEntryServiceConfiguration;
    }

    public void setFinancialInstrumentDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry financialInstrumentDirectoryEntryReference) {
        this.financialInstrumentDirectoryEntryReference = financialInstrumentDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getFinancialInstrumentDirectoryEntryReference() {
        return financialInstrumentDirectoryEntryReference;
    }

    public void setFinancialInstrumentReference(org.museframework.bian.classes.FinancialInstrument financialInstrumentReference) {
        this.financialInstrumentReference = financialInstrumentReference;
    }

    public org.museframework.bian.classes.FinancialInstrument getFinancialInstrumentReference() {
        return financialInstrumentReference;
    }

    public void setFinancialMarketReference(org.museframework.bian.classes.FinancialMarket financialMarketReference) {
        this.financialMarketReference = financialMarketReference;
    }

    public org.museframework.bian.classes.FinancialMarket getFinancialMarketReference() {
        return financialMarketReference;
    }
}