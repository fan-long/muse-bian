package org.museframework.bian.conadvser;

import org.museframework.bian.conadvser.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.conadvser.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.conadvser.dto.InitiateServiceFeesRequest;
import org.museframework.bian.conadvser.dto.InitiateServiceFeesResponse;
import org.museframework.bian.conadvser.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.conadvser.dto.RetrieveServiceFeesResponse;
import org.museframework.bian.conadvser.dto.UpdateServiceFeesRequest;
import org.museframework.bian.conadvser.dto.UpdateServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="ConsumerAdvisoryServices", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("InBQ Initialize service fee processing for an advisory session")
    InitiateServiceFeesResponse initiateServiceFees(InitiateServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of service fees for an advisory session")
    UpdateServiceFeesResponse updateServiceFees(UpdateServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute/apply a fee for an advisory session")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve details about service fees for an advisory session")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}