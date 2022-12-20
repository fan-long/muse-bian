package org.museframework.bian.cusevehis.dto;

public class RetrieveSalesRequest {
    private String customereventhistoryid;

    private String salesid;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid;
    }

    public String getSalesid() {
        return salesid;
    }
}