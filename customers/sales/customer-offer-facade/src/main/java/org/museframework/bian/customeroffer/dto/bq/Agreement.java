/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

public class Agreement extends org.museframework.bian.classes.Agreement {
    /*Reference to the associated master agreement that is accessed during the offer procedure*/
    private org.museframework.bian.classes.Object customerAgreementInstanceReference;

    /*Reference to the product specific agreement that is set-up as a result of the offer procedure (when successful)*/
    private org.museframework.bian.classes.Object salesProductAgreementInstanceReference;

    public void setCustomerAgreementInstanceReference(org.museframework.bian.classes.Object customerAgreementInstanceReference) {
        this.customerAgreementInstanceReference = customerAgreementInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerAgreementInstanceReference() {
        return customerAgreementInstanceReference;
    }

    public void setSalesProductAgreementInstanceReference(org.museframework.bian.classes.Object salesProductAgreementInstanceReference) {
        this.salesProductAgreementInstanceReference = salesProductAgreementInstanceReference;
    }

    public org.museframework.bian.classes.Object getSalesProductAgreementInstanceReference() {
        return salesProductAgreementInstanceReference;
    }
}