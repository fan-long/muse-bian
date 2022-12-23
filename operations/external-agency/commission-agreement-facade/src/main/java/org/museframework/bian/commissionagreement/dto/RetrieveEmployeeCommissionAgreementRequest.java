package org.museframework.bian.commissionagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEmployeeCommissionAgreementRequest {
    @MetaField
    private String commissionagreementid;

    public void setCommissionagreementid(String commissionagreementid) {
        this.commissionagreementid = commissionagreementid;
    }

    public String getCommissionagreementid() {
        return commissionagreementid;
    }
}