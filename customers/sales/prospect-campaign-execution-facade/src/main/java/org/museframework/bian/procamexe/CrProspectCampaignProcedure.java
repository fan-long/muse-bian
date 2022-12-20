package org.museframework.bian.procamexe;

import org.museframework.bian.procamexe.dto.InitiateProspectCampaignProcedureRequest;
import org.museframework.bian.procamexe.dto.InitiateProspectCampaignProcedureResponse;
import org.museframework.bian.procamexe.dto.RetrieveProspectCampaignProcedureRequest;
import org.museframework.bian.procamexe.dto.RetrieveProspectCampaignProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Prospect Campaign Execution. ")
@GenericDomain(name="ProspectCampaignExecution", group="ProspectCampaignProcedure")
public interface CrProspectCampaignProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate prospect campaign processing")
    InitiateProspectCampaignProcedureResponse initiateProspectCampaignProcedure(InitiateProspectCampaignProcedureRequest req);

    @Description("ReCR Retrieve details about an active prospect campaign")
    RetrieveProspectCampaignProcedureResponse retrieveProspectCampaignProcedure(RetrieveProspectCampaignProcedureRequest req);
}