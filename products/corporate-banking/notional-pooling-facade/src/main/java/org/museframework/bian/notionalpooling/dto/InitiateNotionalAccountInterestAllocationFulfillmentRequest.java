package org.museframework.bian.notionalpooling.dto;

public class InitiateNotionalAccountInterestAllocationFulfillmentRequest {
    private String notionalpoolingid;

    private String notionalaccountinterestallocationfulfillmentid;

    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment notionalAccountInterestAllocationFulfillment;

    public void setNotionalpoolingid(String notionalpoolingid) {
        this.notionalpoolingid = notionalpoolingid;
    }

    public String getNotionalpoolingid() {
        return notionalpoolingid;
    }

    public void setNotionalaccountinterestallocationfulfillmentid(String notionalaccountinterestallocationfulfillmentid) {
        this.notionalaccountinterestallocationfulfillmentid = notionalaccountinterestallocationfulfillmentid;
    }

    public String getNotionalaccountinterestallocationfulfillmentid() {
        return notionalaccountinterestallocationfulfillmentid;
    }

    public void setNotionalAccountInterestAllocationFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment notionalAccountInterestAllocationFulfillment) {
        this.notionalAccountInterestAllocationFulfillment = notionalAccountInterestAllocationFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment getNotionalAccountInterestAllocationFulfillment() {
        return notionalAccountInterestAllocationFulfillment;
    }
}