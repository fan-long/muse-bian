/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.crerismod.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Production {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField(0)
    private String productionPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField(0)
    private String productionSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField(0)
    private String productionVersionNumber;

    /*The Credit Risk Model Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String serviceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String serviceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String serviceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String serviceWorkProduct;

    /**/
    @MetaField(0)
    private String serviceName;

    public void setProductionPreconditions(String productionPreconditions) {
        this.productionPreconditions = productionPreconditions;
    }

    public String getProductionPreconditions() {
        return productionPreconditions;
    }

    public void setProductionSpecificationSchedule(String productionSpecificationSchedule) {
        this.productionSpecificationSchedule = productionSpecificationSchedule;
    }

    public String getProductionSpecificationSchedule() {
        return productionSpecificationSchedule;
    }

    public void setProductionVersionNumber(String productionVersionNumber) {
        this.productionVersionNumber = productionVersionNumber;
    }

    public String getProductionVersionNumber() {
        return productionVersionNumber;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceInputsandOuputs(String serviceInputsandOuputs) {
        this.serviceInputsandOuputs = serviceInputsandOuputs;
    }

    public String getServiceInputsandOuputs() {
        return serviceInputsandOuputs;
    }

    public void setServiceWorkProduct(String serviceWorkProduct) {
        this.serviceWorkProduct = serviceWorkProduct;
    }

    public String getServiceWorkProduct() {
        return serviceWorkProduct;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}