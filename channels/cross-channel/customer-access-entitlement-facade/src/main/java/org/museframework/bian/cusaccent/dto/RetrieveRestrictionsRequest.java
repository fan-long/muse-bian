package org.museframework.bian.cusaccent.dto;

public class RetrieveRestrictionsRequest {
    private String customeraccessentitlementid;

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