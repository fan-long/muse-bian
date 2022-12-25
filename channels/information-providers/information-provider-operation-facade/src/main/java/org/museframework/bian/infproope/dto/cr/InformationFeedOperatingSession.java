/*Operate equipment and/or a largely automated facility within Information Provider Operation. */
package org.museframework.bian.infproope.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InformationFeedOperatingSession {
    /*Timetable to operate Information Feed Operating Session*/
    @MetaField(0)
    private String informationFeedOperatingSessionSchedule;

    /*The status of Information Feed Operating Session*/
    @MetaField(0)
    private String informationFeedOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Information Feed Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log informationFeedOperatingSessionUsageLog;

    /*Reference to the party who is involved in Information Feed Operating Session*/
    @MetaField(0)
    private String informationFeedOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Information Feed Operating Session*/
    @MetaField(0)
    private String informationFeedOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Information Feed Operating Session*/
    @MetaField(0)
    private String informationFeedOperatingSessionType;

    /*The schedule according to which the service provider will operate the Information Feed Operating Session*/
    @MetaField(0)
    private String informationFeedOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Information Feed Operating Session*/
    @MetaField(0)
    private String informationFeedOperatingSessionServiceType;

    /*The configuration of Information Feed Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.SystemConfigurationOption informationFeedOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Information Feed Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session informationFeedOperatingSessionReference;

    public void setInformationFeedOperatingSessionSchedule(String informationFeedOperatingSessionSchedule) {
        this.informationFeedOperatingSessionSchedule = informationFeedOperatingSessionSchedule;
    }

    public String getInformationFeedOperatingSessionSchedule() {
        return informationFeedOperatingSessionSchedule;
    }

    public void setInformationFeedOperatingSessionStatus(String informationFeedOperatingSessionStatus) {
        this.informationFeedOperatingSessionStatus = informationFeedOperatingSessionStatus;
    }

    public String getInformationFeedOperatingSessionStatus() {
        return informationFeedOperatingSessionStatus;
    }

    public void setInformationFeedOperatingSessionUsageLog(org.museframework.bian.classes.Log informationFeedOperatingSessionUsageLog) {
        this.informationFeedOperatingSessionUsageLog = informationFeedOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getInformationFeedOperatingSessionUsageLog() {
        return informationFeedOperatingSessionUsageLog;
    }

    public void setInformationFeedOperatingSessionAssociatedPartyReference(String informationFeedOperatingSessionAssociatedPartyReference) {
        this.informationFeedOperatingSessionAssociatedPartyReference = informationFeedOperatingSessionAssociatedPartyReference;
    }

    public String getInformationFeedOperatingSessionAssociatedPartyReference() {
        return informationFeedOperatingSessionAssociatedPartyReference;
    }

    public void setInformationFeedOperatingSessionServiceProviderReference(String informationFeedOperatingSessionServiceProviderReference) {
        this.informationFeedOperatingSessionServiceProviderReference = informationFeedOperatingSessionServiceProviderReference;
    }

    public String getInformationFeedOperatingSessionServiceProviderReference() {
        return informationFeedOperatingSessionServiceProviderReference;
    }

    public void setInformationFeedOperatingSessionType(String informationFeedOperatingSessionType) {
        this.informationFeedOperatingSessionType = informationFeedOperatingSessionType;
    }

    public String getInformationFeedOperatingSessionType() {
        return informationFeedOperatingSessionType;
    }

    public void setInformationFeedOperatingSessionServiceProviderSchedule(String informationFeedOperatingSessionServiceProviderSchedule) {
        this.informationFeedOperatingSessionServiceProviderSchedule = informationFeedOperatingSessionServiceProviderSchedule;
    }

    public String getInformationFeedOperatingSessionServiceProviderSchedule() {
        return informationFeedOperatingSessionServiceProviderSchedule;
    }

    public void setInformationFeedOperatingSessionServiceType(String informationFeedOperatingSessionServiceType) {
        this.informationFeedOperatingSessionServiceType = informationFeedOperatingSessionServiceType;
    }

    public String getInformationFeedOperatingSessionServiceType() {
        return informationFeedOperatingSessionServiceType;
    }

    public void setInformationFeedOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption informationFeedOperatingSessionServiceConfiguration) {
        this.informationFeedOperatingSessionServiceConfiguration = informationFeedOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getInformationFeedOperatingSessionServiceConfiguration() {
        return informationFeedOperatingSessionServiceConfiguration;
    }

    public void setInformationFeedOperatingSessionReference(org.museframework.bian.classes.Session informationFeedOperatingSessionReference) {
        this.informationFeedOperatingSessionReference = informationFeedOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getInformationFeedOperatingSessionReference() {
        return informationFeedOperatingSessionReference;
    }
}