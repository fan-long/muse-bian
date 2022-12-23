package org.museframework.bian.crerisope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyTradingCreditPositionMeasurementRequest {
    @MetaField
    private String creditriskoperationsid;

    public void setCreditriskoperationsid(String creditriskoperationsid) {
        this.creditriskoperationsid = creditriskoperationsid;
    }

    public String getCreditriskoperationsid() {
        return creditriskoperationsid;
    }
}