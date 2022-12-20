/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.systemdevelopment.dto.bq;

public class SoftwareandDataSpecification {
    /*Details the software and data specification/development tasks and deliverables of system development project*/
    private String softwareandDataSpecificationTaskDefinition;

    /*Collection of design and development work products used in the implementation of the software and data specification*/
    private String softwareandDataSpecificationTaskWorkProducts;

    /*Reference to associated project documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The developed software and data specification in a format suited for production deployment*/
    private String systemSoftwareandDataSpecification;

    public void setSoftwareandDataSpecificationTaskDefinition(String softwareandDataSpecificationTaskDefinition) {
        this.softwareandDataSpecificationTaskDefinition = softwareandDataSpecificationTaskDefinition;
    }

    public String getSoftwareandDataSpecificationTaskDefinition() {
        return softwareandDataSpecificationTaskDefinition;
    }

    public void setSoftwareandDataSpecificationTaskWorkProducts(String softwareandDataSpecificationTaskWorkProducts) {
        this.softwareandDataSpecificationTaskWorkProducts = softwareandDataSpecificationTaskWorkProducts;
    }

    public String getSoftwareandDataSpecificationTaskWorkProducts() {
        return softwareandDataSpecificationTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setSystemSoftwareandDataSpecification(String systemSoftwareandDataSpecification) {
        this.systemSoftwareandDataSpecification = systemSoftwareandDataSpecification;
    }

    public String getSystemSoftwareandDataSpecification() {
        return systemSoftwareandDataSpecification;
    }
}