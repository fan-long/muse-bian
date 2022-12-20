package org.museframework.bian.carterope;

import org.museframework.bian.carterope.dto.InitiateAuthorizationRequest;
import org.museframework.bian.carterope.dto.InitiateAuthorizationResponse;
import org.museframework.bian.carterope.dto.RequestAuthorizationRequest;
import org.museframework.bian.carterope.dto.RequestAuthorizationResponse;
import org.museframework.bian.carterope.dto.RetrieveAuthorizationRequest;
import org.museframework.bian.carterope.dto.RetrieveAuthorizationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardTerminalOperation", group="Authorization")
public interface BqAuthorization {
    @GenericDtxEndpoint
    @Description("InBQ Initiate authorization for a card transaction")
    InitiateAuthorizationResponse initiateAuthorization(InitiateAuthorizationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention for a card authorization (e.g. engage specialist)")
    RequestAuthorizationResponse requestAuthorization(RequestAuthorizationRequest req);

    @Description("ReBQ Retrieve details about a card authorization transaction")
    RetrieveAuthorizationResponse retrieveAuthorization(RetrieveAuthorizationRequest req);
}