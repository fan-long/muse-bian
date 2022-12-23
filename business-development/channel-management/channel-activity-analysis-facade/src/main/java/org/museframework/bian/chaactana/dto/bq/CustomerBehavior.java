/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.chaactana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerBehavior extends org.museframework.bian.classes.CustomerBehavior {
    /*Defines the intended analytical insights and required input data and outputs*/
    @MetaField
    private String channelActivityCustomerBehaviorAnalysisAlgorithmSpecification;

    /*Reference to output from the applied algorithm*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object channelActivityCustomerBehaviorAnalysisReference;

    /*The output record from the analysis*/
    @MetaField
    private String channelActivityCustomerBehaviorAnalysisResult;

    public void setChannelActivityCustomerBehaviorAnalysisAlgorithmSpecification(String channelActivityCustomerBehaviorAnalysisAlgorithmSpecification) {
        this.channelActivityCustomerBehaviorAnalysisAlgorithmSpecification = channelActivityCustomerBehaviorAnalysisAlgorithmSpecification;
    }

    public String getChannelActivityCustomerBehaviorAnalysisAlgorithmSpecification() {
        return channelActivityCustomerBehaviorAnalysisAlgorithmSpecification;
    }

    public void setChannelActivityCustomerBehaviorAnalysisReference(org.museframework.bian.classes.Object channelActivityCustomerBehaviorAnalysisReference) {
        this.channelActivityCustomerBehaviorAnalysisReference = channelActivityCustomerBehaviorAnalysisReference;
    }

    public org.museframework.bian.classes.Object getChannelActivityCustomerBehaviorAnalysisReference() {
        return channelActivityCustomerBehaviorAnalysisReference;
    }

    public void setChannelActivityCustomerBehaviorAnalysisResult(String channelActivityCustomerBehaviorAnalysisResult) {
        this.channelActivityCustomerBehaviorAnalysisResult = channelActivityCustomerBehaviorAnalysisResult;
    }

    public String getChannelActivityCustomerBehaviorAnalysisResult() {
        return channelActivityCustomerBehaviorAnalysisResult;
    }
}