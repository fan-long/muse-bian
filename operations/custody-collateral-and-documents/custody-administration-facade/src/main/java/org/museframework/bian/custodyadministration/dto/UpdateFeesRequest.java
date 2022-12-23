package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFeesRequest {
    @MetaField
    private String custodyadministrationid;

    @MetaField
    private String feesid;

    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.Fees fees;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.custodyadministration.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.custodyadministration.dto.bq.Fees getFees() {
        return fees;
    }
}