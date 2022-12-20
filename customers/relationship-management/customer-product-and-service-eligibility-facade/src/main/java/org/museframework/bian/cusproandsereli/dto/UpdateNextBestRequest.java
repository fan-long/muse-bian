package org.museframework.bian.cusproandsereli.dto;

public class UpdateNextBestRequest {
    private String customerproductandserviceeligibilityid;

    private String nextbestid;

    private org.museframework.bian.cusproandsereli.dto.bq.NextBest nextBest;

    public void setCustomerproductandserviceeligibilityid(String customerproductandserviceeligibilityid) {
        this.customerproductandserviceeligibilityid = customerproductandserviceeligibilityid;
    }

    public String getCustomerproductandserviceeligibilityid() {
        return customerproductandserviceeligibilityid;
    }

    public void setNextbestid(String nextbestid) {
        this.nextbestid = nextbestid;
    }

    public String getNextbestid() {
        return nextbestid;
    }

    public void setNextBest(org.museframework.bian.cusproandsereli.dto.bq.NextBest nextBest) {
        this.nextBest = nextBest;
    }

    public org.museframework.bian.cusproandsereli.dto.bq.NextBest getNextBest() {
        return nextBest;
    }
}