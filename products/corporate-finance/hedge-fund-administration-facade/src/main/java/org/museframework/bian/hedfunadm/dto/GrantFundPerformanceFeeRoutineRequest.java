package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantFundPerformanceFeeRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundperformancefeeroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine fundPerformanceFeeRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundperformancefeeroutineid(String fundperformancefeeroutineid) {
        this.fundperformancefeeroutineid = fundperformancefeeroutineid;
    }

    public String getFundperformancefeeroutineid() {
        return fundperformancefeeroutineid;
    }

    public void setFundPerformanceFeeRoutine(org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine fundPerformanceFeeRoutine) {
        this.fundPerformanceFeeRoutine = fundPerformanceFeeRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine getFundPerformanceFeeRoutine() {
        return fundPerformanceFeeRoutine;
    }
}