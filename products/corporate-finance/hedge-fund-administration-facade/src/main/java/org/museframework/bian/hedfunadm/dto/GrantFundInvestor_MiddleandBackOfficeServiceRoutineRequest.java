package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantFundInvestor_MiddleandBackOfficeServiceRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundinvestor_middleandbackofficeserviceroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine fundInvestor_MiddleandBackOfficeServiceRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundinvestor_middleandbackofficeserviceroutineid(String fundinvestor_middleandbackofficeserviceroutineid) {
        this.fundinvestor_middleandbackofficeserviceroutineid = fundinvestor_middleandbackofficeserviceroutineid;
    }

    public String getFundinvestor_middleandbackofficeserviceroutineid() {
        return fundinvestor_middleandbackofficeserviceroutineid;
    }

    public void setFundInvestor_MiddleandBackOfficeServiceRoutine(org.museframework.bian.hedfunadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine fundInvestor_MiddleandBackOfficeServiceRoutine) {
        this.fundInvestor_MiddleandBackOfficeServiceRoutine = fundInvestor_MiddleandBackOfficeServiceRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine getFundInvestor_MiddleandBackOfficeServiceRoutine() {
        return fundInvestor_MiddleandBackOfficeServiceRoutine;
    }
}