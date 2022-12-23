/*Capture and maintain reference information about some type of entitity  within Special Pricing Conditions.*/
package org.museframework.bian.spepricon.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SpecialPricingConditionsDirectoryEntry {
    /*Documentation of Special Pricing Conditions Directory Entry*/
    @MetaField
    private String specialPricingConditionsDirectoryEntryDescription;

    /*The timetable of Special Pricing Conditions Directory Entry*/
    @MetaField
    private String specialPricingConditionsDirectoryEntrySchedule;

    /*The version of Special Pricing Conditions Directory Entry*/
    @MetaField
    private String specialPricingConditionsDirectoryEntryVersion;

    /*The status of Special Pricing Conditions Directory Entry*/
    @MetaField
    private String specialPricingConditionsDirectoryEntryStatus;

    /*Reference to the log of (usage) ativities/events  of Special Pricing Conditions Directory Entry*/
    @MetaField
    private String specialPricingConditionsDirectoryEntryUsageLog;

    /*Reference to the log of (update) ativities/events of Special Pricing Conditions Directory Entry*/
    @MetaField
    private String specialPricingConditionsDirectoryEntryUpdateLog;

    /*The configuration of Special Pricing Conditions Directory Entry*/
    @MetaField
    private String specialPricingConditionsDirectoryEntryServiceConfiguration;

    public void setSpecialPricingConditionsDirectoryEntryDescription(String specialPricingConditionsDirectoryEntryDescription) {
        this.specialPricingConditionsDirectoryEntryDescription = specialPricingConditionsDirectoryEntryDescription;
    }

    public String getSpecialPricingConditionsDirectoryEntryDescription() {
        return specialPricingConditionsDirectoryEntryDescription;
    }

    public void setSpecialPricingConditionsDirectoryEntrySchedule(String specialPricingConditionsDirectoryEntrySchedule) {
        this.specialPricingConditionsDirectoryEntrySchedule = specialPricingConditionsDirectoryEntrySchedule;
    }

    public String getSpecialPricingConditionsDirectoryEntrySchedule() {
        return specialPricingConditionsDirectoryEntrySchedule;
    }

    public void setSpecialPricingConditionsDirectoryEntryVersion(String specialPricingConditionsDirectoryEntryVersion) {
        this.specialPricingConditionsDirectoryEntryVersion = specialPricingConditionsDirectoryEntryVersion;
    }

    public String getSpecialPricingConditionsDirectoryEntryVersion() {
        return specialPricingConditionsDirectoryEntryVersion;
    }

    public void setSpecialPricingConditionsDirectoryEntryStatus(String specialPricingConditionsDirectoryEntryStatus) {
        this.specialPricingConditionsDirectoryEntryStatus = specialPricingConditionsDirectoryEntryStatus;
    }

    public String getSpecialPricingConditionsDirectoryEntryStatus() {
        return specialPricingConditionsDirectoryEntryStatus;
    }

    public void setSpecialPricingConditionsDirectoryEntryUsageLog(String specialPricingConditionsDirectoryEntryUsageLog) {
        this.specialPricingConditionsDirectoryEntryUsageLog = specialPricingConditionsDirectoryEntryUsageLog;
    }

    public String getSpecialPricingConditionsDirectoryEntryUsageLog() {
        return specialPricingConditionsDirectoryEntryUsageLog;
    }

    public void setSpecialPricingConditionsDirectoryEntryUpdateLog(String specialPricingConditionsDirectoryEntryUpdateLog) {
        this.specialPricingConditionsDirectoryEntryUpdateLog = specialPricingConditionsDirectoryEntryUpdateLog;
    }

    public String getSpecialPricingConditionsDirectoryEntryUpdateLog() {
        return specialPricingConditionsDirectoryEntryUpdateLog;
    }

    public void setSpecialPricingConditionsDirectoryEntryServiceConfiguration(String specialPricingConditionsDirectoryEntryServiceConfiguration) {
        this.specialPricingConditionsDirectoryEntryServiceConfiguration = specialPricingConditionsDirectoryEntryServiceConfiguration;
    }

    public String getSpecialPricingConditionsDirectoryEntryServiceConfiguration() {
        return specialPricingConditionsDirectoryEntryServiceConfiguration;
    }
}