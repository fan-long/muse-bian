/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.custodyadministration.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Settlement
@MetaDto
public class Settlement {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String settlementPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String settlementFeatureSchedule;

    /*The Custody Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String settlementPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String settlementServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String settlementServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String settlementServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String settlementServiceWorkProduct;

    /**/
    @MetaField
    private String settlementServiceName;

    public void setSettlementPreconditions(String settlementPreconditions) {
        this.settlementPreconditions = settlementPreconditions;
    }

    public String getSettlementPreconditions() {
        return settlementPreconditions;
    }

    public void setSettlementFeatureSchedule(String settlementFeatureSchedule) {
        this.settlementFeatureSchedule = settlementFeatureSchedule;
    }

    public String getSettlementFeatureSchedule() {
        return settlementFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setSettlementPostconditions(String settlementPostconditions) {
        this.settlementPostconditions = settlementPostconditions;
    }

    public String getSettlementPostconditions() {
        return settlementPostconditions;
    }

    public void setSettlementServiceType(String settlementServiceType) {
        this.settlementServiceType = settlementServiceType;
    }

    public String getSettlementServiceType() {
        return settlementServiceType;
    }

    public void setSettlementServiceDescription(String settlementServiceDescription) {
        this.settlementServiceDescription = settlementServiceDescription;
    }

    public String getSettlementServiceDescription() {
        return settlementServiceDescription;
    }

    public void setSettlementServiceInputsandOuputs(String settlementServiceInputsandOuputs) {
        this.settlementServiceInputsandOuputs = settlementServiceInputsandOuputs;
    }

    public String getSettlementServiceInputsandOuputs() {
        return settlementServiceInputsandOuputs;
    }

    public void setSettlementServiceWorkProduct(String settlementServiceWorkProduct) {
        this.settlementServiceWorkProduct = settlementServiceWorkProduct;
    }

    public String getSettlementServiceWorkProduct() {
        return settlementServiceWorkProduct;
    }

    public void setSettlementServiceName(String settlementServiceName) {
        this.settlementServiceName = settlementServiceName;
    }

    public String getSettlementServiceName() {
        return settlementServiceName;
    }
}