package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFundInflowsandOutflowRoutineRequest {
    @MetaField
    private String mutualfundadministrationid;

    @MetaField
    private String fundinflowsandoutflowroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundinflowsandoutflowroutineid(String fundinflowsandoutflowroutineid) {
        this.fundinflowsandoutflowroutineid = fundinflowsandoutflowroutineid;
    }

    public String getFundinflowsandoutflowroutineid() {
        return fundinflowsandoutflowroutineid;
    }

    public void setFundInflowsandOutflowRoutine(org.museframework.bian.mutfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine) {
        this.fundInflowsandOutflowRoutine = fundInflowsandOutflowRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundInflowsandOutflowRoutine getFundInflowsandOutflowRoutine() {
        return fundInflowsandOutflowRoutine;
    }
}