package org.museframework.bian.cencashan.dto;

public class UpdateProjectionandAllocationRequest {
    private String centralcashhandlingid;

    private String projectionandallocationid;

    private org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation projectionandAllocation;

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

    public void setProjectionandAllocation(org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation projectionandAllocation) {
        this.projectionandAllocation = projectionandAllocation;
    }

    public org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation getProjectionandAllocation() {
        return projectionandAllocation;
    }
}