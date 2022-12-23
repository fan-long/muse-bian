package org.museframework.bian.currentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCurrentAccountFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility;

    public void setCurrentAccountFacility(org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility) {
        this.currentAccountFacility = currentAccountFacility;
    }

    public org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility getCurrentAccountFacility() {
        return currentAccountFacility;
    }
}