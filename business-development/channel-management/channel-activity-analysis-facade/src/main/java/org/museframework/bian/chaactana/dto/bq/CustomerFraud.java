/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.chaactana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerFraud {
    /*Defines the intended analytical insights and required input data and outputs*/
    @MetaField(0)
    private String channelActivityCustomerFraudAnalysisAlgorithmSpecification;

    /*Reference to output from the applied algorithm*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object channelActivityCustomerFraudAnalysisReference;

    /*The output record from the analysis*/
    @MetaField(0)
    private String channelActivityCustomerFraudAnalysisResult;

    public void setChannelActivityCustomerFraudAnalysisAlgorithmSpecification(String channelActivityCustomerFraudAnalysisAlgorithmSpecification) {
        this.channelActivityCustomerFraudAnalysisAlgorithmSpecification = channelActivityCustomerFraudAnalysisAlgorithmSpecification;
    }

    public String getChannelActivityCustomerFraudAnalysisAlgorithmSpecification() {
        return channelActivityCustomerFraudAnalysisAlgorithmSpecification;
    }

    public void setChannelActivityCustomerFraudAnalysisReference(org.museframework.bian.classes.Object channelActivityCustomerFraudAnalysisReference) {
        this.channelActivityCustomerFraudAnalysisReference = channelActivityCustomerFraudAnalysisReference;
    }

    public org.museframework.bian.classes.Object getChannelActivityCustomerFraudAnalysisReference() {
        return channelActivityCustomerFraudAnalysisReference;
    }

    public void setChannelActivityCustomerFraudAnalysisResult(String channelActivityCustomerFraudAnalysisResult) {
        this.channelActivityCustomerFraudAnalysisResult = channelActivityCustomerFraudAnalysisResult;
    }

    public String getChannelActivityCustomerFraudAnalysisResult() {
        return channelActivityCustomerFraudAnalysisResult;
    }
}