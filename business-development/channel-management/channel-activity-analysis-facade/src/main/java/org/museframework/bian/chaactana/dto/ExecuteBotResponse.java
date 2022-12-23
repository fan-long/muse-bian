package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteBotResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.bq.Bot bot;

    public void setBot(org.museframework.bian.chaactana.dto.bq.Bot bot) {
        this.bot = bot;
    }

    public org.museframework.bian.chaactana.dto.bq.Bot getBot() {
        return bot;
    }
}