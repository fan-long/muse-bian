package org.museframework.bian.spepricon.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteSpecialPricingConditionsDirectoryEntryRequest {
    @MetaField
    private String specialpricingconditionsid;

    @MetaField(ref=true)
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