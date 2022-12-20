/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Fraud Resolution. */
package org.museframework.bian.fraudresolution.dto.cr;

public class FraudResolutionProcedure {
    /*Type of case (e.g.  disputed charge, merchant fraud, stolen/fake device)*/
    private String fraudCaseType;

    /*Reference to the product/service associated with case*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the customer associated with case if applicable*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the merchant associated with case if applicable*/
    private org.museframework.bian.classes.Object merchantReference;

    /*Reference to any other interested parties (such as intermediaries)*/
    private org.museframework.bian.classes.Object interstedPartyReference;

    /*Customer contact reference if the case was raised during a customer contact*/
    private org.museframework.bian.classes.Object contactReference;

    /*Reference to one or more product transactions associated with the case*/
    private org.museframework.bian.classes.Object transactionReference;

    /*Record contains all details of the transaction (not itemized)*/
    private String transactionRecord;

    /*Record of a physical address or electronic venue the fraud was detected*/
    private String caseLocation;

    /*Specific dates and ties of significance to the case*/
    private String date;

    /*Business unit and or employee reference where the case was raised*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*File of consolidated notes, forms and documents for the case*/
    private String fraudCaseWorkProducts;

    /*Target and actual dates for case processing/resolution*/
    private String fraudCaseResolutionSchedule;

    /*The processing status for the case*/
    private String fraudCaseStatus;

    public void setFraudCaseType(String fraudCaseType) {
        this.fraudCaseType = fraudCaseType;
    }

    public String getFraudCaseType() {
        return fraudCaseType;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setMerchantReference(org.museframework.bian.classes.Object merchantReference) {
        this.merchantReference = merchantReference;
    }

    public org.museframework.bian.classes.Object getMerchantReference() {
        return merchantReference;
    }

    public void setInterstedPartyReference(org.museframework.bian.classes.Object interstedPartyReference) {
        this.interstedPartyReference = interstedPartyReference;
    }

    public org.museframework.bian.classes.Object getInterstedPartyReference() {
        return interstedPartyReference;
    }

    public void setContactReference(org.museframework.bian.classes.Object contactReference) {
        this.contactReference = contactReference;
    }

    public org.museframework.bian.classes.Object getContactReference() {
        return contactReference;
    }

    public void setTransactionReference(org.museframework.bian.classes.Object transactionReference) {
        this.transactionReference = transactionReference;
    }

    public org.museframework.bian.classes.Object getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionRecord(String transactionRecord) {
        this.transactionRecord = transactionRecord;
    }

    public String getTransactionRecord() {
        return transactionRecord;
    }

    public void setCaseLocation(String caseLocation) {
        this.caseLocation = caseLocation;
    }

    public String getCaseLocation() {
        return caseLocation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setFraudCaseWorkProducts(String fraudCaseWorkProducts) {
        this.fraudCaseWorkProducts = fraudCaseWorkProducts;
    }

    public String getFraudCaseWorkProducts() {
        return fraudCaseWorkProducts;
    }

    public void setFraudCaseResolutionSchedule(String fraudCaseResolutionSchedule) {
        this.fraudCaseResolutionSchedule = fraudCaseResolutionSchedule;
    }

    public String getFraudCaseResolutionSchedule() {
        return fraudCaseResolutionSchedule;
    }

    public void setFraudCaseStatus(String fraudCaseStatus) {
        this.fraudCaseStatus = fraudCaseStatus;
    }

    public String getFraudCaseStatus() {
        return fraudCaseStatus;
    }
}