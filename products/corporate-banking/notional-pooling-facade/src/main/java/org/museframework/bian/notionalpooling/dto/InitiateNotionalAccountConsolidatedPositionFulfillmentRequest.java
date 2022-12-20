package org.museframework.bian.notionalpooling.dto;

public class InitiateNotionalAccountConsolidatedPositionFulfillmentRequest {
    private String notionalpoolingid;

    private String notionalaccountconsolidatedpositionfulfillmentid;

    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment notionalAccountConsolidatedPositionFulfillment;

    public void setNotionalpoolingid(String notionalpoolingid) {
        this.notionalpoolingid = notionalpoolingid;
    }

    public String getNotionalpoolingid() {
        return notionalpoolingid;
    }

    public void setNotionalaccountconsolidatedpositionfulfillmentid(String notionalaccountconsolidatedpositionfulfillmentid) {
        this.notionalaccountconsolidatedpositionfulfillmentid = notionalaccountconsolidatedpositionfulfillmentid;
    }

    public String getNotionalaccountconsolidatedpositionfulfillmentid() {
        return notionalaccountconsolidatedpositionfulfillmentid;
    }

    public void setNotionalAccountConsolidatedPositionFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment notionalAccountConsolidatedPositionFulfillment) {
        this.notionalAccountConsolidatedPositionFulfillment = notionalAccountConsolidatedPositionFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment getNotionalAccountConsolidatedPositionFulfillment() {
        return notionalAccountConsolidatedPositionFulfillment;
    }
}