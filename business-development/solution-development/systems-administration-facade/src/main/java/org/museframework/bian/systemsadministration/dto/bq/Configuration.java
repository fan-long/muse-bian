/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.systemsadministration.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Configuration {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField
    private String configurationPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object configurationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField
    private String configurationWorkSchedule;

    /*The ITSystem Administrative Plan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService systemsConfigurationAdministration;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField
    private String configurationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String configurationSystemsConfigurationAdministrationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String configurationSystemsConfigurationAdministrationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String configurationSystemsConfigurationAdministrationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String configurationSystemsConfigurationAdministrationServiceWorkProduct;

    /**/
    @MetaField
    private String configurationSystemsConfigurationAdministrationServiceName;

    public void setConfigurationPreconditions(String configurationPreconditions) {
        this.configurationPreconditions = configurationPreconditions;
    }

    public String getConfigurationPreconditions() {
        return configurationPreconditions;
    }

    public void setConfigurationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object configurationBusinessUnitEmployeeReference) {
        this.configurationBusinessUnitEmployeeReference = configurationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getConfigurationBusinessUnitEmployeeReference() {
        return configurationBusinessUnitEmployeeReference;
    }

    public void setConfigurationWorkSchedule(String configurationWorkSchedule) {
        this.configurationWorkSchedule = configurationWorkSchedule;
    }

    public String getConfigurationWorkSchedule() {
        return configurationWorkSchedule;
    }

    public void setSystemsConfigurationAdministration(org.museframework.bian.classes.BusinessService systemsConfigurationAdministration) {
        this.systemsConfigurationAdministration = systemsConfigurationAdministration;
    }

    public org.museframework.bian.classes.BusinessService getSystemsConfigurationAdministration() {
        return systemsConfigurationAdministration;
    }

    public void setConfigurationPostconditions(String configurationPostconditions) {
        this.configurationPostconditions = configurationPostconditions;
    }

    public String getConfigurationPostconditions() {
        return configurationPostconditions;
    }

    public void setConfigurationSystemsConfigurationAdministrationServiceType(String configurationSystemsConfigurationAdministrationServiceType) {
        this.configurationSystemsConfigurationAdministrationServiceType = configurationSystemsConfigurationAdministrationServiceType;
    }

    public String getConfigurationSystemsConfigurationAdministrationServiceType() {
        return configurationSystemsConfigurationAdministrationServiceType;
    }

    public void setConfigurationSystemsConfigurationAdministrationServiceDescription(String configurationSystemsConfigurationAdministrationServiceDescription) {
        this.configurationSystemsConfigurationAdministrationServiceDescription = configurationSystemsConfigurationAdministrationServiceDescription;
    }

    public String getConfigurationSystemsConfigurationAdministrationServiceDescription() {
        return configurationSystemsConfigurationAdministrationServiceDescription;
    }

    public void setConfigurationSystemsConfigurationAdministrationServiceInputsandOuputs(String configurationSystemsConfigurationAdministrationServiceInputsandOuputs) {
        this.configurationSystemsConfigurationAdministrationServiceInputsandOuputs = configurationSystemsConfigurationAdministrationServiceInputsandOuputs;
    }

    public String getConfigurationSystemsConfigurationAdministrationServiceInputsandOuputs() {
        return configurationSystemsConfigurationAdministrationServiceInputsandOuputs;
    }

    public void setConfigurationSystemsConfigurationAdministrationServiceWorkProduct(String configurationSystemsConfigurationAdministrationServiceWorkProduct) {
        this.configurationSystemsConfigurationAdministrationServiceWorkProduct = configurationSystemsConfigurationAdministrationServiceWorkProduct;
    }

    public String getConfigurationSystemsConfigurationAdministrationServiceWorkProduct() {
        return configurationSystemsConfigurationAdministrationServiceWorkProduct;
    }

    public void setConfigurationSystemsConfigurationAdministrationServiceName(String configurationSystemsConfigurationAdministrationServiceName) {
        this.configurationSystemsConfigurationAdministrationServiceName = configurationSystemsConfigurationAdministrationServiceName;
    }

    public String getConfigurationSystemsConfigurationAdministrationServiceName() {
        return configurationSystemsConfigurationAdministrationServiceName;
    }
}