package org.museframework.bian.achoperations.dto;

public class UpdateACHFulfillmentOperatingSessionRequest {
    private String achoperationsid;

    private org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession aCHFulfillmentOperatingSession;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setaCHFulfillmentOperatingSession(org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession aCHFulfillmentOperatingSession) {
        this.aCHFulfillmentOperatingSession = aCHFulfillmentOperatingSession;
    }

    public org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession getaCHFulfillmentOperatingSession() {
        return aCHFulfillmentOperatingSession;
    }
}