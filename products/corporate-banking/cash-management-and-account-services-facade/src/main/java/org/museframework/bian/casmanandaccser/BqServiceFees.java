package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.casmanandaccser.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.casmanandaccser.dto.InitiateServiceFeesRequest;
import org.museframework.bian.casmanandaccser.dto.InitiateServiceFeesResponse;
import org.museframework.bian.casmanandaccser.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.casmanandaccser.dto.RetrieveServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CashManagementAndAccountServices", group="ServiceFees")
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