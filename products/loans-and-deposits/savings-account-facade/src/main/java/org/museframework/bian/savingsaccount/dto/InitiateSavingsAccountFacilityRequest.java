package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSavingsAccountFacilityRequest {
    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility savingsAccountFacility;

    public void setSavingsAccountFacility(org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility savingsAccountFacility) {
        this.savingsAccountFacility = savingsAccountFacility;
    }

    public org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility getSavingsAccountFacility() {
        return savingsAccountFacility;
    }
}