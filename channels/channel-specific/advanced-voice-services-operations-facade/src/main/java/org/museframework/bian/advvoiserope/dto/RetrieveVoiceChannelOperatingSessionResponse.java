package org.museframework.bian.advvoiserope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveVoiceChannelOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession voiceChannelOperatingSession;

    public void setVoiceChannelOperatingSession(org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession voiceChannelOperatingSession) {
        this.voiceChannelOperatingSession = voiceChannelOperatingSession;
    }

    public org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession getVoiceChannelOperatingSession() {
        return voiceChannelOperatingSession;
    }
}