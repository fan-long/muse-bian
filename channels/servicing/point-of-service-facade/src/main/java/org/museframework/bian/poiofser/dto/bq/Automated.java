/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.poiofser.dto.bq;

public class Automated {
    /*The business unit responsible for the automated service*/
    private org.museframework.bian.classes.Object businessUnitReference;

    public void setBusinessUnitReference(org.museframework.bian.classes.Object businessUnitReference) {
        this.businessUnitReference = businessUnitReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitReference() {
        return businessUnitReference;
    }
}