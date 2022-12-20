package org.museframework.bian.chaactana.dto;

public class ExchangeChannelActivityAnalysisRequest {
    private String channelactivityanalysisid;

    private org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis channelActivityAnalysis;

    public void setChannelactivityanalysisid(String channelactivityanalysisid) {
        this.channelactivityanalysisid = channelactivityanalysisid;
    }

    public String getChannelactivityanalysisid() {
        return channelactivityanalysisid;
    }

    public void setChannelActivityAnalysis(org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis channelActivityAnalysis) {
        this.channelActivityAnalysis = channelActivityAnalysis;
    }

    public org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis getChannelActivityAnalysis() {
        return channelActivityAnalysis;
    }
}