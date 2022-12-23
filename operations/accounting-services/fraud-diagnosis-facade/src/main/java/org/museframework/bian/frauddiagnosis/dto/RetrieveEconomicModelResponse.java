package org.museframework.bian.frauddiagnosis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveEconomicModelResponse {
    @MetaField(ref=true)
    private org.museframework.bian.frauddiagnosis.dto.bq.EconomicModel economicModel;

    public void setEconomicModel(org.museframework.bian.frauddiagnosis.dto.bq.EconomicModel economicModel) {
        this.economicModel = economicModel;
    }

    public org.museframework.bian.frauddiagnosis.dto.bq.EconomicModel getEconomicModel() {
        return economicModel;
    }
}