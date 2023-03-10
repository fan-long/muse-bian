package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantFundEnrolmentRoutineRequest {
    @MetaField
    private String mutualfundadministrationid;

    @MetaField
    private String fundenrolmentroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundenrolmentroutineid(String fundenrolmentroutineid) {
        this.fundenrolmentroutineid = fundenrolmentroutineid;
    }

    public String getFundenrolmentroutineid() {
        return fundenrolmentroutineid;
    }

    public void setFundEnrolmentRoutine(org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine) {
        this.fundEnrolmentRoutine = fundEnrolmentRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine getFundEnrolmentRoutine() {
        return fundEnrolmentRoutine;
    }
}