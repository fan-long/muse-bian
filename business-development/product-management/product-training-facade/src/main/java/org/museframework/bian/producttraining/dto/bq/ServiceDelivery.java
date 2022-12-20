/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.producttraining.dto.bq;

public class ServiceDelivery {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private String serviceDeliveryPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    private org.museframework.bian.classes.Object serviceDeliveryBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String serviceDeliveryWorkSchedule;

    /*The Product Training Procedure specific Business Service*/
    private org.museframework.bian.classes.BusinessService serviceDelivery;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private String serviceDeliveryPostconditions;

    /*Reference to the specific business service type*/
    private String serviceDeliveryServiceDeliveryServiceType;

    /*Description of the performed business service*/
    private String serviceDeliveryServiceDeliveryServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String serviceDeliveryServiceDeliveryServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String serviceDeliveryServiceDeliveryServiceWorkProduct;

    /**/
    private String serviceDeliveryServiceDeliveryServiceName;

    public void setServiceDeliveryPreconditions(String serviceDeliveryPreconditions) {
        this.serviceDeliveryPreconditions = serviceDeliveryPreconditions;
    }

    public String getServiceDeliveryPreconditions() {
        return serviceDeliveryPreconditions;
    }

    public void setServiceDeliveryBusinessUnitEmployeeReference(org.museframework.bian.classes.Object serviceDeliveryBusinessUnitEmployeeReference) {
        this.serviceDeliveryBusinessUnitEmployeeReference = serviceDeliveryBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getServiceDeliveryBusinessUnitEmployeeReference() {
        return serviceDeliveryBusinessUnitEmployeeReference;
    }

    public void setServiceDeliveryWorkSchedule(String serviceDeliveryWorkSchedule) {
        this.serviceDeliveryWorkSchedule = serviceDeliveryWorkSchedule;
    }

    public String getServiceDeliveryWorkSchedule() {
        return serviceDeliveryWorkSchedule;
    }

    public void setServiceDelivery(org.museframework.bian.classes.BusinessService serviceDelivery) {
        this.serviceDelivery = serviceDelivery;
    }

    public org.museframework.bian.classes.BusinessService getServiceDelivery() {
        return serviceDelivery;
    }

    public void setServiceDeliveryPostconditions(String serviceDeliveryPostconditions) {
        this.serviceDeliveryPostconditions = serviceDeliveryPostconditions;
    }

    public String getServiceDeliveryPostconditions() {
        return serviceDeliveryPostconditions;
    }

    public void setServiceDeliveryServiceDeliveryServiceType(String serviceDeliveryServiceDeliveryServiceType) {
        this.serviceDeliveryServiceDeliveryServiceType = serviceDeliveryServiceDeliveryServiceType;
    }

    public String getServiceDeliveryServiceDeliveryServiceType() {
        return serviceDeliveryServiceDeliveryServiceType;
    }

    public void setServiceDeliveryServiceDeliveryServiceDescription(String serviceDeliveryServiceDeliveryServiceDescription) {
        this.serviceDeliveryServiceDeliveryServiceDescription = serviceDeliveryServiceDeliveryServiceDescription;
    }

    public String getServiceDeliveryServiceDeliveryServiceDescription() {
        return serviceDeliveryServiceDeliveryServiceDescription;
    }

    public void setServiceDeliveryServiceDeliveryServiceInputsandOuputs(String serviceDeliveryServiceDeliveryServiceInputsandOuputs) {
        this.serviceDeliveryServiceDeliveryServiceInputsandOuputs = serviceDeliveryServiceDeliveryServiceInputsandOuputs;
    }

    public String getServiceDeliveryServiceDeliveryServiceInputsandOuputs() {
        return serviceDeliveryServiceDeliveryServiceInputsandOuputs;
    }

    public void setServiceDeliveryServiceDeliveryServiceWorkProduct(String serviceDeliveryServiceDeliveryServiceWorkProduct) {
        this.serviceDeliveryServiceDeliveryServiceWorkProduct = serviceDeliveryServiceDeliveryServiceWorkProduct;
    }

    public String getServiceDeliveryServiceDeliveryServiceWorkProduct() {
        return serviceDeliveryServiceDeliveryServiceWorkProduct;
    }

    public void setServiceDeliveryServiceDeliveryServiceName(String serviceDeliveryServiceDeliveryServiceName) {
        this.serviceDeliveryServiceDeliveryServiceName = serviceDeliveryServiceDeliveryServiceName;
    }

    public String getServiceDeliveryServiceDeliveryServiceName() {
        return serviceDeliveryServiceDeliveryServiceName;
    }
}