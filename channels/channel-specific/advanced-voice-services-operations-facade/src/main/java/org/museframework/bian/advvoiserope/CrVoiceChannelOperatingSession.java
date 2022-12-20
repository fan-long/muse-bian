package org.museframework.bian.advvoiserope;

import org.museframework.bian.advvoiserope.dto.InitiateVoiceChannelOperatingSessionRequest;
import org.museframework.bian.advvoiserope.dto.InitiateVoiceChannelOperatingSessionResponse;
import org.museframework.bian.advvoiserope.dto.RequestVoiceChannelOperatingSessionRequest;
import org.museframework.bian.advvoiserope.dto.RequestVoiceChannelOperatingSessionResponse;
import org.museframework.bian.advvoiserope.dto.RetrieveVoiceChannelOperatingSessionRequest;
import org.museframework.bian.advvoiserope.dto.RetrieveVoiceChannelOperatingSessionResponse;
import org.museframework.bian.advvoiserope.dto.UpdateVoiceChannelOperatingSessionRequest;
import org.museframework.bian.advvoiserope.dto.UpdateVoiceChannelOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Advanced Voice Services Operations. ")
@GenericDomain(name="AdvancedVoiceServicesOperations", group="VoiceChannelOperatingSession")
public interface CrVoiceChannelOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate the voice channel service")
    InitiateVoiceChannelOperatingSessionResponse initiateVoiceChannelOperatingSession(InitiateVoiceChannelOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the voice access service menu during the session")
    UpdateVoiceChannelOperatingSessionResponse updateVoiceChannelOperatingSession(UpdateVoiceChannelOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Report an issue with the production service")
    RequestVoiceChannelOperatingSessionResponse requestVoiceChannelOperatingSession(RequestVoiceChannelOperatingSessionRequest req);

    @Description("ReCR Retrieve details and statistics relating to a session")
    RetrieveVoiceChannelOperatingSessionResponse retrieveVoiceChannelOperatingSession(RetrieveVoiceChannelOperatingSessionRequest req);
}