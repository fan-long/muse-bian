package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductandServiceAccessRequest {
    @MetaField
    private String customerworkbenchid;

    @MetaField
    private String productandserviceaccessid;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setProductandserviceaccessid(String productandserviceaccessid) {
        this.productandserviceaccessid = productandserviceaccessid;
    }

    public String getProductandserviceaccessid() {
        return productandserviceaccessid;
    }
}