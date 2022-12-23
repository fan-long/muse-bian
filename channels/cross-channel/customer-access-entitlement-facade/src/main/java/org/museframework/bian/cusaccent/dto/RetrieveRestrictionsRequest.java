package org.museframework.bian.cusaccent.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRestrictionsRequest {
    @MetaField
    private String customeraccessentitlementid;

    @MetaField
    private String restrictionsid;

    public void setCustomeraccessentitlementid(String customeraccessentitlementid) {
        this.customeraccessentitlementid = customeraccessentitlementid;
    }

    public String getCustomeraccessentitlementid() {
        return customeraccessentitlementid;
    }

    public void setRestrictionsid(String restrictionsid) {
        this.restrictionsid = restrictionsid;
    }

    public String getRestrictionsid() {
        return restrictionsid;
    }
}