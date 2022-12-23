/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.leasing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Sweep {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String sweepPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String sweepFeatureSchedule;

    /*The Leasing Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String sweepPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String sweepServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String sweepServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String sweepServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String sweepServiceWorkProduct;

    /**/
    @MetaField
    private String sweepServiceName;

    public void setSweepPreconditions(String sweepPreconditions) {
        this.sweepPreconditions = sweepPreconditions;
    }

    public String getSweepPreconditions() {
        return sweepPreconditions;
    }

    public void setSweepFeatureSchedule(String sweepFeatureSchedule) {
        this.sweepFeatureSchedule = sweepFeatureSchedule;
    }

    public String getSweepFeatureSchedule() {
        return sweepFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setSweepPostconditions(String sweepPostconditions) {
        this.sweepPostconditions = sweepPostconditions;
    }

    public String getSweepPostconditions() {
        return sweepPostconditions;
    }

    public void setSweepServiceType(String sweepServiceType) {
        this.sweepServiceType = sweepServiceType;
    }

    public String getSweepServiceType() {
        return sweepServiceType;
    }

    public void setSweepServiceDescription(String sweepServiceDescription) {
        this.sweepServiceDescription = sweepServiceDescription;
    }

    public String getSweepServiceDescription() {
        return sweepServiceDescription;
    }

    public void setSweepServiceInputsandOuputs(String sweepServiceInputsandOuputs) {
        this.sweepServiceInputsandOuputs = sweepServiceInputsandOuputs;
    }

    public String getSweepServiceInputsandOuputs() {
        return sweepServiceInputsandOuputs;
    }

    public void setSweepServiceWorkProduct(String sweepServiceWorkProduct) {
        this.sweepServiceWorkProduct = sweepServiceWorkProduct;
    }

    public String getSweepServiceWorkProduct() {
        return sweepServiceWorkProduct;
    }

    public void setSweepServiceName(String sweepServiceName) {
        this.sweepServiceName = sweepServiceName;
    }

    public String getSweepServiceName() {
        return sweepServiceName;
    }
}