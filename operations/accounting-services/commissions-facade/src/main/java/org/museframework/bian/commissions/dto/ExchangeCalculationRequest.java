package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeCalculationRequest {
    @MetaField
    private String commissionsid;

    @MetaField
    private String calculationid;

    @MetaField(ref=true)
    private org.museframework.bian.commissions.dto.bq.Calculation calculation;

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

    public void setCalculation(org.museframework.bian.commissions.dto.bq.Calculation calculation) {
        this.calculation = calculation;
    }

    public org.museframework.bian.commissions.dto.bq.Calculation getCalculation() {
        return calculation;
    }
}