package org.museframework.bian.partyauthentication;

import org.museframework.bian.partyauthentication.dto.EvaluateBehaviorRequest;
import org.museframework.bian.partyauthentication.dto.EvaluateBehaviorResponse;
import org.museframework.bian.partyauthentication.dto.RetrieveBehaviorRequest;
import org.museframework.bian.partyauthentication.dto.RetrieveBehaviorResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="PartyAuthentication", group="Behavior")
public interface BqBehavior {
    @GenericDtxEndpoint
    @Description("EvBQ Evaluate customer authenticity using behaviors")
    EvaluateBehaviorResponse evaluateBehavior(EvaluateBehaviorRequest req);

    @Description("ReBQ Retrieve details about a behavior evaluation")
    RetrieveBehaviorResponse retrieveBehavior(RetrieveBehaviorRequest req);
}