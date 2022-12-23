package org.museframework.bian.casmanandaccser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCashManagementAndAccountServicesFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility cashManagementAndAccountServicesFacility;

    public void setCashManagementAndAccountServicesFacility(org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility cashManagementAndAccountServicesFacility) {
        this.cashManagementAndAccountServicesFacility = cashManagementAndAccountServicesFacility;
    }

    public org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility getCashManagementAndAccountServicesFacility() {
        return cashManagementAndAccountServicesFacility;
    }
}