package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFundPerformanceFeeRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundperformancefeeroutineid;

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
}