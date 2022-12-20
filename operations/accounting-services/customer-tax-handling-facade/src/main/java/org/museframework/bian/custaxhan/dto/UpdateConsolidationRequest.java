package org.museframework.bian.custaxhan.dto;

public class UpdateConsolidationRequest {
    private String customertaxhandlingid;

    private String consolidationid;

    private org.museframework.bian.custaxhan.dto.bq.Consolidation consolidation;

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

    public void setConsolidation(org.museframework.bian.custaxhan.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.custaxhan.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}