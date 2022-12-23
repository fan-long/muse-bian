/*Capture and maintain reference information about some type of entitity within Service Directory.*/
package org.museframework.bian.servicedirectory.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServiceDirectoryEntry {
    /*Documentation of Service Directory Entry*/
    @MetaField
    private String serviceDirectoryEntryDescription;

    /*The timetable to capture and maintain Service Directory Entry*/
    @MetaField
    private String serviceDirectoryEntrySchedule;

    /*The version of Service Directory Entry*/
    @MetaField
    private String serviceDirectoryEntryVersion;

    /*The status of Service Directory Entry*/
    @MetaField
    private String serviceDirectoryEntryStatus;

    /*Reference to the log of (usage) ativities/events  of Service Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log serviceDirectoryEntryUsageLog;

    /*Reference to the log of (update) ativities/events of Service Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log serviceDirectoryEntryUpdateLog;

    /*The configuration of Service Directory Entry*/
    @MetaField
    private String serviceDirectoryEntryServiceConfiguration;

    /*An unique reference to an item or an occurrence of Service Directory Entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry serviceDirectoryEntryReference;

    public void setServiceDirectoryEntryDescription(String serviceDirectoryEntryDescription) {
        this.serviceDirectoryEntryDescription = serviceDirectoryEntryDescription;
    }

    public String getServiceDirectoryEntryDescription() {
        return serviceDirectoryEntryDescription;
    }

    public void setServiceDirectoryEntrySchedule(String serviceDirectoryEntrySchedule) {
        this.serviceDirectoryEntrySchedule = serviceDirectoryEntrySchedule;
    }

    public String getServiceDirectoryEntrySchedule() {
        return serviceDirectoryEntrySchedule;
    }

    public void setServiceDirectoryEntryVersion(String serviceDirectoryEntryVersion) {
        this.serviceDirectoryEntryVersion = serviceDirectoryEntryVersion;
    }

    public String getServiceDirectoryEntryVersion() {
        return serviceDirectoryEntryVersion;
    }

    public void setServiceDirectoryEntryStatus(String serviceDirectoryEntryStatus) {
        this.serviceDirectoryEntryStatus = serviceDirectoryEntryStatus;
    }

    public String getServiceDirectoryEntryStatus() {
        return serviceDirectoryEntryStatus;
    }

    public void setServiceDirectoryEntryUsageLog(org.museframework.bian.classes.Log serviceDirectoryEntryUsageLog) {
        this.serviceDirectoryEntryUsageLog = serviceDirectoryEntryUsageLog;
    }

    public org.museframework.bian.classes.Log getServiceDirectoryEntryUsageLog() {
        return serviceDirectoryEntryUsageLog;
    }

    public void setServiceDirectoryEntryUpdateLog(org.museframework.bian.classes.Log serviceDirectoryEntryUpdateLog) {
        this.serviceDirectoryEntryUpdateLog = serviceDirectoryEntryUpdateLog;
    }

    public org.museframework.bian.classes.Log getServiceDirectoryEntryUpdateLog() {
        return serviceDirectoryEntryUpdateLog;
    }

    public void setServiceDirectoryEntryServiceConfiguration(String serviceDirectoryEntryServiceConfiguration) {
        this.serviceDirectoryEntryServiceConfiguration = serviceDirectoryEntryServiceConfiguration;
    }

    public String getServiceDirectoryEntryServiceConfiguration() {
        return serviceDirectoryEntryServiceConfiguration;
    }

    public void setServiceDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry serviceDirectoryEntryReference) {
        this.serviceDirectoryEntryReference = serviceDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getServiceDirectoryEntryReference() {
        return serviceDirectoryEntryReference;
    }
}