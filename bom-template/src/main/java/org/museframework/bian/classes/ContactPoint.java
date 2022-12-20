/*Number, physical or virtual address, used for communication.*/
package org.museframework.bian.classes;

public class ContactPoint {
    /**/
    private org.museframework.bian.enumerations.Contactpointtypevalues contactPointType;

    public void setContactPointType(org.museframework.bian.enumerations.Contactpointtypevalues contactPointType) {
        this.contactPointType = contactPointType;
    }

    public org.museframework.bian.enumerations.Contactpointtypevalues getContactPointType() {
        return contactPointType;
    }
}