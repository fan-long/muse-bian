package org.museframework.bian.cuscrerat;

import org.museframework.bian.cuscrerat.dto.ExecuteCustomerCreditRatingStateRequest;
import org.museframework.bian.cuscrerat.dto.ExecuteCustomerCreditRatingStateResponse;
import org.museframework.bian.cuscrerat.dto.InitiateCustomerCreditRatingStateRequest;
import org.museframework.bian.cuscrerat.dto.InitiateCustomerCreditRatingStateResponse;
import org.museframework.bian.cuscrerat.dto.RequestCustomerCreditRatingStateRequest;
import org.museframework.bian.cuscrerat.dto.RequestCustomerCreditRatingStateResponse;
import org.museframework.bian.cuscrerat.dto.RetrieveCustomerCreditRatingStateRequest;
import org.museframework.bian.cuscrerat.dto.RetrieveCustomerCreditRatingStateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Monitor and define the status/rating of some entity within Customer Credit Rating. ")
@GenericDomain(name="CustomerCreditRating", group="CustomerCreditRatingState")
public interface CrCustomerCreditRatingState {
    @GenericDtxEndpoint
    @Description("InCR Initiate credit state monitoring for a customer")
    InitiateCustomerCreditRatingStateResponse initiateCustomerCreditRatingState(InitiateCustomerCreditRatingStateRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task for credit state (e.g. auto refresh)")
    ExecuteCustomerCreditRatingStateResponse executeCustomerCreditRatingState(ExecuteCustomerCreditRatingStateRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention for credit state (e.g. revise underlying assessment)")
    RequestCustomerCreditRatingStateResponse requestCustomerCreditRatingState(RequestCustomerCreditRatingStateRequest req);

    @Description("ReCR Retrieve details about credit state monitoring for a customer")
    RetrieveCustomerCreditRatingStateResponse retrieveCustomerCreditRatingState(RetrieveCustomerCreditRatingStateRequest req);
}