/**/
package org.museframework.bian.mortgageloan.dto.bq;

public class Lien {
    /*The required status/situation prior to the implementation of the feature*/
    private String lienPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String lienFeatureSchedule;

    /*The Mortgage Loan Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String lienPostconditions;

    /*Reference to the specific business service type*/
    private String lienServiceType;

    /*Description of the performed business service*/
    private String lienServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String lienServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String lienServiceWorkProduct;

    /**/
    private String lienServiceName;

    public void setLienPreconditions(String lienPreconditions) {
        this.lienPreconditions = lienPreconditions;
    }

    public String getLienPreconditions() {
        return lienPreconditions;
    }

    public void setLienFeatureSchedule(String lienFeatureSchedule) {
        this.lienFeatureSchedule = lienFeatureSchedule;
    }

    public String getLienFeatureSchedule() {
        return lienFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setLienPostconditions(String lienPostconditions) {
        this.lienPostconditions = lienPostconditions;
    }

    public String getLienPostconditions() {
        return lienPostconditions;
    }

    public void setLienServiceType(String lienServiceType) {
        this.lienServiceType = lienServiceType;
    }

    public String getLienServiceType() {
        return lienServiceType;
    }

    public void setLienServiceDescription(String lienServiceDescription) {
        this.lienServiceDescription = lienServiceDescription;
    }

    public String getLienServiceDescription() {
        return lienServiceDescription;
    }

    public void setLienServiceInputsandOuputs(String lienServiceInputsandOuputs) {
        this.lienServiceInputsandOuputs = lienServiceInputsandOuputs;
    }

    public String getLienServiceInputsandOuputs() {
        return lienServiceInputsandOuputs;
    }

    public void setLienServiceWorkProduct(String lienServiceWorkProduct) {
        this.lienServiceWorkProduct = lienServiceWorkProduct;
    }

    public String getLienServiceWorkProduct() {
        return lienServiceWorkProduct;
    }

    public void setLienServiceName(String lienServiceName) {
        this.lienServiceName = lienServiceName;
    }

    public String getLienServiceName() {
        return lienServiceName;
    }
}