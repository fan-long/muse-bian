/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.cr;

public class ManagementManualSpecification {
    /*A Classification value that distinguishes between designs according to the type of business services and/or aspect within Management Manual Specification . Eg Product Design, Campaign Design, Risk Model Design etc. */
    private String managementManualSpecificationParameterType;

    /*A selected optional business service as subject matter of design*/
    private String managementManualSpecificationSelectedOption;

    /*Documentation of Management Manual Specification*/
    private String managementManualSpecificationDescription;

    /*The version of Management Manual Specification*/
    private String managementManualSpecificationVersion;

    /*The status of Management Manual Specification*/
    private String managementManualSpecificationStatus;

    /*Reference to the log of (usage) ativities/events of Management Manual Specification*/
    private String managementManualSpecificationUsageLog;

    /*Information about reactions to a design which is used as a basis for improvement for the Management Manual Specification.*/
    private String managementManualSpecificationFeedback;

    /*Reference to the party who has provided Management Manual Specification*/
    private org.museframework.bian.classes.Object managementManualSpecificationServiceProviderReference;

    public void setManagementManualSpecificationParameterType(String managementManualSpecificationParameterType) {
        this.managementManualSpecificationParameterType = managementManualSpecificationParameterType;
    }

    public String getManagementManualSpecificationParameterType() {
        return managementManualSpecificationParameterType;
    }

    public void setManagementManualSpecificationSelectedOption(String managementManualSpecificationSelectedOption) {
        this.managementManualSpecificationSelectedOption = managementManualSpecificationSelectedOption;
    }

    public String getManagementManualSpecificationSelectedOption() {
        return managementManualSpecificationSelectedOption;
    }

    public void setManagementManualSpecificationDescription(String managementManualSpecificationDescription) {
        this.managementManualSpecificationDescription = managementManualSpecificationDescription;
    }

    public String getManagementManualSpecificationDescription() {
        return managementManualSpecificationDescription;
    }

    public void setManagementManualSpecificationVersion(String managementManualSpecificationVersion) {
        this.managementManualSpecificationVersion = managementManualSpecificationVersion;
    }

    public String getManagementManualSpecificationVersion() {
        return managementManualSpecificationVersion;
    }

    public void setManagementManualSpecificationStatus(String managementManualSpecificationStatus) {
        this.managementManualSpecificationStatus = managementManualSpecificationStatus;
    }

    public String getManagementManualSpecificationStatus() {
        return managementManualSpecificationStatus;
    }

    public void setManagementManualSpecificationUsageLog(String managementManualSpecificationUsageLog) {
        this.managementManualSpecificationUsageLog = managementManualSpecificationUsageLog;
    }

    public String getManagementManualSpecificationUsageLog() {
        return managementManualSpecificationUsageLog;
    }

    public void setManagementManualSpecificationFeedback(String managementManualSpecificationFeedback) {
        this.managementManualSpecificationFeedback = managementManualSpecificationFeedback;
    }

    public String getManagementManualSpecificationFeedback() {
        return managementManualSpecificationFeedback;
    }

    public void setManagementManualSpecificationServiceProviderReference(org.museframework.bian.classes.Object managementManualSpecificationServiceProviderReference) {
        this.managementManualSpecificationServiceProviderReference = managementManualSpecificationServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getManagementManualSpecificationServiceProviderReference() {
        return managementManualSpecificationServiceProviderReference;
    }
}