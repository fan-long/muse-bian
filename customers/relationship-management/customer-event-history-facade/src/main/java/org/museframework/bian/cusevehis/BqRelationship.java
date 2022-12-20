package org.museframework.bian.cusevehis;

import org.museframework.bian.cusevehis.dto.CaptureRelationshipRequest;
import org.museframework.bian.cusevehis.dto.CaptureRelationshipResponse;
import org.museframework.bian.cusevehis.dto.RetrieveRelationshipRequest;
import org.museframework.bian.cusevehis.dto.RetrieveRelationshipResponse;
import org.museframework.bian.cusevehis.dto.UpdateRelationshipRequest;
import org.museframework.bian.cusevehis.dto.UpdateRelationshipResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="CustomerEventHistory", group="Relationship")
public interface BqRelationship {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured relationship management event details")
    UpdateRelationshipResponse updateRelationship(UpdateRelationshipRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture relationship management event details")
    CaptureRelationshipResponse captureRelationship(CaptureRelationshipRequest req);

    @Description("ReBQ Retrieve relationship management event details")
    RetrieveRelationshipResponse retrieveRelationship(RetrieveRelationshipRequest req);
}