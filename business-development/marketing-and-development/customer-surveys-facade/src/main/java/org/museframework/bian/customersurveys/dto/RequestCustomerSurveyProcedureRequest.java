package org.museframework.bian.customersurveys.dto;

public class RequestCustomerSurveyProcedureRequest {
    private String customersurveysid;

    private org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure customerSurveyProcedure;

    public void setCustomersurveysid(String customersurveysid) {
        this.customersurveysid = customersurveysid;
    }

    public String getCustomersurveysid() {
        return customersurveysid;
    }

    public void setCustomerSurveyProcedure(org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure customerSurveyProcedure) {
        this.customerSurveyProcedure = customerSurveyProcedure;
    }

    public org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure getCustomerSurveyProcedure() {
        return customerSurveyProcedure;
    }
}