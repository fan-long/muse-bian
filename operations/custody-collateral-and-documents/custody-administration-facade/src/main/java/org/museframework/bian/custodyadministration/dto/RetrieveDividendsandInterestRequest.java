package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDividendsandInterestRequest {
    @MetaField
    private String custodyadministrationid;

    @MetaField
    private String dividendsandinterestid;

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
}