package org.museframework.bian.contacthandler;

import org.museframework.bian.contacthandler.dto.RetrieveAuthenticationRequest;
import org.museframework.bian.contacthandler.dto.RetrieveAuthenticationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ContactHandler", group="Authentication")
public interface BqAuthentication {
    @Description("ReBQ Retrieve details about an authentication task")
    RetrieveAuthenticationResponse retrieveAuthentication(RetrieveAuthenticationRequest req);
}