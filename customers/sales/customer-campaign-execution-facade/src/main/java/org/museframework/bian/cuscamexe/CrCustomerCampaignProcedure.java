package org.museframework.bian.cuscamexe;

import org.museframework.bian.cuscamexe.dto.InitiateCustomerCampaignProcedureRequest;
import org.museframework.bian.cuscamexe.dto.InitiateCustomerCampaignProcedureResponse;
import org.museframework.bian.cuscamexe.dto.RetrieveCustomerCampaignProcedureRequest;
import org.museframework.bian.cuscamexe.dto.RetrieveCustomerCampaignProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Customer Campaign Execution. ")
@GenericDomain(name="CustomerCampaignExecution", group="CustomerCampaignProcedure")
public interface CrCustomerCampaignProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate customer campaign processing")
    InitiateCustomerCampaignProcedureResponse initiateCustomerCampaignProcedure(InitiateCustomerCampaignProcedureRequest req);

    @Description("ReCR Retrieve details about an active customer campaign")
    RetrieveCustomerCampaignProcedureResponse retrieveCustomerCampaignProcedure(RetrieveCustomerCampaignProcedureRequest req);
}