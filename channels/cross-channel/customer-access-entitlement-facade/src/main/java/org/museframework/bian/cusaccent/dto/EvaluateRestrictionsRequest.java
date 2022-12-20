package org.museframework.bian.cusaccent.dto;

public class EvaluateRestrictionsRequest {
    private String customeraccessentitlementid;

    private String restrictionsid;

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