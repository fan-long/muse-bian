/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Product Combination. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.productcombination.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TransferPricing {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String transferPricingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String transferPricingFeatureSchedule;

    /*The Product Combination Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService productTransferPricing;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String transferPricingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String transferPricingProductTransferPricingServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String transferPricingProductTransferPricingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String transferPricingProductTransferPricingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String transferPricingProductTransferPricingServiceWorkProduct;

    /**/
    @MetaField(0)
    private String transferPricingProductTransferPricingServiceName;

    public void setTransferPricingPreconditions(String transferPricingPreconditions) {
        this.transferPricingPreconditions = transferPricingPreconditions;
    }

    public String getTransferPricingPreconditions() {
        return transferPricingPreconditions;
    }

    public void setTransferPricingFeatureSchedule(String transferPricingFeatureSchedule) {
        this.transferPricingFeatureSchedule = transferPricingFeatureSchedule;
    }

    public String getTransferPricingFeatureSchedule() {
        return transferPricingFeatureSchedule;
    }

    public void setProductTransferPricing(org.museframework.bian.classes.BusinessService productTransferPricing) {
        this.productTransferPricing = productTransferPricing;
    }

    public org.museframework.bian.classes.BusinessService getProductTransferPricing() {
        return productTransferPricing;
    }

    public void setTransferPricingPostconditions(String transferPricingPostconditions) {
        this.transferPricingPostconditions = transferPricingPostconditions;
    }

    public String getTransferPricingPostconditions() {
        return transferPricingPostconditions;
    }

    public void setTransferPricingProductTransferPricingServiceType(String transferPricingProductTransferPricingServiceType) {
        this.transferPricingProductTransferPricingServiceType = transferPricingProductTransferPricingServiceType;
    }

    public String getTransferPricingProductTransferPricingServiceType() {
        return transferPricingProductTransferPricingServiceType;
    }

    public void setTransferPricingProductTransferPricingServiceDescription(String transferPricingProductTransferPricingServiceDescription) {
        this.transferPricingProductTransferPricingServiceDescription = transferPricingProductTransferPricingServiceDescription;
    }

    public String getTransferPricingProductTransferPricingServiceDescription() {
        return transferPricingProductTransferPricingServiceDescription;
    }

    public void setTransferPricingProductTransferPricingServiceInputsandOuputs(String transferPricingProductTransferPricingServiceInputsandOuputs) {
        this.transferPricingProductTransferPricingServiceInputsandOuputs = transferPricingProductTransferPricingServiceInputsandOuputs;
    }

    public String getTransferPricingProductTransferPricingServiceInputsandOuputs() {
        return transferPricingProductTransferPricingServiceInputsandOuputs;
    }

    public void setTransferPricingProductTransferPricingServiceWorkProduct(String transferPricingProductTransferPricingServiceWorkProduct) {
        this.transferPricingProductTransferPricingServiceWorkProduct = transferPricingProductTransferPricingServiceWorkProduct;
    }

    public String getTransferPricingProductTransferPricingServiceWorkProduct() {
        return transferPricingProductTransferPricingServiceWorkProduct;
    }

    public void setTransferPricingProductTransferPricingServiceName(String transferPricingProductTransferPricingServiceName) {
        this.transferPricingProductTransferPricingServiceName = transferPricingProductTransferPricingServiceName;
    }

    public String getTransferPricingProductTransferPricingServiceName() {
        return transferPricingProductTransferPricingServiceName;
    }
}