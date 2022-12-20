package org.museframework.bian.investmentaccount;

import org.museframework.bian.investmentaccount.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.investmentaccount.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.investmentaccount.dto.InitiateServiceFeesRequest;
import org.museframework.bian.investmentaccount.dto.InitiateServiceFeesResponse;
import org.museframework.bian.investmentaccount.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.investmentaccount.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="InvestmentAccount", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("InBQ Initiate, set-up service fee processing for the account")
    InitiateServiceFeesResponse initiateServiceFees(InitiateServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute Apply Service Fee")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve details about service fees for the investment account")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}