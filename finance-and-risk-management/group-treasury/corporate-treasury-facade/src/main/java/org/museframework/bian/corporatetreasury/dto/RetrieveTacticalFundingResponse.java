package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTacticalFundingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatetreasury.dto.bq.TacticalFunding tacticalFunding;

    public void setTacticalFunding(org.museframework.bian.corporatetreasury.dto.bq.TacticalFunding tacticalFunding) {
        this.tacticalFunding = tacticalFunding;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.TacticalFunding getTacticalFunding() {
        return tacticalFunding;
    }
}