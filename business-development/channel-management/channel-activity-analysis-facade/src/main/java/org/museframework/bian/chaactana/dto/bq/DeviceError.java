/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.chaactana.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DeviceError {
    /*Defines the intended analytical insights and required input data and outputs*/
    @MetaField(0)
    private String channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification;

    /*Reference to output from the applied algorithm*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object channelActivityDeviceErrorDetectionAnalysisReference;

    /*The output record from the analysis*/
    @MetaField(0)
    private String channelActivityDeviceErrorDetectionAnalysisResult;

    public void setChannelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification(String channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification) {
        this.channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification = channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification;
    }

    public String getChannelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification() {
        return channelActivityDeviceErrorDetectionAnalysisAlgorithmSpecification;
    }

    public void setChannelActivityDeviceErrorDetectionAnalysisReference(org.museframework.bian.classes.Object channelActivityDeviceErrorDetectionAnalysisReference) {
        this.channelActivityDeviceErrorDetectionAnalysisReference = channelActivityDeviceErrorDetectionAnalysisReference;
    }

    public org.museframework.bian.classes.Object getChannelActivityDeviceErrorDetectionAnalysisReference() {
        return channelActivityDeviceErrorDetectionAnalysisReference;
    }

    public void setChannelActivityDeviceErrorDetectionAnalysisResult(String channelActivityDeviceErrorDetectionAnalysisResult) {
        this.channelActivityDeviceErrorDetectionAnalysisResult = channelActivityDeviceErrorDetectionAnalysisResult;
    }

    public String getChannelActivityDeviceErrorDetectionAnalysisResult() {
        return channelActivityDeviceErrorDetectionAnalysisResult;
    }
}