/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.bralocman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Troubleshooting extends org.museframework.bian.classes.Troubleshooting {
    /*The required status/situation before the duty/obligation can be met*/
    @MetaField
    private String troubleshootingPreconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object troubleshootingBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    @MetaField
    private String troubleshootingWorkSchedule;

    /*The Branch Location Management Plan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    @MetaField
    private String troubleshootingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String troubleshootingServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String troubleshootingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String troubleshootingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String troubleshootingServiceWorkProduct;

    /**/
    @MetaField
    private String troubleshootingServiceName;

    public void setTroubleshootingPreconditions(String troubleshootingPreconditions) {
        this.troubleshootingPreconditions = troubleshootingPreconditions;
    }

    public String getTroubleshootingPreconditions() {
        return troubleshootingPreconditions;
    }

    public void setTroubleshootingBusinessUnitEmployeeReference(org.museframework.bian.classes.Object troubleshootingBusinessUnitEmployeeReference) {
        this.troubleshootingBusinessUnitEmployeeReference = troubleshootingBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getTroubleshootingBusinessUnitEmployeeReference() {
        return troubleshootingBusinessUnitEmployeeReference;
    }

    public void setTroubleshootingWorkSchedule(String troubleshootingWorkSchedule) {
        this.troubleshootingWorkSchedule = troubleshootingWorkSchedule;
    }

    public String getTroubleshootingWorkSchedule() {
        return troubleshootingWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setTroubleshootingPostconditions(String troubleshootingPostconditions) {
        this.troubleshootingPostconditions = troubleshootingPostconditions;
    }

    public String getTroubleshootingPostconditions() {
        return troubleshootingPostconditions;
    }

    public void setTroubleshootingServiceType(String troubleshootingServiceType) {
        this.troubleshootingServiceType = troubleshootingServiceType;
    }

    public String getTroubleshootingServiceType() {
        return troubleshootingServiceType;
    }

    public void setTroubleshootingServiceDescription(String troubleshootingServiceDescription) {
        this.troubleshootingServiceDescription = troubleshootingServiceDescription;
    }

    public String getTroubleshootingServiceDescription() {
        return troubleshootingServiceDescription;
    }

    public void setTroubleshootingServiceInputsandOuputs(String troubleshootingServiceInputsandOuputs) {
        this.troubleshootingServiceInputsandOuputs = troubleshootingServiceInputsandOuputs;
    }

    public String getTroubleshootingServiceInputsandOuputs() {
        return troubleshootingServiceInputsandOuputs;
    }

    public void setTroubleshootingServiceWorkProduct(String troubleshootingServiceWorkProduct) {
        this.troubleshootingServiceWorkProduct = troubleshootingServiceWorkProduct;
    }

    public String getTroubleshootingServiceWorkProduct() {
        return troubleshootingServiceWorkProduct;
    }

    public void setTroubleshootingServiceName(String troubleshootingServiceName) {
        this.troubleshootingServiceName = troubleshootingServiceName;
    }

    public String getTroubleshootingServiceName() {
        return troubleshootingServiceName;
    }
}