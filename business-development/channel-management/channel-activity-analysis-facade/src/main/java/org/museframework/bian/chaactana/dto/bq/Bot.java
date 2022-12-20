/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.chaactana.dto.bq;

public class Bot {
    /*Defines the intended analytical insights and required input data and outputs*/
    private String channelActivityBotDetectionAnalysisAlgorithmSpecification;

    /*Reference to output from the applied algorithm*/
    private org.museframework.bian.classes.Object channelActivityBotDetectionAnalysisReference;

    /*The output record from the analysis*/
    private String channelActivityBotDetectionAnalysisResult;

    public void setChannelActivityBotDetectionAnalysisAlgorithmSpecification(String channelActivityBotDetectionAnalysisAlgorithmSpecification) {
        this.channelActivityBotDetectionAnalysisAlgorithmSpecification = channelActivityBotDetectionAnalysisAlgorithmSpecification;
    }

    public String getChannelActivityBotDetectionAnalysisAlgorithmSpecification() {
        return channelActivityBotDetectionAnalysisAlgorithmSpecification;
    }

    public void setChannelActivityBotDetectionAnalysisReference(org.museframework.bian.classes.Object channelActivityBotDetectionAnalysisReference) {
        this.channelActivityBotDetectionAnalysisReference = channelActivityBotDetectionAnalysisReference;
    }

    public org.museframework.bian.classes.Object getChannelActivityBotDetectionAnalysisReference() {
        return channelActivityBotDetectionAnalysisReference;
    }

    public void setChannelActivityBotDetectionAnalysisResult(String channelActivityBotDetectionAnalysisResult) {
        this.channelActivityBotDetectionAnalysisResult = channelActivityBotDetectionAnalysisResult;
    }

    public String getChannelActivityBotDetectionAnalysisResult() {
        return channelActivityBotDetectionAnalysisResult;
    }
}