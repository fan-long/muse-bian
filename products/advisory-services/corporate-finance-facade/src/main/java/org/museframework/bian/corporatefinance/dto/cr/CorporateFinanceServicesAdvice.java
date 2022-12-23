/*Provide specialist advice and/or support as an ongoing service or for a specific task/event within Corporate Finance*/
package org.museframework.bian.corporatefinance.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorporateFinanceServicesAdvice {
    /*A Classification value that distinguishes between the subject matters of Corporate Finance Services Advice*/
    @MetaField
    private String corporateFinanceServicesAdviceSubjectAreaType;

    /*A Classification value that distinguishes between Options defined within Corporate Finance Services Advice*/
    @MetaField
    private String corporateFinanceServicesAdviceParameterType;

    /*A selected option, identified by Parameter Type*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature corporateFinanceServicesAdviceSelectedOption;

    /*Request to advise*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction corporateFinanceServicesAdviceRequest;

    /*Reference to the log of (usage) ativities/events of Corporate Finance Services Advice*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log corporateFinanceServicesAdviceUsageLog;

    /*Information about reactions to an Advise which is used as a basis for improvement for the Corporate Finance Services Advice.*/
    @MetaField
    private String corporateFinanceServicesAdviceFeedback;

    /*An unique reference to an item or an occurrence of Corporate Finance Services Advice*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateFinanceServicesAdviceReference;

    public void setCorporateFinanceServicesAdviceSubjectAreaType(String corporateFinanceServicesAdviceSubjectAreaType) {
        this.corporateFinanceServicesAdviceSubjectAreaType = corporateFinanceServicesAdviceSubjectAreaType;
    }

    public String getCorporateFinanceServicesAdviceSubjectAreaType() {
        return corporateFinanceServicesAdviceSubjectAreaType;
    }

    public void setCorporateFinanceServicesAdviceParameterType(String corporateFinanceServicesAdviceParameterType) {
        this.corporateFinanceServicesAdviceParameterType = corporateFinanceServicesAdviceParameterType;
    }

    public String getCorporateFinanceServicesAdviceParameterType() {
        return corporateFinanceServicesAdviceParameterType;
    }

    public void setCorporateFinanceServicesAdviceSelectedOption(org.museframework.bian.classes.Feature corporateFinanceServicesAdviceSelectedOption) {
        this.corporateFinanceServicesAdviceSelectedOption = corporateFinanceServicesAdviceSelectedOption;
    }

    public org.museframework.bian.classes.Feature getCorporateFinanceServicesAdviceSelectedOption() {
        return corporateFinanceServicesAdviceSelectedOption;
    }

    public void setCorporateFinanceServicesAdviceRequest(org.museframework.bian.classes.Instruction corporateFinanceServicesAdviceRequest) {
        this.corporateFinanceServicesAdviceRequest = corporateFinanceServicesAdviceRequest;
    }

    public org.museframework.bian.classes.Instruction getCorporateFinanceServicesAdviceRequest() {
        return corporateFinanceServicesAdviceRequest;
    }

    public void setCorporateFinanceServicesAdviceUsageLog(org.museframework.bian.classes.Log corporateFinanceServicesAdviceUsageLog) {
        this.corporateFinanceServicesAdviceUsageLog = corporateFinanceServicesAdviceUsageLog;
    }

    public org.museframework.bian.classes.Log getCorporateFinanceServicesAdviceUsageLog() {
        return corporateFinanceServicesAdviceUsageLog;
    }

    public void setCorporateFinanceServicesAdviceFeedback(String corporateFinanceServicesAdviceFeedback) {
        this.corporateFinanceServicesAdviceFeedback = corporateFinanceServicesAdviceFeedback;
    }

    public String getCorporateFinanceServicesAdviceFeedback() {
        return corporateFinanceServicesAdviceFeedback;
    }

    public void setCorporateFinanceServicesAdviceReference(org.museframework.bian.classes.Object corporateFinanceServicesAdviceReference) {
        this.corporateFinanceServicesAdviceReference = corporateFinanceServicesAdviceReference;
    }

    public org.museframework.bian.classes.Object getCorporateFinanceServicesAdviceReference() {
        return corporateFinanceServicesAdviceReference;
    }
}