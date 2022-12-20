package org.museframework.bian.cardclearing;

import org.museframework.bian.cardclearing.dto.RetrieveRoutingRequest;
import org.museframework.bian.cardclearing.dto.RetrieveRoutingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardClearing", group="Routing")
public interface BqRouting {
    @Description("ReBQ Retrieve details about card transaction routing")
    RetrieveRoutingResponse retrieveRouting(RetrieveRoutingRequest req);
}