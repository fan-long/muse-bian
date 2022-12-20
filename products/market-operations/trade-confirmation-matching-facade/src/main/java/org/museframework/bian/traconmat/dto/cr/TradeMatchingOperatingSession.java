/*Operate equipment and/or a largely automated facility within Trade Confirmation Matching. */
package org.museframework.bian.traconmat.dto.cr;

public class TradeMatchingOperatingSession extends org.museframework.bian.classes.TradeMatchingOperatingSession {
    /*Timetable to operate Trade Matching Operating Session*/
    private String tradeMatchingOperatingSessionSchedule;

    /*The status of Trade Matching Operating Session*/
    private String tradeMatchingOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Trade Matching Operating Session*/
    private org.museframework.bian.classes.Log tradeMatchingOperatingSessionUsageLog;

    /*Reference to the party who is involved in Trade Matching Operating Session*/
    private String tradeMatchingOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Trade Matching Operating Session*/
    private String tradeMatchingOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Trade Matching Operating Session*/
    private String tradeMatchingOperatingSessionType;

    /*The schedule according to which the service provider will operate the Trade Matching Operating Session*/
    private String tradeMatchingOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Trade Matching Operating Session*/
    private String tradeMatchingOperatingSessionServiceType;

    /*The configuration of Trade Matching Operating Session*/
    private org.museframework.bian.classes.SystemConfigurationOption tradeMatchingOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Trade Matching Operating Session*/
    private org.museframework.bian.classes.Session tradeMatchingOperatingSessionReference;

    public void setTradeMatchingOperatingSessionSchedule(String tradeMatchingOperatingSessionSchedule) {
        this.tradeMatchingOperatingSessionSchedule = tradeMatchingOperatingSessionSchedule;
    }

    public String getTradeMatchingOperatingSessionSchedule() {
        return tradeMatchingOperatingSessionSchedule;
    }

    public void setTradeMatchingOperatingSessionStatus(String tradeMatchingOperatingSessionStatus) {
        this.tradeMatchingOperatingSessionStatus = tradeMatchingOperatingSessionStatus;
    }

    public String getTradeMatchingOperatingSessionStatus() {
        return tradeMatchingOperatingSessionStatus;
    }

    public void setTradeMatchingOperatingSessionUsageLog(org.museframework.bian.classes.Log tradeMatchingOperatingSessionUsageLog) {
        this.tradeMatchingOperatingSessionUsageLog = tradeMatchingOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getTradeMatchingOperatingSessionUsageLog() {
        return tradeMatchingOperatingSessionUsageLog;
    }

    public void setTradeMatchingOperatingSessionAssociatedPartyReference(String tradeMatchingOperatingSessionAssociatedPartyReference) {
        this.tradeMatchingOperatingSessionAssociatedPartyReference = tradeMatchingOperatingSessionAssociatedPartyReference;
    }

    public String getTradeMatchingOperatingSessionAssociatedPartyReference() {
        return tradeMatchingOperatingSessionAssociatedPartyReference;
    }

    public void setTradeMatchingOperatingSessionServiceProviderReference(String tradeMatchingOperatingSessionServiceProviderReference) {
        this.tradeMatchingOperatingSessionServiceProviderReference = tradeMatchingOperatingSessionServiceProviderReference;
    }

    public String getTradeMatchingOperatingSessionServiceProviderReference() {
        return tradeMatchingOperatingSessionServiceProviderReference;
    }

    public void setTradeMatchingOperatingSessionType(String tradeMatchingOperatingSessionType) {
        this.tradeMatchingOperatingSessionType = tradeMatchingOperatingSessionType;
    }

    public String getTradeMatchingOperatingSessionType() {
        return tradeMatchingOperatingSessionType;
    }

    public void setTradeMatchingOperatingSessionServiceProviderSchedule(String tradeMatchingOperatingSessionServiceProviderSchedule) {
        this.tradeMatchingOperatingSessionServiceProviderSchedule = tradeMatchingOperatingSessionServiceProviderSchedule;
    }

    public String getTradeMatchingOperatingSessionServiceProviderSchedule() {
        return tradeMatchingOperatingSessionServiceProviderSchedule;
    }

    public void setTradeMatchingOperatingSessionServiceType(String tradeMatchingOperatingSessionServiceType) {
        this.tradeMatchingOperatingSessionServiceType = tradeMatchingOperatingSessionServiceType;
    }

    public String getTradeMatchingOperatingSessionServiceType() {
        return tradeMatchingOperatingSessionServiceType;
    }

    public void setTradeMatchingOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption tradeMatchingOperatingSessionServiceConfiguration) {
        this.tradeMatchingOperatingSessionServiceConfiguration = tradeMatchingOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getTradeMatchingOperatingSessionServiceConfiguration() {
        return tradeMatchingOperatingSessionServiceConfiguration;
    }

    public void setTradeMatchingOperatingSessionReference(org.museframework.bian.classes.Session tradeMatchingOperatingSessionReference) {
        this.tradeMatchingOperatingSessionReference = tradeMatchingOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getTradeMatchingOperatingSessionReference() {
        return tradeMatchingOperatingSessionReference;
    }
}