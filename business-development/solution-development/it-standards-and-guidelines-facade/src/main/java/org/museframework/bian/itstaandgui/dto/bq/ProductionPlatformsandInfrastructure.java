/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.itstaandgui.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductionPlatformsandInfrastructure {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField
    private String productionPlatformsandInfrastructurePreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField
    private String productionPlatformsandInfrastructureSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField
    private String productionPlatformsandInfrastructureVersionNumber;

    /*The Technology Standards Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService productionPlatformsandInfrastructure;

    /*Reference to the specific business service type*/
    @MetaField
    private String productionPlatformsandInfrastructureServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String productionPlatformsandInfrastructureServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String productionPlatformsandInfrastructureServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String productionPlatformsandInfrastructureServiceWorkProduct;

    /**/
    @MetaField
    private String productionPlatformsandInfrastructureServiceName;

    public void setProductionPlatformsandInfrastructurePreconditions(String productionPlatformsandInfrastructurePreconditions) {
        this.productionPlatformsandInfrastructurePreconditions = productionPlatformsandInfrastructurePreconditions;
    }

    public String getProductionPlatformsandInfrastructurePreconditions() {
        return productionPlatformsandInfrastructurePreconditions;
    }

    public void setProductionPlatformsandInfrastructureSpecificationSchedule(String productionPlatformsandInfrastructureSpecificationSchedule) {
        this.productionPlatformsandInfrastructureSpecificationSchedule = productionPlatformsandInfrastructureSpecificationSchedule;
    }

    public String getProductionPlatformsandInfrastructureSpecificationSchedule() {
        return productionPlatformsandInfrastructureSpecificationSchedule;
    }

    public void setProductionPlatformsandInfrastructureVersionNumber(String productionPlatformsandInfrastructureVersionNumber) {
        this.productionPlatformsandInfrastructureVersionNumber = productionPlatformsandInfrastructureVersionNumber;
    }

    public String getProductionPlatformsandInfrastructureVersionNumber() {
        return productionPlatformsandInfrastructureVersionNumber;
    }

    public void setProductionPlatformsandInfrastructure(org.museframework.bian.classes.BusinessService productionPlatformsandInfrastructure) {
        this.productionPlatformsandInfrastructure = productionPlatformsandInfrastructure;
    }

    public org.museframework.bian.classes.BusinessService getProductionPlatformsandInfrastructure() {
        return productionPlatformsandInfrastructure;
    }

    public void setProductionPlatformsandInfrastructureServiceType(String productionPlatformsandInfrastructureServiceType) {
        this.productionPlatformsandInfrastructureServiceType = productionPlatformsandInfrastructureServiceType;
    }

    public String getProductionPlatformsandInfrastructureServiceType() {
        return productionPlatformsandInfrastructureServiceType;
    }

    public void setProductionPlatformsandInfrastructureServiceDescription(String productionPlatformsandInfrastructureServiceDescription) {
        this.productionPlatformsandInfrastructureServiceDescription = productionPlatformsandInfrastructureServiceDescription;
    }

    public String getProductionPlatformsandInfrastructureServiceDescription() {
        return productionPlatformsandInfrastructureServiceDescription;
    }

    public void setProductionPlatformsandInfrastructureServiceInputsandOuputs(String productionPlatformsandInfrastructureServiceInputsandOuputs) {
        this.productionPlatformsandInfrastructureServiceInputsandOuputs = productionPlatformsandInfrastructureServiceInputsandOuputs;
    }

    public String getProductionPlatformsandInfrastructureServiceInputsandOuputs() {
        return productionPlatformsandInfrastructureServiceInputsandOuputs;
    }

    public void setProductionPlatformsandInfrastructureServiceWorkProduct(String productionPlatformsandInfrastructureServiceWorkProduct) {
        this.productionPlatformsandInfrastructureServiceWorkProduct = productionPlatformsandInfrastructureServiceWorkProduct;
    }

    public String getProductionPlatformsandInfrastructureServiceWorkProduct() {
        return productionPlatformsandInfrastructureServiceWorkProduct;
    }

    public void setProductionPlatformsandInfrastructureServiceName(String productionPlatformsandInfrastructureServiceName) {
        this.productionPlatformsandInfrastructureServiceName = productionPlatformsandInfrastructureServiceName;
    }

    public String getProductionPlatformsandInfrastructureServiceName() {
        return productionPlatformsandInfrastructureServiceName;
    }
}