/*A specific role of a specific Party involved in the customer contact.*/
package org.museframework.bian.classes;

public class ContactInvolvement {
    /**/
    private String contactInvolvementType;

    public void setContactInvolvementType(String contactInvolvementType) {
        this.contactInvolvementType = contactInvolvementType;
    }

    public String getContactInvolvementType() {
        return contactInvolvementType;
    }
}