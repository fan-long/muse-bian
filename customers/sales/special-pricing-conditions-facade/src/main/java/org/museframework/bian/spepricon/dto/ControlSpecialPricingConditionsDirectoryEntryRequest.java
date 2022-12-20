package org.museframework.bian.spepricon.dto;

public class ControlSpecialPricingConditionsDirectoryEntryRequest {
    private String specialpricingconditionsid;

    private org.museframework.bian.spepricon.dto.cr.SpecialPricingConditionsDirectoryEntry specialPricingConditionsDirectoryEntry;

    public void setSpecialpricingconditionsid(String specialpricingconditionsid) {
        this.specialpricingconditionsid = specialpricingconditionsid;
    }

    public String getSpecialpricingconditionsid() {
        return specialpricingconditionsid;
    }

    public void setSpecialPricingConditionsDirectoryEntry(org.museframework.bian.spepricon.dto.cr.SpecialPricingConditionsDirectoryEntry specialPricingConditionsDirectoryEntry) {
        this.specialPricingConditionsDirectoryEntry = specialPricingConditionsDirectoryEntry;
    }

    public org.museframework.bian.spepricon.dto.cr.SpecialPricingConditionsDirectoryEntry getSpecialPricingConditionsDirectoryEntry() {
        return specialPricingConditionsDirectoryEntry;
    }
}