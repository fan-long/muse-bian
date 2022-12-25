/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.productdeployment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Production {
    /*The consolidated aspects of the production deployment tasks*/
    @MetaField(0)
    private String productandServiceDeploymentProductionRequirements;

    /*File of consolidated deployment planning and deliverable specifications for the task*/
    @MetaField(0)
    private String productandServiceDeploymentProductionRequirementsWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details the tasks and deliverables needed to handle the production needs of the deployment*/
    @MetaField(0)
    private String productandServiceDeploymentProductionRequirementsTaskSpecification;

    public void setProductandServiceDeploymentProductionRequirements(String productandServiceDeploymentProductionRequirements) {
        this.productandServiceDeploymentProductionRequirements = productandServiceDeploymentProductionRequirements;
    }

    public String getProductandServiceDeploymentProductionRequirements() {
        return productandServiceDeploymentProductionRequirements;
    }

    public void setProductandServiceDeploymentProductionRequirementsWorkProducts(String productandServiceDeploymentProductionRequirementsWorkProducts) {
        this.productandServiceDeploymentProductionRequirementsWorkProducts = productandServiceDeploymentProductionRequirementsWorkProducts;
    }

    public String getProductandServiceDeploymentProductionRequirementsWorkProducts() {
        return productandServiceDeploymentProductionRequirementsWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProductandServiceDeploymentProductionRequirementsTaskSpecification(String productandServiceDeploymentProductionRequirementsTaskSpecification) {
        this.productandServiceDeploymentProductionRequirementsTaskSpecification = productandServiceDeploymentProductionRequirementsTaskSpecification;
    }

    public String getProductandServiceDeploymentProductionRequirementsTaskSpecification() {
        return productandServiceDeploymentProductionRequirementsTaskSpecification;
    }
}