/*A Session of a VoiceChannel*/
package org.museframework.bian.classes;

public class VoiceChannelSession {
    /*Reference to the Voice Channel Service Menu used in the session
*/
    private String voiceChannelServiceMenue;

    /*Indication of where the EBranchChannelSession was originated (inbound or outbound)
*/
    private String voiceChannelSessionDirection;

    /*Reference to a device used the VoiceChannelSession 

- needs to be understood combined with "role", e.g. authentication, authorisation, connection... */
    private String voiceChannelSessionDeviceReference;

    /*The role a device plays in a channel session

e.g. authentication, authorisation, connection... 

*/
    private String voiceChannelSessionDeviceRole;

    public void setVoiceChannelServiceMenue(String voiceChannelServiceMenue) {
        this.voiceChannelServiceMenue = voiceChannelServiceMenue;
    }

    public String getVoiceChannelServiceMenue() {
        return voiceChannelServiceMenue;
    }

    public void setVoiceChannelSessionDirection(String voiceChannelSessionDirection) {
        this.voiceChannelSessionDirection = voiceChannelSessionDirection;
    }

    public String getVoiceChannelSessionDirection() {
        return voiceChannelSessionDirection;
    }

    public void setVoiceChannelSessionDeviceReference(String voiceChannelSessionDeviceReference) {
        this.voiceChannelSessionDeviceReference = voiceChannelSessionDeviceReference;
    }

    public String getVoiceChannelSessionDeviceReference() {
        return voiceChannelSessionDeviceReference;
    }

    public void setVoiceChannelSessionDeviceRole(String voiceChannelSessionDeviceRole) {
        this.voiceChannelSessionDeviceRole = voiceChannelSessionDeviceRole;
    }

    public String getVoiceChannelSessionDeviceRole() {
        return voiceChannelSessionDeviceRole;
    }
}