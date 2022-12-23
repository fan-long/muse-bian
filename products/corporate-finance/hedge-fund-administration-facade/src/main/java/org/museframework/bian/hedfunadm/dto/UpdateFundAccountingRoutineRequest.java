package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFundAccountingRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundaccountingroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundaccountingroutineid(String fundaccountingroutineid) {
        this.fundaccountingroutineid = fundaccountingroutineid;
    }

    public String getFundaccountingroutineid() {
        return fundaccountingroutineid;
    }

    public void setFundAccountingRoutine(org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}