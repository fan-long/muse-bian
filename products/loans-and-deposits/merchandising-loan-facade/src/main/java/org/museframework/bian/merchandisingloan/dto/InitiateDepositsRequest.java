package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateDepositsRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField
    private String depositsid;

    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setDepositsid(String depositsid) {
        this.depositsid = depositsid;
    }

    public String getDepositsid() {
        return depositsid;
    }

    public void setDeposits(org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}