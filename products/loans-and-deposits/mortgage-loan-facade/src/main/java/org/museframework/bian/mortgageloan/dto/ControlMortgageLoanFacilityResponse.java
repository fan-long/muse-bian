package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlMortgageLoanFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility mortgageLoanFacility;

    public void setMortgageLoanFacility(org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility mortgageLoanFacility) {
        this.mortgageLoanFacility = mortgageLoanFacility;
    }

    public org.museframework.bian.mortgageloan.dto.cr.MortgageLoanFacility getMortgageLoanFacility() {
        return mortgageLoanFacility;
    }
}