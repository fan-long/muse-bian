/*To test or assess an entity, possibly against some formal qualification or certification requirement within Financial Statement Assessment. */
package org.museframework.bian.finstaass.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.FinancialStatementAssessment
@MetaDto
public class FinancialStatementAssessment {
    /*A Classification value that distinguishes between Assessments according to type of concern defined within Financial Statement Assessment .*/
    @MetaField
    private String financialStatementAssessmentParameterType;

    /*A selected optional business service as subject matter of Financial Statement Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Service financialStatementAssessmentSelectedOption;

    /*The type of Financial Statement Assessment*/
    @MetaField
    private String financialStatementAssessmentType;

    /*An unique reference to an item or an occurrence of Financial Statement Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Assessment financialStatementAssessmentReference;

    /*Request to assess*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction financialStatementAssessmentRequest;

    /*Timetable to assess Financial Statement Assessment*/
    @MetaField
    private String financialStatementAssessmentSchedule;

    /*The status of Financial Statement Assessment*/
    @MetaField
    private String financialStatementAssessmentStatus;

    /*Reference to the log of (usage) ativities/events of Financial Statement Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log financialStatementAssessmentUsageLog;

    /*Reference to the party who has requested Financial Statement Assessment*/
    @MetaField
    private String financialStatementAssessmentRequesterReference;

    /*Party who is involved in Financial Statement Assessment*/
    @MetaField
    private String financialStatementAssessmentAssociatedParty;

    /*Reference to the party who has provided Financial Statement Assessment*/
    @MetaField
    private String financialStatementAssessmentServiceProviderReference;

    public void setFinancialStatementAssessmentParameterType(String financialStatementAssessmentParameterType) {
        this.financialStatementAssessmentParameterType = financialStatementAssessmentParameterType;
    }

    public String getFinancialStatementAssessmentParameterType() {
        return financialStatementAssessmentParameterType;
    }

    public void setFinancialStatementAssessmentSelectedOption(org.museframework.bian.classes.Service financialStatementAssessmentSelectedOption) {
        this.financialStatementAssessmentSelectedOption = financialStatementAssessmentSelectedOption;
    }

    public org.museframework.bian.classes.Service getFinancialStatementAssessmentSelectedOption() {
        return financialStatementAssessmentSelectedOption;
    }

    public void setFinancialStatementAssessmentType(String financialStatementAssessmentType) {
        this.financialStatementAssessmentType = financialStatementAssessmentType;
    }

    public String getFinancialStatementAssessmentType() {
        return financialStatementAssessmentType;
    }

    public void setFinancialStatementAssessmentReference(org.museframework.bian.classes.Assessment financialStatementAssessmentReference) {
        this.financialStatementAssessmentReference = financialStatementAssessmentReference;
    }

    public org.museframework.bian.classes.Assessment getFinancialStatementAssessmentReference() {
        return financialStatementAssessmentReference;
    }

    public void setFinancialStatementAssessmentRequest(org.museframework.bian.classes.Instruction financialStatementAssessmentRequest) {
        this.financialStatementAssessmentRequest = financialStatementAssessmentRequest;
    }

    public org.museframework.bian.classes.Instruction getFinancialStatementAssessmentRequest() {
        return financialStatementAssessmentRequest;
    }

    public void setFinancialStatementAssessmentSchedule(String financialStatementAssessmentSchedule) {
        this.financialStatementAssessmentSchedule = financialStatementAssessmentSchedule;
    }

    public String getFinancialStatementAssessmentSchedule() {
        return financialStatementAssessmentSchedule;
    }

    public void setFinancialStatementAssessmentStatus(String financialStatementAssessmentStatus) {
        this.financialStatementAssessmentStatus = financialStatementAssessmentStatus;
    }

    public String getFinancialStatementAssessmentStatus() {
        return financialStatementAssessmentStatus;
    }

    public void setFinancialStatementAssessmentUsageLog(org.museframework.bian.classes.Log financialStatementAssessmentUsageLog) {
        this.financialStatementAssessmentUsageLog = financialStatementAssessmentUsageLog;
    }

    public org.museframework.bian.classes.Log getFinancialStatementAssessmentUsageLog() {
        return financialStatementAssessmentUsageLog;
    }

    public void setFinancialStatementAssessmentRequesterReference(String financialStatementAssessmentRequesterReference) {
        this.financialStatementAssessmentRequesterReference = financialStatementAssessmentRequesterReference;
    }

    public String getFinancialStatementAssessmentRequesterReference() {
        return financialStatementAssessmentRequesterReference;
    }

    public void setFinancialStatementAssessmentAssociatedParty(String financialStatementAssessmentAssociatedParty) {
        this.financialStatementAssessmentAssociatedParty = financialStatementAssessmentAssociatedParty;
    }

    public String getFinancialStatementAssessmentAssociatedParty() {
        return financialStatementAssessmentAssociatedParty;
    }

    public void setFinancialStatementAssessmentServiceProviderReference(String financialStatementAssessmentServiceProviderReference) {
        this.financialStatementAssessmentServiceProviderReference = financialStatementAssessmentServiceProviderReference;
    }

    public String getFinancialStatementAssessmentServiceProviderReference() {
        return financialStatementAssessmentServiceProviderReference;
    }
}