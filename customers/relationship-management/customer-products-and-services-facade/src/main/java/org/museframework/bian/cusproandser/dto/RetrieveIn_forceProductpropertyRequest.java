package org.museframework.bian.cusproandser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveIn_forceProductpropertyRequest {
    @MetaField
    private String customerproductsandservicesid;

    @MetaField
    private String in_forceproductpropertyid;

    public void setCustomerproductsandservicesid(String customerproductsandservicesid) {
        this.customerproductsandservicesid = customerproductsandservicesid;
    }

    public String getCustomerproductsandservicesid() {
        return customerproductsandservicesid;
    }

    public void setIn_forceproductpropertyid(String in_forceproductpropertyid) {
        this.in_forceproductpropertyid = in_forceproductpropertyid;
    }

    public String getIn_forceproductpropertyid() {
        return in_forceproductpropertyid;
    }
}