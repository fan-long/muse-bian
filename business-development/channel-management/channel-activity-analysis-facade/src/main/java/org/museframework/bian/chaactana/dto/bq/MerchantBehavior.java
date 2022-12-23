/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.chaactana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MerchantBehavior {
    /*Defines the intended analytical insights and required input data and outputs*/
    @MetaField
    private String channelActivityMerchantBehaviorAnalysisAlgorithmSpecification;

    /*Reference to output from the applied algorithm*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object channelActivityMerchantBehaviorAnalysisReference;

    /*The output record from the analysis*/
    @MetaField
    private String channelActivityMerchantBehaviorAnalysisResult;

    public void setChannelActivityMerchantBehaviorAnalysisAlgorithmSpecification(String channelActivityMerchantBehaviorAnalysisAlgorithmSpecification) {
        this.channelActivityMerchantBehaviorAnalysisAlgorithmSpecification = channelActivityMerchantBehaviorAnalysisAlgorithmSpecification;
    }

    public String getChannelActivityMerchantBehaviorAnalysisAlgorithmSpecification() {
        return channelActivityMerchantBehaviorAnalysisAlgorithmSpecification;
    }

    public void setChannelActivityMerchantBehaviorAnalysisReference(org.museframework.bian.classes.Object channelActivityMerchantBehaviorAnalysisReference) {
        this.channelActivityMerchantBehaviorAnalysisReference = channelActivityMerchantBehaviorAnalysisReference;
    }

    public org.museframework.bian.classes.Object getChannelActivityMerchantBehaviorAnalysisReference() {
        return channelActivityMerchantBehaviorAnalysisReference;
    }

    public void setChannelActivityMerchantBehaviorAnalysisResult(String channelActivityMerchantBehaviorAnalysisResult) {
        this.channelActivityMerchantBehaviorAnalysisResult = channelActivityMerchantBehaviorAnalysisResult;
    }

    public String getChannelActivityMerchantBehaviorAnalysisResult() {
        return channelActivityMerchantBehaviorAnalysisResult;
    }
}