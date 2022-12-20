/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.bracurdis.dto.bq;

public class DistributionVehicleAdministration {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private String distributionVehicleAdministrationPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    private org.museframework.bian.classes.Object distributionVehicleAdministrationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String distributionVehicleAdministrationWorkSchedule;

    /*The Cash Distribution Procedure specific Business Service*/
    private org.museframework.bian.classes.BusinessService vehicleAdministration;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private String distributionVehicleAdministrationPostconditions;

    /*Reference to the specific business service type*/
    private String distributionVehicleAdministrationVehicleAdministrationServiceType;

    /*Description of the performed business service*/
    private String distributionVehicleAdministrationVehicleAdministrationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String distributionVehicleAdministrationVehicleAdministrationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String distributionVehicleAdministrationVehicleAdministrationServiceWorkProduct;

    /**/
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