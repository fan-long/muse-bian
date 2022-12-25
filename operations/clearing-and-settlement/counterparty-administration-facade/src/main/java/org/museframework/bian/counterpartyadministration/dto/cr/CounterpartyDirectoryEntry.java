/*Capture and maintain reference information about some type of entitity within Counterparty Administration.*/
package org.museframework.bian.counterpartyadministration.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CounterpartyDirectoryEntry
@MetaDto
public class CounterpartyDirectoryEntry {
    /*Documentation of Counterparty Directory Entry*/
    @MetaField(0)
    private String counterpartyDirectoryEntryDescription;

    /*The timetable to capture and maintain Counterparty Directory Entry*/
    @MetaField(0)
    private String counterpartyDirectoryEntrySchedule;

    /*The version of Counterparty Directory Entry*/
    @MetaField(0)
    private String counterpartyDirectoryEntryVersion;

    /*The status of Counterparty Directory Entry*/
    @MetaField(0)
    private String counterpartyDirectoryEntryStatus;

    /*Reference to the log of (usage) ativities/events  of Counterparty Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log counterpartyDirectoryEntryUsageLog;

    /*Reference to the log of (update) ativities/events of Counterparty Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log counterpartyDirectoryEntryUpdateLog;

    /*The configuration of Counterparty Directory Entry*/
    @MetaField(0)
    private String counterpartyDirectoryEntryServiceConfiguration;

    /*An unique reference to an item or an occurrence of Counterparty Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry counterpartyDirectoryEntryReference;

    /**/
    @MetaField(0)
    private String conterpartyReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement agreementReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialTransaction financialTransactionReference;

    public void setCounterpartyDirectoryEntryDescription(String counterpartyDirectoryEntryDescription) {
        this.counterpartyDirectoryEntryDescription = counterpartyDirectoryEntryDescription;
    }

    public String getCounterpartyDirectoryEntryDescription() {
        return counterpartyDirectoryEntryDescription;
    }

    public void setCounterpartyDirectoryEntrySchedule(String counterpartyDirectoryEntrySchedule) {
        this.counterpartyDirectoryEntrySchedule = counterpartyDirectoryEntrySchedule;
    }

    public String getCounterpartyDirectoryEntrySchedule() {
        return counterpartyDirectoryEntrySchedule;
    }

    public void setCounterpartyDirectoryEntryVersion(String counterpartyDirectoryEntryVersion) {
        this.counterpartyDirectoryEntryVersion = counterpartyDirectoryEntryVersion;
    }

    public String getCounterpartyDirectoryEntryVersion() {
        return counterpartyDirectoryEntryVersion;
    }

    public void setCounterpartyDirectoryEntryStatus(String counterpartyDirectoryEntryStatus) {
        this.counterpartyDirectoryEntryStatus = counterpartyDirectoryEntryStatus;
    }

    public String getCounterpartyDirectoryEntryStatus() {
        return counterpartyDirectoryEntryStatus;
    }

    public void setCounterpartyDirectoryEntryUsageLog(org.museframework.bian.classes.Log counterpartyDirectoryEntryUsageLog) {
        this.counterpartyDirectoryEntryUsageLog = counterpartyDirectoryEntryUsageLog;
    }

    public org.museframework.bian.classes.Log getCounterpartyDirectoryEntryUsageLog() {
        return counterpartyDirectoryEntryUsageLog;
    }

    public void setCounterpartyDirectoryEntryUpdateLog(org.museframework.bian.classes.Log counterpartyDirectoryEntryUpdateLog) {
        this.counterpartyDirectoryEntryUpdateLog = counterpartyDirectoryEntryUpdateLog;
    }

    public org.museframework.bian.classes.Log getCounterpartyDirectoryEntryUpdateLog() {
        return counterpartyDirectoryEntryUpdateLog;
    }

    public void setCounterpartyDirectoryEntryServiceConfiguration(String counterpartyDirectoryEntryServiceConfiguration) {
        this.counterpartyDirectoryEntryServiceConfiguration = counterpartyDirectoryEntryServiceConfiguration;
    }

    public String getCounterpartyDirectoryEntryServiceConfiguration() {
        return counterpartyDirectoryEntryServiceConfiguration;
    }

    public void setCounterpartyDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry counterpartyDirectoryEntryReference) {
        this.counterpartyDirectoryEntryReference = counterpartyDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getCounterpartyDirectoryEntryReference() {
        return counterpartyDirectoryEntryReference;
    }

    public void setConterpartyReference(String conterpartyReference) {
        this.conterpartyReference = conterpartyReference;
    }

    public String getConterpartyReference() {
        return conterpartyReference;
    }

    public void setAgreementReference(org.museframework.bian.classes.Agreement agreementReference) {
        this.agreementReference = agreementReference;
    }

    public org.museframework.bian.classes.Agreement getAgreementReference() {
        return agreementReference;
    }

    public void setFinancialTransactionReference(org.museframework.bian.classes.FinancialTransaction financialTransactionReference) {
        this.financialTransactionReference = financialTransactionReference;
    }

    public org.museframework.bian.classes.FinancialTransaction getFinancialTransactionReference() {
        return financialTransactionReference;
    }
}