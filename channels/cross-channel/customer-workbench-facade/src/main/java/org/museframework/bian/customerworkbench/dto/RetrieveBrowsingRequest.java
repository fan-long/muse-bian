package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBrowsingRequest {
    @MetaField
    private String customerworkbenchid;

    @MetaField
    private String browsingid;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setBrowsingid(String browsingid) {
        this.browsingid = browsingid;
    }

    public String getBrowsingid() {
        return browsingid;
    }
}