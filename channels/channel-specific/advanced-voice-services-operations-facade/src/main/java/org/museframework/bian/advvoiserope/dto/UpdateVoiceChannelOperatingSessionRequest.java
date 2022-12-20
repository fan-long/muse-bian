package org.museframework.bian.advvoiserope.dto;

public class UpdateVoiceChannelOperatingSessionRequest {
    private String advancedvoiceservicesoperationsid;

    private org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession voiceChannelOperatingSession;

    public void setAdvancedvoiceservicesoperationsid(String advancedvoiceservicesoperationsid) {
        this.advancedvoiceservicesoperationsid = advancedvoiceservicesoperationsid;
    }

    public String getAdvancedvoiceservicesoperationsid() {
        return advancedvoiceservicesoperationsid;
    }

    public void setVoiceChannelOperatingSession(org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession voiceChannelOperatingSession) {
        this.voiceChannelOperatingSession = voiceChannelOperatingSession;
    }

    public org.museframework.bian.advvoiserope.dto.cr.VoiceChannelOperatingSession getVoiceChannelOperatingSession() {
        return voiceChannelOperatingSession;
    }
}