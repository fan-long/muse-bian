/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.productdeployment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Systems {
    /*The consolidated aspects of the systems deployment tasks*/
    @MetaField(0)
    private String productandServiceDeploymentSystemsRequirements;

    /*File of consolidated deployment planning and deliverable specifications for the task*/
    @MetaField(0)
    private String productandServiceDeploymentSystemsRequirementsWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details the tasks and deliverables needed to handle the systems needs of the deployment*/
    @MetaField(0)
    private String productandServiceDeploymentSystemsRequirementsTaskSpecification;

    public void setProductandServiceDeploymentSystemsRequirements(String productandServiceDeploymentSystemsRequirements) {
        this.productandServiceDeploymentSystemsRequirements = productandServiceDeploymentSystemsRequirements;
    }

    public String getProductandServiceDeploymentSystemsRequirements() {
        return productandServiceDeploymentSystemsRequirements;
    }

    public void setProductandServiceDeploymentSystemsRequirementsWorkProducts(String productandServiceDeploymentSystemsRequirementsWorkProducts) {
        this.productandServiceDeploymentSystemsRequirementsWorkProducts = productandServiceDeploymentSystemsRequirementsWorkProducts;
    }

    public String getProductandServiceDeploymentSystemsRequirementsWorkProducts() {
        return productandServiceDeploymentSystemsRequirementsWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProductandServiceDeploymentSystemsRequirementsTaskSpecification(String productandServiceDeploymentSystemsRequirementsTaskSpecification) {
        this.productandServiceDeploymentSystemsRequirementsTaskSpecification = productandServiceDeploymentSystemsRequirementsTaskSpecification;
    }

    public String getProductandServiceDeploymentSystemsRequirementsTaskSpecification() {
        return productandServiceDeploymentSystemsRequirementsTaskSpecification;
    }
}