package org.museframework.bian.notionalpooling.dto;

public class ExchangeNotionalAccountArrangementFulfillmentRequest {
    private String notionalpoolingid;

    private String notionalaccountarrangementfulfillmentid;

    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment notionalAccountArrangementFulfillment;

    public void setNotionalpoolingid(String notionalpoolingid) {
        this.notionalpoolingid = notionalpoolingid;
    }

    public String getNotionalpoolingid() {
        return notionalpoolingid;
    }

    public void setNotionalaccountarrangementfulfillmentid(String notionalaccountarrangementfulfillmentid) {
        this.notionalaccountarrangementfulfillmentid = notionalaccountarrangementfulfillmentid;
    }

    public String getNotionalaccountarrangementfulfillmentid() {
        return notionalaccountarrangementfulfillmentid;
    }

    public void setNotionalAccountArrangementFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment notionalAccountArrangementFulfillment) {
        this.notionalAccountArrangementFulfillment = notionalAccountArrangementFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment getNotionalAccountArrangementFulfillment() {
        return notionalAccountArrangementFulfillment;
    }
}