/*A functional specification for a designed model.

The specification of functional requirements that defines the model.
*/
package org.museframework.bian.classes;

public class ModelDesignFunctionalRequirementsSpecification {
    /**/
    private String functionalRequirementType;

    /*Reference to external service information provider used to obtain example production data for design.*/
    private String externalServiceInformationProvider;

    /*Record of example production data file.*/
    private String customerOrMarketData;

    public void setFunctionalRequirementType(String functionalRequirementType) {
        this.functionalRequirementType = functionalRequirementType;
    }

    public String getFunctionalRequirementType() {
        return functionalRequirementType;
    }

    public void setExternalServiceInformationProvider(String externalServiceInformationProvider) {
        this.externalServiceInformationProvider = externalServiceInformationProvider;
    }

    public String getExternalServiceInformationProvider() {
        return externalServiceInformationProvider;
    }

    public void setCustomerOrMarketData(String customerOrMarketData) {
        this.customerOrMarketData = customerOrMarketData;
    }

    public String getCustomerOrMarketData() {
        return customerOrMarketData;
    }
}