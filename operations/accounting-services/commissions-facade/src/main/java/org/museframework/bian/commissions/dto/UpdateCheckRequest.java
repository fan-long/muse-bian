package org.museframework.bian.commissions.dto;

public class UpdateCheckRequest {
    private String commissionsid;

    private String checkid;

    private org.museframework.bian.commissions.dto.bq.Check check;

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

    public void setCheck(org.museframework.bian.commissions.dto.bq.Check check) {
        this.check = check;
    }

    public org.museframework.bian.commissions.dto.bq.Check getCheck() {
        return check;
    }
}