/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.bracurdis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DistributionVehicleAdministration {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField
    private String distributionVehicleAdministrationPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object distributionVehicleAdministrationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField
    private String distributionVehicleAdministrationWorkSchedule;

    /*The Cash Distribution Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService vehicleAdministration;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField
    private String distributionVehicleAdministrationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String distributionVehicleAdministrationVehicleAdministrationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String distributionVehicleAdministrationVehicleAdministrationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct;

    /**/
    @MetaField
    private String distributionVehicleAdministrationVehicleAdministrationServiceName;

    public void setDistributionVehicleAdministrationPreconditions(String distributionVehicleAdministrationPreconditions) {
        this.distributionVehicleAdministrationPreconditions = distributionVehicleAdministrationPreconditions;
    }

    public String getDistributionVehicleAdministrationPreconditions() {
        return distributionVehicleAdministrationPreconditions;
    }

    public void setDistributionVehicleAdministrationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object distributionVehicleAdministrationBusinessUnitEmployeeReference) {
        this.distributionVehicleAdministrationBusinessUnitEmployeeReference = distributionVehicleAdministrationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getDistributionVehicleAdministrationBusinessUnitEmployeeReference() {
        return distributionVehicleAdministrationBusinessUnitEmployeeReference;
    }

    public void setDistributionVehicleAdministrationWorkSchedule(String distributionVehicleAdministrationWorkSchedule) {
        this.distributionVehicleAdministrationWorkSchedule = distributionVehicleAdministrationWorkSchedule;
    }

    public String getDistributionVehicleAdministrationWorkSchedule() {
        return distributionVehicleAdministrationWorkSchedule;
    }

    public void setVehicleAdministration(org.museframework.bian.classes.BusinessService vehicleAdministration) {
        this.vehicleAdministration = vehicleAdministration;
    }

    public org.museframework.bian.classes.BusinessService getVehicleAdministration() {
        return vehicleAdministration;
    }

    public void setDistributionVehicleAdministrationPostconditions(String distributionVehicleAdministrationPostconditions) {
        this.distributionVehicleAdministrationPostconditions = distributionVehicleAdministrationPostconditions;
    }

    public String getDistributionVehicleAdministrationPostconditions() {
        return distributionVehicleAdministrationPostconditions;
    }

    public void setDistributionVehicleAdministrationVehicleAdministrationServiceType(String distributionVehicleAdministrationVehicleAdministrationServiceType) {
        this.distributionVehicleAdministrationVehicleAdministrationServiceType = distributionVehicleAdministrationVehicleAdministrationServiceType;
    }

    public String getDistributionVehicleAdministrationVehicleAdministrationServiceType() {
        return distributionVehicleAdministrationVehicleAdministrationServiceType;
    }

    public void setDistributionVehicleAdministrationVehicleAdministrationServiceDescription(String distributionVehicleAdministrationVehicleAdministrationServiceDescription) {
        this.distributionVehicleAdministrationVehicleAdministrationServiceDescription = distributionVehicleAdministrationVehicleAdministrationServiceDescription;
    }

    public String getDistributionVehicleAdministrationVehicleAdministrationServiceDescription() {
        return distributionVehicleAdministrationVehicleAdministrationServiceDescription;
    }

    public void setDistributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs(String distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs) {
        this.distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs = distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs;
    }

    public String getDistributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs() {
        return distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs;
    }

    public void setDistributionVehicleAdministrationVehicleAdministrationServiceWorkProduct(String distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct) {
        this.distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct = distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct;
    }

    public String getDistributionVehicleAdministrationVehicleAdministrationServiceWorkProduct() {
        return distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct;
    }

    public void setDistributionVehicleAdministrationVehicleAdministrationServiceName(String distributionVehicleAdministrationVehicleAdministrationServiceName) {
        this.distributionVehicleAdministrationVehicleAdministrationServiceName = distributionVehicleAdministrationVehicleAdministrationServiceName;
    }

    public String getDistributionVehicleAdministrationVehicleAdministrationServiceName() {
        return distributionVehicleAdministrationVehicleAdministrationServiceName;
    }
}