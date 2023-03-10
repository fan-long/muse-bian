/*Analyze the performance or behavior of some on-going activity or entity  within Channel Activity Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.chaactana.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ChannelActivityAnalysis
@MetaDto
public class ChannelActivityAnalysis {
    /*The type of channel for which the analysis is performed*/
    @MetaField(0)
    private String channelType;

    /*The period covered by the analysis (from to date time)*/
    @MetaField(0)
    private String channelActivityAnalysisPeriod;

    /*The type of analysis, can combine multiple (e.g. customer fraud, merchant fraud)*/
    @MetaField(0)
    private String channelActivityAnalysisType;

    /*The result of the analysis*/
    @MetaField(0)
    private String channelActivityAnalysisResult;

    /*A report combining the results of the analysis in a consumable format*/
    @MetaField(0)
    private String channelActivityAnalysisRecord;

    /*The raw data used in the analysis (retrieved from Channel Activity History)*/
    @MetaField(0)
    private String channelActivityHistoryReport;

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelActivityAnalysisPeriod(String channelActivityAnalysisPeriod) {
        this.channelActivityAnalysisPeriod = channelActivityAnalysisPeriod;
    }

    public String getChannelActivityAnalysisPeriod() {
        return channelActivityAnalysisPeriod;
    }

    public void setChannelActivityAnalysisType(String channelActivityAnalysisType) {
        this.channelActivityAnalysisType = channelActivityAnalysisType;
    }

    public String getChannelActivityAnalysisType() {
        return channelActivityAnalysisType;
    }

    public void setChannelActivityAnalysisResult(String channelActivityAnalysisResult) {
        this.channelActivityAnalysisResult = channelActivityAnalysisResult;
    }

    public String getChannelActivityAnalysisResult() {
        return channelActivityAnalysisResult;
    }

    public void setChannelActivityAnalysisRecord(String channelActivityAnalysisRecord) {
        this.channelActivityAnalysisRecord = channelActivityAnalysisRecord;
    }

    public String getChannelActivityAnalysisRecord() {
        return channelActivityAnalysisRecord;
    }

    public void setChannelActivityHistoryReport(String channelActivityHistoryReport) {
        this.channelActivityHistoryReport = channelActivityHistoryReport;
    }

    public String getChannelActivityHistoryReport() {
        return channelActivityHistoryReport;
    }
}