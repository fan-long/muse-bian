package org.museframework.bian.poiofser.dto;

public class RetrieveCashPositionRequest {
    private String pointofserviceid;

    private String cashpositionid;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setCashpositionid(String cashpositionid) {
        this.cashpositionid = cashpositionid;
    }

    public String getCashpositionid() {
        return cashpositionid;
    }
}