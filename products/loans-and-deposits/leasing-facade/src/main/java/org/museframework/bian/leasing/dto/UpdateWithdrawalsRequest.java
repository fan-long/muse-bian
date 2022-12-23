package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateWithdrawalsRequest {
    @MetaField
    private String leasingid;

    @MetaField
    private String withdrawalsid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Withdrawals withdrawals;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setWithdrawalsid(String withdrawalsid) {
        this.withdrawalsid = withdrawalsid;
    }

    public String getWithdrawalsid() {
        return withdrawalsid;
    }

    public void setWithdrawals(org.museframework.bian.leasing.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.leasing.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}