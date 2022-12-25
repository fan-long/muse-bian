/*Capture and maintain reference information about some type of entitity within Direct Debit Mandate.*/
package org.museframework.bian.dirdebman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.DirectDebitMandateDirectoryEntry
@MetaDto
public class DirectDebitMandateDirectoryEntry {
    /*Refers to the corporate entity related to this specific collection of customer mandates*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mandatedCustomerReference;

    /*Description of the purpose for this collection of customer mandates*/
    @MetaField(0)
    private String mandateDescription;

    /*The date and time the mandate collection is valid from to (allows for duration limits)*/
    @MetaField(0)
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