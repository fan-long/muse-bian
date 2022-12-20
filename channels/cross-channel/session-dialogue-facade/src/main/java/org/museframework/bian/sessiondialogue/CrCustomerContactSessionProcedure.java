package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.ExecuteCustomerContactSessionProcedureRequest;
import org.museframework.bian.sessiondialogue.dto.ExecuteCustomerContactSessionProcedureResponse;
import org.museframework.bian.sessiondialogue.dto.InitiateCustomerContactSessionProcedureRequest;
import org.museframework.bian.sessiondialogue.dto.InitiateCustomerContactSessionProcedureResponse;
import org.museframework.bian.sessiondialogue.dto.RequestCustomerContactSessionProcedureRequest;
import org.museframework.bian.sessiondialogue.dto.RequestCustomerContactSessionProcedureResponse;
import org.museframework.bian.sessiondialogue.dto.RetrieveCustomerContactSessionProcedureRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveCustomerContactSessionProcedureResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateCustomerContactSessionProcedureRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateCustomerContactSessionProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Session Dialogue. ")
@GenericDomain(name="SessionDialogue", group="CustomerContactSessionProcedure")
public interface CrCustomerContactSessionProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate a customer dialogue")
    InitiateCustomerContactSessionProcedureResponse initiateCustomerContactSessionProcedure(InitiateCustomerContactSessionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a customer dialogue")
    UpdateCustomerContactSessionProcedureResponse updateCustomerContactSessionProcedure(UpdateCustomerContactSessionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task (e.g. self service offer process)")
    ExecuteCustomerContactSessionProcedureResponse executeCustomerContactSessionProcedure(ExecuteCustomerContactSessionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention (e.g. request servicing support)")
    RequestCustomerContactSessionProcedureResponse requestCustomerContactSessionProcedure(RequestCustomerContactSessionProcedureRequest req);

    @Description("ReCR Retrieve details about a customer dialogue")
    RetrieveCustomerContactSessionProcedureResponse retrieveCustomerContactSessionProcedure(RetrieveCustomerContactSessionProcedureRequest req);
}