package org.museframework.bian.meracqfac.dto;

public class UpdateClearingResponse {
    private org.museframework.bian.meracqfac.dto.bq.Clearing clearing;

    public void setClearing(org.museframework.bian.meracqfac.dto.bq.Clearing clearing) {
        this.clearing = clearing;
    }

    public org.museframework.bian.meracqfac.dto.bq.Clearing getClearing() {
        return clearing;
    }
}