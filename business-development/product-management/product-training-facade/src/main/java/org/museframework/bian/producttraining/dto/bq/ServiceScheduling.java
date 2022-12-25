/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.producttraining.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServiceScheduling {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(0)
    private String serviceSchedulingPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object serviceSchedulingBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String serviceSchedulingWorkSchedule;

    /*The Product Training Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService serviceScheduling;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(0)
    private String serviceSchedulingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String serviceSchedulingServiceSchedulingServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String serviceSchedulingServiceSchedulingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String serviceSchedulingServiceSchedulingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String serviceSchedulingServiceSchedulingServiceWorkProduct;

    /**/
    @MetaField(0)
    private String serviceSchedulingServiceSchedulingServiceName;

    public void setServiceSchedulingPreconditions(String serviceSchedulingPreconditions) {
        this.serviceSchedulingPreconditions = serviceSchedulingPreconditions;
    }

    public String getServiceSchedulingPreconditions() {
        return serviceSchedulingPreconditions;
    }

    public void setServiceSchedulingBusinessUnitEmployeeReference(org.museframework.bian.classes.Object serviceSchedulingBusinessUnitEmployeeReference) {
        this.serviceSchedulingBusinessUnitEmployeeReference = serviceSchedulingBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getServiceSchedulingBusinessUnitEmployeeReference() {
        return serviceSchedulingBusinessUnitEmployeeReference;
    }

    public void setServiceSchedulingWorkSchedule(String serviceSchedulingWorkSchedule) {
        this.serviceSchedulingWorkSchedule = serviceSchedulingWorkSchedule;
    }

    public String getServiceSchedulingWorkSchedule() {
        return serviceSchedulingWorkSchedule;
    }

    public void setServiceScheduling(org.museframework.bian.classes.BusinessService serviceScheduling) {
        this.serviceScheduling = serviceScheduling;
    }

    public org.museframework.bian.classes.BusinessService getServiceScheduling() {
        return serviceScheduling;
    }

    public void setServiceSchedulingPostconditions(String serviceSchedulingPostconditions) {
        this.serviceSchedulingPostconditions = serviceSchedulingPostconditions;
    }

    public String getServiceSchedulingPostconditions() {
        return serviceSchedulingPostconditions;
    }

    public void setServiceSchedulingServiceSchedulingServiceType(String serviceSchedulingServiceSchedulingServiceType) {
        this.serviceSchedulingServiceSchedulingServiceType = serviceSchedulingServiceSchedulingServiceType;
    }

    public String getServiceSchedulingServiceSchedulingServiceType() {
        return serviceSchedulingServiceSchedulingServiceType;
    }

    public void setServiceSchedulingServiceSchedulingServiceDescription(String serviceSchedulingServiceSchedulingServiceDescription) {
        this.serviceSchedulingServiceSchedulingServiceDescription = serviceSchedulingServiceSchedulingServiceDescription;
    }

    public String getServiceSchedulingServiceSchedulingServiceDescription() {
        return serviceSchedulingServiceSchedulingServiceDescription;
    }

    public void setServiceSchedulingServiceSchedulingServiceInputsandOuputs(String serviceSchedulingServiceSchedulingServiceInputsandOuputs) {
        this.serviceSchedulingServiceSchedulingServiceInputsandOuputs = serviceSchedulingServiceSchedulingServiceInputsandOuputs;
    }

    public String getServiceSchedulingServiceSchedulingServiceInputsandOuputs() {
        return serviceSchedulingServiceSchedulingServiceInputsandOuputs;
    }

    public void setServiceSchedulingServiceSchedulingServiceWorkProduct(String serviceSchedulingServiceSchedulingServiceWorkProduct) {
        this.serviceSchedulingServiceSchedulingServiceWorkProduct = serviceSchedulingServiceSchedulingServiceWorkProduct;
    }

    public String getServiceSchedulingServiceSchedulingServiceWorkProduct() {
        return serviceSchedulingServiceSchedulingServiceWorkProduct;
    }

    public void setServiceSchedulingServiceSchedulingServiceName(String serviceSchedulingServiceSchedulingServiceName) {
        this.serviceSchedulingServiceSchedulingServiceName = serviceSchedulingServiceSchedulingServiceName;
    }

    public String getServiceSchedulingServiceSchedulingServiceName() {
        return serviceSchedulingServiceSchedulingServiceName;
    }
}