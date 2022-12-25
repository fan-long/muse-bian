/*Provide specialist advice and/or support as an ongoing service or for a specific task/event within Mergers and Acquisitions Advisory*/
package org.museframework.bian.merandacqadv.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MergersAndAcquisitionAdvice {
    /*A Classification value that distinguishes between the subject matters of Mergers And Acquisition Advice*/
    @MetaField(0)
    private String mergersAndAcquisitionAdviceSubjectAreaType;

    /*A Classification value that distinguishes between Options defined within Mergers And Acquisition Advice*/
    @MetaField(0)
    private String mergersAndAcquisitionAdviceParameterType;

    /*A selected option, identified by Parameter Type*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature mergersAndAcquisitionAdviceSelectedOption;

    /*Request to advise*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction mergersAndAcquisitionAdviceRequest;

    /*Reference to the log of (usage) ativities/events of Mergers And Acquisition Advice*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log mergersAndAcquisitionAdviceUsageLog;

    /*Information about reactions to an Advise which is used as a basis for improvement for the Mergers And Acquisition Advice.*/
    @MetaField(0)
    private String mergersAndAcquisitionAdviceFeedback;

    /*An unique reference to an item or an occurrence of Mergers And Acquisition Advice*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mergersAndAcquisitionAdviceReference;

    public void setMergersAndAcquisitionAdviceSubjectAreaType(String mergersAndAcquisitionAdviceSubjectAreaType) {
        this.mergersAndAcquisitionAdviceSubjectAreaType = mergersAndAcquisitionAdviceSubjectAreaType;
    }

    public String getMergersAndAcquisitionAdviceSubjectAreaType() {
        return mergersAndAcquisitionAdviceSubjectAreaType;
    }

    public void setMergersAndAcquisitionAdviceParameterType(String mergersAndAcquisitionAdviceParameterType) {
        this.mergersAndAcquisitionAdviceParameterType = mergersAndAcquisitionAdviceParameterType;
    }

    public String getMergersAndAcquisitionAdviceParameterType() {
        return mergersAndAcquisitionAdviceParameterType;
    }

    public void setMergersAndAcquisitionAdviceSelectedOption(org.museframework.bian.classes.Feature mergersAndAcquisitionAdviceSelectedOption) {
        this.mergersAndAcquisitionAdviceSelectedOption = mergersAndAcquisitionAdviceSelectedOption;
    }

    public org.museframework.bian.classes.Feature getMergersAndAcquisitionAdviceSelectedOption() {
        return mergersAndAcquisitionAdviceSelectedOption;
    }

    public void setMergersAndAcquisitionAdviceRequest(org.museframework.bian.classes.Instruction mergersAndAcquisitionAdviceRequest) {
        this.mergersAndAcquisitionAdviceRequest = mergersAndAcquisitionAdviceRequest;
    }

    public org.museframework.bian.classes.Instruction getMergersAndAcquisitionAdviceRequest() {
        return mergersAndAcquisitionAdviceRequest;
    }

    public void setMergersAndAcquisitionAdviceUsageLog(org.museframework.bian.classes.Log mergersAndAcquisitionAdviceUsageLog) {
        this.mergersAndAcquisitionAdviceUsageLog = mergersAndAcquisitionAdviceUsageLog;
    }

    public org.museframework.bian.classes.Log getMergersAndAcquisitionAdviceUsageLog() {
        return mergersAndAcquisitionAdviceUsageLog;
    }

    public void setMergersAndAcquisitionAdviceFeedback(String mergersAndAcquisitionAdviceFeedback) {
        this.mergersAndAcquisitionAdviceFeedback = mergersAndAcquisitionAdviceFeedback;
    }

    public String getMergersAndAcquisitionAdviceFeedback() {
        return mergersAndAcquisitionAdviceFeedback;
    }

    public void setMergersAndAcquisitionAdviceReference(org.museframework.bian.classes.Object mergersAndAcquisitionAdviceReference) {
        this.mergersAndAcquisitionAdviceReference = mergersAndAcquisitionAdviceReference;
    }

    public org.museframework.bian.classes.Object getMergersAndAcquisitionAdviceReference() {
        return mergersAndAcquisitionAdviceReference;
    }
}