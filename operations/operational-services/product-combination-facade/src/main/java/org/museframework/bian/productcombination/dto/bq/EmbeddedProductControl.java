/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Product Combination. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.productcombination.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class EmbeddedProductControl {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String embeddedProductControlPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String embeddedProductControlFeatureSchedule;

    /*The Product Combination Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService combinedProductControl;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String embeddedProductControlPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String embeddedProductControlCombinedProductControlServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String embeddedProductControlCombinedProductControlServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String embeddedProductControlCombinedProductControlServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String embeddedProductControlCombinedProductControlServiceWorkProduct;

    /**/
    @MetaField
    private String embeddedProductControlCombinedProductControlServiceName;

    public void setEmbeddedProductControlPreconditions(String embeddedProductControlPreconditions) {
        this.embeddedProductControlPreconditions = embeddedProductControlPreconditions;
    }

    public String getEmbeddedProductControlPreconditions() {
        return embeddedProductControlPreconditions;
    }

    public void setEmbeddedProductControlFeatureSchedule(String embeddedProductControlFeatureSchedule) {
        this.embeddedProductControlFeatureSchedule = embeddedProductControlFeatureSchedule;
    }

    public String getEmbeddedProductControlFeatureSchedule() {
        return embeddedProductControlFeatureSchedule;
    }

    public void setCombinedProductControl(org.museframework.bian.classes.BusinessService combinedProductControl) {
        this.combinedProductControl = combinedProductControl;
    }

    public org.museframework.bian.classes.BusinessService getCombinedProductControl() {
        return combinedProductControl;
    }

    public void setEmbeddedProductControlPostconditions(String embeddedProductControlPostconditions) {
        this.embeddedProductControlPostconditions = embeddedProductControlPostconditions;
    }

    public String getEmbeddedProductControlPostconditions() {
        return embeddedProductControlPostconditions;
    }

    public void setEmbeddedProductControlCombinedProductControlServiceType(String embeddedProductControlCombinedProductControlServiceType) {
        this.embeddedProductControlCombinedProductControlServiceType = embeddedProductControlCombinedProductControlServiceType;
    }

    public String getEmbeddedProductControlCombinedProductControlServiceType() {
        return embeddedProductControlCombinedProductControlServiceType;
    }

    public void setEmbeddedProductControlCombinedProductControlServiceDescription(String embeddedProductControlCombinedProductControlServiceDescription) {
        this.embeddedProductControlCombinedProductControlServiceDescription = embeddedProductControlCombinedProductControlServiceDescription;
    }

    public String getEmbeddedProductControlCombinedProductControlServiceDescription() {
        return embeddedProductControlCombinedProductControlServiceDescription;
    }

    public void setEmbeddedProductControlCombinedProductControlServiceInputsandOuputs(String embeddedProductControlCombinedProductControlServiceInputsandOuputs) {
        this.embeddedProductControlCombinedProductControlServiceInputsandOuputs = embeddedProductControlCombinedProductControlServiceInputsandOuputs;
    }

    public String getEmbeddedProductControlCombinedProductControlServiceInputsandOuputs() {
        return embeddedProductControlCombinedProductControlServiceInputsandOuputs;
    }

    public void setEmbeddedProductControlCombinedProductControlServiceWorkProduct(String embeddedProductControlCombinedProductControlServiceWorkProduct) {
        this.embeddedProductControlCombinedProductControlServiceWorkProduct = embeddedProductControlCombinedProductControlServiceWorkProduct;
    }

    public String getEmbeddedProductControlCombinedProductControlServiceWorkProduct() {
        return embeddedProductControlCombinedProductControlServiceWorkProduct;
    }

    public void setEmbeddedProductControlCombinedProductControlServiceName(String embeddedProductControlCombinedProductControlServiceName) {
        this.embeddedProductControlCombinedProductControlServiceName = embeddedProductControlCombinedProductControlServiceName;
    }

    public String getEmbeddedProductControlCombinedProductControlServiceName() {
        return embeddedProductControlCombinedProductControlServiceName;
    }
}