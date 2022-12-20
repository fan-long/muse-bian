/*An evaluation by which an individual or an institution undertakes the risk associated with a loan, an insurance, or an investment.
*/
package org.museframework.bian.classes;

public class UnderwritingAssessment {
    /*Identifier of the underwriting process.*/
    private String underwritingAssessmentIdentifier;

    /*Result of the underwriting process.*/
    private String underwritingAssessmentResult;

    /**/
    private String underwritingAssessmentDocument;

    public void setUnderwritingAssessmentIdentifier(String underwritingAssessmentIdentifier) {
        this.underwritingAssessmentIdentifier = underwritingAssessmentIdentifier;
    }

    public String getUnderwritingAssessmentIdentifier() {
        return underwritingAssessmentIdentifier;
    }

    public void setUnderwritingAssessmentResult(String underwritingAssessmentResult) {
        this.underwritingAssessmentResult = underwritingAssessmentResult;
    }

    public String getUnderwritingAssessmentResult() {
        return underwritingAssessmentResult;
    }

    public void setUnderwritingAssessmentDocument(String underwritingAssessmentDocument) {
        this.underwritingAssessmentDocument = underwritingAssessmentDocument;
    }

    public String getUnderwritingAssessmentDocument() {
        return underwritingAssessmentDocument;
    }
}