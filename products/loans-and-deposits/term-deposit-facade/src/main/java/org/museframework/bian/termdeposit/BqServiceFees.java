package org.museframework.bian.termdeposit;

import org.museframework.bian.termdeposit.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.termdeposit.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.termdeposit.dto.InitiateServiceFeesRequest;
import org.museframework.bian.termdeposit.dto.InitiateServiceFeesResponse;
import org.museframework.bian.termdeposit.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.termdeposit.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="TermDeposit", group="ServiceFees")
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