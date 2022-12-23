package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeFundInflowsandOutflowRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundinflowsandoutflowroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundinflowsandoutflowroutineid(String fundinflowsandoutflowroutineid) {
        this.fundinflowsandoutflowroutineid = fundinflowsandoutflowroutineid;
    }

    public String getFundinflowsandoutflowroutineid() {
        return fundinflowsandoutflowroutineid;
    }

    public void setFundInflowsandOutflowRoutine(org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine) {
        this.fundInflowsandOutflowRoutine = fundInflowsandOutflowRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine getFundInflowsandOutflowRoutine() {
        return fundInflowsandOutflowRoutine;
    }
}