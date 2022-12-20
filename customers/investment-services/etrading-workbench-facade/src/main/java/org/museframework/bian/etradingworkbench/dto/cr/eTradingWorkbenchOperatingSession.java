/*Operate equipment and/or a largely automated facility within eTrading Workbench. */
package org.museframework.bian.etradingworkbench.dto.cr;

public class eTradingWorkbenchOperatingSession {
    /*Timetable to operate eTrading Workbench Operating Session*/
    private String eTradingWorkbenchOperatingSessionSchedule;

    /*The status of eTrading Workbench Operating Session*/
    private String eTradingWorkbenchOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of eTrading Workbench Operating Session*/
    private org.museframework.bian.classes.Log eTradingWorkbenchOperatingSessionUsageLog;

    /*Reference to the party who is involved in eTrading Workbench Operating Session*/
    private String eTradingWorkbenchOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of eTrading Workbench Operating Session*/
    private String eTradingWorkbenchOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within eTrading Workbench Operating Session*/
    private String eTradingWorkbenchOperatingSessionType;

    /*The schedule according to which the service provider will operate the eTrading Workbench Operating Session*/
    private String eTradingWorkbenchOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within eTrading Workbench Operating Session*/
    private String eTradingWorkbenchOperatingSessionServiceType;

    /*The configuration of eTrading Workbench Operating Session*/
    private org.museframework.bian.classes.SystemConfigurationOption eTradingWorkbenchOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of eTrading Workbench Operating Session*/
    private org.museframework.bian.classes.Session eTradingWorkbenchOperatingSessionReference;

    public void seteTradingWorkbenchOperatingSessionSchedule(String eTradingWorkbenchOperatingSessionSchedule) {
        this.eTradingWorkbenchOperatingSessionSchedule = eTradingWorkbenchOperatingSessionSchedule;
    }

    public String geteTradingWorkbenchOperatingSessionSchedule() {
        return eTradingWorkbenchOperatingSessionSchedule;
    }

    public void seteTradingWorkbenchOperatingSessionStatus(String eTradingWorkbenchOperatingSessionStatus) {
        this.eTradingWorkbenchOperatingSessionStatus = eTradingWorkbenchOperatingSessionStatus;
    }

    public String geteTradingWorkbenchOperatingSessionStatus() {
        return eTradingWorkbenchOperatingSessionStatus;
    }

    public void seteTradingWorkbenchOperatingSessionUsageLog(org.museframework.bian.classes.Log eTradingWorkbenchOperatingSessionUsageLog) {
        this.eTradingWorkbenchOperatingSessionUsageLog = eTradingWorkbenchOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log geteTradingWorkbenchOperatingSessionUsageLog() {
        return eTradingWorkbenchOperatingSessionUsageLog;
    }

    public void seteTradingWorkbenchOperatingSessionAssociatedPartyReference(String eTradingWorkbenchOperatingSessionAssociatedPartyReference) {
        this.eTradingWorkbenchOperatingSessionAssociatedPartyReference = eTradingWorkbenchOperatingSessionAssociatedPartyReference;
    }

    public String geteTradingWorkbenchOperatingSessionAssociatedPartyReference() {
        return eTradingWorkbenchOperatingSessionAssociatedPartyReference;
    }

    public void seteTradingWorkbenchOperatingSessionServiceProviderReference(String eTradingWorkbenchOperatingSessionServiceProviderReference) {
        this.eTradingWorkbenchOperatingSessionServiceProviderReference = eTradingWorkbenchOperatingSessionServiceProviderReference;
    }

    public String geteTradingWorkbenchOperatingSessionServiceProviderReference() {
        return eTradingWorkbenchOperatingSessionServiceProviderReference;
    }

    public void seteTradingWorkbenchOperatingSessionType(String eTradingWorkbenchOperatingSessionType) {
        this.eTradingWorkbenchOperatingSessionType = eTradingWorkbenchOperatingSessionType;
    }

    public String geteTradingWorkbenchOperatingSessionType() {
        return eTradingWorkbenchOperatingSessionType;
    }

    public void seteTradingWorkbenchOperatingSessionServiceProviderSchedule(String eTradingWorkbenchOperatingSessionServiceProviderSchedule) {
        this.eTradingWorkbenchOperatingSessionServiceProviderSchedule = eTradingWorkbenchOperatingSessionServiceProviderSchedule;
    }

    public String geteTradingWorkbenchOperatingSessionServiceProviderSchedule() {
        return eTradingWorkbenchOperatingSessionServiceProviderSchedule;
    }

    public void seteTradingWorkbenchOperatingSessionServiceType(String eTradingWorkbenchOperatingSessionServiceType) {
        this.eTradingWorkbenchOperatingSessionServiceType = eTradingWorkbenchOperatingSessionServiceType;
    }

    public String geteTradingWorkbenchOperatingSessionServiceType() {
        return eTradingWorkbenchOperatingSessionServiceType;
    }

    public void seteTradingWorkbenchOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption eTradingWorkbenchOperatingSessionServiceConfiguration) {
        this.eTradingWorkbenchOperatingSessionServiceConfiguration = eTradingWorkbenchOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption geteTradingWorkbenchOperatingSessionServiceConfiguration() {
        return eTradingWorkbenchOperatingSessionServiceConfiguration;
    }

    public void seteTradingWorkbenchOperatingSessionReference(org.museframework.bian.classes.Session eTradingWorkbenchOperatingSessionReference) {
        this.eTradingWorkbenchOperatingSessionReference = eTradingWorkbenchOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session geteTradingWorkbenchOperatingSessionReference() {
        return eTradingWorkbenchOperatingSessionReference;
    }
}