package org.museframework.bian.proinvdis.dto;

public class RetrieveMailingRequest {
    private String productinventorydistributionid;

    private String mailingid;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setMailingid(String mailingid) {
        this.mailingid = mailingid;
    }

    public String getMailingid() {
        return mailingid;
    }
}