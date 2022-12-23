package org.museframework.bian.cusproandser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyIn_forceServicepropertyRequest {
    @MetaField
    private String customerproductsandservicesid;

    @MetaField
    private String in_forceservicepropertyid;

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
}