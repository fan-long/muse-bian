package org.museframework.bian.currentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCurrentAccountFacilityRequest {
    @MetaField
    private String currentaccountid;

    @MetaField(ref=true)
    private org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setCurrentAccountFacility(org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility) {
        this.currentAccountFacility = currentAccountFacility;
    }

    public org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility getCurrentAccountFacility() {
        return currentAccountFacility;
    }
}