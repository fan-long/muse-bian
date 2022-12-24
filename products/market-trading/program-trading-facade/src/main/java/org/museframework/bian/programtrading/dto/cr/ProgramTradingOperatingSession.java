/*Operate equipment and/or a largely automated facility within Program Trading. */
package org.museframework.bian.programtrading.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ProgramTradingOperatingSession
@MetaDto
public class ProgramTradingOperatingSession {
    /*Timetable to operate Program Trading Operating Session*/
    @MetaField
    private String programTradingOperatingSessionSchedule;

    /*The status of Program Trading Operating Session*/
    @MetaField
    private String programTradingOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Program Trading Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log programTradingOperatingSessionUsageLog;

    /*Reference to the party who is involved in Program Trading Operating Session*/
    @MetaField
    private String programTradingOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Program Trading Operating Session*/
    @MetaField
    private String programTradingOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Program Trading Operating Session*/
    @MetaField
    private String programTradingOperatingSessionType;

    /*The schedule according to which the service provider will operate the Program Trading Operating Session*/
    @MetaField
    private String programTradingOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Program Trading Operating Session*/
    @MetaField
    private String programTradingOperatingSessionServiceType;

    /*The configuration of Program Trading Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.SystemConfigurationOption programTradingOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Program Trading Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session programTradingOperatingSessionReference;

    public void setProgramTradingOperatingSessionSchedule(String programTradingOperatingSessionSchedule) {
        this.programTradingOperatingSessionSchedule = programTradingOperatingSessionSchedule;
    }

    public String getProgramTradingOperatingSessionSchedule() {
        return programTradingOperatingSessionSchedule;
    }

    public void setProgramTradingOperatingSessionStatus(String programTradingOperatingSessionStatus) {
        this.programTradingOperatingSessionStatus = programTradingOperatingSessionStatus;
    }

    public String getProgramTradingOperatingSessionStatus() {
        return programTradingOperatingSessionStatus;
    }

    public void setProgramTradingOperatingSessionUsageLog(org.museframework.bian.classes.Log programTradingOperatingSessionUsageLog) {
        this.programTradingOperatingSessionUsageLog = programTradingOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getProgramTradingOperatingSessionUsageLog() {
        return programTradingOperatingSessionUsageLog;
    }

    public void setProgramTradingOperatingSessionAssociatedPartyReference(String programTradingOperatingSessionAssociatedPartyReference) {
        this.programTradingOperatingSessionAssociatedPartyReference = programTradingOperatingSessionAssociatedPartyReference;
    }

    public String getProgramTradingOperatingSessionAssociatedPartyReference() {
        return programTradingOperatingSessionAssociatedPartyReference;
    }

    public void setProgramTradingOperatingSessionServiceProviderReference(String programTradingOperatingSessionServiceProviderReference) {
        this.programTradingOperatingSessionServiceProviderReference = programTradingOperatingSessionServiceProviderReference;
    }

    public String getProgramTradingOperatingSessionServiceProviderReference() {
        return programTradingOperatingSessionServiceProviderReference;
    }

    public void setProgramTradingOperatingSessionType(String programTradingOperatingSessionType) {
        this.programTradingOperatingSessionType = programTradingOperatingSessionType;
    }

    public String getProgramTradingOperatingSessionType() {
        return programTradingOperatingSessionType;
    }

    public void setProgramTradingOperatingSessionServiceProviderSchedule(String programTradingOperatingSessionServiceProviderSchedule) {
        this.programTradingOperatingSessionServiceProviderSchedule = programTradingOperatingSessionServiceProviderSchedule;
    }

    public String getProgramTradingOperatingSessionServiceProviderSchedule() {
        return programTradingOperatingSessionServiceProviderSchedule;
    }

    public void setProgramTradingOperatingSessionServiceType(String programTradingOperatingSessionServiceType) {
        this.programTradingOperatingSessionServiceType = programTradingOperatingSessionServiceType;
    }

    public String getProgramTradingOperatingSessionServiceType() {
        return programTradingOperatingSessionServiceType;
    }

    public void setProgramTradingOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption programTradingOperatingSessionServiceConfiguration) {
        this.programTradingOperatingSessionServiceConfiguration = programTradingOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getProgramTradingOperatingSessionServiceConfiguration() {
        return programTradingOperatingSessionServiceConfiguration;
    }

    public void setProgramTradingOperatingSessionReference(org.museframework.bian.classes.Session programTradingOperatingSessionReference) {
        this.programTradingOperatingSessionReference = programTradingOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getProgramTradingOperatingSessionReference() {
        return programTradingOperatingSessionReference;
    }
}