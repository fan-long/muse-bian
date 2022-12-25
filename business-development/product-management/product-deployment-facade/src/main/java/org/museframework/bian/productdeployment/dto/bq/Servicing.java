/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.productdeployment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Servicing {
    /*The consolidated aspects of the servicing deployment tasks*/
    @MetaField(0)
    private String productandServiceDeploymentServicingRequirements;

    /*File of consolidated deployment planning and deliverable specifications for the task*/
    @MetaField(0)
    private String productandServiceDeploymentServicingRequirementsWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details the tasks and deliverables needed to handle the servicing needs of the deployment*/
    @MetaField(0)
    private String productandServiceDeploymentServicingRequirementsTaskSpecification;

    public void setProductandServiceDeploymentServicingRequirements(String productandServiceDeploymentServicingRequirements) {
        this.productandServiceDeploymentServicingRequirements = productandServiceDeploymentServicingRequirements;
    }

    public String getProductandServiceDeploymentServicingRequirements() {
        return productandServiceDeploymentServicingRequirements;
    }

    public void setProductandServiceDeploymentServicingRequirementsWorkProducts(String productandServiceDeploymentServicingRequirementsWorkProducts) {
        this.productandServiceDeploymentServicingRequirementsWorkProducts = productandServiceDeploymentServicingRequirementsWorkProducts;
    }

    public String getProductandServiceDeploymentServicingRequirementsWorkProducts() {
        return productandServiceDeploymentServicingRequirementsWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProductandServiceDeploymentServicingRequirementsTaskSpecification(String productandServiceDeploymentServicingRequirementsTaskSpecification) {
        this.productandServiceDeploymentServicingRequirementsTaskSpecification = productandServiceDeploymentServicingRequirementsTaskSpecification;
    }

    public String getProductandServiceDeploymentServicingRequirementsTaskSpecification() {
        return productandServiceDeploymentServicingRequirementsTaskSpecification;
    }
}