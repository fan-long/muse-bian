package org.museframework.bian.cusaccent.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateRestrictionsRequest {
    @MetaField
    private String customeraccessentitlementid;

    @MetaField
    private String restrictionsid;

    @MetaField(ref=true)
    private org.museframework.bian.cusaccent.dto.bq.Restrictions restrictions;

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

    public void setRestrictions(org.museframework.bian.cusaccent.dto.bq.Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    public org.museframework.bian.cusaccent.dto.bq.Restrictions getRestrictions() {
        return restrictions;
    }
}