package org.museframework.bian.cusproandser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestIn_forceServicepropertyRequest {
    @MetaField
    private String customerproductsandservicesid;

    @MetaField
    private String in_forceservicepropertyid;

    @MetaField(ref=true)
    private org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty in_forceServiceproperty;

    public void setCustomerproductsandservicesid(String customerproductsandservicesid) {
        this.customerproductsandservicesid = customerproductsandservicesid;
    }

    public String getCustomerproductsandservicesid() {
        return customerproductsandservicesid;
    }

    public void setIn_forceservicepropertyid(String in_forceservicepropertyid) {
        this.in_forceservicepropertyid = in_forceservicepropertyid;
    }

    public String getIn_forceservicepropertyid() {
        return in_forceservicepropertyid;
    }

    public void setIn_forceServiceproperty(org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty in_forceServiceproperty) {
        this.in_forceServiceproperty = in_forceServiceproperty;
    }

    public org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty getIn_forceServiceproperty() {
        return in_forceServiceproperty;
    }
}