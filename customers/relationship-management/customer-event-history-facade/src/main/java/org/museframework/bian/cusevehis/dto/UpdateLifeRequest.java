package org.museframework.bian.cusevehis.dto;

public class UpdateLifeRequest {
    private String customereventhistoryid;

    private String lifeid;

    private org.museframework.bian.cusevehis.dto.bq.Life life;

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

    public void setLife(org.museframework.bian.cusevehis.dto.bq.Life life) {
        this.life = life;
    }

    public org.museframework.bian.cusevehis.dto.bq.Life getLife() {
        return life;
    }
}