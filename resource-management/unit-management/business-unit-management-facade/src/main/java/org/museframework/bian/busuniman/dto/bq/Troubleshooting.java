/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.busuniman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Troubleshooting
@MetaDto
public class Troubleshooting {
    /*A record of any production issues arising during the session (see Advanced Voice Channel Operations for detailed content)*/
    @MetaField(0)
    private String businessUnitProductionIssueRecord;

    /*A record of the root cause analysis for recurring issues and suggested remedial action that can be internal to the unit or recommended to service providers and subscribers as appropriate*/
    @MetaField(0)
    private String businessUnitIssueAnalysisAndRecommendedResponse;

    public void setBusinessUnitProductionIssueRecord(String businessUnitProductionIssueRecord) {
        this.businessUnitProductionIssueRecord = businessUnitProductionIssueRecord;
    }

    public String getBusinessUnitProductionIssueRecord() {
        return businessUnitProductionIssueRecord;
    }

    public void setBusinessUnitIssueAnalysisAndRecommendedResponse(String businessUnitIssueAnalysisAndRecommendedResponse) {
        this.businessUnitIssueAnalysisAndRecommendedResponse = businessUnitIssueAnalysisAndRecommendedResponse;
    }

    public String getBusinessUnitIssueAnalysisAndRecommendedResponse() {
        return businessUnitIssueAnalysisAndRecommendedResponse;
    }
}