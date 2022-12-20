package org.museframework.bian.cencashan.dto;

public class RetrieveProjectionandAllocationRequest {
    private String centralcashhandlingid;

    private String projectionandallocationid;

    public void setCentralcashhandlingid(String centralcashhandlingid) {
        this.centralcashhandlingid = centralcashhandlingid;
    }

    public String getCentralcashhandlingid() {
        return centralcashhandlingid;
    }

    public void setProjectionandallocationid(String projectionandallocationid) {
        this.projectionandallocationid = projectionandallocationid;
    }

    public String getProjectionandallocationid() {
        return projectionandallocationid;
    }
}