package org.museframework.bian.cusaccent.dto;

public class RetrievePreferencesRequest {
    private String customeraccessentitlementid;

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