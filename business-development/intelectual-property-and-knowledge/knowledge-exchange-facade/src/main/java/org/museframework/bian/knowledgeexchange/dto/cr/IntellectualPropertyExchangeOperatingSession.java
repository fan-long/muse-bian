/*Operate equipment and/or a largely automated facility  within Knowledge Exchange. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.knowledgeexchange.dto.cr;

public class IntellectualPropertyExchangeOperatingSession {
    /*The timetable of Intellectual Property Exchange Operating Session*/
    private String intellectualPropertyExchangeOperatingSessionSchedule;

    /*The status of Intellectual Property Exchange Operating Session*/
    private String intellectualPropertyExchangeOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Intellectual Property Exchange Operating Session*/
    private String intellectualPropertyExchangeOperatingSessionUsageLog;

    /*Reference to the party who is involved in Intellectual Property Exchange Operating Session*/
    private org.museframework.bian.classes.Object intellectualPropertyExchangeOperatingSessionReference;

    /*Reference to the party who provides the services of Intellectual Property Exchange Operating Session */
    private org.museframework.bian.classes.Object intellectualPropertyExchangeOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Intellectual Property Exchange Operating Session */
    private String intellectualPropertyExchangeOperatingSessionType;

    /*The schedule according to which the service provider will operate the Intellectual Property Exchange Operating Session*/
    private String intellectualPropertyExchangeOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Intellectual Property Exchange Operating Session */
    private String intellectualPropertyExchangeOperatingSessionServiceType;

    /*The configuration of Intellectual Property Exchange Operating Session*/
    private String intellectualPropertyExchangeOperatingSessionServiceConfiguration;

    public void setIntellectualPropertyExchangeOperatingSessionSchedule(String intellectualPropertyExchangeOperatingSessionSchedule) {
        this.intellectualPropertyExchangeOperatingSessionSchedule = intellectualPropertyExchangeOperatingSessionSchedule;
    }

    public String getIntellectualPropertyExchangeOperatingSessionSchedule() {
        return intellectualPropertyExchangeOperatingSessionSchedule;
    }

    public void setIntellectualPropertyExchangeOperatingSessionStatus(String intellectualPropertyExchangeOperatingSessionStatus) {
        this.intellectualPropertyExchangeOperatingSessionStatus = intellectualPropertyExchangeOperatingSessionStatus;
    }

    public String getIntellectualPropertyExchangeOperatingSessionStatus() {
        return intellectualPropertyExchangeOperatingSessionStatus;
    }

    public void setIntellectualPropertyExchangeOperatingSessionUsageLog(String intellectualPropertyExchangeOperatingSessionUsageLog) {
        this.intellectualPropertyExchangeOperatingSessionUsageLog = intellectualPropertyExchangeOperatingSessionUsageLog;
    }

    public String getIntellectualPropertyExchangeOperatingSessionUsageLog() {
        return intellectualPropertyExchangeOperatingSessionUsageLog;
    }

    public void setIntellectualPropertyExchangeOperatingSessionReference(org.museframework.bian.classes.Object intellectualPropertyExchangeOperatingSessionReference) {
        this.intellectualPropertyExchangeOperatingSessionReference = intellectualPropertyExchangeOperatingSessionReference;
    }

    public org.museframework.bian.classes.Object getIntellectualPropertyExchangeOperatingSessionReference() {
        return intellectualPropertyExchangeOperatingSessionReference;
    }

    public void setIntellectualPropertyExchangeOperatingSessionServiceProviderReference(org.museframework.bian.classes.Object intellectualPropertyExchangeOperatingSessionServiceProviderReference) {
        this.intellectualPropertyExchangeOperatingSessionServiceProviderReference = intellectualPropertyExchangeOperatingSessionServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getIntellectualPropertyExchangeOperatingSessionServiceProviderReference() {
        return intellectualPropertyExchangeOperatingSessionServiceProviderReference;
    }

    public void setIntellectualPropertyExchangeOperatingSessionType(String intellectualPropertyExchangeOperatingSessionType) {
        this.intellectualPropertyExchangeOperatingSessionType = intellectualPropertyExchangeOperatingSessionType;
    }

    public String getIntellectualPropertyExchangeOperatingSessionType() {
        return intellectualPropertyExchangeOperatingSessionType;
    }

    public void setIntellectualPropertyExchangeOperatingSessionServiceProviderSchedule(String intellectualPropertyExchangeOperatingSessionServiceProviderSchedule) {
        this.intellectualPropertyExchangeOperatingSessionServiceProviderSchedule = intellectualPropertyExchangeOperatingSessionServiceProviderSchedule;
    }

    public String getIntellectualPropertyExchangeOperatingSessionServiceProviderSchedule() {
        return intellectualPropertyExchangeOperatingSessionServiceProviderSchedule;
    }

    public void setIntellectualPropertyExchangeOperatingSessionServiceType(String intellectualPropertyExchangeOperatingSessionServiceType) {
        this.intellectualPropertyExchangeOperatingSessionServiceType = intellectualPropertyExchangeOperatingSessionServiceType;
    }

    public String getIntellectualPropertyExchangeOperatingSessionServiceType() {
        return intellectualPropertyExchangeOperatingSessionServiceType;
    }

    public void setIntellectualPropertyExchangeOperatingSessionServiceConfiguration(String intellectualPropertyExchangeOperatingSessionServiceConfiguration) {
        this.intellectualPropertyExchangeOperatingSessionServiceConfiguration = intellectualPropertyExchangeOperatingSessionServiceConfiguration;
    }

    public String getIntellectualPropertyExchangeOperatingSessionServiceConfiguration() {
        return intellectualPropertyExchangeOperatingSessionServiceConfiguration;
    }
}