package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureStrategicFundingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding strategicFunding;

    public void setStrategicFunding(org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding strategicFunding) {
        this.strategicFunding = strategicFunding;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.StrategicFunding getStrategicFunding() {
        return strategicFunding;
    }
}