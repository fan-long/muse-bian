/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.custodyadministration.dto.bq;

public class DividendsandInterest {
    /*The required status/situation prior to the implementation of the feature*/
    private String dividendsandInterestPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String dividendsandInterestFeatureSchedule;

    /*The Custody Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService custodyDividendsandInterest;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String dividendsandInterestPostconditions;

    /*Reference to the specific business service type*/
    private String dividendsandInterestCustodyDividendsandInterestServiceType;

    /*Description of the performed business service*/
    private String dividendsandInterestCustodyDividendsandInterestServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String dividendsandInterestCustodyDividendsandInterestServiceWorkProduct;

    /**/
    private String dividendsandInterestCustodyDividendsandInterestServiceName;

    public void setDividendsandInterestPreconditions(String dividendsandInterestPreconditions) {
        this.dividendsandInterestPreconditions = dividendsandInterestPreconditions;
    }

    public String getDividendsandInterestPreconditions() {
        return dividendsandInterestPreconditions;
    }

    public void setDividendsandInterestFeatureSchedule(String dividendsandInterestFeatureSchedule) {
        this.dividendsandInterestFeatureSchedule = dividendsandInterestFeatureSchedule;
    }

    public String getDividendsandInterestFeatureSchedule() {
        return dividendsandInterestFeatureSchedule;
    }

    public void setCustodyDividendsandInterest(org.museframework.bian.classes.BusinessService custodyDividendsandInterest) {
        this.custodyDividendsandInterest = custodyDividendsandInterest;
    }

    public org.museframework.bian.classes.BusinessService getCustodyDividendsandInterest() {
        return custodyDividendsandInterest;
    }

    public void setDividendsandInterestPostconditions(String dividendsandInterestPostconditions) {
        this.dividendsandInterestPostconditions = dividendsandInterestPostconditions;
    }

    public String getDividendsandInterestPostconditions() {
        return dividendsandInterestPostconditions;
    }

    public void setDividendsandInterestCustodyDividendsandInterestServiceType(String dividendsandInterestCustodyDividendsandInterestServiceType) {
        this.dividendsandInterestCustodyDividendsandInterestServiceType = dividendsandInterestCustodyDividendsandInterestServiceType;
    }

    public String getDividendsandInterestCustodyDividendsandInterestServiceType() {
        return dividendsandInterestCustodyDividendsandInterestServiceType;
    }

    public void setDividendsandInterestCustodyDividendsandInterestServiceDescription(String dividendsandInterestCustodyDividendsandInterestServiceDescription) {
        this.dividendsandInterestCustodyDividendsandInterestServiceDescription = dividendsandInterestCustodyDividendsandInterestServiceDescription;
    }

    public String getDividendsandInterestCustodyDividendsandInterestServiceDescription() {
        return dividendsandInterestCustodyDividendsandInterestServiceDescription;
    }

    public void setDividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs(String dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs) {
        this.dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs = dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs;
    }

    public String getDividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs() {
        return dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs;
    }

    public void setDividendsandInterestCustodyDividendsandInterestServiceWorkProduct(String dividendsandInterestCustodyDividendsandInterestServiceWorkProduct) {
        this.dividendsandInterestCustodyDividendsandInterestServiceWorkProduct = dividendsandInterestCustodyDividendsandInterestServiceWorkProduct;
    }

    public String getDividendsandInterestCustodyDividendsandInterestServiceWorkProduct() {
        return dividendsandInterestCustodyDividendsandInterestServiceWorkProduct;
    }

    public void setDividendsandInterestCustodyDividendsandInterestServiceName(String dividendsandInterestCustodyDividendsandInterestServiceName) {
        this.dividendsandInterestCustodyDividendsandInterestServiceName = dividendsandInterestCustodyDividendsandInterestServiceName;
    }

    public String getDividendsandInterestCustodyDividendsandInterestServiceName() {
        return dividendsandInterestCustodyDividendsandInterestServiceName;
    }
}