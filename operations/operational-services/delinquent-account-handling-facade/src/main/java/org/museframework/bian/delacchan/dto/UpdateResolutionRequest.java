package org.museframework.bian.delacchan.dto;

public class UpdateResolutionRequest {
    private String delinquentaccounthandlingid;

    private String resolutionid;

    private org.museframework.bian.delacchan.dto.bq.Resolution resolution;

    public void setDelinquentaccounthandlingid(String delinquentaccounthandlingid) {
        this.delinquentaccounthandlingid = delinquentaccounthandlingid;
    }

    public String getDelinquentaccounthandlingid() {
        return delinquentaccounthandlingid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }

    public void setResolution(org.museframework.bian.delacchan.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.delacchan.dto.bq.Resolution getResolution() {
        return resolution;
    }
}