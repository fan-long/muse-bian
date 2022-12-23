package org.museframework.bian.rewpoiawaandred.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveRedemptionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.rewpoiawaandred.dto.bq.Redemption redemption;

    public void setRedemption(org.museframework.bian.rewpoiawaandred.dto.bq.Redemption redemption) {
        this.redemption = redemption;
    }

    public org.museframework.bian.rewpoiawaandred.dto.bq.Redemption getRedemption() {
        return redemption;
    }
}