package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateWithdrawalsRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String withdrawalsid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Withdrawals withdrawals;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setWithdrawalsid(String withdrawalsid) {
        this.withdrawalsid = withdrawalsid;
    }

    public String getWithdrawalsid() {
        return withdrawalsid;
    }

    public void setWithdrawals(org.museframework.bian.mortgageloan.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}