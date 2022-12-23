package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDepositsRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String depositsid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Deposits deposits;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setDepositsid(String depositsid) {
        this.depositsid = depositsid;
    }

    public String getDepositsid() {
        return depositsid;
    }

    public void setDeposits(org.museframework.bian.mortgageloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}