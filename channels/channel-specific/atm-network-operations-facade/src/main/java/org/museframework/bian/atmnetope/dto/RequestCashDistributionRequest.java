package org.museframework.bian.atmnetope.dto;

public class RequestCashDistributionRequest {
    private String atmnetworkoperationsid;

    private String cashdistributionid;

    private org.museframework.bian.atmnetope.dto.bq.CashDistribution cashDistribution;

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

    public void setCashDistribution(org.museframework.bian.atmnetope.dto.bq.CashDistribution cashDistribution) {
        this.cashDistribution = cashDistribution;
    }

    public org.museframework.bian.atmnetope.dto.bq.CashDistribution getCashDistribution() {
        return cashDistribution;
    }
}