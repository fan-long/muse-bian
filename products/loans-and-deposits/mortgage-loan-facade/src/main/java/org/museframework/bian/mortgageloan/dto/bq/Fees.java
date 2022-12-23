/**/
package org.museframework.bian.mortgageloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Fees {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String feesPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String feesFeatureSchedule;

    /*The Mortgage Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String feesPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String feesServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String feesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String feesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String feesServiceWorkProduct;

    /**/
    @MetaField
    private String feesServiceName;

    public void setFeesPreconditions(String feesPreconditions) {
        this.feesPreconditions = feesPreconditions;
    }

    public String getFeesPreconditions() {
        return feesPreconditions;
    }

    public void setFeesFeatureSchedule(String feesFeatureSchedule) {
        this.feesFeatureSchedule = feesFeatureSchedule;
    }

    public String getFeesFeatureSchedule() {
        return feesFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setFeesPostconditions(String feesPostconditions) {
        this.feesPostconditions = feesPostconditions;
    }

    public String getFeesPostconditions() {
        return feesPostconditions;
    }

    public void setFeesServiceType(String feesServiceType) {
        this.feesServiceType = feesServiceType;
    }

    public String getFeesServiceType() {
        return feesServiceType;
    }

    public void setFeesServiceDescription(String feesServiceDescription) {
        this.feesServiceDescription = feesServiceDescription;
    }

    public String getFeesServiceDescription() {
        return feesServiceDescription;
    }

    public void setFeesServiceInputsandOuputs(String feesServiceInputsandOuputs) {
        this.feesServiceInputsandOuputs = feesServiceInputsandOuputs;
    }

    public String getFeesServiceInputsandOuputs() {
        return feesServiceInputsandOuputs;
    }

    public void setFeesServiceWorkProduct(String feesServiceWorkProduct) {
        this.feesServiceWorkProduct = feesServiceWorkProduct;
    }

    public String getFeesServiceWorkProduct() {
        return feesServiceWorkProduct;
    }

    public void setFeesServiceName(String feesServiceName) {
        this.feesServiceName = feesServiceName;
    }

    public String getFeesServiceName() {
        return feesServiceName;
    }
}