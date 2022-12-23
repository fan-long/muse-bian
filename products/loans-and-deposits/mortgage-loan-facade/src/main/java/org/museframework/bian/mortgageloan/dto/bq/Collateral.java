/**/
package org.museframework.bian.mortgageloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Collateral {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String collateralPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String collateralFeatureSchedule;

    /*The Mortgage Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String collateralPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String collateralServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String collateralServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String collateralServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String collateralServiceWorkProduct;

    /**/
    @MetaField
    private String collateralServiceName;

    public void setCollateralPreconditions(String collateralPreconditions) {
        this.collateralPreconditions = collateralPreconditions;
    }

    public String getCollateralPreconditions() {
        return collateralPreconditions;
    }

    public void setCollateralFeatureSchedule(String collateralFeatureSchedule) {
        this.collateralFeatureSchedule = collateralFeatureSchedule;
    }

    public String getCollateralFeatureSchedule() {
        return collateralFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setCollateralPostconditions(String collateralPostconditions) {
        this.collateralPostconditions = collateralPostconditions;
    }

    public String getCollateralPostconditions() {
        return collateralPostconditions;
    }

    public void setCollateralServiceType(String collateralServiceType) {
        this.collateralServiceType = collateralServiceType;
    }

    public String getCollateralServiceType() {
        return collateralServiceType;
    }

    public void setCollateralServiceDescription(String collateralServiceDescription) {
        this.collateralServiceDescription = collateralServiceDescription;
    }

    public String getCollateralServiceDescription() {
        return collateralServiceDescription;
    }

    public void setCollateralServiceInputsandOuputs(String collateralServiceInputsandOuputs) {
        this.collateralServiceInputsandOuputs = collateralServiceInputsandOuputs;
    }

    public String getCollateralServiceInputsandOuputs() {
        return collateralServiceInputsandOuputs;
    }

    public void setCollateralServiceWorkProduct(String collateralServiceWorkProduct) {
        this.collateralServiceWorkProduct = collateralServiceWorkProduct;
    }

    public String getCollateralServiceWorkProduct() {
        return collateralServiceWorkProduct;
    }

    public void setCollateralServiceName(String collateralServiceName) {
        this.collateralServiceName = collateralServiceName;
    }

    public String getCollateralServiceName() {
        return collateralServiceName;
    }
}