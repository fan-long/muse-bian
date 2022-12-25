/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.proinvdis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Oversight {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField(0)
    private String oversightPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object oversightBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField(0)
    private String oversightWorkSchedule;

    /*The Product Inventory Distribution AdministrativePlan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService administrativeOversight;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField(0)
    private String oversightPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String oversightAdministrativeOversightServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String oversightAdministrativeOversightServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String oversightAdministrativeOversightServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String oversightAdministrativeOversightServiceWorkProduct;

    /**/
    @MetaField(0)
    private String oversightAdministrativeOversightServiceName;

    public void setOversightPreconditions(String oversightPreconditions) {
        this.oversightPreconditions = oversightPreconditions;
    }

    public String getOversightPreconditions() {
        return oversightPreconditions;
    }

    public void setOversightBusinessUnitEmployeeReference(org.museframework.bian.classes.Object oversightBusinessUnitEmployeeReference) {
        this.oversightBusinessUnitEmployeeReference = oversightBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getOversightBusinessUnitEmployeeReference() {
        return oversightBusinessUnitEmployeeReference;
    }

    public void setOversightWorkSchedule(String oversightWorkSchedule) {
        this.oversightWorkSchedule = oversightWorkSchedule;
    }

    public String getOversightWorkSchedule() {
        return oversightWorkSchedule;
    }

    public void setAdministrativeOversight(org.museframework.bian.classes.BusinessService administrativeOversight) {
        this.administrativeOversight = administrativeOversight;
    }

    public org.museframework.bian.classes.BusinessService getAdministrativeOversight() {
        return administrativeOversight;
    }

    public void setOversightPostconditions(String oversightPostconditions) {
        this.oversightPostconditions = oversightPostconditions;
    }

    public String getOversightPostconditions() {
        return oversightPostconditions;
    }

    public void setOversightAdministrativeOversightServiceType(String oversightAdministrativeOversightServiceType) {
        this.oversightAdministrativeOversightServiceType = oversightAdministrativeOversightServiceType;
    }

    public String getOversightAdministrativeOversightServiceType() {
        return oversightAdministrativeOversightServiceType;
    }

    public void setOversightAdministrativeOversightServiceDescription(String oversightAdministrativeOversightServiceDescription) {
        this.oversightAdministrativeOversightServiceDescription = oversightAdministrativeOversightServiceDescription;
    }

    public String getOversightAdministrativeOversightServiceDescription() {
        return oversightAdministrativeOversightServiceDescription;
    }

    public void setOversightAdministrativeOversightServiceInputsandOuputs(String oversightAdministrativeOversightServiceInputsandOuputs) {
        this.oversightAdministrativeOversightServiceInputsandOuputs = oversightAdministrativeOversightServiceInputsandOuputs;
    }

    public String getOversightAdministrativeOversightServiceInputsandOuputs() {
        return oversightAdministrativeOversightServiceInputsandOuputs;
    }

    public void setOversightAdministrativeOversightServiceWorkProduct(String oversightAdministrativeOversightServiceWorkProduct) {
        this.oversightAdministrativeOversightServiceWorkProduct = oversightAdministrativeOversightServiceWorkProduct;
    }

    public String getOversightAdministrativeOversightServiceWorkProduct() {
        return oversightAdministrativeOversightServiceWorkProduct;
    }

    public void setOversightAdministrativeOversightServiceName(String oversightAdministrativeOversightServiceName) {
        this.oversightAdministrativeOversightServiceName = oversightAdministrativeOversightServiceName;
    }

    public String getOversightAdministrativeOversightServiceName() {
        return oversightAdministrativeOversightServiceName;
    }
}