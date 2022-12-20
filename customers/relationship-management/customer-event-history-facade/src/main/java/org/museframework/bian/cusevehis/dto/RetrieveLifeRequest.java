package org.museframework.bian.cusevehis.dto;

public class RetrieveLifeRequest {
    private String customereventhistoryid;

    private String lifeid;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setLifeid(String lifeid) {
        this.lifeid = lifeid;
    }

    public String getLifeid() {
        return lifeid;
    }
}