package org.museframework.bian.savingsaccount;

import org.museframework.bian.savingsaccount.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.savingsaccount.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.savingsaccount.dto.InitiateServiceFeesRequest;
import org.museframework.bian.savingsaccount.dto.InitiateServiceFeesResponse;
import org.museframework.bian.savingsaccount.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.savingsaccount.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="SavingsAccount", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("InBQ Initiate service fees against an account")
    InitiateServiceFeesResponse initiateServiceFees(InitiateServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute Apply Service Fee")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve information about a service fee applied to the account")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}