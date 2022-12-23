package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFundManagementFeeRoutineRequest {
    @MetaField
    private String mutualfundadministrationid;

    @MetaField
    private String fundmanagementfeeroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundmanagementfeeroutineid(String fundmanagementfeeroutineid) {
        this.fundmanagementfeeroutineid = fundmanagementfeeroutineid;
    }

    public String getFundmanagementfeeroutineid() {
        return fundmanagementfeeroutineid;
    }

    public void setFundManagementFeeRoutine(org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine) {
        this.fundManagementFeeRoutine = fundManagementFeeRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine getFundManagementFeeRoutine() {
        return fundManagementFeeRoutine;
    }
}