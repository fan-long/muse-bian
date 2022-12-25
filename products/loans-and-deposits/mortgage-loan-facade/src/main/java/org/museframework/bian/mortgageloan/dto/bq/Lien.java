/**/
package org.museframework.bian.mortgageloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Lien {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String lienPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String lienFeatureSchedule;

    /*The Mortgage Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String lienPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String lienServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String lienServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String lienServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String lienServiceWorkProduct;

    /**/
    @MetaField(0)
    private String lienServiceName;

    public void setLienPreconditions(String lienPreconditions) {
        this.lienPreconditions = lienPreconditions;
    }

    public String getLienPreconditions() {
        return lienPreconditions;
    }

    public void setLienFeatureSchedule(String lienFeatureSchedule) {
        this.lienFeatureSchedule = lienFeatureSchedule;
    }

    public String getLienFeatureSchedule() {
        return lienFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setLienPostconditions(String lienPostconditions) {
        this.lienPostconditions = lienPostconditions;
    }

    public String getLienPostconditions() {
        return lienPostconditions;
    }

    public void setLienServiceType(String lienServiceType) {
        this.lienServiceType = lienServiceType;
    }

    public String getLienServiceType() {
        return lienServiceType;
    }

    public void setLienServiceDescription(String lienServiceDescription) {
        this.lienServiceDescription = lienServiceDescription;
    }

    public String getLienServiceDescription() {
        return lienServiceDescription;
    }

    public void setLienServiceInputsandOuputs(String lienServiceInputsandOuputs) {
        this.lienServiceInputsandOuputs = lienServiceInputsandOuputs;
    }

    public String getLienServiceInputsandOuputs() {
        return lienServiceInputsandOuputs;
    }

    public void setLienServiceWorkProduct(String lienServiceWorkProduct) {
        this.lienServiceWorkProduct = lienServiceWorkProduct;
    }

    public String getLienServiceWorkProduct() {
        return lienServiceWorkProduct;
    }

    public void setLienServiceName(String lienServiceName) {
        this.lienServiceName = lienServiceName;
    }

    public String getLienServiceName() {
        return lienServiceName;
    }
}