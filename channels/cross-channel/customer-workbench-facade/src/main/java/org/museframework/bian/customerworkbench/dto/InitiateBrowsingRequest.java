package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateBrowsingRequest {
    @MetaField
    private String customerworkbenchid;

    @MetaField
    private String browsingid;

    @MetaField(ref=true)
    private org.museframework.bian.customerworkbench.dto.bq.Browsing browsing;

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

    public void setBrowsing(org.museframework.bian.customerworkbench.dto.bq.Browsing browsing) {
        this.browsing = browsing;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Browsing getBrowsing() {
        return browsing;
    }
}