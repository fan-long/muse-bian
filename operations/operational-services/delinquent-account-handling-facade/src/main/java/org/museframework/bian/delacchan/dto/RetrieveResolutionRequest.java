package org.museframework.bian.delacchan.dto;

public class RetrieveResolutionRequest {
    private String delinquentaccounthandlingid;

    private String resolutionid;

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
}