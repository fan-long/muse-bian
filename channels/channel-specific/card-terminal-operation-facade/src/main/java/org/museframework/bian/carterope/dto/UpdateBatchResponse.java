package org.museframework.bian.carterope.dto;

public class UpdateBatchResponse {
    private org.museframework.bian.carterope.dto.bq.Batch batch;

    public void setBatch(org.museframework.bian.carterope.dto.bq.Batch batch) {
        this.batch = batch;
    }

    public org.museframework.bian.carterope.dto.bq.Batch getBatch() {
        return batch;
    }
}