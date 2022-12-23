package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFeesRequest {
    @MetaField
    private String leasingid;

    @MetaField
    private String feesid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Fees fees;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.leasing.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.leasing.dto.bq.Fees getFees() {
        return fees;
    }
}