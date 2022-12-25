/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.bralocman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductandServicePlanning {
    /*The required status/situation before the duty/obligation can be met*/
    @MetaField(0)
    private String productandServicePlanningPreconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServicePlanningBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    @MetaField(0)
    private String productandServicePlanningWorkSchedule;

    /*The Branch Location Management Plan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService productandServicePlanning;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    @MetaField(0)
    private String productandServicePlanningPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String productandServicePlanningProductandServicePlanningServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String productandServicePlanningProductandServicePlanningServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String productandServicePlanningProductandServicePlanningServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String productandServicePlanningProductandServicePlanningServiceWorkProduct;

    /**/
    @MetaField(0)
    private String productandServicePlanningProductandServicePlanningServiceName;

    public void setProductandServicePlanningPreconditions(String productandServicePlanningPreconditions) {
        this.productandServicePlanningPreconditions = productandServicePlanningPreconditions;
    }

    public String getProductandServicePlanningPreconditions() {
        return productandServicePlanningPreconditions;
    }

    public void setProductandServicePlanningBusinessUnitEmployeeReference(org.museframework.bian.classes.Object productandServicePlanningBusinessUnitEmployeeReference) {
        this.productandServicePlanningBusinessUnitEmployeeReference = productandServicePlanningBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getProductandServicePlanningBusinessUnitEmployeeReference() {
        return productandServicePlanningBusinessUnitEmployeeReference;
    }

    public void setProductandServicePlanningWorkSchedule(String productandServicePlanningWorkSchedule) {
        this.productandServicePlanningWorkSchedule = productandServicePlanningWorkSchedule;
    }

    public String getProductandServicePlanningWorkSchedule() {
        return productandServicePlanningWorkSchedule;
    }

    public void setProductandServicePlanning(org.museframework.bian.classes.BusinessService productandServicePlanning) {
        this.productandServicePlanning = productandServicePlanning;
    }

    public org.museframework.bian.classes.BusinessService getProductandServicePlanning() {
        return productandServicePlanning;
    }

    public void setProductandServicePlanningPostconditions(String productandServicePlanningPostconditions) {
        this.productandServicePlanningPostconditions = productandServicePlanningPostconditions;
    }

    public String getProductandServicePlanningPostconditions() {
        return productandServicePlanningPostconditions;
    }

    public void setProductandServicePlanningProductandServicePlanningServiceType(String productandServicePlanningProductandServicePlanningServiceType) {
        this.productandServicePlanningProductandServicePlanningServiceType = productandServicePlanningProductandServicePlanningServiceType;
    }

    public String getProductandServicePlanningProductandServicePlanningServiceType() {
        return productandServicePlanningProductandServicePlanningServiceType;
    }

    public void setProductandServicePlanningProductandServicePlanningServiceDescription(String productandServicePlanningProductandServicePlanningServiceDescription) {
        this.productandServicePlanningProductandServicePlanningServiceDescription = productandServicePlanningProductandServicePlanningServiceDescription;
    }

    public String getProductandServicePlanningProductandServicePlanningServiceDescription() {
        return productandServicePlanningProductandServicePlanningServiceDescription;
    }

    public void setProductandServicePlanningProductandServicePlanningServiceInputsandOuputs(String productandServicePlanningProductandServicePlanningServiceInputsandOuputs) {
        this.productandServicePlanningProductandServicePlanningServiceInputsandOuputs = productandServicePlanningProductandServicePlanningServiceInputsandOuputs;
    }

    public String getProductandServicePlanningProductandServicePlanningServiceInputsandOuputs() {
        return productandServicePlanningProductandServicePlanningServiceInputsandOuputs;
    }

    public void setProductandServicePlanningProductandServicePlanningServiceWorkProduct(String productandServicePlanningProductandServicePlanningServiceWorkProduct) {
        this.productandServicePlanningProductandServicePlanningServiceWorkProduct = productandServicePlanningProductandServicePlanningServiceWorkProduct;
    }

    public String getProductandServicePlanningProductandServicePlanningServiceWorkProduct() {
        return productandServicePlanningProductandServicePlanningServiceWorkProduct;
    }

    public void setProductandServicePlanningProductandServicePlanningServiceName(String productandServicePlanningProductandServicePlanningServiceName) {
        this.productandServicePlanningProductandServicePlanningServiceName = productandServicePlanningProductandServicePlanningServiceName;
    }

    public String getProductandServicePlanningProductandServicePlanningServiceName() {
        return productandServicePlanningProductandServicePlanningServiceName;
    }
}