/**/
package org.museframework.bian.mortgageloan.dto.bq;

public class Interest {
    /*The required status/situation prior to the implementation of the feature*/
    private String interestPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String interestFeatureSchedule;

    /*The Mortgage Loan Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String interestPostconditions;

    /*Reference to the specific business service type*/
    private String interestServiceType;

    /*Description of the performed business service*/
    private String interestServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String interestServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String interestServiceWorkProduct;

    /**/
    private String interestServiceName;

    public void setInterestPreconditions(String interestPreconditions) {
        this.interestPreconditions = interestPreconditions;
    }

    public String getInterestPreconditions() {
        return interestPreconditions;
    }

    public void setInterestFeatureSchedule(String interestFeatureSchedule) {
        this.interestFeatureSchedule = interestFeatureSchedule;
    }

    public String getInterestFeatureSchedule() {
        return interestFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setInterestPostconditions(String interestPostconditions) {
        this.interestPostconditions = interestPostconditions;
    }

    public String getInterestPostconditions() {
        return interestPostconditions;
    }

    public void setInterestServiceType(String interestServiceType) {
        this.interestServiceType = interestServiceType;
    }

    public String getInterestServiceType() {
        return interestServiceType;
    }

    public void setInterestServiceDescription(String interestServiceDescription) {
        this.interestServiceDescription = interestServiceDescription;
    }

    public String getInterestServiceDescription() {
        return interestServiceDescription;
    }

    public void setInterestServiceInputsandOuputs(String interestServiceInputsandOuputs) {
        this.interestServiceInputsandOuputs = interestServiceInputsandOuputs;
    }

    public String getInterestServiceInputsandOuputs() {
        return interestServiceInputsandOuputs;
    }

    public void setInterestServiceWorkProduct(String interestServiceWorkProduct) {
        this.interestServiceWorkProduct = interestServiceWorkProduct;
    }

    public String getInterestServiceWorkProduct() {
        return interestServiceWorkProduct;
    }

    public void setInterestServiceName(String interestServiceName) {
        this.interestServiceName = interestServiceName;
    }

    public String getInterestServiceName() {
        return interestServiceName;
    }
}