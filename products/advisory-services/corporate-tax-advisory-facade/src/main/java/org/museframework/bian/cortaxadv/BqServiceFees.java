package org.museframework.bian.cortaxadv;

import org.museframework.bian.cortaxadv.dto.ExecuteServiceFeesRequest;
import org.museframework.bian.cortaxadv.dto.ExecuteServiceFeesResponse;
import org.museframework.bian.cortaxadv.dto.InitiateServiceFeesRequest;
import org.museframework.bian.cortaxadv.dto.InitiateServiceFeesResponse;
import org.museframework.bian.cortaxadv.dto.RetrieveServiceFeesRequest;
import org.museframework.bian.cortaxadv.dto.RetrieveServiceFeesResponse;
import org.museframework.bian.cortaxadv.dto.UpdateServiceFeesRequest;
import org.museframework.bian.cortaxadv.dto.UpdateServiceFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CorporateTaxAdvisory", group="ServiceFees")
public interface BqServiceFees {
    @GenericDtxEndpoint
    @Description("InBQ Initialize service fee processing for corporate tax advisory services")
    InitiateServiceFeesResponse initiateServiceFees(InitiateServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of service fees for corporate tax advisory services")
    UpdateServiceFeesResponse updateServiceFees(UpdateServiceFeesRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute/apply a fee for a corporate tax advisory session")
    ExecuteServiceFeesResponse executeServiceFees(ExecuteServiceFeesRequest req);

    @Description("ReBQ Retrieve details about service fees for a corporate tax advisory service")
    RetrieveServiceFeesResponse retrieveServiceFees(RetrieveServiceFeesRequest req);
}