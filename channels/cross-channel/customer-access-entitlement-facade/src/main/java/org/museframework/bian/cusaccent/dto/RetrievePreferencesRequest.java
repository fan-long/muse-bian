package org.museframework.bian.cusaccent.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePreferencesRequest {
    @MetaField
    private String customeraccessentitlementid;

    @MetaField
    private String preferencesid;

    public void setCustomeraccessentitlementid(String customeraccessentitlementid) {
        this.customeraccessentitlementid = customeraccessentitlementid;
    }

    public String getCustomeraccessentitlementid() {
        return customeraccessentitlementid;
    }

    public void setPreferencesid(String preferencesid) {
        this.preferencesid = preferencesid;
    }

    public String getPreferencesid() {
        return preferencesid;
    }
}