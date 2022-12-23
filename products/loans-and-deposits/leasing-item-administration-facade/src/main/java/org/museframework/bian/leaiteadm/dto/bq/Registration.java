/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.leaiteadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Registration {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField
    private String registrationPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object registrationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField
    private String registrationWorkSchedule;

    /*The Leasing Item Administrative Plan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService collateralRegistration;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField
    private String registrationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String registrationCollateralRegistrationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String registrationCollateralRegistrationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String registrationCollateralRegistrationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String registrationCollateralRegistrationServiceWorkProduct;

    /**/
    @MetaField
    private String registrationCollateralRegistrationServiceName;

    public void setRegistrationPreconditions(String registrationPreconditions) {
        this.registrationPreconditions = registrationPreconditions;
    }

    public String getRegistrationPreconditions() {
        return registrationPreconditions;
    }

    public void setRegistrationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object registrationBusinessUnitEmployeeReference) {
        this.registrationBusinessUnitEmployeeReference = registrationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getRegistrationBusinessUnitEmployeeReference() {
        return registrationBusinessUnitEmployeeReference;
    }

    public void setRegistrationWorkSchedule(String registrationWorkSchedule) {
        this.registrationWorkSchedule = registrationWorkSchedule;
    }

    public String getRegistrationWorkSchedule() {
        return registrationWorkSchedule;
    }

    public void setCollateralRegistration(org.museframework.bian.classes.BusinessService collateralRegistration) {
        this.collateralRegistration = collateralRegistration;
    }

    public org.museframework.bian.classes.BusinessService getCollateralRegistration() {
        return collateralRegistration;
    }

    public void setRegistrationPostconditions(String registrationPostconditions) {
        this.registrationPostconditions = registrationPostconditions;
    }

    public String getRegistrationPostconditions() {
        return registrationPostconditions;
    }

    public void setRegistrationCollateralRegistrationServiceType(String registrationCollateralRegistrationServiceType) {
        this.registrationCollateralRegistrationServiceType = registrationCollateralRegistrationServiceType;
    }

    public String getRegistrationCollateralRegistrationServiceType() {
        return registrationCollateralRegistrationServiceType;
    }

    public void setRegistrationCollateralRegistrationServiceDescription(String registrationCollateralRegistrationServiceDescription) {
        this.registrationCollateralRegistrationServiceDescription = registrationCollateralRegistrationServiceDescription;
    }

    public String getRegistrationCollateralRegistrationServiceDescription() {
        return registrationCollateralRegistrationServiceDescription;
    }

    public void setRegistrationCollateralRegistrationServiceInputsandOuputs(String registrationCollateralRegistrationServiceInputsandOuputs) {
        this.registrationCollateralRegistrationServiceInputsandOuputs = registrationCollateralRegistrationServiceInputsandOuputs;
    }

    public String getRegistrationCollateralRegistrationServiceInputsandOuputs() {
        return registrationCollateralRegistrationServiceInputsandOuputs;
    }

    public void setRegistrationCollateralRegistrationServiceWorkProduct(String registrationCollateralRegistrationServiceWorkProduct) {
        this.registrationCollateralRegistrationServiceWorkProduct = registrationCollateralRegistrationServiceWorkProduct;
    }

    public String getRegistrationCollateralRegistrationServiceWorkProduct() {
        return registrationCollateralRegistrationServiceWorkProduct;
    }

    public void setRegistrationCollateralRegistrationServiceName(String registrationCollateralRegistrationServiceName) {
        this.registrationCollateralRegistrationServiceName = registrationCollateralRegistrationServiceName;
    }

    public String getRegistrationCollateralRegistrationServiceName() {
        return registrationCollateralRegistrationServiceName;
    }
}