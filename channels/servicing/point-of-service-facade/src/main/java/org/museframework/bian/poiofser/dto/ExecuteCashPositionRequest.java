package org.museframework.bian.poiofser.dto;

public class ExecuteCashPositionRequest {
    private String pointofserviceid;

    private String cashpositionid;

    private org.museframework.bian.poiofser.dto.bq.CashPosition cashPosition;

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

    public void setCashPosition(org.museframework.bian.poiofser.dto.bq.CashPosition cashPosition) {
        this.cashPosition = cashPosition;
    }

    public org.museframework.bian.poiofser.dto.bq.CashPosition getCashPosition() {
        return cashPosition;
    }
}