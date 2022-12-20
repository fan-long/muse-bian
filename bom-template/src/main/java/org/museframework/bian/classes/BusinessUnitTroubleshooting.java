/*Direct the resolution of and assess major production issues. Amend the unit operating set-up and operational procedures/priorities as necessary*/
package org.museframework.bian.classes;

public class BusinessUnitTroubleshooting {
    /**/
    private String businessUnitProductionIssue;

    /**/
    private String businessUnitIssueRecommendation;

    public void setBusinessUnitProductionIssue(String businessUnitProductionIssue) {
        this.businessUnitProductionIssue = businessUnitProductionIssue;
    }

    public String getBusinessUnitProductionIssue() {
        return businessUnitProductionIssue;
    }

    public void setBusinessUnitIssueRecommendation(String businessUnitIssueRecommendation) {
        this.businessUnitIssueRecommendation = businessUnitIssueRecommendation;
    }

    public String getBusinessUnitIssueRecommendation() {
        return businessUnitIssueRecommendation;
    }
}