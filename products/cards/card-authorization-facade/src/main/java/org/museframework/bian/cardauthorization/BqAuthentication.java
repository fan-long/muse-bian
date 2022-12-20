package org.museframework.bian.cardauthorization;

import org.museframework.bian.cardauthorization.dto.RetrieveAuthenticationRequest;
import org.museframework.bian.cardauthorization.dto.RetrieveAuthenticationResponse;
import org.museframework.bian.cardauthorization.dto.UpdateAuthenticationRequest;
import org.museframework.bian.cardauthorization.dto.UpdateAuthenticationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="CardAuthorization", group="Authentication")
public interface BqAuthentication {
    @GenericDtxEndpoint
    @Description("UpBQ Update details for the card holder authentication check")
    UpdateAuthenticationResponse updateAuthentication(UpdateAuthenticationRequest req);

    @Description("ReBQ Retrieve details about the card holder authentication check")
    RetrieveAuthenticationResponse retrieveAuthentication(RetrieveAuthenticationRequest req);
}