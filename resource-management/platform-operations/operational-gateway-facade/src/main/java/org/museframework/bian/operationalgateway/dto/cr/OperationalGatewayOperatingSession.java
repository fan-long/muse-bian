/*Operate equipment and/or a largely automated facility within Operational Gateway. */
package org.museframework.bian.operationalgateway.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.OperationalGatewayOperatingSession
@MetaDto
public class OperationalGatewayOperatingSession {
    /*Timetable to operate Operational Gateway Operating Session*/
    @MetaField
    private String operationalGatewayOperatingSessionSchedule;

    /*The status of Operational Gateway Operating Session*/
    @MetaField
    private String operationalGatewayOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Operational Gateway Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log operationalGatewayOperatingSessionUsageLog;

    /*Reference to the party who is involved in Operational Gateway Operating Session*/
    @MetaField
    private String operationalGatewayOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Operational Gateway Operating Session*/
    @MetaField
    private String operationalGatewayOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Operational Gateway Operating Session*/
    @MetaField
    private String operationalGatewayOperatingSessionType;

    /*The schedule according to which the service provider will operate the Operational Gateway Operating Session*/
    @MetaField
    private String operationalGatewayOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Operational Gateway Operating Session*/
    @MetaField
    private String operationalGatewayOperatingSessionServiceType;

    /*The configuration of Operational Gateway Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.SystemConfigurationOption operationalGatewayOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Operational Gateway Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session operationalGatewayOperatingSessionReference;

    public void setOperationalGatewayOperatingSessionSchedule(String operationalGatewayOperatingSessionSchedule) {
        this.operationalGatewayOperatingSessionSchedule = operationalGatewayOperatingSessionSchedule;
    }

    public String getOperationalGatewayOperatingSessionSchedule() {
        return operationalGatewayOperatingSessionSchedule;
    }

    public void setOperationalGatewayOperatingSessionStatus(String operationalGatewayOperatingSessionStatus) {
        this.operationalGatewayOperatingSessionStatus = operationalGatewayOperatingSessionStatus;
    }

    public String getOperationalGatewayOperatingSessionStatus() {
        return operationalGatewayOperatingSessionStatus;
    }

    public void setOperationalGatewayOperatingSessionUsageLog(org.museframework.bian.classes.Log operationalGatewayOperatingSessionUsageLog) {
        this.operationalGatewayOperatingSessionUsageLog = operationalGatewayOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getOperationalGatewayOperatingSessionUsageLog() {
        return operationalGatewayOperatingSessionUsageLog;
    }

    public void setOperationalGatewayOperatingSessionAssociatedPartyReference(String operationalGatewayOperatingSessionAssociatedPartyReference) {
        this.operationalGatewayOperatingSessionAssociatedPartyReference = operationalGatewayOperatingSessionAssociatedPartyReference;
    }

    public String getOperationalGatewayOperatingSessionAssociatedPartyReference() {
        return operationalGatewayOperatingSessionAssociatedPartyReference;
    }

    public void setOperationalGatewayOperatingSessionServiceProviderReference(String operationalGatewayOperatingSessionServiceProviderReference) {
        this.operationalGatewayOperatingSessionServiceProviderReference = operationalGatewayOperatingSessionServiceProviderReference;
    }

    public String getOperationalGatewayOperatingSessionServiceProviderReference() {
        return operationalGatewayOperatingSessionServiceProviderReference;
    }

    public void setOperationalGatewayOperatingSessionType(String operationalGatewayOperatingSessionType) {
        this.operationalGatewayOperatingSessionType = operationalGatewayOperatingSessionType;
    }

    public String getOperationalGatewayOperatingSessionType() {
        return operationalGatewayOperatingSessionType;
    }

    public void setOperationalGatewayOperatingSessionServiceProviderSchedule(String operationalGatewayOperatingSessionServiceProviderSchedule) {
        this.operationalGatewayOperatingSessionServiceProviderSchedule = operationalGatewayOperatingSessionServiceProviderSchedule;
    }

    public String getOperationalGatewayOperatingSessionServiceProviderSchedule() {
        return operationalGatewayOperatingSessionServiceProviderSchedule;
    }

    public void setOperationalGatewayOperatingSessionServiceType(String operationalGatewayOperatingSessionServiceType) {
        this.operationalGatewayOperatingSessionServiceType = operationalGatewayOperatingSessionServiceType;
    }

    public String getOperationalGatewayOperatingSessionServiceType() {
        return operationalGatewayOperatingSessionServiceType;
    }

    public void setOperationalGatewayOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption operationalGatewayOperatingSessionServiceConfiguration) {
        this.operationalGatewayOperatingSessionServiceConfiguration = operationalGatewayOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getOperationalGatewayOperatingSessionServiceConfiguration() {
        return operationalGatewayOperatingSessionServiceConfiguration;
    }

    public void setOperationalGatewayOperatingSessionReference(org.museframework.bian.classes.Session operationalGatewayOperatingSessionReference) {
        this.operationalGatewayOperatingSessionReference = operationalGatewayOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getOperationalGatewayOperatingSessionReference() {
        return operationalGatewayOperatingSessionReference;
    }
}