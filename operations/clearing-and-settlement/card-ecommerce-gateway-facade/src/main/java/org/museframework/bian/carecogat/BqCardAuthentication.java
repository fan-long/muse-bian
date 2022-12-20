package org.museframework.bian.carecogat;

import org.museframework.bian.carecogat.dto.InitiateCardAuthenticationRequest;
import org.museframework.bian.carecogat.dto.InitiateCardAuthenticationResponse;
import org.museframework.bian.carecogat.dto.RetrieveCardAuthenticationRequest;
import org.museframework.bian.carecogat.dto.RetrieveCardAuthenticationResponse;
import org.museframework.bian.carecogat.dto.UpdateCardAuthenticationRequest;
import org.museframework.bian.carecogat.dto.UpdateCardAuthenticationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardeCommerceGateway", group="CardAuthentication")
public interface BqCardAuthentication {
    @GenericDtxEndpoint
    @Description("InBQ Initiate card authentication (routed to issuing bank)")
    InitiateCardAuthenticationResponse initiateCardAuthentication(InitiateCardAuthenticationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a card transaction used in authentication")
    UpdateCardAuthenticationResponse updateCardAuthentication(UpdateCardAuthenticationRequest req);

    @Description("ReBQ Retrieve details about a card authentication")
    RetrieveCardAuthenticationResponse retrieveCardAuthentication(RetrieveCardAuthenticationRequest req);
}