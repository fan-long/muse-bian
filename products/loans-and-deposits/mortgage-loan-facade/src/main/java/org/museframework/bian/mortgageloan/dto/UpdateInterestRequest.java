package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInterestRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String interestid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Interest interest;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }

    public void setInterest(org.museframework.bian.mortgageloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Interest getInterest() {
        return interest;
    }
}