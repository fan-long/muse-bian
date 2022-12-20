package org.museframework.bian.advvoiserman;

import org.museframework.bian.advvoiserman.dto.CreateVoiceChannelManagementPlanRequest;
import org.museframework.bian.advvoiserman.dto.CreateVoiceChannelManagementPlanResponse;
import org.museframework.bian.advvoiserman.dto.RetrieveVoiceChannelManagementPlanRequest;
import org.museframework.bian.advvoiserman.dto.RetrieveVoiceChannelManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Advanced Voice Services Management.")
@GenericDomain(name="AdvancedVoiceServicesManagement", group="VoiceChannelManagementPlan")
public interface CrVoiceChannelManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create the management plan for the voice channel")
    CreateVoiceChannelManagementPlanResponse createVoiceChannelManagementPlan(CreateVoiceChannelManagementPlanRequest req);

    @Description("ReCR Retrieve details about the voice channel management plan")
    RetrieveVoiceChannelManagementPlanResponse retrieveVoiceChannelManagementPlan(RetrieveVoiceChannelManagementPlanRequest req);
}