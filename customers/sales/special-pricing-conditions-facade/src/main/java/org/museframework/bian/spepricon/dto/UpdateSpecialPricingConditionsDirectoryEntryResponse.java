package org.museframework.bian.spepricon.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSpecialPricingConditionsDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.spepricon.dto.cr.SpecialPricingConditionsDirectoryEntry specialPricingConditionsDirectoryEntry;

    public void setSpecialPricingConditionsDirectoryEntry(org.museframework.bian.spepricon.dto.cr.SpecialPricingConditionsDirectoryEntry specialPricingConditionsDirectoryEntry) {
        this.specialPricingConditionsDirectoryEntry = specialPricingConditionsDirectoryEntry;
    }

    public org.museframework.bian.spepricon.dto.cr.SpecialPricingConditionsDirectoryEntry getSpecialPricingConditionsDirectoryEntry() {
        return specialPricingConditionsDirectoryEntry;
    }
}