package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFundDevelopmentRoutineRequest {
    @MetaField
    private String mutualfundadministrationid;

    @MetaField
    private String funddevelopmentroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFunddevelopmentroutineid(String funddevelopmentroutineid) {
        this.funddevelopmentroutineid = funddevelopmentroutineid;
    }

    public String getFunddevelopmentroutineid() {
        return funddevelopmentroutineid;
    }

    public void setFundDevelopmentRoutine(org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine) {
        this.fundDevelopmentRoutine = fundDevelopmentRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine getFundDevelopmentRoutine() {
        return fundDevelopmentRoutine;
    }
}