/*Arrangement within a Letter of Credit Agreement*/
package org.museframework.bian.classes;

public class LetterOfCreditArrangement {
    /**/
    private org.museframework.bian.enumerations.Letterofcreditarrangementtypevalues letterOfCreditArrangementType;

    /*Amount of the letter/documentary credit (ISO20022)
*/
    private String letterOfCreditAmount;

    /**/
    private String letterOfCreditArrangementValidityPeriod;

    public void setLetterOfCreditArrangementType(org.museframework.bian.enumerations.Letterofcreditarrangementtypevalues letterOfCreditArrangementType) {
        this.letterOfCreditArrangementType = letterOfCreditArrangementType;
    }

    public org.museframework.bian.enumerations.Letterofcreditarrangementtypevalues getLetterOfCreditArrangementType() {
        return letterOfCreditArrangementType;
    }

    public void setLetterOfCreditAmount(String letterOfCreditAmount) {
        this.letterOfCreditAmount = letterOfCreditAmount;
    }

    public String getLetterOfCreditAmount() {
        return letterOfCreditAmount;
    }

    public void setLetterOfCreditArrangementValidityPeriod(String letterOfCreditArrangementValidityPeriod) {
        this.letterOfCreditArrangementValidityPeriod = letterOfCreditArrangementValidityPeriod;
    }

    public String getLetterOfCreditArrangementValidityPeriod() {
        return letterOfCreditArrangementValidityPeriod;
    }
}