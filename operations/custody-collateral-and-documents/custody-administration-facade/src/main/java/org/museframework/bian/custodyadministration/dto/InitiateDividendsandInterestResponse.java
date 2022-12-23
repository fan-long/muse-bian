package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateDividendsandInterestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest dividendsandInterest;

    public void setDividendsandInterest(org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest dividendsandInterest) {
        this.dividendsandInterest = dividendsandInterest;
    }

    public org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest getDividendsandInterest() {
        return dividendsandInterest;
    }
}