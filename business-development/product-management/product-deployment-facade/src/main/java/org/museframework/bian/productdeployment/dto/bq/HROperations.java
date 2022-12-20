/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.productdeployment.dto.bq;

public class HROperations {
    /*The consolidated aspects of the staffing operations deployment tasks*/
    private String productandServiceDeploymentHROperationsRequirements;

    /*File of consolidated deployment planning and deliverable specifications for the task*/
    private String productandServiceDeploymentHROperationsRequirementsWorkProducts;

    /*Reference to associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details the tasks and deliverables needed to handle the staffing operations needs of the deployment*/
    private String productandServiceDeploymentHROperationsRequirementsTaskSpecification;

    public void setProductandServiceDeploymentHROperationsRequirements(String productandServiceDeploymentHROperationsRequirements) {
        this.productandServiceDeploymentHROperationsRequirements = productandServiceDeploymentHROperationsRequirements;
    }

    public String getProductandServiceDeploymentHROperationsRequirements() {
        return productandServiceDeploymentHROperationsRequirements;
    }

    public void setProductandServiceDeploymentHROperationsRequirementsWorkProducts(String productandServiceDeploymentHROperationsRequirementsWorkProducts) {
        this.productandServiceDeploymentHROperationsRequirementsWorkProducts = productandServiceDeploymentHROperationsRequirementsWorkProducts;
    }

    public String getProductandServiceDeploymentHROperationsRequirementsWorkProducts() {
        return productandServiceDeploymentHROperationsRequirementsWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProductandServiceDeploymentHROperationsRequirementsTaskSpecification(String productandServiceDeploymentHROperationsRequirementsTaskSpecification) {
        this.productandServiceDeploymentHROperationsRequirementsTaskSpecification = productandServiceDeploymentHROperationsRequirementsTaskSpecification;
    }

    public String getProductandServiceDeploymentHROperationsRequirementsTaskSpecification() {
        return productandServiceDeploymentHROperationsRequirementsTaskSpecification;
    }
}