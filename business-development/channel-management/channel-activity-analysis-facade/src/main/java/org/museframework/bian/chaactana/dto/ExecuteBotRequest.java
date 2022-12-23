package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteBotRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String botid;

    @MetaField(ref=true)
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