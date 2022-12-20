/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.custodyadministration.dto.bq;

public class SafeKeeping {
    /*The required status/situation prior to the implementation of the feature*/
    private String safeKeepingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String safeKeepingFeatureSchedule;

    /*The Custody Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService securitiesSafeKeeping;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String safeKeepingPostconditions;

    /*Reference to the specific business service type*/
    private String safeKeepingSecuritiesSafeKeepingServiceType;

    /*Description of the performed business service*/
    private String safeKeepingSecuritiesSafeKeepingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String safeKeepingSecuritiesSafeKeepingServiceWorkProduct;

    /**/
    private String safeKeepingSecuritiesSafeKeepingServiceName;

    public void setSafeKeepingPreconditions(String safeKeepingPreconditions) {
        this.safeKeepingPreconditions = safeKeepingPreconditions;
    }

    public String getSafeKeepingPreconditions() {
        return safeKeepingPreconditions;
    }

    public void setSafeKeepingFeatureSchedule(String safeKeepingFeatureSchedule) {
        this.safeKeepingFeatureSchedule = safeKeepingFeatureSchedule;
    }

    public String getSafeKeepingFeatureSchedule() {
        return safeKeepingFeatureSchedule;
    }

    public void setSecuritiesSafeKeeping(org.museframework.bian.classes.BusinessService securitiesSafeKeeping) {
        this.securitiesSafeKeeping = securitiesSafeKeeping;
    }

    public org.museframework.bian.classes.BusinessService getSecuritiesSafeKeeping() {
        return securitiesSafeKeeping;
    }

    public void setSafeKeepingPostconditions(String safeKeepingPostconditions) {
        this.safeKeepingPostconditions = safeKeepingPostconditions;
    }

    public String getSafeKeepingPostconditions() {
        return safeKeepingPostconditions;
    }

    public void setSafeKeepingSecuritiesSafeKeepingServiceType(String safeKeepingSecuritiesSafeKeepingServiceType) {
        this.safeKeepingSecuritiesSafeKeepingServiceType = safeKeepingSecuritiesSafeKeepingServiceType;
    }

    public String getSafeKeepingSecuritiesSafeKeepingServiceType() {
        return safeKeepingSecuritiesSafeKeepingServiceType;
    }

    public void setSafeKeepingSecuritiesSafeKeepingServiceDescription(String safeKeepingSecuritiesSafeKeepingServiceDescription) {
        this.safeKeepingSecuritiesSafeKeepingServiceDescription = safeKeepingSecuritiesSafeKeepingServiceDescription;
    }

    public String getSafeKeepingSecuritiesSafeKeepingServiceDescription() {
        return safeKeepingSecuritiesSafeKeepingServiceDescription;
    }

    public void setSafeKeepingSecuritiesSafeKeepingServiceInputsandOuputs(String safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs) {
        this.safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs = safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs;
    }

    public String getSafeKeepingSecuritiesSafeKeepingServiceInputsandOuputs() {
        return safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs;
    }

    public void setSafeKeepingSecuritiesSafeKeepingServiceWorkProduct(String safeKeepingSecuritiesSafeKeepingServiceWorkProduct) {
        this.safeKeepingSecuritiesSafeKeepingServiceWorkProduct = safeKeepingSecuritiesSafeKeepingServiceWorkProduct;
    }

    public String getSafeKeepingSecuritiesSafeKeepingServiceWorkProduct() {
        return safeKeepingSecuritiesSafeKeepingServiceWorkProduct;
    }

    public void setSafeKeepingSecuritiesSafeKeepingServiceName(String safeKeepingSecuritiesSafeKeepingServiceName) {
        this.safeKeepingSecuritiesSafeKeepingServiceName = safeKeepingSecuritiesSafeKeepingServiceName;
    }

    public String getSafeKeepingSecuritiesSafeKeepingServiceName() {
        return safeKeepingSecuritiesSafeKeepingServiceName;
    }
}