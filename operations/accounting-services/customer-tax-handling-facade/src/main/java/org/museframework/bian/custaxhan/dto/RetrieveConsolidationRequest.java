package org.museframework.bian.custaxhan.dto;

public class RetrieveConsolidationRequest {
    private String customertaxhandlingid;

    private String consolidationid;

    public void setCustomertaxhandlingid(String customertaxhandlingid) {
        this.customertaxhandlingid = customertaxhandlingid;
    }

    public String getCustomertaxhandlingid() {
        return customertaxhandlingid;
    }

    public void setConsolidationid(String consolidationid) {
        this.consolidationid = consolidationid;
    }

    public String getConsolidationid() {
        return consolidationid;
    }
}