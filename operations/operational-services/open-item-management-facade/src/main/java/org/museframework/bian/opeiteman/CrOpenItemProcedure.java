package org.museframework.bian.opeiteman;

import org.museframework.bian.opeiteman.dto.InitiateOpenItemProcedureRequest;
import org.museframework.bian.opeiteman.dto.InitiateOpenItemProcedureResponse;
import org.museframework.bian.opeiteman.dto.RequestOpenItemProcedureRequest;
import org.museframework.bian.opeiteman.dto.RequestOpenItemProcedureResponse;
import org.museframework.bian.opeiteman.dto.RetrieveOpenItemProcedureRequest;
import org.museframework.bian.opeiteman.dto.RetrieveOpenItemProcedureResponse;
import org.museframework.bian.opeiteman.dto.UpdateOpenItemProcedureRequest;
import org.museframework.bian.opeiteman.dto.UpdateOpenItemProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Open Item Management. ")
@GenericDomain(name="OpenItemManagement", group="OpenItemProcedure")
public interface CrOpenItemProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate an open item procedure")
    InitiateOpenItemProcedureResponse initiateOpenItemProcedure(InitiateOpenItemProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active open item procedure")
    UpdateOpenItemProcedureResponse updateOpenItemProcedure(UpdateOpenItemProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with an active open item procedure")
    RequestOpenItemProcedureResponse requestOpenItemProcedure(RequestOpenItemProcedureRequest req);

    @Description("ReCR Retrieve details about an open item")
    RetrieveOpenItemProcedureResponse retrieveOpenItemProcedure(RetrieveOpenItemProcedureRequest req);
}