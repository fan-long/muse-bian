package org.museframework.bian.customersurveys.dto;

public class InitiateCustomerSurveyProcedureResponse {
    private org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure customerSurveyProcedure;

    public void setCustomerSurveyProcedure(org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure customerSurveyProcedure) {
        this.customerSurveyProcedure = customerSurveyProcedure;
    }

    public org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure getCustomerSurveyProcedure() {
        return customerSurveyProcedure;
    }
}