/*An arrangement within a Factoring Agreement*/
package org.museframework.bian.classes;

public class FactoringArrangement {
    /**/
    private org.museframework.bian.enumerations.Factoringarrangementtypevalues factoringArrangementType;

    public void setFactoringArrangementType(org.museframework.bian.enumerations.Factoringarrangementtypevalues factoringArrangementType) {
        this.factoringArrangementType = factoringArrangementType;
    }

    public org.museframework.bian.enumerations.Factoringarrangementtypevalues getFactoringArrangementType() {
        return factoringArrangementType;
    }
}