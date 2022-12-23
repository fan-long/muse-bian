/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.systemsadministration.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CapacityPlanningandResilience {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField
    private String capacityPlanningandResiliencePreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object capacityPlanningandResilienceBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField
    private String capacityPlanningandResilienceWorkSchedule;

    /*The ITSystem Administrative Plan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService capacityPlanningandResilience;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField
    private String capacityPlanningandResiliencePostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct;

    /**/
    @MetaField
    private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceName;

    public void setCapacityPlanningandResiliencePreconditions(String capacityPlanningandResiliencePreconditions) {
        this.capacityPlanningandResiliencePreconditions = capacityPlanningandResiliencePreconditions;
    }

    public String getCapacityPlanningandResiliencePreconditions() {
        return capacityPlanningandResiliencePreconditions;
    }

    public void setCapacityPlanningandResilienceBusinessUnitEmployeeReference(org.museframework.bian.classes.Object capacityPlanningandResilienceBusinessUnitEmployeeReference) {
        this.capacityPlanningandResilienceBusinessUnitEmployeeReference = capacityPlanningandResilienceBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCapacityPlanningandResilienceBusinessUnitEmployeeReference() {
        return capacityPlanningandResilienceBusinessUnitEmployeeReference;
    }

    public void setCapacityPlanningandResilienceWorkSchedule(String capacityPlanningandResilienceWorkSchedule) {
        this.capacityPlanningandResilienceWorkSchedule = capacityPlanningandResilienceWorkSchedule;
    }

    public String getCapacityPlanningandResilienceWorkSchedule() {
        return capacityPlanningandResilienceWorkSchedule;
    }

    public void setCapacityPlanningandResilience(org.museframework.bian.classes.BusinessService capacityPlanningandResilience) {
        this.capacityPlanningandResilience = capacityPlanningandResilience;
    }

    public org.museframework.bian.classes.BusinessService getCapacityPlanningandResilience() {
        return capacityPlanningandResilience;
    }

    public void setCapacityPlanningandResiliencePostconditions(String capacityPlanningandResiliencePostconditions) {
        this.capacityPlanningandResiliencePostconditions = capacityPlanningandResiliencePostconditions;
    }

    public String getCapacityPlanningandResiliencePostconditions() {
        return capacityPlanningandResiliencePostconditions;
    }

    public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceType(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceType) {
        this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceType = capacityPlanningandResilienceCapacityPlanningandResilienceServiceType;
    }

    public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceType() {
        return capacityPlanningandResilienceCapacityPlanningandResilienceServiceType;
    }

    public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription) {
        this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription = capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription;
    }

    public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription() {
        return capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription;
    }

    public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs) {
        this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs = capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs;
    }

    public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs() {
        return capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs;
    }

    public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct) {
        this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct = capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct;
    }

    public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct() {
        return capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct;
    }

    public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceName(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceName) {
        this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceName = capacityPlanningandResilienceCapacityPlanningandResilienceServiceName;
    }

    public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceName() {
        return capacityPlanningandResilienceCapacityPlanningandResilienceServiceName;
    }
}