package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFeesRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String feesid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Fees fees;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.mortgageloan.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Fees getFees() {
        return fees;
    }
}