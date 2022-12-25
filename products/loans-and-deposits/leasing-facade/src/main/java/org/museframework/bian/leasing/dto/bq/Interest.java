/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.leasing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Interest {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String interestPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String interestFeatureSchedule;

    /*The Leasing Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String interestPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String interestServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String interestServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String interestServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String interestServiceWorkProduct;

    /**/
    @MetaField(0)
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