package org.museframework.bian.carfinset.dto;

public class UpdateProcessingResponse {
    private org.museframework.bian.carfinset.dto.bq.Processing processing;

    public void setProcessing(org.museframework.bian.carfinset.dto.bq.Processing processing) {
        this.processing = processing;
    }

    public org.museframework.bian.carfinset.dto.bq.Processing getProcessing() {
        return processing;
    }
}