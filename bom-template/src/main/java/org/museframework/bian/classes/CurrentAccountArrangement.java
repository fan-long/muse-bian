/*An arrangement within the current account agreement*/
package org.museframework.bian.classes;

public class CurrentAccountArrangement {
    /**/
    private org.museframework.bian.enumerations.Arrangementtypevalues currentAccountArrangementType;

    /*Reference to the product feature applied in this arrangement */
    private String currentAccountArrangementProductFeatureType;

    public void setCurrentAccountArrangementType(org.museframework.bian.enumerations.Arrangementtypevalues currentAccountArrangementType) {
        this.currentAccountArrangementType = currentAccountArrangementType;
    }

    public org.museframework.bian.enumerations.Arrangementtypevalues getCurrentAccountArrangementType() {
        return currentAccountArrangementType;
    }

    public void setCurrentAccountArrangementProductFeatureType(String currentAccountArrangementProductFeatureType) {
        this.currentAccountArrangementProductFeatureType = currentAccountArrangementProductFeatureType;
    }

    public String getCurrentAccountArrangementProductFeatureType() {
        return currentAccountArrangementProductFeatureType;
    }
}