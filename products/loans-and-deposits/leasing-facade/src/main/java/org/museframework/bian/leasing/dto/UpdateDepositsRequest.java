package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDepositsRequest {
    @MetaField
    private String leasingid;

    @MetaField
    private String depositsid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Deposits deposits;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setDepositsid(String depositsid) {
        this.depositsid = depositsid;
    }

    public String getDepositsid() {
        return depositsid;
    }

    public void setDeposits(org.museframework.bian.leasing.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.leasing.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}