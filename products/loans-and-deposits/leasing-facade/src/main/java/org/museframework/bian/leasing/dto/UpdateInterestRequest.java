package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInterestRequest {
    @MetaField
    private String leasingid;

    @MetaField
    private String interestid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Interest interest;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }

    public void setInterest(org.museframework.bian.leasing.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.leasing.dto.bq.Interest getInterest() {
        return interest;
    }
}