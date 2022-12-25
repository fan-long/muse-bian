/*Operate equipment and/or a largely automated facility within Archive Services. */
package org.museframework.bian.archiveservices.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ArchiveOperatingSession
@MetaDto
public class ArchiveOperatingSession {
    /*Timetable to operate Archive Operating Session*/
    @MetaField(0)
    private String archiveOperatingSessionSchedule;

    /*The status of Archive Operating Session*/
    @MetaField(0)
    private String archiveOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Archive Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log archiveOperatingSessionUsageLog;

    /*Reference to the party who is involved in Archive Operating Session*/
    @MetaField(0)
    private String archiveOperatingSessionAssociatedPartyReference;

    /*Reference to the party who provides the services of Archive Operating Session*/
    @MetaField(0)
    private String archiveOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Archive Operating Session*/
    @MetaField(0)
    private String archiveOperatingSessionType;

    /*The schedule according to which the service provider will operate the Archive Operating Session*/
    @MetaField(0)
    private String archiveOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Archive Operating Session*/
    @MetaField(0)
    private String archiveOperatingSessionServiceType;

    /*The configuration of Archive Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.SystemConfigurationOption archiveOperatingSessionServiceConfiguration;

    /*An unique reference to an item or an occurrence of Archive Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session archiveOperatingSessionReference;

    public void setArchiveOperatingSessionSchedule(String archiveOperatingSessionSchedule) {
        this.archiveOperatingSessionSchedule = archiveOperatingSessionSchedule;
    }

    public String getArchiveOperatingSessionSchedule() {
        return archiveOperatingSessionSchedule;
    }

    public void setArchiveOperatingSessionStatus(String archiveOperatingSessionStatus) {
        this.archiveOperatingSessionStatus = archiveOperatingSessionStatus;
    }

    public String getArchiveOperatingSessionStatus() {
        return archiveOperatingSessionStatus;
    }

    public void setArchiveOperatingSessionUsageLog(org.museframework.bian.classes.Log archiveOperatingSessionUsageLog) {
        this.archiveOperatingSessionUsageLog = archiveOperatingSessionUsageLog;
    }

    public org.museframework.bian.classes.Log getArchiveOperatingSessionUsageLog() {
        return archiveOperatingSessionUsageLog;
    }

    public void setArchiveOperatingSessionAssociatedPartyReference(String archiveOperatingSessionAssociatedPartyReference) {
        this.archiveOperatingSessionAssociatedPartyReference = archiveOperatingSessionAssociatedPartyReference;
    }

    public String getArchiveOperatingSessionAssociatedPartyReference() {
        return archiveOperatingSessionAssociatedPartyReference;
    }

    public void setArchiveOperatingSessionServiceProviderReference(String archiveOperatingSessionServiceProviderReference) {
        this.archiveOperatingSessionServiceProviderReference = archiveOperatingSessionServiceProviderReference;
    }

    public String getArchiveOperatingSessionServiceProviderReference() {
        return archiveOperatingSessionServiceProviderReference;
    }

    public void setArchiveOperatingSessionType(String archiveOperatingSessionType) {
        this.archiveOperatingSessionType = archiveOperatingSessionType;
    }

    public String getArchiveOperatingSessionType() {
        return archiveOperatingSessionType;
    }

    public void setArchiveOperatingSessionServiceProviderSchedule(String archiveOperatingSessionServiceProviderSchedule) {
        this.archiveOperatingSessionServiceProviderSchedule = archiveOperatingSessionServiceProviderSchedule;
    }

    public String getArchiveOperatingSessionServiceProviderSchedule() {
        return archiveOperatingSessionServiceProviderSchedule;
    }

    public void setArchiveOperatingSessionServiceType(String archiveOperatingSessionServiceType) {
        this.archiveOperatingSessionServiceType = archiveOperatingSessionServiceType;
    }

    public String getArchiveOperatingSessionServiceType() {
        return archiveOperatingSessionServiceType;
    }

    public void setArchiveOperatingSessionServiceConfiguration(org.museframework.bian.classes.SystemConfigurationOption archiveOperatingSessionServiceConfiguration) {
        this.archiveOperatingSessionServiceConfiguration = archiveOperatingSessionServiceConfiguration;
    }

    public org.museframework.bian.classes.SystemConfigurationOption getArchiveOperatingSessionServiceConfiguration() {
        return archiveOperatingSessionServiceConfiguration;
    }

    public void setArchiveOperatingSessionReference(org.museframework.bian.classes.Session archiveOperatingSessionReference) {
        this.archiveOperatingSessionReference = archiveOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getArchiveOperatingSessionReference() {
        return archiveOperatingSessionReference;
    }
}