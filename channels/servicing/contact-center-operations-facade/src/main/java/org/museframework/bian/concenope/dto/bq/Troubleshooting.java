/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.concenope.dto.bq;

public class Troubleshooting extends org.museframework.bian.classes.Troubleshooting {
    /*A record of any production issues arising during the session (see Advanced Voice Channel Operations for detailed content)*/
    private String contactCenterProductionIssueRecord;

    /*A record of the root cause analysis for recurring issues and suggested remedial action*/
    private String contactCenterIssueAnalysisAndRecommendedResponse;

    public void setContactCenterProductionIssueRecord(String contactCenterProductionIssueRecord) {
        this.contactCenterProductionIssueRecord = contactCenterProductionIssueRecord;
    }

    public String getContactCenterProductionIssueRecord() {
        return contactCenterProductionIssueRecord;
    }

    public void setContactCenterIssueAnalysisAndRecommendedResponse(String contactCenterIssueAnalysisAndRecommendedResponse) {
        this.contactCenterIssueAnalysisAndRecommendedResponse = contactCenterIssueAnalysisAndRecommendedResponse;
    }

    public String getContactCenterIssueAnalysisAndRecommendedResponse() {
        return contactCenterIssueAnalysisAndRecommendedResponse;
    }
}