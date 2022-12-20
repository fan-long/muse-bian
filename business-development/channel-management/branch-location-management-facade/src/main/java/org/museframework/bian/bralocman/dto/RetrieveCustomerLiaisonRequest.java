package org.museframework.bian.bralocman.dto;

public class RetrieveCustomerLiaisonRequest {
    private String branchlocationmanagementid;

    private String customerliaisonid;

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
}