/*Capture and maintain reference information about some type of entitity within Direct Debit Mandate.*/
package org.museframework.bian.dirdebman.dto.cr;

public class DirectDebitMandateDirectoryEntry extends org.museframework.bian.classes.DirectDebitMandateDirectoryEntry {
    /*Refers to the corporate entity related to this specific collection of customer mandates*/
    private org.museframework.bian.classes.Object mandatedCustomerReference;

    /*Description of the purpose for this collection of customer mandates*/
    private String mandateDescription;

    /*The date and time the mandate collection is valid from to (allows for duration limits)*/
    private String mandateCollectionValidPeriod;

    public void setMandatedCustomerReference(org.museframework.bian.classes.Object mandatedCustomerReference) {
        this.mandatedCustomerReference = mandatedCustomerReference;
    }

    public org.museframework.bian.classes.Object getMandatedCustomerReference() {
        return mandatedCustomerReference;
    }

    public void setMandateDescription(String mandateDescription) {
        this.mandateDescription = mandateDescription;
    }

    public String getMandateDescription() {
        return mandateDescription;
    }

    public void setMandateCollectionValidPeriod(String mandateCollectionValidPeriod) {
        this.mandateCollectionValidPeriod = mandateCollectionValidPeriod;
    }

    public String getMandateCollectionValidPeriod() {
        return mandateCollectionValidPeriod;
    }
}