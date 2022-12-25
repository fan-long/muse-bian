/*The configuration and execution of Batch Debit arrangement within the Direct Debit Facility*/
package org.museframework.bian.directdebit.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FundsAvailableCheck {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String fundsAvailableCheckPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String fundsAvailableCheckFeatureSchedule;

    /*The Direct Debit Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService fundsAvailableCheck;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String fundsAvailableCheckPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String fundsAvailableCheckFundsAvailableCheckServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String fundsAvailableCheckFundsAvailableCheckServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;

    /**/
    @MetaField(0)
    private String fundsAvailableCheckFundsAvailableCheckServiceName;

    public void setFundsAvailableCheckPreconditions(String fundsAvailableCheckPreconditions) {
        this.fundsAvailableCheckPreconditions = fundsAvailableCheckPreconditions;
    }

    public String getFundsAvailableCheckPreconditions() {
        return fundsAvailableCheckPreconditions;
    }

    public void setFundsAvailableCheckFeatureSchedule(String fundsAvailableCheckFeatureSchedule) {
        this.fundsAvailableCheckFeatureSchedule = fundsAvailableCheckFeatureSchedule;
    }

    public String getFundsAvailableCheckFeatureSchedule() {
        return fundsAvailableCheckFeatureSchedule;
    }

    public void setFundsAvailableCheck(org.museframework.bian.classes.BusinessService fundsAvailableCheck) {
        this.fundsAvailableCheck = fundsAvailableCheck;
    }

    public org.museframework.bian.classes.BusinessService getFundsAvailableCheck() {
        return fundsAvailableCheck;
    }

    public void setFundsAvailableCheckPostconditions(String fundsAvailableCheckPostconditions) {
        this.fundsAvailableCheckPostconditions = fundsAvailableCheckPostconditions;
    }

    public String getFundsAvailableCheckPostconditions() {
        return fundsAvailableCheckPostconditions;
    }

    public void setFundsAvailableCheckFundsAvailableCheckServiceType(String fundsAvailableCheckFundsAvailableCheckServiceType) {
        this.fundsAvailableCheckFundsAvailableCheckServiceType = fundsAvailableCheckFundsAvailableCheckServiceType;
    }

    public String getFundsAvailableCheckFundsAvailableCheckServiceType() {
        return fundsAvailableCheckFundsAvailableCheckServiceType;
    }

    public void setFundsAvailableCheckFundsAvailableCheckServiceDescription(String fundsAvailableCheckFundsAvailableCheckServiceDescription) {
        this.fundsAvailableCheckFundsAvailableCheckServiceDescription = fundsAvailableCheckFundsAvailableCheckServiceDescription;
    }

    public String getFundsAvailableCheckFundsAvailableCheckServiceDescription() {
        return fundsAvailableCheckFundsAvailableCheckServiceDescription;
    }

    public void setFundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs(String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs) {
        this.fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs = fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;
    }

    public String getFundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs() {
        return fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;
    }

    public void setFundsAvailableCheckFundsAvailableCheckServiceWorkProduct(String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct) {
        this.fundsAvailableCheckFundsAvailableCheckServiceWorkProduct = fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;
    }

    public String getFundsAvailableCheckFundsAvailableCheckServiceWorkProduct() {
        return fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;
    }

    public void setFundsAvailableCheckFundsAvailableCheckServiceName(String fundsAvailableCheckFundsAvailableCheckServiceName) {
        this.fundsAvailableCheckFundsAvailableCheckServiceName = fundsAvailableCheckFundsAvailableCheckServiceName;
    }

    public String getFundsAvailableCheckFundsAvailableCheckServiceName() {
        return fundsAvailableCheckFundsAvailableCheckServiceName;
    }
}