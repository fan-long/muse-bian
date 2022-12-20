/*Role played by a party in the context of a specific mandate.*/
package org.museframework.bian.classes;

public class MandateInvolvement {
    /**/
    private String mandateInvolvementType;

    public void setMandateInvolvementType(String mandateInvolvementType) {
        this.mandateInvolvementType = mandateInvolvementType;
    }

    public String getMandateInvolvementType() {
        return mandateInvolvementType;
    }
}