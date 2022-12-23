package org.museframework.bian.cusproandsereli.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveNextBestRequest {
    @MetaField
    private String customerproductandserviceeligibilityid;

    @MetaField
    private String nextbestid;

    public void setCustomerproductandserviceeligibilityid(String customerproductandserviceeligibilityid) {
        this.customerproductandserviceeligibilityid = customerproductandserviceeligibilityid;
    }

    public String getCustomerproductandserviceeligibilityid() {
        return customerproductandserviceeligibilityid;
    }

    public void setNextbestid(String nextbestid) {
        this.nextbestid = nextbestid;
    }

    public String getNextbestid() {
        return nextbestid;
    }
}