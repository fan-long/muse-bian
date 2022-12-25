/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.itstaandgui.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductionEnvironmentandSupportServices {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField(0)
    private String productionEnvironmentandSupportServicesPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField(0)
    private String productionEnvironmentandSupportServicesSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField(0)
    private String productionEnvironmentandSupportServicesVersionNumber;

    /*The Technology Standards Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService productionEnvironmentandSupportServices;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String productionEnvironmentandSupportServicesServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String productionEnvironmentandSupportServicesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String productionEnvironmentandSupportServicesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String productionEnvironmentandSupportServicesServiceWorkProduct;

    /**/
    @MetaField(0)
    private String productionEnvironmentandSupportServicesServiceName;

    public void setProductionEnvironmentandSupportServicesPreconditions(String productionEnvironmentandSupportServicesPreconditions) {
        this.productionEnvironmentandSupportServicesPreconditions = productionEnvironmentandSupportServicesPreconditions;
    }

    public String getProductionEnvironmentandSupportServicesPreconditions() {
        return productionEnvironmentandSupportServicesPreconditions;
    }

    public void setProductionEnvironmentandSupportServicesSpecificationSchedule(String productionEnvironmentandSupportServicesSpecificationSchedule) {
        this.productionEnvironmentandSupportServicesSpecificationSchedule = productionEnvironmentandSupportServicesSpecificationSchedule;
    }

    public String getProductionEnvironmentandSupportServicesSpecificationSchedule() {
        return productionEnvironmentandSupportServicesSpecificationSchedule;
    }

    public void setProductionEnvironmentandSupportServicesVersionNumber(String productionEnvironmentandSupportServicesVersionNumber) {
        this.productionEnvironmentandSupportServicesVersionNumber = productionEnvironmentandSupportServicesVersionNumber;
    }

    public String getProductionEnvironmentandSupportServicesVersionNumber() {
        return productionEnvironmentandSupportServicesVersionNumber;
    }

    public void setProductionEnvironmentandSupportServices(org.museframework.bian.classes.BusinessService productionEnvironmentandSupportServices) {
        this.productionEnvironmentandSupportServices = productionEnvironmentandSupportServices;
    }

    public org.museframework.bian.classes.BusinessService getProductionEnvironmentandSupportServices() {
        return productionEnvironmentandSupportServices;
    }

    public void setProductionEnvironmentandSupportServicesServiceType(String productionEnvironmentandSupportServicesServiceType) {
        this.productionEnvironmentandSupportServicesServiceType = productionEnvironmentandSupportServicesServiceType;
    }

    public String getProductionEnvironmentandSupportServicesServiceType() {
        return productionEnvironmentandSupportServicesServiceType;
    }

    public void setProductionEnvironmentandSupportServicesServiceDescription(String productionEnvironmentandSupportServicesServiceDescription) {
        this.productionEnvironmentandSupportServicesServiceDescription = productionEnvironmentandSupportServicesServiceDescription;
    }

    public String getProductionEnvironmentandSupportServicesServiceDescription() {
        return productionEnvironmentandSupportServicesServiceDescription;
    }

    public void setProductionEnvironmentandSupportServicesServiceInputsandOuputs(String productionEnvironmentandSupportServicesServiceInputsandOuputs) {
        this.productionEnvironmentandSupportServicesServiceInputsandOuputs = productionEnvironmentandSupportServicesServiceInputsandOuputs;
    }

    public String getProductionEnvironmentandSupportServicesServiceInputsandOuputs() {
        return productionEnvironmentandSupportServicesServiceInputsandOuputs;
    }

    public void setProductionEnvironmentandSupportServicesServiceWorkProduct(String productionEnvironmentandSupportServicesServiceWorkProduct) {
        this.productionEnvironmentandSupportServicesServiceWorkProduct = productionEnvironmentandSupportServicesServiceWorkProduct;
    }

    public String getProductionEnvironmentandSupportServicesServiceWorkProduct() {
        return productionEnvironmentandSupportServicesServiceWorkProduct;
    }

    public void setProductionEnvironmentandSupportServicesServiceName(String productionEnvironmentandSupportServicesServiceName) {
        this.productionEnvironmentandSupportServicesServiceName = productionEnvironmentandSupportServicesServiceName;
    }

    public String getProductionEnvironmentandSupportServicesServiceName() {
        return productionEnvironmentandSupportServicesServiceName;
    }
}