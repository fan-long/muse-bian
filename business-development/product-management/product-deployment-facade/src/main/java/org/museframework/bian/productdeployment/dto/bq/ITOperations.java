/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.productdeployment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ITOperations {
    /*The consolidated aspects of the IT operations deployment tasks*/
    @MetaField
    private String productandServiceDeploymentITOperationsRequirements;

    /*File of consolidated deployment planning and deliverable specifications for the task*/
    @MetaField
    private String productandServiceDeploymentITOperationsRequirementsWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details the tasks and deliverables needed to handle the IT operations needs of the deployment*/
    @MetaField
    private String productandServiceDeploymentITOperationsRequirementsTaskSpecification;

    public void setProductandServiceDeploymentITOperationsRequirements(String productandServiceDeploymentITOperationsRequirements) {
        this.productandServiceDeploymentITOperationsRequirements = productandServiceDeploymentITOperationsRequirements;
    }

    public String getProductandServiceDeploymentITOperationsRequirements() {
        return productandServiceDeploymentITOperationsRequirements;
    }

    public void setProductandServiceDeploymentITOperationsRequirementsWorkProducts(String productandServiceDeploymentITOperationsRequirementsWorkProducts) {
        this.productandServiceDeploymentITOperationsRequirementsWorkProducts = productandServiceDeploymentITOperationsRequirementsWorkProducts;
    }

    public String getProductandServiceDeploymentITOperationsRequirementsWorkProducts() {
        return productandServiceDeploymentITOperationsRequirementsWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProductandServiceDeploymentITOperationsRequirementsTaskSpecification(String productandServiceDeploymentITOperationsRequirementsTaskSpecification) {
        this.productandServiceDeploymentITOperationsRequirementsTaskSpecification = productandServiceDeploymentITOperationsRequirementsTaskSpecification;
    }

    public String getProductandServiceDeploymentITOperationsRequirementsTaskSpecification() {
        return productandServiceDeploymentITOperationsRequirementsTaskSpecification;
    }
}