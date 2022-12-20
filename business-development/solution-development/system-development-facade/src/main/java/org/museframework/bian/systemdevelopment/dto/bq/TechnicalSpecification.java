/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.systemdevelopment.dto.bq;

public class TechnicalSpecification {
    /*Details the technical specification tasks and deliverables of system development project*/
    private String technicalSpecificationTaskDefinition;

    /*Collection of design and development work products used in the definition of technical requirements*/
    private String technicalSpecificationTaskWorkProducts;

    /*Reference to associated project documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The technical specification as a suitably structured and formatted document*/
    private String systemTechnicalSpecification;

    public void setTechnicalSpecificationTaskDefinition(String technicalSpecificationTaskDefinition) {
        this.technicalSpecificationTaskDefinition = technicalSpecificationTaskDefinition;
    }

    public String getTechnicalSpecificationTaskDefinition() {
        return technicalSpecificationTaskDefinition;
    }

    public void setTechnicalSpecificationTaskWorkProducts(String technicalSpecificationTaskWorkProducts) {
        this.technicalSpecificationTaskWorkProducts = technicalSpecificationTaskWorkProducts;
    }

    public String getTechnicalSpecificationTaskWorkProducts() {
        return technicalSpecificationTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setSystemTechnicalSpecification(String systemTechnicalSpecification) {
        this.systemTechnicalSpecification = systemTechnicalSpecification;
    }

    public String getSystemTechnicalSpecification() {
        return systemTechnicalSpecification;
    }
}