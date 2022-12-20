package org.museframework.bian.dealerdesk.dto;

public class NotifyInformationFeedAdministrationFunctionRequest {
    private String dealerdeskid;

    private String informationfeedadministrationfunctionid;

    public void setDealerdeskid(String dealerdeskid) {
        this.dealerdeskid = dealerdeskid;
    }

    public String getDealerdeskid() {
        return dealerdeskid;
    }

    public void setInformationfeedadministrationfunctionid(String informationfeedadministrationfunctionid) {
        this.informationfeedadministrationfunctionid = informationfeedadministrationfunctionid;
    }

    public String getInformationfeedadministrationfunctionid() {
        return informationfeedadministrationfunctionid;
    }
}