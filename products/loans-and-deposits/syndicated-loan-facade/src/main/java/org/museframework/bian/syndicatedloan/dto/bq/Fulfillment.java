/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.syndicatedloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Fulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String fulfillmentPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String fulfillmentFeatureSchedule;

    /*The Syndicated Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService fiduciaryArrangementFulfillment;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String fulfillmentPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String fulfillmentFiduciaryArrangementFulfillmentServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String fulfillmentFiduciaryArrangementFulfillmentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct;

    /**/
    @MetaField(0)
    private String fulfillmentFiduciaryArrangementFulfillmentServiceName;

    public void setFulfillmentPreconditions(String fulfillmentPreconditions) {
        this.fulfillmentPreconditions = fulfillmentPreconditions;
    }

    public String getFulfillmentPreconditions() {
        return fulfillmentPreconditions;
    }

    public void setFulfillmentFeatureSchedule(String fulfillmentFeatureSchedule) {
        this.fulfillmentFeatureSchedule = fulfillmentFeatureSchedule;
    }

    public String getFulfillmentFeatureSchedule() {
        return fulfillmentFeatureSchedule;
    }

    public void setFiduciaryArrangementFulfillment(org.museframework.bian.classes.BusinessService fiduciaryArrangementFulfillment) {
        this.fiduciaryArrangementFulfillment = fiduciaryArrangementFulfillment;
    }

    public org.museframework.bian.classes.BusinessService getFiduciaryArrangementFulfillment() {
        return fiduciaryArrangementFulfillment;
    }

    public void setFulfillmentPostconditions(String fulfillmentPostconditions) {
        this.fulfillmentPostconditions = fulfillmentPostconditions;
    }

    public String getFulfillmentPostconditions() {
        return fulfillmentPostconditions;
    }

    public void setFulfillmentFiduciaryArrangementFulfillmentServiceType(String fulfillmentFiduciaryArrangementFulfillmentServiceType) {
        this.fulfillmentFiduciaryArrangementFulfillmentServiceType = fulfillmentFiduciaryArrangementFulfillmentServiceType;
    }

    public String getFulfillmentFiduciaryArrangementFulfillmentServiceType() {
        return fulfillmentFiduciaryArrangementFulfillmentServiceType;
    }

    public void setFulfillmentFiduciaryArrangementFulfillmentServiceDescription(String fulfillmentFiduciaryArrangementFulfillmentServiceDescription) {
        this.fulfillmentFiduciaryArrangementFulfillmentServiceDescription = fulfillmentFiduciaryArrangementFulfillmentServiceDescription;
    }

    public String getFulfillmentFiduciaryArrangementFulfillmentServiceDescription() {
        return fulfillmentFiduciaryArrangementFulfillmentServiceDescription;
    }

    public void setFulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs(String fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs) {
        this.fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs = fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs;
    }

    public String getFulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs() {
        return fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs;
    }

    public void setFulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct(String fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct) {
        this.fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct = fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct;
    }

    public String getFulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct() {
        return fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct;
    }

    public void setFulfillmentFiduciaryArrangementFulfillmentServiceName(String fulfillmentFiduciaryArrangementFulfillmentServiceName) {
        this.fulfillmentFiduciaryArrangementFulfillmentServiceName = fulfillmentFiduciaryArrangementFulfillmentServiceName;
    }

    public String getFulfillmentFiduciaryArrangementFulfillmentServiceName() {
        return fulfillmentFiduciaryArrangementFulfillmentServiceName;
    }
}