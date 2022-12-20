package org.museframework.bian.currentaccount;

import org.museframework.bian.currentaccount.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.currentaccount.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.currentaccount.dto.InitiateServiceFeesRequest;
import org.museframework.bian.currentaccount.dto.InitiateServiceFeesResponse;
import org.museframework.bian.currentaccount.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.currentaccount.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CurrentAccount", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("InBQ Initiate service fees against an account")
    InitiateServiceFeesResponse initiateServiceFees(InitiateServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Apply a service fee to the account")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve information about a service fee applied to the account")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}