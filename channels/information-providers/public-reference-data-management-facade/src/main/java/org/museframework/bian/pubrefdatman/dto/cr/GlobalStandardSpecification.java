/*Create and maintain a design for a procedure, product/service model or other such entity  within Public Reference Data Management. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.pubrefdatman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class GlobalStandardSpecification {
    /*A Classification value that distinguishes between designs according to the type of business services and/or aspect within Global Standard Specification . Eg Product Design, Campaign Design, Risk Model Design etc. */
    @MetaField(0)
    private String globalStandardSpecificationParameterType;

    /*A selected optional business service as subject matter of design*/
    @MetaField(0)
    private String globalStandardSpecificationSelectedOption;

    /*Documentation of Global Standard Specification*/
    @MetaField(0)
    private String globalStandardSpecificationDescription;

    /*The version of Global Standard Specification*/
    @MetaField(0)
    private String globalStandardSpecificationVersion;

    /*The status of Global Standard Specification*/
    @MetaField(0)
    private String globalStandardSpecificationStatus;

    /*Reference to the log of (usage) ativities/events of Global Standard Specification*/
    @MetaField(0)
    private String globalStandardSpecificationUsageLog;

    /*Information about reactions to a design which is used as a basis for improvement for the Global Standard Specification.*/
    @MetaField(0)
    private String globalStandardSpecificationFeedback;

    /*Reference to the party who has provided Global Standard Specification*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object globalStandardSpecificationServiceProviderReference;

    public void setGlobalStandardSpecificationParameterType(String globalStandardSpecificationParameterType) {
        this.globalStandardSpecificationParameterType = globalStandardSpecificationParameterType;
    }

    public String getGlobalStandardSpecificationParameterType() {
        return globalStandardSpecificationParameterType;
    }

    public void setGlobalStandardSpecificationSelectedOption(String globalStandardSpecificationSelectedOption) {
        this.globalStandardSpecificationSelectedOption = globalStandardSpecificationSelectedOption;
    }

    public String getGlobalStandardSpecificationSelectedOption() {
        return globalStandardSpecificationSelectedOption;
    }

    public void setGlobalStandardSpecificationDescription(String globalStandardSpecificationDescription) {
        this.globalStandardSpecificationDescription = globalStandardSpecificationDescription;
    }

    public String getGlobalStandardSpecificationDescription() {
        return globalStandardSpecificationDescription;
    }

    public void setGlobalStandardSpecificationVersion(String globalStandardSpecificationVersion) {
        this.globalStandardSpecificationVersion = globalStandardSpecificationVersion;
    }

    public String getGlobalStandardSpecificationVersion() {
        return globalStandardSpecificationVersion;
    }

    public void setGlobalStandardSpecificationStatus(String globalStandardSpecificationStatus) {
        this.globalStandardSpecificationStatus = globalStandardSpecificationStatus;
    }

    public String getGlobalStandardSpecificationStatus() {
        return globalStandardSpecificationStatus;
    }

    public void setGlobalStandardSpecificationUsageLog(String globalStandardSpecificationUsageLog) {
        this.globalStandardSpecificationUsageLog = globalStandardSpecificationUsageLog;
    }

    public String getGlobalStandardSpecificationUsageLog() {
        return globalStandardSpecificationUsageLog;
    }

    public void setGlobalStandardSpecificationFeedback(String globalStandardSpecificationFeedback) {
        this.globalStandardSpecificationFeedback = globalStandardSpecificationFeedback;
    }

    public String getGlobalStandardSpecificationFeedback() {
        return globalStandardSpecificationFeedback;
    }

    public void setGlobalStandardSpecificationServiceProviderReference(org.museframework.bian.classes.Object globalStandardSpecificationServiceProviderReference) {
        this.globalStandardSpecificationServiceProviderReference = globalStandardSpecificationServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getGlobalStandardSpecificationServiceProviderReference() {
        return globalStandardSpecificationServiceProviderReference;
    }
}