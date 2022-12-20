/*Capture and maintain reference information about some type of entitity within Party Asset Directory Entry*/
package org.museframework.bian.parassdir.dto.cr;

public class PartyAssetDirectoryEntry {
    /*Documentation of Party Asset Directory Entry*/
    private String partyAssetDirectoryEntryDescription;

    /*The timetable to capture and maintain Party Asset Directory Entry*/
    private String partyAssetDirectoryEntrySchedule;

    /*The version of Party Asset Directory Entry*/
    private String partyAssetDirectoryEntryVersion;

    /*The status of Party Asset Directory Entry*/
    private String partyAssetDirectoryEntryStatus;

    /*Reference to the log of (usage) ativities/events  of Party Asset Directory Entry*/
    private org.museframework.bian.classes.Log partyAssetDirectoryEntryUsageLog;

    /*Reference to the log of (update) ativities/events of Party Asset Directory Entry*/
    private org.museframework.bian.classes.Log partyAssetDirectoryEntryUpdateLog;

    /*The configuration of Party Asset Directory Entry*/
    private String partyAssetDirectoryEntryServiceConfiguration;

    /*An unique reference to an item or an occurrence of Party Asset Directory Entry*/
    private org.museframework.bian.classes.DirectoryEntry partyAssetDirectoryEntryReference;

    /**/
    private org.museframework.bian.classes.Asset partyAssetReference;

    public void setPartyAssetDirectoryEntryDescription(String partyAssetDirectoryEntryDescription) {
        this.partyAssetDirectoryEntryDescription = partyAssetDirectoryEntryDescription;
    }

    public String getPartyAssetDirectoryEntryDescription() {
        return partyAssetDirectoryEntryDescription;
    }

    public void setPartyAssetDirectoryEntrySchedule(String partyAssetDirectoryEntrySchedule) {
        this.partyAssetDirectoryEntrySchedule = partyAssetDirectoryEntrySchedule;
    }

    public String getPartyAssetDirectoryEntrySchedule() {
        return partyAssetDirectoryEntrySchedule;
    }

    public void setPartyAssetDirectoryEntryVersion(String partyAssetDirectoryEntryVersion) {
        this.partyAssetDirectoryEntryVersion = partyAssetDirectoryEntryVersion;
    }

    public String getPartyAssetDirectoryEntryVersion() {
        return partyAssetDirectoryEntryVersion;
    }

    public void setPartyAssetDirectoryEntryStatus(String partyAssetDirectoryEntryStatus) {
        this.partyAssetDirectoryEntryStatus = partyAssetDirectoryEntryStatus;
    }

    public String getPartyAssetDirectoryEntryStatus() {
        return partyAssetDirectoryEntryStatus;
    }

    public void setPartyAssetDirectoryEntryUsageLog(org.museframework.bian.classes.Log partyAssetDirectoryEntryUsageLog) {
        this.partyAssetDirectoryEntryUsageLog = partyAssetDirectoryEntryUsageLog;
    }

    public org.museframework.bian.classes.Log getPartyAssetDirectoryEntryUsageLog() {
        return partyAssetDirectoryEntryUsageLog;
    }

    public void setPartyAssetDirectoryEntryUpdateLog(org.museframework.bian.classes.Log partyAssetDirectoryEntryUpdateLog) {
        this.partyAssetDirectoryEntryUpdateLog = partyAssetDirectoryEntryUpdateLog;
    }

    public org.museframework.bian.classes.Log getPartyAssetDirectoryEntryUpdateLog() {
        return partyAssetDirectoryEntryUpdateLog;
    }

    public void setPartyAssetDirectoryEntryServiceConfiguration(String partyAssetDirectoryEntryServiceConfiguration) {
        this.partyAssetDirectoryEntryServiceConfiguration = partyAssetDirectoryEntryServiceConfiguration;
    }

    public String getPartyAssetDirectoryEntryServiceConfiguration() {
        return partyAssetDirectoryEntryServiceConfiguration;
    }

    public void setPartyAssetDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry partyAssetDirectoryEntryReference) {
        this.partyAssetDirectoryEntryReference = partyAssetDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getPartyAssetDirectoryEntryReference() {
        return partyAssetDirectoryEntryReference;
    }

    public void setPartyAssetReference(org.museframework.bian.classes.Asset partyAssetReference) {
        this.partyAssetReference = partyAssetReference;
    }

    public org.museframework.bian.classes.Asset getPartyAssetReference() {
        return partyAssetReference;
    }
}