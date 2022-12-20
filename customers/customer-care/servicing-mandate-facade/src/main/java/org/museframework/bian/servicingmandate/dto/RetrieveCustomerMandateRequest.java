package org.museframework.bian.servicingmandate.dto;

public class RetrieveCustomerMandateRequest {
    private String servicingmandateid;

    private String customermandateid;

    public void setServicingmandateid(String servicingmandateid) {
        this.servicingmandateid = servicingmandateid;
    }

    public String getServicingmandateid() {
        return servicingmandateid;
    }

    public void setCustomermandateid(String customermandateid) {
        this.customermandateid = customermandateid;
    }

    public String getCustomermandateid() {
        return customermandateid;
    }
}