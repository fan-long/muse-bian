package org.museframework.bian.parlifman;

import org.museframework.bian.parlifman.dto.RetrieveAuthenticationRequest;
import org.museframework.bian.parlifman.dto.RetrieveAuthenticationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="PartyLifecycleManagement", group="Authentication")
public interface BqAuthentication {
    @Description("ReBQ Retrieve details about a party authentication procedure")
    RetrieveAuthenticationResponse retrieveAuthentication(RetrieveAuthenticationRequest req);
}