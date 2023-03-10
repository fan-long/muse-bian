package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProductandServiceAccessRequest {
    @MetaField
    private String customerworkbenchid;

    @MetaField
    private String productandserviceaccessid;

    @MetaField(ref=true)
    private org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess productandServiceAccess;

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

    public void setProductandServiceAccess(org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess productandServiceAccess) {
        this.productandServiceAccess = productandServiceAccess;
    }

    public org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess getProductandServiceAccess() {
        return productandServiceAccess;
    }
}