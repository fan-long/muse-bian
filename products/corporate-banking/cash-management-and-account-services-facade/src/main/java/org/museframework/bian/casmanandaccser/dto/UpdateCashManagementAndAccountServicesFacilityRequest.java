package org.museframework.bian.casmanandaccser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCashManagementAndAccountServicesFacilityRequest {
    @MetaField
    private String cashmanagementandaccountservicesid;

    @MetaField(ref=true)
    private org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility cashManagementAndAccountServicesFacility;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setCashManagementAndAccountServicesFacility(org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility cashManagementAndAccountServicesFacility) {
        this.cashManagementAndAccountServicesFacility = cashManagementAndAccountServicesFacility;
    }

    public org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility getCashManagementAndAccountServicesFacility() {
        return cashManagementAndAccountServicesFacility;
    }
}