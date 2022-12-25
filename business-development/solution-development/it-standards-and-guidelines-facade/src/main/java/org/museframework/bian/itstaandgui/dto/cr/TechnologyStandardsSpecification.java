/*Create and maintain a design for a procedure, product/service model or other such entity  within IT Standards & Guidelines. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.itstaandgui.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TechnologyStandardsSpecification {
    /*A Classification value that distinguishes between designs according to the type of business services and/or aspect within Technology Standards Specification . Eg Product Design, Campaign Design, Risk Model Design etc. */
    @MetaField(0)
    private String technologyStandardsSpecificationParameterType;

    /*A selected optional business service as subject matter of design*/
    @MetaField(0)
    private String technologyStandardsSpecificationSelectedOption;

    /*Documentation of Technology Standards Specification*/
    @MetaField(0)
    private String technologyStandardsSpecificationDescription;

    /*The version of Technology Standards Specification*/
    @MetaField(0)
    private String technologyStandardsSpecificationVersion;

    /*The status of Technology Standards Specification*/
    @MetaField(0)
    private String technologyStandardsSpecificationStatus;

    /*Reference to the log of (usage) ativities/events of Technology Standards Specification*/
    @MetaField(0)
    private String technologyStandardsSpecificationUsageLog;

    /*Information about reactions to a design which is used as a basis for improvement for the Technology Standards Specification.*/
    @MetaField(0)
    private String technologyStandardsSpecificationFeedback;

    /*Reference to the party who has provided Technology Standards Specification*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object technologyStandardsSpecificationServiceProviderReference;

    public void setTechnologyStandardsSpecificationParameterType(String technologyStandardsSpecificationParameterType) {
        this.technologyStandardsSpecificationParameterType = technologyStandardsSpecificationParameterType;
    }

    public String getTechnologyStandardsSpecificationParameterType() {
        return technologyStandardsSpecificationParameterType;
    }

    public void setTechnologyStandardsSpecificationSelectedOption(String technologyStandardsSpecificationSelectedOption) {
        this.technologyStandardsSpecificationSelectedOption = technologyStandardsSpecificationSelectedOption;
    }

    public String getTechnologyStandardsSpecificationSelectedOption() {
        return technologyStandardsSpecificationSelectedOption;
    }

    public void setTechnologyStandardsSpecificationDescription(String technologyStandardsSpecificationDescription) {
        this.technologyStandardsSpecificationDescription = technologyStandardsSpecificationDescription;
    }

    public String getTechnologyStandardsSpecificationDescription() {
        return technologyStandardsSpecificationDescription;
    }

    public void setTechnologyStandardsSpecificationVersion(String technologyStandardsSpecificationVersion) {
        this.technologyStandardsSpecificationVersion = technologyStandardsSpecificationVersion;
    }

    public String getTechnologyStandardsSpecificationVersion() {
        return technologyStandardsSpecificationVersion;
    }

    public void setTechnologyStandardsSpecificationStatus(String technologyStandardsSpecificationStatus) {
        this.technologyStandardsSpecificationStatus = technologyStandardsSpecificationStatus;
    }

    public String getTechnologyStandardsSpecificationStatus() {
        return technologyStandardsSpecificationStatus;
    }

    public void setTechnologyStandardsSpecificationUsageLog(String technologyStandardsSpecificationUsageLog) {
        this.technologyStandardsSpecificationUsageLog = technologyStandardsSpecificationUsageLog;
    }

    public String getTechnologyStandardsSpecificationUsageLog() {
        return technologyStandardsSpecificationUsageLog;
    }

    public void setTechnologyStandardsSpecificationFeedback(String technologyStandardsSpecificationFeedback) {
        this.technologyStandardsSpecificationFeedback = technologyStandardsSpecificationFeedback;
    }

    public String getTechnologyStandardsSpecificationFeedback() {
        return technologyStandardsSpecificationFeedback;
    }

    public void setTechnologyStandardsSpecificationServiceProviderReference(org.museframework.bian.classes.Object technologyStandardsSpecificationServiceProviderReference) {
        this.technologyStandardsSpecificationServiceProviderReference = technologyStandardsSpecificationServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getTechnologyStandardsSpecificationServiceProviderReference() {
        return technologyStandardsSpecificationServiceProviderReference;
    }
}