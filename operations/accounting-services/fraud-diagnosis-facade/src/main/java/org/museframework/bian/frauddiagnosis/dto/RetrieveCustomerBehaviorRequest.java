package org.museframework.bian.frauddiagnosis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCustomerBehaviorRequest {
    @MetaField
    private String frauddiagnosisid;

    @MetaField
    private String customerbehaviorid;

    public void setFrauddiagnosisid(String frauddiagnosisid) {
        this.frauddiagnosisid = frauddiagnosisid;
    }

    public String getFrauddiagnosisid() {
        return frauddiagnosisid;
    }

    public void setCustomerbehaviorid(String customerbehaviorid) {
        this.customerbehaviorid = customerbehaviorid;
    }

    public String getCustomerbehaviorid() {
        return customerbehaviorid;
    }
}