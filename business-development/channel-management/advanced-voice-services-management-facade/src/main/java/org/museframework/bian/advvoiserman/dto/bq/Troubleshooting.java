/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.advvoiserman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Troubleshooting extends org.museframework.bian.classes.Troubleshooting {
    /*A record of any production issues arising during the session (see Advanced Voice Channel Operations for detailed content)*/
    @MetaField
    private String VChannelProductionIssueRecord;

    /*A record of the root cause analysis for recurring issues and suggested remedial action*/
    @MetaField
    private String VChannelIssueAnalysisAndRecommendedResponse;

    public void setVChannelProductionIssueRecord(String VChannelProductionIssueRecord) {
        this.VChannelProductionIssueRecord = VChannelProductionIssueRecord;
    }

    public String getVChannelProductionIssueRecord() {
        return VChannelProductionIssueRecord;
    }

    public void setVChannelIssueAnalysisAndRecommendedResponse(String VChannelIssueAnalysisAndRecommendedResponse) {
        this.VChannelIssueAnalysisAndRecommendedResponse = VChannelIssueAnalysisAndRecommendedResponse;
    }

    public String getVChannelIssueAnalysisAndRecommendedResponse() {
        return VChannelIssueAnalysisAndRecommendedResponse;
    }
}