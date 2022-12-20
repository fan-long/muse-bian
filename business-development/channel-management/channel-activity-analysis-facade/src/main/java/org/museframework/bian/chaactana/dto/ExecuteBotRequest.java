package org.museframework.bian.chaactana.dto;

public class ExecuteBotRequest {
    private String channelactivityanalysisid;

    private String botid;

    private org.museframework.bian.chaactana.dto.bq.Bot bot;

    public void setChannelactivityanalysisid(String channelactivityanalysisid) {
        this.channelactivityanalysisid = channelactivityanalysisid;
    }

    public String getChannelactivityanalysisid() {
        return channelactivityanalysisid;
    }

    public void setBotid(String botid) {
        this.botid = botid;
    }

    public String getBotid() {
        return botid;
    }

    public void setBot(org.museframework.bian.chaactana.dto.bq.Bot bot) {
        this.bot = bot;
    }

    public org.museframework.bian.chaactana.dto.bq.Bot getBot() {
        return bot;
    }
}