package org.museframework.bian.commissions.dto;

public class RetrieveCheckRequest {
    private String commissionsid;

    private String checkid;

    public void setCommissionsid(String commissionsid) {
        this.commissionsid = commissionsid;
    }

    public String getCommissionsid() {
        return commissionsid;
    }

    public void setCheckid(String checkid) {
        this.checkid = checkid;
    }

    public String getCheckid() {
        return checkid;
    }
}