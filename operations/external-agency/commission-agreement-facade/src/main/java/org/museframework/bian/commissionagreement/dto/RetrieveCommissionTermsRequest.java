package org.museframework.bian.commissionagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCommissionTermsRequest {
    @MetaField
    private String commissionagreementid;

    @MetaField
    private String commissiontermsid;

    public void setCommissionagreementid(String commissionagreementid) {
        this.commissionagreementid = commissionagreementid;
    }

    public String getCommissionagreementid() {
        return commissionagreementid;
    }

    public void setCommissiontermsid(String commissiontermsid) {
        this.commissiontermsid = commissiontermsid;
    }

    public String getCommissiontermsid() {
        return commissiontermsid;
    }
}