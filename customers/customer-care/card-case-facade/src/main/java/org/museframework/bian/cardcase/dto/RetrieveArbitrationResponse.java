package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveArbitrationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcase.dto.bq.Arbitration arbitration;

    public void setArbitration(org.museframework.bian.cardcase.dto.bq.Arbitration arbitration) {
        this.arbitration = arbitration;
    }

    public org.museframework.bian.cardcase.dto.bq.Arbitration getArbitration() {
        return arbitration;
    }
}