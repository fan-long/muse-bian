package org.museframework.bian.commissions.dto;

public class UpdateCheckResponse {
    private org.museframework.bian.commissions.dto.bq.Check check;

    public void setCheck(org.museframework.bian.commissions.dto.bq.Check check) {
        this.check = check;
    }

    public org.museframework.bian.commissions.dto.bq.Check getCheck() {
        return check;
    }
}