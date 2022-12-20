package org.museframework.bian.corcuracc;

import org.museframework.bian.corcuracc.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.corcuracc.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.corcuracc.dto.InitiateServiceFeesRequest;
import org.museframework.bian.corcuracc.dto.InitiateServiceFeesResponse;
import org.museframework.bian.corcuracc.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.corcuracc.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateCurrentAccount", group="ServiceFees")
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