package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFundEnrolmentRoutineRequest {
    @MetaField
    private String unittrustadministrationid;

    @MetaField
    private String fundenrolmentroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundenrolmentroutineid(String fundenrolmentroutineid) {
        this.fundenrolmentroutineid = fundenrolmentroutineid;
    }

    public String getFundenrolmentroutineid() {
        return fundenrolmentroutineid;
    }

    public void setFundEnrolmentRoutine(org.museframework.bian.unitruadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine) {
        this.fundEnrolmentRoutine = fundEnrolmentRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundEnrolmentRoutine getFundEnrolmentRoutine() {
        return fundEnrolmentRoutine;
    }
}