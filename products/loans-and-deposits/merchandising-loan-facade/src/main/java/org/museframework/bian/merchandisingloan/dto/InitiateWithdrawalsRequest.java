package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateWithdrawalsRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField
    private String withdrawalsid;

    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Withdrawals withdrawals;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setWithdrawalsid(String withdrawalsid) {
        this.withdrawalsid = withdrawalsid;
    }

    public String getWithdrawalsid() {
        return withdrawalsid;
    }

    public void setWithdrawals(org.museframework.bian.merchandisingloan.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}