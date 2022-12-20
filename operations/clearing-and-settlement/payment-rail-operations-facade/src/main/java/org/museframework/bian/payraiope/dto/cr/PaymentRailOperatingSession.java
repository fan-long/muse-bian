/*Operate equipment and/or a largely automated facility within Payment Rail Operations. */
package org.museframework.bian.payraiope.dto.cr;

public class PaymentRailOperatingSession extends org.museframework.bian.classes.PaymentRailOperatingSession {
    /*Timetable to operate Payment Rail Operating Session*/
    private String paymentRailOperatingSessionSchedule;

    /*The status of Payment Rail Operating Session*/
    private String paymentRailOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Payment Rail Operating Session*/
    private org.museframework.bian.classes.Log paymentRailOperatingSessionUsageLog;

    /*Reference to the party who is involved in Payment Rail Operating Session*/
    private String paymentRailOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Payment Rail Operating Session*/
    private String paymentRailOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Payment Rail Operating Session*/
    private String paymentRailOperatingSessionType;

    /*The schedule according to which the service provider will operate the Payment Rail Operating Session*/
    private String paymentRailOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Payment Rail Operating Session*/
    private String paymentRailOperatingSessionServiceType;

    /*The configuration of Payment Rail Operating Session*/
    private org.museframework.bian.classes.SystemConfigurationOption paymentRailOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Payment Rail Operating Session*/
    private org.museframework.bian.classes.Session paymentRailOperatingSessionReference;

    public void setPaymentRailOperatingSessionSchedule(String paymentRailOperatingSessionSchedule) {
        this.paymentRailOperatingSessionSchedule = paymentRailOperatingSessionSchedule;
    }

    public String getPaymentRailOperatingSessionSchedule() {
        return paymentRailOperatingSessionSchedule;
    }

    public void setPaymentRailOperatingSessionStatus(String paymentRailOperatingSessionStatus) {
        this.paymentRailOperatingSessionStatus = paymentRailOperatingSessionStatus;
    }

    public String getPaymentRailOperatingSessionStatus() {
        return paymentRailOperatingSessionStatus;
    }

    public void setPaymentRailOperatingSessionUsageLog(org.museframework.bian.classes.Log paymentRailOperatingSessionUsageLog) {
        this.paymentRailOperatingSessionUsageLog = paymentRailOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getPaymentRailOperatingSessionUsageLog() {
        return paymentRailOperatingSessionUsageLog;
    }

    public void setPaymentRailOperatingSessionAssociatedPartyReference(String paymentRailOperatingSessionAssociatedPartyReference) {
        this.paymentRailOperatingSessionAssociatedPartyReference = paymentRailOperatingSessionAssociatedPartyReference;
    }

    public String getPaymentRailOperatingSessionAssociatedPartyReference() {
        return paymentRailOperatingSessionAssociatedPartyReference;
    }

    public void setPaymentRailOperatingSessionServiceProviderReference(String paymentRailOperatingSessionServiceProviderReference) {
        this.paymentRailOperatingSessionServiceProviderReference = paymentRailOperatingSessionServiceProviderReference;
    }

    public String getPaymentRailOperatingSessionServiceProviderReference() {
        return paymentRailOperatingSessionServiceProviderReference;
    }

    public void setPaymentRailOperatingSessionType(String paymentRailOperatingSessionType) {
        this.paymentRailOperatingSessionType = paymentRailOperatingSessionType;
    }

    public String getPaymentRailOperatingSessionType() {
        return paymentRailOperatingSessionType;
    }

    public void setPaymentRailOperatingSessionServiceProviderSchedule(String paymentRailOperatingSessionServiceProviderSchedule) {
        this.paymentRailOperatingSessionServiceProviderSchedule = paymentRailOperatingSessionServiceProviderSchedule;
    }

    public String getPaymentRailOperatingSessionServiceProviderSchedule() {
        return paymentRailOperatingSessionServiceProviderSchedule;
    }

    public void setPaymentRailOperatingSessionServiceType(String paymentRailOperatingSessionServiceType) {
        this.paymentRailOperatingSessionServiceType = paymentRailOperatingSessionServiceType;
    }

    public String getPaymentRailOperatingSessionServiceType() {
        return paymentRailOperatingSessionServiceType;
    }

    public void setPaymentRailOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption paymentRailOperatingSessionServiceConfiguration) {
        this.paymentRailOperatingSessionServiceConfiguration = paymentRailOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getPaymentRailOperatingSessionServiceConfiguration() {
        return paymentRailOperatingSessionServiceConfiguration;
    }

    public void setPaymentRailOperatingSessionReference(org.museframework.bian.classes.Session paymentRailOperatingSessionReference) {
        this.paymentRailOperatingSessionReference = paymentRailOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getPaymentRailOperatingSessionReference() {
        return paymentRailOperatingSessionReference;
    }
}