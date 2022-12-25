/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.productdeployment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SalesandMarketing {
    /*The consolidated aspects of the sales and marketing deployment tasks*/
    @MetaField(0)
    private String productandServiceDeploymentSalesandMarketingRequirements;

    /*File of consolidated deployment planning and deliverable specifications for the task*/
    @MetaField(0)
    private String productandServiceDeploymentSalesandMarketingRequirementsWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details the tasks and deliverables needed to handle the sales and marketing needs of the deployment*/
    @MetaField(0)
    private String productandServiceDeploymentSalesandMarketingRequirementsTaskSpecification;

    public void setProductandServiceDeploymentSalesandMarketingRequirements(String productandServiceDeploymentSalesandMarketingRequirements) {
        this.productandServiceDeploymentSalesandMarketingRequirements = productandServiceDeploymentSalesandMarketingRequirements;
    }

    public String getProductandServiceDeploymentSalesandMarketingRequirements() {
        return productandServiceDeploymentSalesandMarketingRequirements;
    }

    public void setProductandServiceDeploymentSalesandMarketingRequirementsWorkProducts(String productandServiceDeploymentSalesandMarketingRequirementsWorkProducts) {
        this.productandServiceDeploymentSalesandMarketingRequirementsWorkProducts = productandServiceDeploymentSalesandMarketingRequirementsWorkProducts;
    }

    public String getProductandServiceDeploymentSalesandMarketingRequirementsWorkProducts() {
        return productandServiceDeploymentSalesandMarketingRequirementsWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProductandServiceDeploymentSalesandMarketingRequirementsTaskSpecification(String productandServiceDeploymentSalesandMarketingRequirementsTaskSpecification) {
        this.productandServiceDeploymentSalesandMarketingRequirementsTaskSpecification = productandServiceDeploymentSalesandMarketingRequirementsTaskSpecification;
    }

    public String getProductandServiceDeploymentSalesandMarketingRequirementsTaskSpecification() {
        return productandServiceDeploymentSalesandMarketingRequirementsTaskSpecification;
    }
}