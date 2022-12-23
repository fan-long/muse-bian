package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateDividendsandInterestRequest {
    @MetaField
    private String custodyadministrationid;

    @MetaField
    private String dividendsandinterestid;

    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest dividendsandInterest;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setDividendsandinterestid(String dividendsandinterestid) {
        this.dividendsandinterestid = dividendsandinterestid;
    }

    public String getDividendsandinterestid() {
        return dividendsandinterestid;
    }

    public void setDividendsandInterest(org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest dividendsandInterest) {
        this.dividendsandInterest = dividendsandInterest;
    }

    public org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest getDividendsandInterest() {
        return dividendsandInterest;
    }
}