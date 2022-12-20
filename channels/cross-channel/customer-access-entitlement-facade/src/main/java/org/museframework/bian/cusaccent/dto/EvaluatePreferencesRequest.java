package org.museframework.bian.cusaccent.dto;

public class EvaluatePreferencesRequest {
    private String customeraccessentitlementid;

    private String preferencesid;

    private org.museframework.bian.cusaccent.dto.bq.Preferences preferences;

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

    public void setPreferences(org.museframework.bian.cusaccent.dto.bq.Preferences preferences) {
        this.preferences = preferences;
    }

    public org.museframework.bian.cusaccent.dto.bq.Preferences getPreferences() {
        return preferences;
    }
}