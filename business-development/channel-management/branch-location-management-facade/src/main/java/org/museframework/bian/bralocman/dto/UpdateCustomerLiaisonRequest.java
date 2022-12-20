package org.museframework.bian.bralocman.dto;

public class UpdateCustomerLiaisonRequest {
    private String branchlocationmanagementid;

    private String customerliaisonid;

    private org.museframework.bian.bralocman.dto.bq.CustomerLiaison customerLiaison;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setCustomerliaisonid(String customerliaisonid) {
        this.customerliaisonid = customerliaisonid;
    }

    public String getCustomerliaisonid() {
        return customerliaisonid;
    }

    public void setCustomerLiaison(org.museframework.bian.bralocman.dto.bq.CustomerLiaison customerLiaison) {
        this.customerLiaison = customerLiaison;
    }

    public org.museframework.bian.bralocman.dto.bq.CustomerLiaison getCustomerLiaison() {
        return customerLiaison;
    }
}