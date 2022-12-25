/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.itstaandgui.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductTestingandDeploymentMechanisms {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField(0)
    private String productTestingandDeploymentMechanismsPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField(0)
    private String productTestingandDeploymentMechanismsSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField(0)
    private String productTestingandDeploymentMechanismsVersionNumber;

    /*The Technology Standards Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService productTestingandDeploymentMechanisms;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String productTestingandDeploymentMechanismsServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String productTestingandDeploymentMechanismsServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String productTestingandDeploymentMechanismsServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String productTestingandDeploymentMechanismsServiceWorkProduct;

    /**/
    @MetaField(0)
    private String productTestingandDeploymentMechanismsServiceName;

    public void setProductTestingandDeploymentMechanismsPreconditions(String productTestingandDeploymentMechanismsPreconditions) {
        this.productTestingandDeploymentMechanismsPreconditions = productTestingandDeploymentMechanismsPreconditions;
    }

    public String getProductTestingandDeploymentMechanismsPreconditions() {
        return productTestingandDeploymentMechanismsPreconditions;
    }

    public void setProductTestingandDeploymentMechanismsSpecificationSchedule(String productTestingandDeploymentMechanismsSpecificationSchedule) {
        this.productTestingandDeploymentMechanismsSpecificationSchedule = productTestingandDeploymentMechanismsSpecificationSchedule;
    }

    public String getProductTestingandDeploymentMechanismsSpecificationSchedule() {
        return productTestingandDeploymentMechanismsSpecificationSchedule;
    }

    public void setProductTestingandDeploymentMechanismsVersionNumber(String productTestingandDeploymentMechanismsVersionNumber) {
        this.productTestingandDeploymentMechanismsVersionNumber = productTestingandDeploymentMechanismsVersionNumber;
    }

    public String getProductTestingandDeploymentMechanismsVersionNumber() {
        return productTestingandDeploymentMechanismsVersionNumber;
    }

    public void setProductTestingandDeploymentMechanisms(org.museframework.bian.classes.BusinessService productTestingandDeploymentMechanisms) {
        this.productTestingandDeploymentMechanisms = productTestingandDeploymentMechanisms;
    }

    public org.museframework.bian.classes.BusinessService getProductTestingandDeploymentMechanisms() {
        return productTestingandDeploymentMechanisms;
    }

    public void setProductTestingandDeploymentMechanismsServiceType(String productTestingandDeploymentMechanismsServiceType) {
        this.productTestingandDeploymentMechanismsServiceType = productTestingandDeploymentMechanismsServiceType;
    }

    public String getProductTestingandDeploymentMechanismsServiceType() {
        return productTestingandDeploymentMechanismsServiceType;
    }

    public void setProductTestingandDeploymentMechanismsServiceDescription(String productTestingandDeploymentMechanismsServiceDescription) {
        this.productTestingandDeploymentMechanismsServiceDescription = productTestingandDeploymentMechanismsServiceDescription;
    }

    public String getProductTestingandDeploymentMechanismsServiceDescription() {
        return productTestingandDeploymentMechanismsServiceDescription;
    }

    public void setProductTestingandDeploymentMechanismsServiceInputsandOuputs(String productTestingandDeploymentMechanismsServiceInputsandOuputs) {
        this.productTestingandDeploymentMechanismsServiceInputsandOuputs = productTestingandDeploymentMechanismsServiceInputsandOuputs;
    }

    public String getProductTestingandDeploymentMechanismsServiceInputsandOuputs() {
        return productTestingandDeploymentMechanismsServiceInputsandOuputs;
    }

    public void setProductTestingandDeploymentMechanismsServiceWorkProduct(String productTestingandDeploymentMechanismsServiceWorkProduct) {
        this.productTestingandDeploymentMechanismsServiceWorkProduct = productTestingandDeploymentMechanismsServiceWorkProduct;
    }

    public String getProductTestingandDeploymentMechanismsServiceWorkProduct() {
        return productTestingandDeploymentMechanismsServiceWorkProduct;
    }

    public void setProductTestingandDeploymentMechanismsServiceName(String productTestingandDeploymentMechanismsServiceName) {
        this.productTestingandDeploymentMechanismsServiceName = productTestingandDeploymentMechanismsServiceName;
    }

    public String getProductTestingandDeploymentMechanismsServiceName() {
        return productTestingandDeploymentMechanismsServiceName;
    }
}