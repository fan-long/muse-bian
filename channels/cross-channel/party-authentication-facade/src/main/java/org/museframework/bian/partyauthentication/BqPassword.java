package org.museframework.bian.partyauthentication;

import org.museframework.bian.partyauthentication.dto.EvaluatePasswordRequest;
import org.museframework.bian.partyauthentication.dto.EvaluatePasswordResponse;
import org.museframework.bian.partyauthentication.dto.RetrievePasswordRequest;
import org.museframework.bian.partyauthentication.dto.RetrievePasswordResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="PartyAuthentication", group="Password")
public interface BqPassword {
    @GenericDtxEndpoint
    @Description("EvBQ Evaluate customer authenticity using passwords")
    EvaluatePasswordResponse evaluatePassword(EvaluatePasswordRequest req);

    @Description("ReBQ Retrieve details about a password evaluation")
    RetrievePasswordResponse retrievePassword(RetrievePasswordRequest req);
}