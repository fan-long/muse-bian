/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customercase.dto.bq;

public class Determination {
    /*Reference to the in-force customer master agreement*/
    private org.museframework.bian.classes.Object customerAgreementInstanceReference;

    /*The agreement is accessed to support the determination of the resolution approach*/
    private String customerAgreement;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    private String caseDeterminationWorkProduct;

    /*The outcome of the determination and resolution planning task*/
    private String caseDeterminationWorkTaskResult;

    public void setCustomerAgreementInstanceReference(org.museframework.bian.classes.Object customerAgreementInstanceReference) {
        this.customerAgreementInstanceReference = customerAgreementInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerAgreementInstanceReference() {
        return customerAgreementInstanceReference;
    }

    public void setCustomerAgreement(String customerAgreement) {
        this.customerAgreement = customerAgreement;
    }

    public String getCustomerAgreement() {
        return customerAgreement;
    }

    public void setCaseDeterminationWorkProduct(String caseDeterminationWorkProduct) {
        this.caseDeterminationWorkProduct = caseDeterminationWorkProduct;
    }

    public String getCaseDeterminationWorkProduct() {
        return caseDeterminationWorkProduct;
    }

    public void setCaseDeterminationWorkTaskResult(String caseDeterminationWorkTaskResult) {
        this.caseDeterminationWorkTaskResult = caseDeterminationWorkTaskResult;
    }

    public String getCaseDeterminationWorkTaskResult() {
        return caseDeterminationWorkTaskResult;
    }
}