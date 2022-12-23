package org.museframework.bian.advvoiserman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateVoiceChannelManagementPlanRequest {
    @MetaField(ref=true)
    private org.museframework.bian.advvoiserman.dto.cr.VoiceChannelManagementPlan voiceChannelManagementPlan;

    public void setVoiceChannelManagementPlan(org.museframework.bian.advvoiserman.dto.cr.VoiceChannelManagementPlan voiceChannelManagementPlan) {
        this.voiceChannelManagementPlan = voiceChannelManagementPlan;
    }

    public org.museframework.bian.advvoiserman.dto.cr.VoiceChannelManagementPlan getVoiceChannelManagementPlan() {
        return voiceChannelManagementPlan;
    }
}