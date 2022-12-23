package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInterestRequest {
    @MetaField
    private String virtualaccountid;

    @MetaField
    private String interestid;

    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.Interest interest;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }

    public void setInterest(org.museframework.bian.virtualaccount.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.virtualaccount.dto.bq.Interest getInterest() {
        return interest;
    }
}