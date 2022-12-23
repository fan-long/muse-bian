package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCalculationRequest {
    @MetaField
    private String commissionsid;

    @MetaField
    private String calculationid;

    public void setCommissionsid(String commissionsid) {
        this.commissionsid = commissionsid;
    }

    public String getCommissionsid() {
        return commissionsid;
    }

    public void setCalculationid(String calculationid) {
        this.calculationid = calculationid;
    }

    public String getCalculationid() {
        return calculationid;
    }
}