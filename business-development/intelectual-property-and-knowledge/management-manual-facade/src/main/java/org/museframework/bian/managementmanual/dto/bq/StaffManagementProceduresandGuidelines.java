/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StaffManagementProceduresandGuidelines {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField
    private String staffManagementProceduresandGuidelinesPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField
    private String staffManagementProceduresandGuidelinesSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField
    private String staffManagementProceduresandGuidelinesVersionNumber;

    /*The Management Manual Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService staffManagementProceduresandGuidelines;

    /*Reference to the specific business service type*/
    @MetaField
    private String staffManagementProceduresandGuidelinesServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String staffManagementProceduresandGuidelinesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String staffManagementProceduresandGuidelinesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String staffManagementProceduresandGuidelinesServiceWorkProduct;

    /**/
    @MetaField
    private String staffManagementProceduresandGuidelinesServiceName;

    public void setStaffManagementProceduresandGuidelinesPreconditions(String staffManagementProceduresandGuidelinesPreconditions) {
        this.staffManagementProceduresandGuidelinesPreconditions = staffManagementProceduresandGuidelinesPreconditions;
    }

    public String getStaffManagementProceduresandGuidelinesPreconditions() {
        return staffManagementProceduresandGuidelinesPreconditions;
    }

    public void setStaffManagementProceduresandGuidelinesSpecificationSchedule(String staffManagementProceduresandGuidelinesSpecificationSchedule) {
        this.staffManagementProceduresandGuidelinesSpecificationSchedule = staffManagementProceduresandGuidelinesSpecificationSchedule;
    }

    public String getStaffManagementProceduresandGuidelinesSpecificationSchedule() {
        return staffManagementProceduresandGuidelinesSpecificationSchedule;
    }

    public void setStaffManagementProceduresandGuidelinesVersionNumber(String staffManagementProceduresandGuidelinesVersionNumber) {
        this.staffManagementProceduresandGuidelinesVersionNumber = staffManagementProceduresandGuidelinesVersionNumber;
    }

    public String getStaffManagementProceduresandGuidelinesVersionNumber() {
        return staffManagementProceduresandGuidelinesVersionNumber;
    }

    public void setStaffManagementProceduresandGuidelines(org.museframework.bian.classes.BusinessService staffManagementProceduresandGuidelines) {
        this.staffManagementProceduresandGuidelines = staffManagementProceduresandGuidelines;
    }

    public org.museframework.bian.classes.BusinessService getStaffManagementProceduresandGuidelines() {
        return staffManagementProceduresandGuidelines;
    }

    public void setStaffManagementProceduresandGuidelinesServiceType(String staffManagementProceduresandGuidelinesServiceType) {
        this.staffManagementProceduresandGuidelinesServiceType = staffManagementProceduresandGuidelinesServiceType;
    }

    public String getStaffManagementProceduresandGuidelinesServiceType() {
        return staffManagementProceduresandGuidelinesServiceType;
    }

    public void setStaffManagementProceduresandGuidelinesServiceDescription(String staffManagementProceduresandGuidelinesServiceDescription) {
        this.staffManagementProceduresandGuidelinesServiceDescription = staffManagementProceduresandGuidelinesServiceDescription;
    }

    public String getStaffManagementProceduresandGuidelinesServiceDescription() {
        return staffManagementProceduresandGuidelinesServiceDescription;
    }

    public void setStaffManagementProceduresandGuidelinesServiceInputsandOuputs(String staffManagementProceduresandGuidelinesServiceInputsandOuputs) {
        this.staffManagementProceduresandGuidelinesServiceInputsandOuputs = staffManagementProceduresandGuidelinesServiceInputsandOuputs;
    }

    public String getStaffManagementProceduresandGuidelinesServiceInputsandOuputs() {
        return staffManagementProceduresandGuidelinesServiceInputsandOuputs;
    }

    public void setStaffManagementProceduresandGuidelinesServiceWorkProduct(String staffManagementProceduresandGuidelinesServiceWorkProduct) {
        this.staffManagementProceduresandGuidelinesServiceWorkProduct = staffManagementProceduresandGuidelinesServiceWorkProduct;
    }

    public String getStaffManagementProceduresandGuidelinesServiceWorkProduct() {
        return staffManagementProceduresandGuidelinesServiceWorkProduct;
    }

    public void setStaffManagementProceduresandGuidelinesServiceName(String staffManagementProceduresandGuidelinesServiceName) {
        this.staffManagementProceduresandGuidelinesServiceName = staffManagementProceduresandGuidelinesServiceName;
    }

    public String getStaffManagementProceduresandGuidelinesServiceName() {
        return staffManagementProceduresandGuidelinesServiceName;
    }
}