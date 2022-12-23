/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.accountsreceivable.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerNegotiation {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField
    private String customerNegotiationPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerNegotiationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField
    private String customerNegotiationWorkSchedule;

    /*The Accounts Receivable Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService paymentNegotation;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField
    private String customerNegotiationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String customerNegotiationPaymentNegotationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String customerNegotiationPaymentNegotationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String customerNegotiationPaymentNegotationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String customerNegotiationPaymentNegotationServiceWorkProduct;

    /**/
    @MetaField
    private String customerNegotiationPaymentNegotationServiceName;

    public void setCustomerNegotiationPreconditions(String customerNegotiationPreconditions) {
        this.customerNegotiationPreconditions = customerNegotiationPreconditions;
    }

    public String getCustomerNegotiationPreconditions() {
        return customerNegotiationPreconditions;
    }

    public void setCustomerNegotiationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object customerNegotiationBusinessUnitEmployeeReference) {
        this.customerNegotiationBusinessUnitEmployeeReference = customerNegotiationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCustomerNegotiationBusinessUnitEmployeeReference() {
        return customerNegotiationBusinessUnitEmployeeReference;
    }

    public void setCustomerNegotiationWorkSchedule(String customerNegotiationWorkSchedule) {
        this.customerNegotiationWorkSchedule = customerNegotiationWorkSchedule;
    }

    public String getCustomerNegotiationWorkSchedule() {
        return customerNegotiationWorkSchedule;
    }

    public void setPaymentNegotation(org.museframework.bian.classes.BusinessService paymentNegotation) {
        this.paymentNegotation = paymentNegotation;
    }

    public org.museframework.bian.classes.BusinessService getPaymentNegotation() {
        return paymentNegotation;
    }

    public void setCustomerNegotiationPostconditions(String customerNegotiationPostconditions) {
        this.customerNegotiationPostconditions = customerNegotiationPostconditions;
    }

    public String getCustomerNegotiationPostconditions() {
        return customerNegotiationPostconditions;
    }

    public void setCustomerNegotiationPaymentNegotationServiceType(String customerNegotiationPaymentNegotationServiceType) {
        this.customerNegotiationPaymentNegotationServiceType = customerNegotiationPaymentNegotationServiceType;
    }

    public String getCustomerNegotiationPaymentNegotationServiceType() {
        return customerNegotiationPaymentNegotationServiceType;
    }

    public void setCustomerNegotiationPaymentNegotationServiceDescription(String customerNegotiationPaymentNegotationServiceDescription) {
        this.customerNegotiationPaymentNegotationServiceDescription = customerNegotiationPaymentNegotationServiceDescription;
    }

    public String getCustomerNegotiationPaymentNegotationServiceDescription() {
        return customerNegotiationPaymentNegotationServiceDescription;
    }

    public void setCustomerNegotiationPaymentNegotationServiceInputsandOuputs(String customerNegotiationPaymentNegotationServiceInputsandOuputs) {
        this.customerNegotiationPaymentNegotationServiceInputsandOuputs = customerNegotiationPaymentNegotationServiceInputsandOuputs;
    }

    public String getCustomerNegotiationPaymentNegotationServiceInputsandOuputs() {
        return customerNegotiationPaymentNegotationServiceInputsandOuputs;
    }

    public void setCustomerNegotiationPaymentNegotationServiceWorkProduct(String customerNegotiationPaymentNegotationServiceWorkProduct) {
        this.customerNegotiationPaymentNegotationServiceWorkProduct = customerNegotiationPaymentNegotationServiceWorkProduct;
    }

    public String getCustomerNegotiationPaymentNegotationServiceWorkProduct() {
        return customerNegotiationPaymentNegotationServiceWorkProduct;
    }

    public void setCustomerNegotiationPaymentNegotationServiceName(String customerNegotiationPaymentNegotationServiceName) {
        this.customerNegotiationPaymentNegotationServiceName = customerNegotiationPaymentNegotationServiceName;
    }

    public String getCustomerNegotiationPaymentNegotationServiceName() {
        return customerNegotiationPaymentNegotationServiceName;
    }
}