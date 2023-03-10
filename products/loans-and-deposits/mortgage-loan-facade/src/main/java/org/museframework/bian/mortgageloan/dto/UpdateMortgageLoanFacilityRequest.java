package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMortgageLoanFacilityRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility mortgageLoanFacility;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setMortgageLoanFacility(org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility mortgageLoanFacility) {
        this.mortgageLoanFacility = mortgageLoanFacility;
    }

    public org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility getMortgageLoanFacility() {
        return mortgageLoanFacility;
    }
}