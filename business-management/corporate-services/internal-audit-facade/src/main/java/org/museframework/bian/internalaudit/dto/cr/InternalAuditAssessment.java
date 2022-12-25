/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Internal Audit. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.internalaudit.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InternalAuditAssessment {
    /*A Classification value that distinguishes between Assessments according to type of concern defined within Internal Audit Assessment . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc.*/
    @MetaField(0)
    private String internalAuditAssessmentParameterType;

    /*A selected optional business service as subject matter of assessment*/
    @MetaField(0)
    private String internalAuditAssessmentSelectedOption;

    /*The type of Internal Audit Assessment*/
    @MetaField(0)
    private String internalAuditAssessmentType;

    /*Reference to Internal Audit Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object internalAuditAssessmentReference;

    /*Request to assess InternalAudit*/
    @MetaField(0)
    private String internalAuditAssessmentRequest;

    /*Timetable to assess InternalAudit*/
    @MetaField(0)
    private String internalAuditAssessmentSchedule;

    /*The status of Internal Audit Assessment*/
    @MetaField(0)
    private String internalAuditAssessmentStatus;

    /*Reference to the log of (usage) ativities/events of Internal Audit Assessment*/
    @MetaField(0)
    private String internalAuditAssessmentUsageLog;

    /*Reference to the party who has provided Internal Audit Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object internalAuditAssessmentServiceProviderReference;

    /*Reference to the party who has requested Internal Audit Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object internalAuditAssessmentRequesterReference;

    public void setInternalAuditAssessmentParameterType(String internalAuditAssessmentParameterType) {
        this.internalAuditAssessmentParameterType = internalAuditAssessmentParameterType;
    }

    public String getInternalAuditAssessmentParameterType() {
        return internalAuditAssessmentParameterType;
    }

    public void setInternalAuditAssessmentSelectedOption(String internalAuditAssessmentSelectedOption) {
        this.internalAuditAssessmentSelectedOption = internalAuditAssessmentSelectedOption;
    }

    public String getInternalAuditAssessmentSelectedOption() {
        return internalAuditAssessmentSelectedOption;
    }

    public void setInternalAuditAssessmentType(String internalAuditAssessmentType) {
        this.internalAuditAssessmentType = internalAuditAssessmentType;
    }

    public String getInternalAuditAssessmentType() {
        return internalAuditAssessmentType;
    }

    public void setInternalAuditAssessmentReference(org.museframework.bian.classes.Object internalAuditAssessmentReference) {
        this.internalAuditAssessmentReference = internalAuditAssessmentReference;
    }

    public org.museframework.bian.classes.Object getInternalAuditAssessmentReference() {
        return internalAuditAssessmentReference;
    }

    public void setInternalAuditAssessmentRequest(String internalAuditAssessmentRequest) {
        this.internalAuditAssessmentRequest = internalAuditAssessmentRequest;
    }

    public String getInternalAuditAssessmentRequest() {
        return internalAuditAssessmentRequest;
    }

    public void setInternalAuditAssessmentSchedule(String internalAuditAssessmentSchedule) {
        this.internalAuditAssessmentSchedule = internalAuditAssessmentSchedule;
    }

    public String getInternalAuditAssessmentSchedule() {
        return internalAuditAssessmentSchedule;
    }

    public void setInternalAuditAssessmentStatus(String internalAuditAssessmentStatus) {
        this.internalAuditAssessmentStatus = internalAuditAssessmentStatus;
    }

    public String getInternalAuditAssessmentStatus() {
        return internalAuditAssessmentStatus;
    }

    public void setInternalAuditAssessmentUsageLog(String internalAuditAssessmentUsageLog) {
        this.internalAuditAssessmentUsageLog = internalAuditAssessmentUsageLog;
    }

    public String getInternalAuditAssessmentUsageLog() {
        return internalAuditAssessmentUsageLog;
    }

    public void setInternalAuditAssessmentServiceProviderReference(org.museframework.bian.classes.Object internalAuditAssessmentServiceProviderReference) {
        this.internalAuditAssessmentServiceProviderReference = internalAuditAssessmentServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getInternalAuditAssessmentServiceProviderReference() {
        return internalAuditAssessmentServiceProviderReference;
    }

    public void setInternalAuditAssessmentRequesterReference(org.museframework.bian.classes.Object internalAuditAssessmentRequesterReference) {
        this.internalAuditAssessmentRequesterReference = internalAuditAssessmentRequesterReference;
    }

    public org.museframework.bian.classes.Object getInternalAuditAssessmentRequesterReference() {
        return internalAuditAssessmentRequesterReference;
    }
}