package org.museframework.bian.dealerdesk.dto;

public class InitiateInformationFeedAdministrationFunctionRequest {
    private String dealerdeskid;

    private String informationfeedadministrationfunctionid;

    private org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction informationFeedAdministrationFunction;

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

    public void setInformationFeedAdministrationFunction(org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction informationFeedAdministrationFunction) {
        this.informationFeedAdministrationFunction = informationFeedAdministrationFunction;
    }

    public org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction getInformationFeedAdministrationFunction() {
        return informationFeedAdministrationFunction;
    }
}