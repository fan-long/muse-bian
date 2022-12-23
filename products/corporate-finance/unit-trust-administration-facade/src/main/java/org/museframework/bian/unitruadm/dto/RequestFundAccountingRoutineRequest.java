package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFundAccountingRoutineRequest {
    @MetaField
    private String unittrustadministrationid;

    @MetaField
    private String fundaccountingroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundaccountingroutineid(String fundaccountingroutineid) {
        this.fundaccountingroutineid = fundaccountingroutineid;
    }

    public String getFundaccountingroutineid() {
        return fundaccountingroutineid;
    }

    public void setFundAccountingRoutine(org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}