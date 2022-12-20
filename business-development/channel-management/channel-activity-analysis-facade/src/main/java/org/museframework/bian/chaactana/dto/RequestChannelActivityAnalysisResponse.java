package org.museframework.bian.chaactana.dto;

public class RequestChannelActivityAnalysisResponse {
    private org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis channelActivityAnalysis;

    public void setChannelActivityAnalysis(org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis channelActivityAnalysis) {
        this.channelActivityAnalysis = channelActivityAnalysis;
    }

    public org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis getChannelActivityAnalysis() {
        return channelActivityAnalysis;
    }
}