/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.systemdevelopment.dto.bq;

public class FunctionalSpecification {
    /*Details the functional specification tasks and deliverables of system development project*/
    private String functionalSpecificationTaskDefinition;

    /*Collection of design and development work products used in the definition of functional requirements*/
    private String functionalSpecificationTaskWorkProducts;

    /*Reference to associated project documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The functional specification as a suitably structured and formatted document*/
    private String systemFunctionalSpecification;

    public void setFunctionalSpecificationTaskDefinition(String functionalSpecificationTaskDefinition) {
        this.functionalSpecificationTaskDefinition = functionalSpecificationTaskDefinition;
    }

    public String getFunctionalSpecificationTaskDefinition() {
        return functionalSpecificationTaskDefinition;
    }

    public void setFunctionalSpecificationTaskWorkProducts(String functionalSpecificationTaskWorkProducts) {
        this.functionalSpecificationTaskWorkProducts = functionalSpecificationTaskWorkProducts;
    }

    public String getFunctionalSpecificationTaskWorkProducts() {
        return functionalSpecificationTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setSystemFunctionalSpecification(String systemFunctionalSpecification) {
        this.systemFunctionalSpecification = systemFunctionalSpecification;
    }

    public String getSystemFunctionalSpecification() {
        return systemFunctionalSpecification;
    }
}