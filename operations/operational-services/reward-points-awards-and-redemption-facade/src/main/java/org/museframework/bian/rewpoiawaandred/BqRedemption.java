package org.museframework.bian.rewpoiawaandred;

import org.museframework.bian.rewpoiawaandred.dto.ExchangeRedemptionRequest;
import org.museframework.bian.rewpoiawaandred.dto.ExchangeRedemptionResponse;
import org.museframework.bian.rewpoiawaandred.dto.InitiateRedemptionRequest;
import org.museframework.bian.rewpoiawaandred.dto.InitiateRedemptionResponse;
import org.museframework.bian.rewpoiawaandred.dto.RetrieveRedemptionRequest;
import org.museframework.bian.rewpoiawaandred.dto.RetrieveRedemptionResponse;
import org.museframework.bian.rewpoiawaandred.dto.UpdateRedemptionRequest;
import org.museframework.bian.rewpoiawaandred.dto.UpdateRedemptionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Reward Points Awards & Redemption.  Example: Execute a payment transaction.")
@GenericDomain(name="RewardPointsAwardsAndRedemption", group="Redemption")
public interface BqRedemption {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Redemption processing")
    ExchangeRedemptionResponse exchangeRedemption(ExchangeRedemptionRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Redemption")
    InitiateRedemptionResponse initiateRedemption(InitiateRedemptionRequest req);

    @Description("ReBQ Retrieve details about any aspect of Redemption")
    RetrieveRedemptionResponse retrieveRedemption(RetrieveRedemptionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Redemption")
    UpdateRedemptionResponse updateRedemption(UpdateRedemptionRequest req);
}