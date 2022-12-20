package org.museframework.bian.rewpoiawaandred;

import org.museframework.bian.rewpoiawaandred.dto.ExchangeRewardPointsTransactionRequest;
import org.museframework.bian.rewpoiawaandred.dto.ExchangeRewardPointsTransactionResponse;
import org.museframework.bian.rewpoiawaandred.dto.ExecuteRewardPointsTransactionRequest;
import org.museframework.bian.rewpoiawaandred.dto.ExecuteRewardPointsTransactionResponse;
import org.museframework.bian.rewpoiawaandred.dto.InitiateRewardPointsTransactionRequest;
import org.museframework.bian.rewpoiawaandred.dto.InitiateRewardPointsTransactionResponse;
import org.museframework.bian.rewpoiawaandred.dto.RequestRewardPointsTransactionRequest;
import org.museframework.bian.rewpoiawaandred.dto.RequestRewardPointsTransactionResponse;
import org.museframework.bian.rewpoiawaandred.dto.RetrieveRewardPointsTransactionRequest;
import org.museframework.bian.rewpoiawaandred.dto.RetrieveRewardPointsTransactionResponse;
import org.museframework.bian.rewpoiawaandred.dto.UpdateRewardPointsTransactionRequest;
import org.museframework.bian.rewpoiawaandred.dto.UpdateRewardPointsTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Reward Points Awards & Redemption.  Example: Execute a payment transaction.")
@GenericDomain(name="RewardPointsAwardsAndRedemption", group="RewardPointsTransaction")
public interface CrRewardPointsTransaction {
    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Reward Points Transaction processing")
    ExchangeRewardPointsTransactionResponse exchangeRewardPointsTransaction(ExchangeRewardPointsTransactionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Reward Points Transaction")
    ExecuteRewardPointsTransactionResponse executeRewardPointsTransaction(ExecuteRewardPointsTransactionRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Reward Points Transaction")
    InitiateRewardPointsTransactionResponse initiateRewardPointsTransaction(InitiateRewardPointsTransactionRequest req);

    @Description("ReCR Retrieve details about any aspect of Reward Points Transaction")
    RetrieveRewardPointsTransactionResponse retrieveRewardPointsTransaction(RetrieveRewardPointsTransactionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Reward Points Transaction")
    RequestRewardPointsTransactionResponse requestRewardPointsTransaction(RequestRewardPointsTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Reward Points Transaction")
    UpdateRewardPointsTransactionResponse updateRewardPointsTransaction(UpdateRewardPointsTransactionRequest req);
}