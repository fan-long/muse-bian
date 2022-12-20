/*Operate equipment and/or a largely automated facility within Trade and Price Reporting. */
package org.museframework.bian.traandprirep.dto.cr;

public class MarketTradeReportingOperatingSession extends org.museframework.bian.classes.MarketTradeReportingOperatingSession {
    /*Timetable to operate Market Trade Reporting Operating Session*/
    private String marketTradeReportingOperatingSessionSchedule;

    /*The status of Market Trade Reporting Operating Session*/
    private String marketTradeReportingOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Market Trade Reporting Operating Session*/
    private org.museframework.bian.classes.Log marketTradeReportingOperatingSessionUsageLog;

    /*Reference to the party who is involved in Market Trade Reporting Operating Session*/
    private String marketTradeReportingOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Market Trade Reporting Operating Session*/
    private String marketTradeReportingOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Market Trade Reporting Operating Session*/
    private String marketTradeReportingOperatingSessionType;

    /*The schedule according to which the service provider will operate the Market Trade Reporting Operating Session*/
    private String marketTradeReportingOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Market Trade Reporting Operating Session*/
    private String marketTradeReportingOperatingSessionServiceType;

    /*The configuration of Market Trade Reporting Operating Session*/
    private org.museframework.bian.classes.SystemConfigurationOption marketTradeReportingOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Market Trade Reporting Operating Session*/
    private org.museframework.bian.classes.Session marketTradeReportingOperatingSessionReference;

    public void setMarketTradeReportingOperatingSessionSchedule(String marketTradeReportingOperatingSessionSchedule) {
        this.marketTradeReportingOperatingSessionSchedule = marketTradeReportingOperatingSessionSchedule;
    }

    public String getMarketTradeReportingOperatingSessionSchedule() {
        return marketTradeReportingOperatingSessionSchedule;
    }

    public void setMarketTradeReportingOperatingSessionStatus(String marketTradeReportingOperatingSessionStatus) {
        this.marketTradeReportingOperatingSessionStatus = marketTradeReportingOperatingSessionStatus;
    }

    public String getMarketTradeReportingOperatingSessionStatus() {
        return marketTradeReportingOperatingSessionStatus;
    }

    public void setMarketTradeReportingOperatingSessionUsageLog(org.museframework.bian.classes.Log marketTradeReportingOperatingSessionUsageLog) {
        this.marketTradeReportingOperatingSessionUsageLog = marketTradeReportingOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getMarketTradeReportingOperatingSessionUsageLog() {
        return marketTradeReportingOperatingSessionUsageLog;
    }

    public void setMarketTradeReportingOperatingSessionAssociatedPartyReference(String marketTradeReportingOperatingSessionAssociatedPartyReference) {
        this.marketTradeReportingOperatingSessionAssociatedPartyReference = marketTradeReportingOperatingSessionAssociatedPartyReference;
    }

    public String getMarketTradeReportingOperatingSessionAssociatedPartyReference() {
        return marketTradeReportingOperatingSessionAssociatedPartyReference;
    }

    public void setMarketTradeReportingOperatingSessionServiceProviderReference(String marketTradeReportingOperatingSessionServiceProviderReference) {
        this.marketTradeReportingOperatingSessionServiceProviderReference = marketTradeReportingOperatingSessionServiceProviderReference;
    }

    public String getMarketTradeReportingOperatingSessionServiceProviderReference() {
        return marketTradeReportingOperatingSessionServiceProviderReference;
    }

    public void setMarketTradeReportingOperatingSessionType(String marketTradeReportingOperatingSessionType) {
        this.marketTradeReportingOperatingSessionType = marketTradeReportingOperatingSessionType;
    }

    public String getMarketTradeReportingOperatingSessionType() {
        return marketTradeReportingOperatingSessionType;
    }

    public void setMarketTradeReportingOperatingSessionServiceProviderSchedule(String marketTradeReportingOperatingSessionServiceProviderSchedule) {
        this.marketTradeReportingOperatingSessionServiceProviderSchedule = marketTradeReportingOperatingSessionServiceProviderSchedule;
    }

    public String getMarketTradeReportingOperatingSessionServiceProviderSchedule() {
        return marketTradeReportingOperatingSessionServiceProviderSchedule;
    }

    public void setMarketTradeReportingOperatingSessionServiceType(String marketTradeReportingOperatingSessionServiceType) {
        this.marketTradeReportingOperatingSessionServiceType = marketTradeReportingOperatingSessionServiceType;
    }

    public String getMarketTradeReportingOperatingSessionServiceType() {
        return marketTradeReportingOperatingSessionServiceType;
    }

    public void setMarketTradeReportingOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption marketTradeReportingOperatingSessionServiceConfiguration) {
        this.marketTradeReportingOperatingSessionServiceConfiguration = marketTradeReportingOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getMarketTradeReportingOperatingSessionServiceConfiguration() {
        return marketTradeReportingOperatingSessionServiceConfiguration;
    }

    public void setMarketTradeReportingOperatingSessionReference(org.museframework.bian.classes.Session marketTradeReportingOperatingSessionReference) {
        this.marketTradeReportingOperatingSessionReference = marketTradeReportingOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getMarketTradeReportingOperatingSessionReference() {
        return marketTradeReportingOperatingSessionReference;
    }
}