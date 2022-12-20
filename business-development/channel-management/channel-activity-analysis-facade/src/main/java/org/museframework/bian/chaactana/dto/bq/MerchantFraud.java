/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.chaactana.dto.bq;

public class MerchantFraud {
    /*Defines the intended analytical insights and required input data and outputs*/
    private String channelActivityMerchantFraudAnalysisAlgorithmSpecification;

    /*Reference to output from the applied algorithm*/
    private org.museframework.bian.classes.Object channelActivityMerchantFraudAnalysisReference;

    /*The output record from the analysis*/
    private String channelActivityMerchantFraudAnalysisResult;

    public void setChannelActivityMerchantFraudAnalysisAlgorithmSpecification(String channelActivityMerchantFraudAnalysisAlgorithmSpecification) {
        this.channelActivityMerchantFraudAnalysisAlgorithmSpecification = channelActivityMerchantFraudAnalysisAlgorithmSpecification;
    }

    public String getChannelActivityMerchantFraudAnalysisAlgorithmSpecification() {
        return channelActivityMerchantFraudAnalysisAlgorithmSpecification;
    }

    public void setChannelActivityMerchantFraudAnalysisReference(org.museframework.bian.classes.Object channelActivityMerchantFraudAnalysisReference) {
        this.channelActivityMerchantFraudAnalysisReference = channelActivityMerchantFraudAnalysisReference;
    }

    public org.museframework.bian.classes.Object getChannelActivityMerchantFraudAnalysisReference() {
        return channelActivityMerchantFraudAnalysisReference;
    }

    public void setChannelActivityMerchantFraudAnalysisResult(String channelActivityMerchantFraudAnalysisResult) {
        this.channelActivityMerchantFraudAnalysisResult = channelActivityMerchantFraudAnalysisResult;
    }

    public String getChannelActivityMerchantFraudAnalysisResult() {
        return channelActivityMerchantFraudAnalysisResult;
    }
}