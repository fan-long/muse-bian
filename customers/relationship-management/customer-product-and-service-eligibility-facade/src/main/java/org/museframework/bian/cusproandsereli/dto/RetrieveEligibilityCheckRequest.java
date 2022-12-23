package org.museframework.bian.cusproandsereli.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEligibilityCheckRequest {
    @MetaField
    private String customerproductandserviceeligibilityid;

    @MetaField
    private String eligibilitycheckid;

    public void setCustomerproductandserviceeligibilityid(String customerproductandserviceeligibilityid) {
        this.customerproductandserviceeligibilityid = customerproductandserviceeligibilityid;
    }

    public String getCustomerproductandserviceeligibilityid() {
        return customerproductandserviceeligibilityid;
    }

    public void setEligibilitycheckid(String eligibilitycheckid) {
        this.eligibilitycheckid = eligibilitycheckid;
    }

    public String getEligibilitycheckid() {
        return eligibilitycheckid;
    }
}