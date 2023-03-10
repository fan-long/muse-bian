/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.cencashan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TrackingandAllocation {
    /*The required status/situation before the allocation can be made*/
    @MetaField(0)
    private String trackingandAllocationPreconditions;

    /*The schedule and timing of allocation decisions*/
    @MetaField(0)
    private String trackingandAllocationAllocationSchedule;

    /*The Central Cash Allocation specific  Business Service*/
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

    public void setTrackingandAllocationPreconditions(String trackingandAllocationPreconditions) {
        this.trackingandAllocationPreconditions = trackingandAllocationPreconditions;
    }

    public String getTrackingandAllocationPreconditions() {
        return trackingandAllocationPreconditions;
    }

    public void setTrackingandAllocationAllocationSchedule(String trackingandAllocationAllocationSchedule) {
        this.trackingandAllocationAllocationSchedule = trackingandAllocationAllocationSchedule;
    }

    public String getTrackingandAllocationAllocationSchedule() {
        return trackingandAllocationAllocationSchedule;
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