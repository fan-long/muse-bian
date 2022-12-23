/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.compliancereporting.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ComplianceAssessment {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField
    private String complianceAssessmentPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object complianceAssessmentBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField
    private String complianceAssessmentWorkSchedule;

    /*The Compliance Reporting Administrative Plan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService auditandReporting;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField
    private String complianceAssessmentPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String complianceAssessmentAuditandReportingServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String complianceAssessmentAuditandReportingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String complianceAssessmentAuditandReportingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String complianceAssessmentAuditandReportingServiceWorkProduct;

    /**/
    @MetaField
    private String complianceAssessmentAuditandReportingServiceName;

    public void setComplianceAssessmentPreconditions(String complianceAssessmentPreconditions) {
        this.complianceAssessmentPreconditions = complianceAssessmentPreconditions;
    }

    public String getComplianceAssessmentPreconditions() {
        return complianceAssessmentPreconditions;
    }

    public void setComplianceAssessmentBusinessUnitEmployeeReference(org.museframework.bian.classes.Object complianceAssessmentBusinessUnitEmployeeReference) {
        this.complianceAssessmentBusinessUnitEmployeeReference = complianceAssessmentBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getComplianceAssessmentBusinessUnitEmployeeReference() {
        return complianceAssessmentBusinessUnitEmployeeReference;
    }

    public void setComplianceAssessmentWorkSchedule(String complianceAssessmentWorkSchedule) {
        this.complianceAssessmentWorkSchedule = complianceAssessmentWorkSchedule;
    }

    public String getComplianceAssessmentWorkSchedule() {
        return complianceAssessmentWorkSchedule;
    }

    public void setAuditandReporting(org.museframework.bian.classes.BusinessService auditandReporting) {
        this.auditandReporting = auditandReporting;
    }

    public org.museframework.bian.classes.BusinessService getAuditandReporting() {
        return auditandReporting;
    }

    public void setComplianceAssessmentPostconditions(String complianceAssessmentPostconditions) {
        this.complianceAssessmentPostconditions = complianceAssessmentPostconditions;
    }

    public String getComplianceAssessmentPostconditions() {
        return complianceAssessmentPostconditions;
    }

    public void setComplianceAssessmentAuditandReportingServiceType(String complianceAssessmentAuditandReportingServiceType) {
        this.complianceAssessmentAuditandReportingServiceType = complianceAssessmentAuditandReportingServiceType;
    }

    public String getComplianceAssessmentAuditandReportingServiceType() {
        return complianceAssessmentAuditandReportingServiceType;
    }

    public void setComplianceAssessmentAuditandReportingServiceDescription(String complianceAssessmentAuditandReportingServiceDescription) {
        this.complianceAssessmentAuditandReportingServiceDescription = complianceAssessmentAuditandReportingServiceDescription;
    }

    public String getComplianceAssessmentAuditandReportingServiceDescription() {
        return complianceAssessmentAuditandReportingServiceDescription;
    }

    public void setComplianceAssessmentAuditandReportingServiceInputsandOuputs(String complianceAssessmentAuditandReportingServiceInputsandOuputs) {
        this.complianceAssessmentAuditandReportingServiceInputsandOuputs = complianceAssessmentAuditandReportingServiceInputsandOuputs;
    }

    public String getComplianceAssessmentAuditandReportingServiceInputsandOuputs() {
        return complianceAssessmentAuditandReportingServiceInputsandOuputs;
    }

    public void setComplianceAssessmentAuditandReportingServiceWorkProduct(String complianceAssessmentAuditandReportingServiceWorkProduct) {
        this.complianceAssessmentAuditandReportingServiceWorkProduct = complianceAssessmentAuditandReportingServiceWorkProduct;
    }

    public String getComplianceAssessmentAuditandReportingServiceWorkProduct() {
        return complianceAssessmentAuditandReportingServiceWorkProduct;
    }

    public void setComplianceAssessmentAuditandReportingServiceName(String complianceAssessmentAuditandReportingServiceName) {
        this.complianceAssessmentAuditandReportingServiceName = complianceAssessmentAuditandReportingServiceName;
    }

    public String getComplianceAssessmentAuditandReportingServiceName() {
        return complianceAssessmentAuditandReportingServiceName;
    }
}