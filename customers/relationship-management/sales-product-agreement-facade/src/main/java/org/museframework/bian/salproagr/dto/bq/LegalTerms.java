/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.salproagr.dto.bq;

public class LegalTerms {
    /*The legal jurisdiction*/
    private String jurisdiction;

    /*Reference to any legal requirements*/
    private org.museframework.bian.classes.Object applicableLawReference;

    /*Explanation or interpretation of the law as applied*/
    private String applicableLawInterpretation;

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setApplicableLawReference(org.museframework.bian.classes.Object applicableLawReference) {
        this.applicableLawReference = applicableLawReference;
    }

    public org.museframework.bian.classes.Object getApplicableLawReference() {
        return applicableLawReference;
    }

    public void setApplicableLawInterpretation(String applicableLawInterpretation) {
        this.applicableLawInterpretation = applicableLawInterpretation;
    }

    public String getApplicableLawInterpretation() {
        return applicableLawInterpretation;
    }
}