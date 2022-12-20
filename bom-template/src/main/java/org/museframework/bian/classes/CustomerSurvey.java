/*Customer polling to identify their level of satisfaction with an existing product/service, relationship and etc. 

Customer polling to identify their level of satisfaction with an existing product, and to discover their express and hidden needs and expectations for new or proposed product(s).

Read more: http://www.businessdictionary.com/definition/customer-survey.html*/
package org.museframework.bian.classes;

public class CustomerSurvey {
    /*The type or category of customer survey (e.g. questionnaire, in context solicitation, focus group)*/
    private org.museframework.bian.enumerations.Customersurveytypevalues customerSurveyType;

    /*A description of the customer survey that clarifies the sought customer insights, survey mechanism and target reviewers*/
    private String customerSurveyDescription;

    /**/
    private String customerSurveyVersion;

    /*Key dates associated with the customer survey (e.g. initiation date, version revision date, completion date)*/
    private String customerSurveyDateTime;

    public void setCustomerSurveyType(org.museframework.bian.enumerations.Customersurveytypevalues customerSurveyType) {
        this.customerSurveyType = customerSurveyType;
    }

    public org.museframework.bian.enumerations.Customersurveytypevalues getCustomerSurveyType() {
        return customerSurveyType;
    }

    public void setCustomerSurveyDescription(String customerSurveyDescription) {
        this.customerSurveyDescription = customerSurveyDescription;
    }

    public String getCustomerSurveyDescription() {
        return customerSurveyDescription;
    }

    public void setCustomerSurveyVersion(String customerSurveyVersion) {
        this.customerSurveyVersion = customerSurveyVersion;
    }

    public String getCustomerSurveyVersion() {
        return customerSurveyVersion;
    }

    public void setCustomerSurveyDateTime(String customerSurveyDateTime) {
        this.customerSurveyDateTime = customerSurveyDateTime;
    }

    public String getCustomerSurveyDateTime() {
        return customerSurveyDateTime;
    }
}