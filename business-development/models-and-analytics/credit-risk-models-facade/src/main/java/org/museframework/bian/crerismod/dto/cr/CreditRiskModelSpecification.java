/*Create and maintain a design for a procedure, product/service model or other such entity  within Credit Risk Models. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.crerismod.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditRiskModelSpecification {
    /*A Classification value that distinguishes between designs according to the type of business services and/or aspect within Credit Risk Model Specification . Eg Product Design, Campaign Design, Risk Model Design etc. */
    @MetaField(0)
    private String creditRiskModelSpecificationParameterType;

    /*A selected optional business service as subject matter of design*/
    @MetaField(0)
    private String creditRiskModelSpecificationSelectedOption;

    /*Documentation of Credit Risk Model Specification*/
    @MetaField(0)
    private String creditRiskModelSpecificationDescription;

    /*The version of Credit Risk Model Specification*/
    @MetaField(0)
    private String creditRiskModelSpecificationVersion;

    /*The status of Credit Risk Model Specification*/
    @MetaField(0)
    private String creditRiskModelSpecificationStatus;

    /*Reference to the log of (usage) ativities/events of Credit Risk Model Specification*/
    @MetaField(0)
    private String creditRiskModelSpecificationUsageLog;

    /*Information about reactions to a design which is used as a basis for improvement for the Credit Risk Model Specification.*/
    @MetaField(0)
    private String creditRiskModelSpecificationFeedback;

    /*Reference to the party who has provided Credit Risk Model Specification*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object creditRiskModelSpecificationServiceProviderReference;

    public void setCreditRiskModelSpecificationParameterType(String creditRiskModelSpecificationParameterType) {
        this.creditRiskModelSpecificationParameterType = creditRiskModelSpecificationParameterType;
    }

    public String getCreditRiskModelSpecificationParameterType() {
        return creditRiskModelSpecificationParameterType;
    }

    public void setCreditRiskModelSpecificationSelectedOption(String creditRiskModelSpecificationSelectedOption) {
        this.creditRiskModelSpecificationSelectedOption = creditRiskModelSpecificationSelectedOption;
    }

    public String getCreditRiskModelSpecificationSelectedOption() {
        return creditRiskModelSpecificationSelectedOption;
    }

    public void setCreditRiskModelSpecificationDescription(String creditRiskModelSpecificationDescription) {
        this.creditRiskModelSpecificationDescription = creditRiskModelSpecificationDescription;
    }

    public String getCreditRiskModelSpecificationDescription() {
        return creditRiskModelSpecificationDescription;
    }

    public void setCreditRiskModelSpecificationVersion(String creditRiskModelSpecificationVersion) {
        this.creditRiskModelSpecificationVersion = creditRiskModelSpecificationVersion;
    }

    public String getCreditRiskModelSpecificationVersion() {
        return creditRiskModelSpecificationVersion;
    }

    public void setCreditRiskModelSpecificationStatus(String creditRiskModelSpecificationStatus) {
        this.creditRiskModelSpecificationStatus = creditRiskModelSpecificationStatus;
    }

    public String getCreditRiskModelSpecificationStatus() {
        return creditRiskModelSpecificationStatus;
    }

    public void setCreditRiskModelSpecificationUsageLog(String creditRiskModelSpecificationUsageLog) {
        this.creditRiskModelSpecificationUsageLog = creditRiskModelSpecificationUsageLog;
    }

    public String getCreditRiskModelSpecificationUsageLog() {
        return creditRiskModelSpecificationUsageLog;
    }

    public void setCreditRiskModelSpecificationFeedback(String creditRiskModelSpecificationFeedback) {
        this.creditRiskModelSpecificationFeedback = creditRiskModelSpecificationFeedback;
    }

    public String getCreditRiskModelSpecificationFeedback() {
        return creditRiskModelSpecificationFeedback;
    }

    public void setCreditRiskModelSpecificationServiceProviderReference(org.museframework.bian.classes.Object creditRiskModelSpecificationServiceProviderReference) {
        this.creditRiskModelSpecificationServiceProviderReference = creditRiskModelSpecificationServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getCreditRiskModelSpecificationServiceProviderReference() {
        return creditRiskModelSpecificationServiceProviderReference;
    }
}