package org.museframework.bian.parlifman;

import org.museframework.bian.parlifman.dto.ExecutePartyRelationshipProcedureRequest;
import org.museframework.bian.parlifman.dto.ExecutePartyRelationshipProcedureResponse;
import org.museframework.bian.parlifman.dto.InitiatePartyRelationshipProcedureRequest;
import org.museframework.bian.parlifman.dto.InitiatePartyRelationshipProcedureResponse;
import org.museframework.bian.parlifman.dto.RequestPartyRelationshipProcedureRequest;
import org.museframework.bian.parlifman.dto.RequestPartyRelationshipProcedureResponse;
import org.museframework.bian.parlifman.dto.RetrievePartyRelationshipProcedureRequest;
import org.museframework.bian.parlifman.dto.RetrievePartyRelationshipProcedureResponse;
import org.museframework.bian.parlifman.dto.UpdatePartyRelationshipProcedureRequest;
import org.museframework.bian.parlifman.dto.UpdatePartyRelationshipProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="PartyLifecycleManagement", group="PartyRelationshipProcedure")
public interface CrPartyRelationshipProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate party life-cycle processing")
    InitiatePartyRelationshipProcedureResponse initiatePartyRelationshipProcedure(InitiatePartyRelationshipProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about a party life-cycle procedure")
    UpdatePartyRelationshipProcedureResponse updatePartyRelationshipProcedure(UpdatePartyRelationshipProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action (e.g. input data)")
    ExecutePartyRelationshipProcedureResponse executePartyRelationshipProcedure(ExecutePartyRelationshipProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention (e.g. negotiate resolution)")
    RequestPartyRelationshipProcedureResponse requestPartyRelationshipProcedure(RequestPartyRelationshipProcedureRequest req);

    @Description("ReCR Retrieve details about a party life-cycle procedure")
    RetrievePartyRelationshipProcedureResponse retrievePartyRelationshipProcedure(RetrievePartyRelationshipProcedureRequest req);
}