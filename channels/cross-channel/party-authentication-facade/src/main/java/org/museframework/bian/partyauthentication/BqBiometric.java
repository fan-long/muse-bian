package org.museframework.bian.partyauthentication;

import org.museframework.bian.partyauthentication.dto.EvaluateBiometricRequest;
import org.museframework.bian.partyauthentication.dto.EvaluateBiometricResponse;
import org.museframework.bian.partyauthentication.dto.RetrieveBiometricRequest;
import org.museframework.bian.partyauthentication.dto.RetrieveBiometricResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="PartyAuthentication", group="Biometric")
public interface BqBiometric {
    @GenericDtxEndpoint
    @Description("EvBQ Evaluate customer authenticity using biometrics")
    EvaluateBiometricResponse evaluateBiometric(EvaluateBiometricRequest req);

    @Description("ReBQ Retrieve details about a biometric evaluation")
    RetrieveBiometricResponse retrieveBiometric(RetrieveBiometricRequest req);
}