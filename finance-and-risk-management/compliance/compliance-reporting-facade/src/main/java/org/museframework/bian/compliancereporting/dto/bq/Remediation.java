/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.compliancereporting.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Remediation {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField(0)
    private String remediationPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object remediationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField(0)
    private String remediationWorkSchedule;

    /*The Compliance Reporting Administrative Plan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService remediationAssurance;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField(0)
    private String remediationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String remediationRemediationAssuranceServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String remediationRemediationAssuranceServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String remediationRemediationAssuranceServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String remediationRemediationAssuranceServiceWorkProduct;

    /**/
    @MetaField(0)
    private String remediationRemediationAssuranceServiceName;

    public void setRemediationPreconditions(String remediationPreconditions) {
        this.remediationPreconditions = remediationPreconditions;
    }

    public String getRemediationPreconditions() {
        return remediationPreconditions;
    }

    public void setRemediationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object remediationBusinessUnitEmployeeReference) {
        this.remediationBusinessUnitEmployeeReference = remediationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getRemediationBusinessUnitEmployeeReference() {
        return remediationBusinessUnitEmployeeReference;
    }

    public void setRemediationWorkSchedule(String remediationWorkSchedule) {
        this.remediationWorkSchedule = remediationWorkSchedule;
    }

    public String getRemediationWorkSchedule() {
        return remediationWorkSchedule;
    }

    public void setRemediationAssurance(org.museframework.bian.classes.BusinessService remediationAssurance) {
        this.remediationAssurance = remediationAssurance;
    }

    public org.museframework.bian.classes.BusinessService getRemediationAssurance() {
        return remediationAssurance;
    }

    public void setRemediationPostconditions(String remediationPostconditions) {
        this.remediationPostconditions = remediationPostconditions;
    }

    public String getRemediationPostconditions() {
        return remediationPostconditions;
    }

    public void setRemediationRemediationAssuranceServiceType(String remediationRemediationAssuranceServiceType) {
        this.remediationRemediationAssuranceServiceType = remediationRemediationAssuranceServiceType;
    }

    public String getRemediationRemediationAssuranceServiceType() {
        return remediationRemediationAssuranceServiceType;
    }

    public void setRemediationRemediationAssuranceServiceDescription(String remediationRemediationAssuranceServiceDescription) {
        this.remediationRemediationAssuranceServiceDescription = remediationRemediationAssuranceServiceDescription;
    }

    public String getRemediationRemediationAssuranceServiceDescription() {
        return remediationRemediationAssuranceServiceDescription;
    }

    public void setRemediationRemediationAssuranceServiceInputsandOuputs(String remediationRemediationAssuranceServiceInputsandOuputs) {
        this.remediationRemediationAssuranceServiceInputsandOuputs = remediationRemediationAssuranceServiceInputsandOuputs;
    }

    public String getRemediationRemediationAssuranceServiceInputsandOuputs() {
        return remediationRemediationAssuranceServiceInputsandOuputs;
    }

    public void setRemediationRemediationAssuranceServiceWorkProduct(String remediationRemediationAssuranceServiceWorkProduct) {
        this.remediationRemediationAssuranceServiceWorkProduct = remediationRemediationAssuranceServiceWorkProduct;
    }

    public String getRemediationRemediationAssuranceServiceWorkProduct() {
        return remediationRemediationAssuranceServiceWorkProduct;
    }

    public void setRemediationRemediationAssuranceServiceName(String remediationRemediationAssuranceServiceName) {
        this.remediationRemediationAssuranceServiceName = remediationRemediationAssuranceServiceName;
    }

    public String getRemediationRemediationAssuranceServiceName() {
        return remediationRemediationAssuranceServiceName;
    }
}