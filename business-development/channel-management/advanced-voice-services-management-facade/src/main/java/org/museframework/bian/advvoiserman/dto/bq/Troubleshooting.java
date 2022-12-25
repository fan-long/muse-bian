/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.advvoiserman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Troubleshooting
@MetaDto
public class Troubleshooting {
    /*A record of any production issues arising during the session (see Advanced Voice Channel Operations for detailed content)*/
    @MetaField(0)
    private String VChannelProductionIssueRecord;

    /*A record of the root cause analysis for recurring issues and suggested remedial action*/
    @MetaField(0)
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