package org.museframework.bian.cusproandsereli.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveEligibilityCheckResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusproandsereli.dto.bq.EligibilityCheck eligibilityCheck;

    public void setEligibilityCheck(org.museframework.bian.cusproandsereli.dto.bq.EligibilityCheck eligibilityCheck) {
        this.eligibilityCheck = eligibilityCheck;
    }

    public org.museframework.bian.cusproandsereli.dto.bq.EligibilityCheck getEligibilityCheck() {
        return eligibilityCheck;
    }
}