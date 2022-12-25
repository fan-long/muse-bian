/*Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.enterprisearchitecture.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class EnterpriseArchitectureSpecification {
    /*A Classification value that distinguishes between designs according to the type of business services and/or aspect within Business Architecture Specification . Eg Product Design, Campaign Design, Risk Model Design etc. */
    @MetaField(0)
    private String enterpriseArchitectureSpecificationParameterType;

    /*A selected optional business service as subject matter of design*/
    @MetaField(0)
    private String enterpriseArchitectureSpecificationSelectedOption;

    /*Documentation of Business Architecture Specification*/
    @MetaField(0)
    private String enterpriseArchitectureSpecificationDescription;

    /*The version of Business Architecture Specification*/
    @MetaField(0)
    private String enterpriseArchitectureSpecificationVersion;

    /*The status of Business Architecture Specification*/
    @MetaField(0)
    private String enterpriseArchitectureSpecificationStatus;

    /*Reference to the log of (usage) ativities/events of Business Architecture Specification*/
    @MetaField(0)
    private String enterpriseArchitectureSpecificationUsageLog;

    /*Information about reactions to a design which is used as a basis for improvement for the Business Architecture Specification.*/
    @MetaField(0)
    private String enterpriseArchitectureSpecificationFeedback;

    /*Reference to the party who has provided Business Architecture Specification*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object enterpriseArchitectureSpecificationServiceProviderReference;

    public void setEnterpriseArchitectureSpecificationParameterType(String enterpriseArchitectureSpecificationParameterType) {
        this.enterpriseArchitectureSpecificationParameterType = enterpriseArchitectureSpecificationParameterType;
    }

    public String getEnterpriseArchitectureSpecificationParameterType() {
        return enterpriseArchitectureSpecificationParameterType;
    }

    public void setEnterpriseArchitectureSpecificationSelectedOption(String enterpriseArchitectureSpecificationSelectedOption) {
        this.enterpriseArchitectureSpecificationSelectedOption = enterpriseArchitectureSpecificationSelectedOption;
    }

    public String getEnterpriseArchitectureSpecificationSelectedOption() {
        return enterpriseArchitectureSpecificationSelectedOption;
    }

    public void setEnterpriseArchitectureSpecificationDescription(String enterpriseArchitectureSpecificationDescription) {
        this.enterpriseArchitectureSpecificationDescription = enterpriseArchitectureSpecificationDescription;
    }

    public String getEnterpriseArchitectureSpecificationDescription() {
        return enterpriseArchitectureSpecificationDescription;
    }

    public void setEnterpriseArchitectureSpecificationVersion(String enterpriseArchitectureSpecificationVersion) {
        this.enterpriseArchitectureSpecificationVersion = enterpriseArchitectureSpecificationVersion;
    }

    public String getEnterpriseArchitectureSpecificationVersion() {
        return enterpriseArchitectureSpecificationVersion;
    }

    public void setEnterpriseArchitectureSpecificationStatus(String enterpriseArchitectureSpecificationStatus) {
        this.enterpriseArchitectureSpecificationStatus = enterpriseArchitectureSpecificationStatus;
    }

    public String getEnterpriseArchitectureSpecificationStatus() {
        return enterpriseArchitectureSpecificationStatus;
    }

    public void setEnterpriseArchitectureSpecificationUsageLog(String enterpriseArchitectureSpecificationUsageLog) {
        this.enterpriseArchitectureSpecificationUsageLog = enterpriseArchitectureSpecificationUsageLog;
    }

    public String getEnterpriseArchitectureSpecificationUsageLog() {
        return enterpriseArchitectureSpecificationUsageLog;
    }

    public void setEnterpriseArchitectureSpecificationFeedback(String enterpriseArchitectureSpecificationFeedback) {
        this.enterpriseArchitectureSpecificationFeedback = enterpriseArchitectureSpecificationFeedback;
    }

    public String getEnterpriseArchitectureSpecificationFeedback() {
        return enterpriseArchitectureSpecificationFeedback;
    }

    public void setEnterpriseArchitectureSpecificationServiceProviderReference(org.museframework.bian.classes.Object enterpriseArchitectureSpecificationServiceProviderReference) {
        this.enterpriseArchitectureSpecificationServiceProviderReference = enterpriseArchitectureSpecificationServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getEnterpriseArchitectureSpecificationServiceProviderReference() {
        return enterpriseArchitectureSpecificationServiceProviderReference;
    }
}