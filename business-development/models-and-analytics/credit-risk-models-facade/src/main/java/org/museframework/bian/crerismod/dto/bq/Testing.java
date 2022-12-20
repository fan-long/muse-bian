/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.crerismod.dto.bq;

public class Testing {
    /*The required status/situation before the specification aspect can be defined*/
    private String testingPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    private String testingSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    private String testingVersionNumber;

    /*The Credit Risk Model Specification specific  Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to the specific business service type*/
    private String serviceType;

    /*Description of the performed business service*/
    private String serviceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String serviceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String serviceWorkProduct;

    /**/
    private String serviceName;

    public void setTestingPreconditions(String testingPreconditions) {
        this.testingPreconditions = testingPreconditions;
    }

    public String getTestingPreconditions() {
        return testingPreconditions;
    }

    public void setTestingSpecificationSchedule(String testingSpecificationSchedule) {
        this.testingSpecificationSchedule = testingSpecificationSchedule;
    }

    public String getTestingSpecificationSchedule() {
        return testingSpecificationSchedule;
    }

    public void setTestingVersionNumber(String testingVersionNumber) {
        this.testingVersionNumber = testingVersionNumber;
    }

    public String getTestingVersionNumber() {
        return testingVersionNumber;
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