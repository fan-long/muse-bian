/*The way in which a lien arrangement will be fulfilled. */
package org.museframework.bian.classes;

public class LienArrangementModality {
    /**/
    private org.museframework.bian.enumerations.Modalitytypevalues lienArrangementModalityType;

    /*Parameters to be used in the lien modalities*/
    private String lienArrangementModalityParameter;

    /*Guidelines to be used in the lien modalities*/
    private String lienArrangementModalityGuideline;

    /*Schedule to be used for in lien modalities*/
    private String lienArrangementModalitySchedule;

    public void setLienArrangementModalityType(org.museframework.bian.enumerations.Modalitytypevalues lienArrangementModalityType) {
        this.lienArrangementModalityType = lienArrangementModalityType;
    }

    public org.museframework.bian.enumerations.Modalitytypevalues getLienArrangementModalityType() {
        return lienArrangementModalityType;
    }

    public void setLienArrangementModalityParameter(String lienArrangementModalityParameter) {
        this.lienArrangementModalityParameter = lienArrangementModalityParameter;
    }

    public String getLienArrangementModalityParameter() {
        return lienArrangementModalityParameter;
    }

    public void setLienArrangementModalityGuideline(String lienArrangementModalityGuideline) {
        this.lienArrangementModalityGuideline = lienArrangementModalityGuideline;
    }

    public String getLienArrangementModalityGuideline() {
        return lienArrangementModalityGuideline;
    }

    public void setLienArrangementModalitySchedule(String lienArrangementModalitySchedule) {
        this.lienArrangementModalitySchedule = lienArrangementModalitySchedule;
    }

    public String getLienArrangementModalitySchedule() {
        return lienArrangementModalitySchedule;
    }
}