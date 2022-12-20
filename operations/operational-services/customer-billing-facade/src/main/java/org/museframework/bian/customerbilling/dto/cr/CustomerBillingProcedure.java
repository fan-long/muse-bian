/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Customer Billing. */
package org.museframework.bian.customerbilling.dto.cr;

public class CustomerBillingProcedure {
    /*The type of customer billing (e.g. product fees, penalties)*/
    private String customerBillingTransactionType;

    /*Description that annotates the bill as appropriate*/
    private String customerBillingTransactionDescription;

    /*Reference to the customer for the billing*/
    private org.museframework.bian.classes.Object customerReference;

    /*The product instance associated with the charge*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The agreement covering the product arrangement (referenced for any specific billing terms and conditions)*/
    private org.museframework.bian.classes.Object customerAgreementReference;

    /*Breakdown and description of the billed service or activities*/
    private String customerBillingProductandServiceActionDescription;

    /*The legal entity being charged (will usually be the customer)*/
    private String customerBillingParty;

    /*The billing address (can be an electronic location*/
    private String customerBillingAddress;

    /*The billing period is appropriate (e.g. for an on-going service)*/
    private String customerBillingPeriod;

    /*The itemized breakdown of the charges with references*/
    private String customerBillingStatement;

    /*The total amount due*/
    private String customerBillingAmount;

    /*The due date for payment*/
    private String customerBillingPaymentDueDate;

    /*The payment details (e.g. payment account)*/
    private String customerBillingPaymentDetails;

    /*The target and actual billing activities and dates*/
    private String customerBillingPaymentSchedule;

    public void setCustomerBillingTransactionType(String customerBillingTransactionType) {
        this.customerBillingTransactionType = customerBillingTransactionType;
    }

    public String getCustomerBillingTransactionType() {
        return customerBillingTransactionType;
    }

    public void setCustomerBillingTransactionDescription(String customerBillingTransactionDescription) {
        this.customerBillingTransactionDescription = customerBillingTransactionDescription;
    }

    public String getCustomerBillingTransactionDescription() {
        return customerBillingTransactionDescription;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerAgreementReference(org.museframework.bian.classes.Object customerAgreementReference) {
        this.customerAgreementReference = customerAgreementReference;
    }

    public org.museframework.bian.classes.Object getCustomerAgreementReference() {
        return customerAgreementReference;
    }

    public void setCustomerBillingProductandServiceActionDescription(String customerBillingProductandServiceActionDescription) {
        this.customerBillingProductandServiceActionDescription = customerBillingProductandServiceActionDescription;
    }

    public String getCustomerBillingProductandServiceActionDescription() {
        return customerBillingProductandServiceActionDescription;
    }

    public void setCustomerBillingParty(String customerBillingParty) {
        this.customerBillingParty = customerBillingParty;
    }

    public String getCustomerBillingParty() {
        return customerBillingParty;
    }

    public void setCustomerBillingAddress(String customerBillingAddress) {
        this.customerBillingAddress = customerBillingAddress;
    }

    public String getCustomerBillingAddress() {
        return customerBillingAddress;
    }

    public void setCustomerBillingPeriod(String customerBillingPeriod) {
        this.customerBillingPeriod = customerBillingPeriod;
    }

    public String getCustomerBillingPeriod() {
        return customerBillingPeriod;
    }

    public void setCustomerBillingStatement(String customerBillingStatement) {
        this.customerBillingStatement = customerBillingStatement;
    }

    public String getCustomerBillingStatement() {
        return customerBillingStatement;
    }

    public void setCustomerBillingAmount(String customerBillingAmount) {
        this.customerBillingAmount = customerBillingAmount;
    }

    public String getCustomerBillingAmount() {
        return customerBillingAmount;
    }

    public void setCustomerBillingPaymentDueDate(String customerBillingPaymentDueDate) {
        this.customerBillingPaymentDueDate = customerBillingPaymentDueDate;
    }

    public String getCustomerBillingPaymentDueDate() {
        return customerBillingPaymentDueDate;
    }

    public void setCustomerBillingPaymentDetails(String customerBillingPaymentDetails) {
        this.customerBillingPaymentDetails = customerBillingPaymentDetails;
    }

    public String getCustomerBillingPaymentDetails() {
        return customerBillingPaymentDetails;
    }

    public void setCustomerBillingPaymentSchedule(String customerBillingPaymentSchedule) {
        this.customerBillingPaymentSchedule = customerBillingPaymentSchedule;
    }

    public String getCustomerBillingPaymentSchedule() {
        return customerBillingPaymentSchedule;
    }
}