/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.parrefdatdir.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BankRelations {
    /*The type of relationship (e.g. relationship manager)*/
    @MetaField(0)
    private String bankRelationType;

    /*Reference to the associated employee or unit*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object businessUnitEmployeeReference;

    public void setBankRelationType(String bankRelationType) {
        this.bankRelationType = bankRelationType;
    }

    public String getBankRelationType() {
        return bankRelationType;
    }

    public void setBusinessUnitEmployeeReference(org.museframework.bian.classes.Object businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }
}