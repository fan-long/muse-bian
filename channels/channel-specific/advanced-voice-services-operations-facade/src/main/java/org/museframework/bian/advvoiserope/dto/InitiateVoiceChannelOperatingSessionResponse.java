package org.museframework.bian.advvoiserope.dto;

public class InitiateVoiceChannelOperatingSessionResponse {
    private org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession voiceChannelOperatingSession;

    public void setVoiceChannelOperatingSession(org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession voiceChannelOperatingSession) {
        this.voiceChannelOperatingSession = voiceChannelOperatingSession;
    }

    public org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession getVoiceChannelOperatingSession() {
        return voiceChannelOperatingSession;
    }
}