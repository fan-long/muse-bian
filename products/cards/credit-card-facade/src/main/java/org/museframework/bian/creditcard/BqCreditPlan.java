package org.museframework.bian.creditcard;

import org.museframework.bian.creditcard.dto.InitiateCreditPlanRequest;
import org.museframework.bian.creditcard.dto.InitiateCreditPlanResponse;
import org.museframework.bian.creditcard.dto.RequestCreditPlanRequest;
import org.museframework.bian.creditcard.dto.RequestCreditPlanResponse;
import org.museframework.bian.creditcard.dto.RetrieveCreditPlanRequest;
import org.museframework.bian.creditcard.dto.RetrieveCreditPlanResponse;
import org.museframework.bian.creditcard.dto.UpdateCreditPlanRequest;
import org.museframework.bian.creditcard.dto.UpdateCreditPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CreditCard", group="CreditPlan")
public interface BqCreditPlan {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a credit plan linked to the card account")
    InitiateCreditPlanResponse initiateCreditPlan(InitiateCreditPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of the credit plan")
    UpdateCreditPlanResponse updateCreditPlan(UpdateCreditPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention with a credit plan")
    RequestCreditPlanResponse requestCreditPlan(RequestCreditPlanRequest req);

    @Description("ReBQ Retrieve details about a linked credit plan")
    RetrieveCreditPlanResponse retrieveCreditPlan(RetrieveCreditPlanRequest req);
}