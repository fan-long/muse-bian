/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.productdeployment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductionSupport {
    /*The consolidated aspects of the production support deployment tasks*/
    @MetaField(0)
    private String productandServiceDeploymentProductionSupportRequirements;

    /*File of consolidated deployment planning and deliverable specifications for the task*/
    @MetaField(0)
    private String productandServiceDeploymentProductionSupportRequirementsWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details the tasks and deliverables needed to handle the production support needs of the deployment*/
    @MetaField(0)
    private String productandServiceDeploymentProductionSupportRequirementsTaskSpecification;

    public void setProductandServiceDeploymentProductionSupportRequirements(String productandServiceDeploymentProductionSupportRequirements) {
        this.productandServiceDeploymentProductionSupportRequirements = productandServiceDeploymentProductionSupportRequirements;
    }

    public String getProductandServiceDeploymentProductionSupportRequirements() {
        return productandServiceDeploymentProductionSupportRequirements;
    }

    public void setProductandServiceDeploymentProductionSupportRequirementsWorkProducts(String productandServiceDeploymentProductionSupportRequirementsWorkProducts) {
        this.productandServiceDeploymentProductionSupportRequirementsWorkProducts = productandServiceDeploymentProductionSupportRequirementsWorkProducts;
    }

    public String getProductandServiceDeploymentProductionSupportRequirementsWorkProducts() {
        return productandServiceDeploymentProductionSupportRequirementsWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProductandServiceDeploymentProductionSupportRequirementsTaskSpecification(String productandServiceDeploymentProductionSupportRequirementsTaskSpecification) {
        this.productandServiceDeploymentProductionSupportRequirementsTaskSpecification = productandServiceDeploymentProductionSupportRequirementsTaskSpecification;
    }

    public String getProductandServiceDeploymentProductionSupportRequirementsTaskSpecification() {
        return productandServiceDeploymentProductionSupportRequirementsTaskSpecification;
    }
}