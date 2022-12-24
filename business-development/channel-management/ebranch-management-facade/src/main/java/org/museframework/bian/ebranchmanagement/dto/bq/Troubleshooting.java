/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.ebranchmanagement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Troubleshooting
@MetaDto
public class Troubleshooting {
    /*A record of any production issues arising during the session (see E-Branch Operations for detailed content)*/
    @MetaField
    private String eBranchChannelProductionIssueRecord;

    /*A record of the root cause analysis for recurring issues and suggested remedial action*/
    @MetaField
    private String eBranchChannelIssueAnalysisAndRecommendedResponse;

    public void seteBranchChannelProductionIssueRecord(String eBranchChannelProductionIssueRecord) {
        this.eBranchChannelProductionIssueRecord = eBranchChannelProductionIssueRecord;
    }

    public String geteBranchChannelProductionIssueRecord() {
        return eBranchChannelProductionIssueRecord;
    }

    public void seteBranchChannelIssueAnalysisAndRecommendedResponse(String eBranchChannelIssueAnalysisAndRecommendedResponse) {
        this.eBranchChannelIssueAnalysisAndRecommendedResponse = eBranchChannelIssueAnalysisAndRecommendedResponse;
    }

    public String geteBranchChannelIssueAnalysisAndRecommendedResponse() {
        return eBranchChannelIssueAnalysisAndRecommendedResponse;
    }
}