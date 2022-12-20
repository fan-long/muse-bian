package org.museframework.bian.parlifman;

import org.museframework.bian.parlifman.dto.RetrievePrecedentsRequest;
import org.museframework.bian.parlifman.dto.RetrievePrecedentsResponse;
import org.museframework.bian.parlifman.dto.UpdatePrecedentsRequest;
import org.museframework.bian.parlifman.dto.UpdatePrecedentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="PartyLifecycleManagement", group="Precedents")
public interface BqPrecedents {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about customer precedents")
    UpdatePrecedentsResponse updatePrecedents(UpdatePrecedentsRequest req);

    @Description("ReBQ Retrieve details about customer precedent maintenance")
    RetrievePrecedentsResponse retrievePrecedents(RetrievePrecedentsRequest req);
}