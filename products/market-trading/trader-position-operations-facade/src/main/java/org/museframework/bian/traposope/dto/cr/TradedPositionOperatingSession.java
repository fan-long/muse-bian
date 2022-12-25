/*Operate equipment and/or a largely automated facility within Trader Position Operations. */
package org.museframework.bian.traposope.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.TradedPositionOperatingSession
@MetaDto
public class TradedPositionOperatingSession {
    /*Timetable to operate Traded Position Operating Session*/
    @MetaField(0)
    private String tradedPositionOperatingSessionSchedule;

    /*The status of Traded Position Operating Session*/
    @MetaField(0)
    private String tradedPositionOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Traded Position Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log tradedPositionOperatingSessionUsageLog;

    /*Reference to the party who is involved in Traded Position Operating Session*/
    @MetaField(0)
    private String tradedPositionOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Traded Position Operating Session*/
    @MetaField(0)
    private String tradedPositionOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Traded Position Operating Session*/
    @MetaField(0)
    private String tradedPositionOperatingSessionType;

    /*The schedule according to which the service provider will operate the Traded Position Operating Session*/
    @MetaField(0)
    private String tradedPositionOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Traded Position Operating Session*/
    @MetaField(0)
    private String tradedPositionOperatingSessionServiceType;

    /*The configuration of Traded Position Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.SystemConfigurationOption tradedPositionOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Traded Position Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session tradedPositionOperatingSessionReference;

    public void setTradedPositionOperatingSessionSchedule(String tradedPositionOperatingSessionSchedule) {
        this.tradedPositionOperatingSessionSchedule = tradedPositionOperatingSessionSchedule;
    }

    public String getTradedPositionOperatingSessionSchedule() {
        return tradedPositionOperatingSessionSchedule;
    }

    public void setTradedPositionOperatingSessionStatus(String tradedPositionOperatingSessionStatus) {
        this.tradedPositionOperatingSessionStatus = tradedPositionOperatingSessionStatus;
    }

    public String getTradedPositionOperatingSessionStatus() {
        return tradedPositionOperatingSessionStatus;
    }

    public void setTradedPositionOperatingSessionUsageLog(org.museframework.bian.classes.Log tradedPositionOperatingSessionUsageLog) {
        this.tradedPositionOperatingSessionUsageLog = tradedPositionOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getTradedPositionOperatingSessionUsageLog() {
        return tradedPositionOperatingSessionUsageLog;
    }

    public void setTradedPositionOperatingSessionAssociatedPartyReference(String tradedPositionOperatingSessionAssociatedPartyReference) {
        this.tradedPositionOperatingSessionAssociatedPartyReference = tradedPositionOperatingSessionAssociatedPartyReference;
    }

    public String getTradedPositionOperatingSessionAssociatedPartyReference() {
        return tradedPositionOperatingSessionAssociatedPartyReference;
    }

    public void setTradedPositionOperatingSessionServiceProviderReference(String tradedPositionOperatingSessionServiceProviderReference) {
        this.tradedPositionOperatingSessionServiceProviderReference = tradedPositionOperatingSessionServiceProviderReference;
    }

    public String getTradedPositionOperatingSessionServiceProviderReference() {
        return tradedPositionOperatingSessionServiceProviderReference;
    }

    public void setTradedPositionOperatingSessionType(String tradedPositionOperatingSessionType) {
        this.tradedPositionOperatingSessionType = tradedPositionOperatingSessionType;
    }

    public String getTradedPositionOperatingSessionType() {
        return tradedPositionOperatingSessionType;
    }

    public void setTradedPositionOperatingSessionServiceProviderSchedule(String tradedPositionOperatingSessionServiceProviderSchedule) {
        this.tradedPositionOperatingSessionServiceProviderSchedule = tradedPositionOperatingSessionServiceProviderSchedule;
    }

    public String getTradedPositionOperatingSessionServiceProviderSchedule() {
        return tradedPositionOperatingSessionServiceProviderSchedule;
    }

    public void setTradedPositionOperatingSessionServiceType(String tradedPositionOperatingSessionServiceType) {
        this.tradedPositionOperatingSessionServiceType = tradedPositionOperatingSessionServiceType;
    }

    public String getTradedPositionOperatingSessionServiceType() {
        return tradedPositionOperatingSessionServiceType;
    }

    public void setTradedPositionOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption tradedPositionOperatingSessionServiceConfiguration) {
        this.tradedPositionOperatingSessionServiceConfiguration = tradedPositionOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getTradedPositionOperatingSessionServiceConfiguration() {
        return tradedPositionOperatingSessionServiceConfiguration;
    }

    public void setTradedPositionOperatingSessionReference(org.museframework.bian.classes.Session tradedPositionOperatingSessionReference) {
        this.tradedPositionOperatingSessionReference = tradedPositionOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getTradedPositionOperatingSessionReference() {
        return tradedPositionOperatingSessionReference;
    }
}