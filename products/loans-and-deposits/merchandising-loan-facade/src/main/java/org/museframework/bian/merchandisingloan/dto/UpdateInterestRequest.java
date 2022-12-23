package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInterestRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField
    private String interestid;

    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Interest interest;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }

    public void setInterest(org.museframework.bian.merchandisingloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Interest getInterest() {
        return interest;
    }
}