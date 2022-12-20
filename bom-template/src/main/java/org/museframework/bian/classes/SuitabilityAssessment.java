/*An assessment to confirm that all involved counterparties are suitable for a proposed market trade.*/
package org.museframework.bian.classes;

public class SuitabilityAssessment {
    /**/
    private String suitabilityAssessmentType;

    /**/
    private String suitabilityAssessmentDocument;

    /**/
    private String suitabilityAssessmentCorrespondence;

    /**/
    private String suitabilityAssessmentResult;

    public void setSuitabilityAssessmentType(String suitabilityAssessmentType) {
        this.suitabilityAssessmentType = suitabilityAssessmentType;
    }

    public String getSuitabilityAssessmentType() {
        return suitabilityAssessmentType;
    }

    public void setSuitabilityAssessmentDocument(String suitabilityAssessmentDocument) {
        this.suitabilityAssessmentDocument = suitabilityAssessmentDocument;
    }

    public String getSuitabilityAssessmentDocument() {
        return suitabilityAssessmentDocument;
    }

    public void setSuitabilityAssessmentCorrespondence(String suitabilityAssessmentCorrespondence) {
        this.suitabilityAssessmentCorrespondence = suitabilityAssessmentCorrespondence;
    }

    public String getSuitabilityAssessmentCorrespondence() {
        return suitabilityAssessmentCorrespondence;
    }

    public void setSuitabilityAssessmentResult(String suitabilityAssessmentResult) {
        this.suitabilityAssessmentResult = suitabilityAssessmentResult;
    }

    public String getSuitabilityAssessmentResult() {
        return suitabilityAssessmentResult;
    }
}