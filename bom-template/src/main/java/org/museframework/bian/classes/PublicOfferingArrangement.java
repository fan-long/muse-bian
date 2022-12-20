/*A Service Arrangement which is promised and committed for the Public Offering*/
package org.museframework.bian.classes;

public class PublicOfferingArrangement {
    /**/
    private org.museframework.bian.enumerations.Publicofferingarrangementtypevalues publicOfferingArrangementType;

    public void setPublicOfferingArrangementType(org.museframework.bian.enumerations.Publicofferingarrangementtypevalues publicOfferingArrangementType) {
        this.publicOfferingArrangementType = publicOfferingArrangementType;
    }

    public org.museframework.bian.enumerations.Publicofferingarrangementtypevalues getPublicOfferingArrangementType() {
        return publicOfferingArrangementType;
    }
}