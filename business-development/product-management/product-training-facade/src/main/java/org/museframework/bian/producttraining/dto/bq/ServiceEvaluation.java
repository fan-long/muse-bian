/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.producttraining.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServiceEvaluation {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField
    private String serviceEvaluationPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object serviceEvaluationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField
    private String serviceEvaluationWorkSchedule;

    /*The Product Training Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService serviceEvaluation;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField
    private String serviceEvaluationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String serviceEvaluationServiceEvaluationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String serviceEvaluationServiceEvaluationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String serviceEvaluationServiceEvaluationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String serviceEvaluationServiceEvaluationServiceWorkProduct;

    /**/
    @MetaField
    private String serviceEvaluationServiceEvaluationServiceName;

    public void setServiceEvaluationPreconditions(String serviceEvaluationPreconditions) {
        this.serviceEvaluationPreconditions = serviceEvaluationPreconditions;
    }

    public String getServiceEvaluationPreconditions() {
        return serviceEvaluationPreconditions;
    }

    public void setServiceEvaluationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object serviceEvaluationBusinessUnitEmployeeReference) {
        this.serviceEvaluationBusinessUnitEmployeeReference = serviceEvaluationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getServiceEvaluationBusinessUnitEmployeeReference() {
        return serviceEvaluationBusinessUnitEmployeeReference;
    }

    public void setServiceEvaluationWorkSchedule(String serviceEvaluationWorkSchedule) {
        this.serviceEvaluationWorkSchedule = serviceEvaluationWorkSchedule;
    }

    public String getServiceEvaluationWorkSchedule() {
        return serviceEvaluationWorkSchedule;
    }

    public void setServiceEvaluation(org.museframework.bian.classes.BusinessService serviceEvaluation) {
        this.serviceEvaluation = serviceEvaluation;
    }

    public org.museframework.bian.classes.BusinessService getServiceEvaluation() {
        return serviceEvaluation;
    }

    public void setServiceEvaluationPostconditions(String serviceEvaluationPostconditions) {
        this.serviceEvaluationPostconditions = serviceEvaluationPostconditions;
    }

    public String getServiceEvaluationPostconditions() {
        return serviceEvaluationPostconditions;
    }

    public void setServiceEvaluationServiceEvaluationServiceType(String serviceEvaluationServiceEvaluationServiceType) {
        this.serviceEvaluationServiceEvaluationServiceType = serviceEvaluationServiceEvaluationServiceType;
    }

    public String getServiceEvaluationServiceEvaluationServiceType() {
        return serviceEvaluationServiceEvaluationServiceType;
    }

    public void setServiceEvaluationServiceEvaluationServiceDescription(String serviceEvaluationServiceEvaluationServiceDescription) {
        this.serviceEvaluationServiceEvaluationServiceDescription = serviceEvaluationServiceEvaluationServiceDescription;
    }

    public String getServiceEvaluationServiceEvaluationServiceDescription() {
        return serviceEvaluationServiceEvaluationServiceDescription;
    }

    public void setServiceEvaluationServiceEvaluationServiceInputsandOuputs(String serviceEvaluationServiceEvaluationServiceInputsandOuputs) {
        this.serviceEvaluationServiceEvaluationServiceInputsandOuputs = serviceEvaluationServiceEvaluationServiceInputsandOuputs;
    }

    public String getServiceEvaluationServiceEvaluationServiceInputsandOuputs() {
        return serviceEvaluationServiceEvaluationServiceInputsandOuputs;
    }

    public void setServiceEvaluationServiceEvaluationServiceWorkProduct(String serviceEvaluationServiceEvaluationServiceWorkProduct) {
        this.serviceEvaluationServiceEvaluationServiceWorkProduct = serviceEvaluationServiceEvaluationServiceWorkProduct;
    }

    public String getServiceEvaluationServiceEvaluationServiceWorkProduct() {
        return serviceEvaluationServiceEvaluationServiceWorkProduct;
    }

    public void setServiceEvaluationServiceEvaluationServiceName(String serviceEvaluationServiceEvaluationServiceName) {
        this.serviceEvaluationServiceEvaluationServiceName = serviceEvaluationServiceEvaluationServiceName;
    }

    public String getServiceEvaluationServiceEvaluationServiceName() {
        return serviceEvaluationServiceEvaluationServiceName;
    }
}