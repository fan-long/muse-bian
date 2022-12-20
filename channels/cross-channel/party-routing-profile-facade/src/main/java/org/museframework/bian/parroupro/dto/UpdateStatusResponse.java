package org.museframework.bian.parroupro.dto;

public class UpdateStatusResponse {
    private org.museframework.bian.parroupro.dto.bq.Status status;

    public void setStatus(org.museframework.bian.parroupro.dto.bq.Status status) {
        this.status = status;
    }

    public org.museframework.bian.parroupro.dto.bq.Status getStatus() {
        return status;
    }
}