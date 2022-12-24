/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.leasing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CorporateAction
@MetaDto
public class CorporateAction {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String corporateActionPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String corporateActionFeatureSchedule;

    /*The Leasing Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService BS_CorporateActionProcessing;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String corporateActionPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String corporateActionBS_CorporateActionProcessingServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String corporateActionBS_CorporateActionProcessingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String corporateActionBS_CorporateActionProcessingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String corporateActionBS_CorporateActionProcessingServiceWorkProduct;

    /**/
    @MetaField
    private String corporateActionBS_CorporateActionProcessingServiceName;

    public void setCorporateActionPreconditions(String corporateActionPreconditions) {
        this.corporateActionPreconditions = corporateActionPreconditions;
    }

    public String getCorporateActionPreconditions() {
        return corporateActionPreconditions;
    }

    public void setCorporateActionFeatureSchedule(String corporateActionFeatureSchedule) {
        this.corporateActionFeatureSchedule = corporateActionFeatureSchedule;
    }

    public String getCorporateActionFeatureSchedule() {
        return corporateActionFeatureSchedule;
    }

    public void setBS_CorporateActionProcessing(org.museframework.bian.classes.BusinessService BS_CorporateActionProcessing) {
        this.BS_CorporateActionProcessing = BS_CorporateActionProcessing;
    }

    public org.museframework.bian.classes.BusinessService getBS_CorporateActionProcessing() {
        return BS_CorporateActionProcessing;
    }

    public void setCorporateActionPostconditions(String corporateActionPostconditions) {
        this.corporateActionPostconditions = corporateActionPostconditions;
    }

    public String getCorporateActionPostconditions() {
        return corporateActionPostconditions;
    }

    public void setCorporateActionBS_CorporateActionProcessingServiceType(String corporateActionBS_CorporateActionProcessingServiceType) {
        this.corporateActionBS_CorporateActionProcessingServiceType = corporateActionBS_CorporateActionProcessingServiceType;
    }

    public String getCorporateActionBS_CorporateActionProcessingServiceType() {
        return corporateActionBS_CorporateActionProcessingServiceType;
    }

    public void setCorporateActionBS_CorporateActionProcessingServiceDescription(String corporateActionBS_CorporateActionProcessingServiceDescription) {
        this.corporateActionBS_CorporateActionProcessingServiceDescription = corporateActionBS_CorporateActionProcessingServiceDescription;
    }

    public String getCorporateActionBS_CorporateActionProcessingServiceDescription() {
        return corporateActionBS_CorporateActionProcessingServiceDescription;
    }

    public void setCorporateActionBS_CorporateActionProcessingServiceInputsandOuputs(String corporateActionBS_CorporateActionProcessingServiceInputsandOuputs) {
        this.corporateActionBS_CorporateActionProcessingServiceInputsandOuputs = corporateActionBS_CorporateActionProcessingServiceInputsandOuputs;
    }

    public String getCorporateActionBS_CorporateActionProcessingServiceInputsandOuputs() {
        return corporateActionBS_CorporateActionProcessingServiceInputsandOuputs;
    }

    public void setCorporateActionBS_CorporateActionProcessingServiceWorkProduct(String corporateActionBS_CorporateActionProcessingServiceWorkProduct) {
        this.corporateActionBS_CorporateActionProcessingServiceWorkProduct = corporateActionBS_CorporateActionProcessingServiceWorkProduct;
    }

    public String getCorporateActionBS_CorporateActionProcessingServiceWorkProduct() {
        return corporateActionBS_CorporateActionProcessingServiceWorkProduct;
    }

    public void setCorporateActionBS_CorporateActionProcessingServiceName(String corporateActionBS_CorporateActionProcessingServiceName) {
        this.corporateActionBS_CorporateActionProcessingServiceName = corporateActionBS_CorporateActionProcessingServiceName;
    }

    public String getCorporateActionBS_CorporateActionProcessingServiceName() {
        return corporateActionBS_CorporateActionProcessingServiceName;
    }
}