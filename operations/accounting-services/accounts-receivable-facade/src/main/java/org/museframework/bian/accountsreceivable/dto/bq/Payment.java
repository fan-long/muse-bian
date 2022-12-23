/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.accountsreceivable.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Payment {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField
    private String paymentPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField
    private String paymentWorkSchedule;

    /*The Accounts Receivable Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField
    private String paymentPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String paymentServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String paymentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String paymentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String paymentServiceWorkProduct;

    /**/
    @MetaField
    private String paymentServiceName;

    public void setPaymentPreconditions(String paymentPreconditions) {
        this.paymentPreconditions = paymentPreconditions;
    }

    public String getPaymentPreconditions() {
        return paymentPreconditions;
    }

    public void setPaymentBusinessUnitEmployeeReference(org.museframework.bian.classes.Object paymentBusinessUnitEmployeeReference) {
        this.paymentBusinessUnitEmployeeReference = paymentBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getPaymentBusinessUnitEmployeeReference() {
        return paymentBusinessUnitEmployeeReference;
    }

    public void setPaymentWorkSchedule(String paymentWorkSchedule) {
        this.paymentWorkSchedule = paymentWorkSchedule;
    }

    public String getPaymentWorkSchedule() {
        return paymentWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPaymentPostconditions(String paymentPostconditions) {
        this.paymentPostconditions = paymentPostconditions;
    }

    public String getPaymentPostconditions() {
        return paymentPostconditions;
    }

    public void setPaymentServiceType(String paymentServiceType) {
        this.paymentServiceType = paymentServiceType;
    }

    public String getPaymentServiceType() {
        return paymentServiceType;
    }

    public void setPaymentServiceDescription(String paymentServiceDescription) {
        this.paymentServiceDescription = paymentServiceDescription;
    }

    public String getPaymentServiceDescription() {
        return paymentServiceDescription;
    }

    public void setPaymentServiceInputsandOuputs(String paymentServiceInputsandOuputs) {
        this.paymentServiceInputsandOuputs = paymentServiceInputsandOuputs;
    }

    public String getPaymentServiceInputsandOuputs() {
        return paymentServiceInputsandOuputs;
    }

    public void setPaymentServiceWorkProduct(String paymentServiceWorkProduct) {
        this.paymentServiceWorkProduct = paymentServiceWorkProduct;
    }

    public String getPaymentServiceWorkProduct() {
        return paymentServiceWorkProduct;
    }

    public void setPaymentServiceName(String paymentServiceName) {
        this.paymentServiceName = paymentServiceName;
    }

    public String getPaymentServiceName() {
        return paymentServiceName;
    }
}