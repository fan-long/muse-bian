/*Create and maintain a design for a procedure, product/service model or other such entity  within Product Design. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.productdesign.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductorServiceSpecification {
    /*The type or category of product or service (e.g. specialized consumer loan, relocation services)*/
    @MetaField(0)
    private String productandServiceType;

    /*A description of the product or service including its main features and target customer*/
    @MetaField(0)
    private String productandServiceDescription;

    /*Maintains the current production deployment configuration of the product or service*/
    @MetaField(0)
    private String productandServiceSpecificationDeployment;

    /*Reference to the business units where the product or service is in use or supported*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Details of the product or service specification deployment for reference*/
    @MetaField(0)
    private String productandServiceSpecificationDeploymentConfiguration;

    /*Reference to the specification deployment task*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceSpecificationDeploymentTaskReference;

    /*Recorded details of a specification deployment task*/
    @MetaField(0)
    private String productandServiceSpecificationDeploymentTaskRecord;

    /*The operational and development status of the product or service specification (e.g. under development, available, in-use under review)*/
    @MetaField(0)
    private String productandServiceSpecificationStatus;

    /*Tracking deployment and product or service usage frequency*/
    @MetaField(0)
    private String productandServiceSpecificationUsage;

    /*Track reporting of the performance/profitability (of specific features ) of the product or service specification*/
    @MetaField(0)
    private String productandServiceSpecificationImpact;

    /*Release version of the available specification plus version history as appropriate*/
    @MetaField(0)
    private String productandServiceSpecificationVersion;

    /*The deployable product or service specification in any appropriate form (including historical versions as appropriate). Note supporting systems and production/operations facilities are handled in parallel as part of a broader deployment*/
    @MetaField(0)
    private String productandServiceSpecification;

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setProductandServiceDescription(String productandServiceDescription) {
        this.productandServiceDescription = productandServiceDescription;
    }

    public String getProductandServiceDescription() {
        return productandServiceDescription;
    }

    public void setProductandServiceSpecificationDeployment(String productandServiceSpecificationDeployment) {
        this.productandServiceSpecificationDeployment = productandServiceSpecificationDeployment;
    }

    public String getProductandServiceSpecificationDeployment() {
        return productandServiceSpecificationDeployment;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setProductandServiceSpecificationDeploymentConfiguration(String productandServiceSpecificationDeploymentConfiguration) {
        this.productandServiceSpecificationDeploymentConfiguration = productandServiceSpecificationDeploymentConfiguration;
    }

    public String getProductandServiceSpecificationDeploymentConfiguration() {
        return productandServiceSpecificationDeploymentConfiguration;
    }

    public void setProductandServiceSpecificationDeploymentTaskReference(org.museframework.bian.classes.Object productandServiceSpecificationDeploymentTaskReference) {
        this.productandServiceSpecificationDeploymentTaskReference = productandServiceSpecificationDeploymentTaskReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceSpecificationDeploymentTaskReference() {
        return productandServiceSpecificationDeploymentTaskReference;
    }

    public void setProductandServiceSpecificationDeploymentTaskRecord(String productandServiceSpecificationDeploymentTaskRecord) {
        this.productandServiceSpecificationDeploymentTaskRecord = productandServiceSpecificationDeploymentTaskRecord;
    }

    public String getProductandServiceSpecificationDeploymentTaskRecord() {
        return productandServiceSpecificationDeploymentTaskRecord;
    }

    public void setProductandServiceSpecificationStatus(String productandServiceSpecificationStatus) {
        this.productandServiceSpecificationStatus = productandServiceSpecificationStatus;
    }

    public String getProductandServiceSpecificationStatus() {
        return productandServiceSpecificationStatus;
    }

    public void setProductandServiceSpecificationUsage(String productandServiceSpecificationUsage) {
        this.productandServiceSpecificationUsage = productandServiceSpecificationUsage;
    }

    public String getProductandServiceSpecificationUsage() {
        return productandServiceSpecificationUsage;
    }

    public void setProductandServiceSpecificationImpact(String productandServiceSpecificationImpact) {
        this.productandServiceSpecificationImpact = productandServiceSpecificationImpact;
    }

    public String getProductandServiceSpecificationImpact() {
        return productandServiceSpecificationImpact;
    }

    public void setProductandServiceSpecificationVersion(String productandServiceSpecificationVersion) {
        this.productandServiceSpecificationVersion = productandServiceSpecificationVersion;
    }

    public String getProductandServiceSpecificationVersion() {
        return productandServiceSpecificationVersion;
    }

    public void setProductandServiceSpecification(String productandServiceSpecification) {
        this.productandServiceSpecification = productandServiceSpecification;
    }

    public String getProductandServiceSpecification() {
        return productandServiceSpecification;
    }
}