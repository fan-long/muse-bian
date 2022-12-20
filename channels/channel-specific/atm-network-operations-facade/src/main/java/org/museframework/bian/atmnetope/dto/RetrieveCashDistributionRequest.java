package org.museframework.bian.atmnetope.dto;

public class RetrieveCashDistributionRequest {
    private String atmnetworkoperationsid;

    private String cashdistributionid;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setCashdistributionid(String cashdistributionid) {
        this.cashdistributionid = cashdistributionid;
    }

    public String getCashdistributionid() {
        return cashdistributionid;
    }
}