package org.museframework.bian.customeroffer.dto;

public class UpdateComplianceRequest {
    private String customerofferid;

    private String complianceid;

    private org.museframework.bian.customeroffer.dto.bq.Compliance compliance;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setComplianceid(String complianceid) {
        this.complianceid = complianceid;
    }

    public String getComplianceid() {
        return complianceid;
    }

    public void setCompliance(org.museframework.bian.customeroffer.dto.bq.Compliance compliance) {
        this.compliance = compliance;
    }

    public org.museframework.bian.customeroffer.dto.bq.Compliance getCompliance() {
        return compliance;
    }
}