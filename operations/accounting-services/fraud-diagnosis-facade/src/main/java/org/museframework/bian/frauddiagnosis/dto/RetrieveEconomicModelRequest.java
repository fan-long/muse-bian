package org.museframework.bian.frauddiagnosis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEconomicModelRequest {
    @MetaField
    private String frauddiagnosisid;

    @MetaField
    private String economicmodelid;

    public void setFrauddiagnosisid(String frauddiagnosisid) {
        this.frauddiagnosisid = frauddiagnosisid;
    }

    public String getFrauddiagnosisid() {
        return frauddiagnosisid;
    }

    public void setEconomicmodelid(String economicmodelid) {
        this.economicmodelid = economicmodelid;
    }

    public String getEconomicmodelid() {
        return economicmodelid;
    }
}