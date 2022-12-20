package org.museframework.bian.rewpoiawaandred;

import org.museframework.bian.rewpoiawaandred.dto.ExchangeAwardRequest;
import org.museframework.bian.rewpoiawaandred.dto.ExchangeAwardResponse;
import org.museframework.bian.rewpoiawaandred.dto.InitiateAwardRequest;
import org.museframework.bian.rewpoiawaandred.dto.InitiateAwardResponse;
import org.museframework.bian.rewpoiawaandred.dto.RetrieveAwardRequest;
import org.museframework.bian.rewpoiawaandred.dto.RetrieveAwardResponse;
import org.museframework.bian.rewpoiawaandred.dto.UpdateAwardRequest;
import org.museframework.bian.rewpoiawaandred.dto.UpdateAwardResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Reward Points Awards & Redemption.  Example: Execute a payment transaction.")
@GenericDomain(name="RewardPointsAwardsAndRedemption", group="Award")
public interface BqAward {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Award processing")
    ExchangeAwardResponse exchangeAward(ExchangeAwardRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Award")
    InitiateAwardResponse initiateAward(InitiateAwardRequest req);

    @Description("ReBQ Retrieve details about any aspect of Award")
    RetrieveAwardResponse retrieveAward(RetrieveAwardRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Award")
    UpdateAwardResponse updateAward(UpdateAwardRequest req);
}