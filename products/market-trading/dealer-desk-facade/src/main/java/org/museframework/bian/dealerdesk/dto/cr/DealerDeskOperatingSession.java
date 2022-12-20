/*Operate equipment and/or a largely automated facility within Dealer Desk. */
package org.museframework.bian.dealerdesk.dto.cr;

public class DealerDeskOperatingSession {
    /*Timetable to operate Dealer Desk Operating Session*/
    private String dealerDeskOperatingSessionSchedule;

    /*The status of Dealer Desk Operating Session*/
    private String dealerDeskOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Dealer Desk Operating Session*/
    private org.museframework.bian.classes.Log dealerDeskOperatingSessionUsageLog;

    /*Reference to the party who is involved in Dealer Desk Operating Session*/
    private String dealerDeskOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Dealer Desk Operating Session*/
    private String dealerDeskOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Dealer Desk Operating Session*/
    private String dealerDeskOperatingSessionType;

    /*The schedule according to which the service provider will operate the Dealer Desk Operating Session*/
    private String dealerDeskOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Dealer Desk Operating Session*/
    private String dealerDeskOperatingSessionServiceType;

    /*The configuration of Dealer Desk Operating Session*/
    private org.museframework.bian.classes.SystemConfigurationOption dealerDeskOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Dealer Desk Operating Session*/
    private org.museframework.bian.classes.Session dealerDeskOperatingSessionReference;

    public void setDealerDeskOperatingSessionSchedule(String dealerDeskOperatingSessionSchedule) {
        this.dealerDeskOperatingSessionSchedule = dealerDeskOperatingSessionSchedule;
    }

    public String getDealerDeskOperatingSessionSchedule() {
        return dealerDeskOperatingSessionSchedule;
    }

    public void setDealerDeskOperatingSessionStatus(String dealerDeskOperatingSessionStatus) {
        this.dealerDeskOperatingSessionStatus = dealerDeskOperatingSessionStatus;
    }

    public String getDealerDeskOperatingSessionStatus() {
        return dealerDeskOperatingSessionStatus;
    }

    public void setDealerDeskOperatingSessionUsageLog(org.museframework.bian.classes.Log dealerDeskOperatingSessionUsageLog) {
        this.dealerDeskOperatingSessionUsageLog = dealerDeskOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getDealerDeskOperatingSessionUsageLog() {
        return dealerDeskOperatingSessionUsageLog;
    }

    public void setDealerDeskOperatingSessionAssociatedPartyReference(String dealerDeskOperatingSessionAssociatedPartyReference) {
        this.dealerDeskOperatingSessionAssociatedPartyReference = dealerDeskOperatingSessionAssociatedPartyReference;
    }

    public String getDealerDeskOperatingSessionAssociatedPartyReference() {
        return dealerDeskOperatingSessionAssociatedPartyReference;
    }

    public void setDealerDeskOperatingSessionServiceProviderReference(String dealerDeskOperatingSessionServiceProviderReference) {
        this.dealerDeskOperatingSessionServiceProviderReference = dealerDeskOperatingSessionServiceProviderReference;
    }

    public String getDealerDeskOperatingSessionServiceProviderReference() {
        return dealerDeskOperatingSessionServiceProviderReference;
    }

    public void setDealerDeskOperatingSessionType(String dealerDeskOperatingSessionType) {
        this.dealerDeskOperatingSessionType = dealerDeskOperatingSessionType;
    }

    public String getDealerDeskOperatingSessionType() {
        return dealerDeskOperatingSessionType;
    }

    public void setDealerDeskOperatingSessionServiceProviderSchedule(String dealerDeskOperatingSessionServiceProviderSchedule) {
        this.dealerDeskOperatingSessionServiceProviderSchedule = dealerDeskOperatingSessionServiceProviderSchedule;
    }

    public String getDealerDeskOperatingSessionServiceProviderSchedule() {
        return dealerDeskOperatingSessionServiceProviderSchedule;
    }

    public void setDealerDeskOperatingSessionServiceType(String dealerDeskOperatingSessionServiceType) {
        this.dealerDeskOperatingSessionServiceType = dealerDeskOperatingSessionServiceType;
    }

    public String getDealerDeskOperatingSessionServiceType() {
        return dealerDeskOperatingSessionServiceType;
    }

    public void setDealerDeskOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption dealerDeskOperatingSessionServiceConfiguration) {
        this.dealerDeskOperatingSessionServiceConfiguration = dealerDeskOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getDealerDeskOperatingSessionServiceConfiguration() {
        return dealerDeskOperatingSessionServiceConfiguration;
    }

    public void setDealerDeskOperatingSessionReference(org.museframework.bian.classes.Session dealerDeskOperatingSessionReference) {
        this.dealerDeskOperatingSessionReference = dealerDeskOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getDealerDeskOperatingSessionReference() {
        return dealerDeskOperatingSessionReference;
    }
}