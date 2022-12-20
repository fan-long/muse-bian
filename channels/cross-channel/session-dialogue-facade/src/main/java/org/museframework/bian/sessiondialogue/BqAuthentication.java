package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.RetrieveAuthenticationRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveAuthenticationResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateAuthenticationRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateAuthenticationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="Authentication")
public interface BqAuthentication {
    @GenericDtxEndpoint
    @Description("UpBQ Update details for authentication processing")
    UpdateAuthenticationResponse updateAuthentication(UpdateAuthenticationRequest req);

    @Description("ReBQ Retrieve details about authentication processing")
    RetrieveAuthenticationResponse retrieveAuthentication(RetrieveAuthenticationRequest req);
}