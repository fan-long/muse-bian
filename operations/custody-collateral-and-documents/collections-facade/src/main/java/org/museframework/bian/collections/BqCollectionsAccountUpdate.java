package org.museframework.bian.collections;

import org.museframework.bian.collections.dto.RetrieveCollectionsAccountUpdateRequest;
import org.museframework.bian.collections.dto.RetrieveCollectionsAccountUpdateResponse;
import org.museframework.bian.collections.dto.UpdateCollectionsAccountUpdateRequest;
import org.museframework.bian.collections.dto.UpdateCollectionsAccountUpdateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="Collections", group="CollectionsAccountUpdate")
public interface BqCollectionsAccountUpdate {
    @Description("ReBQ Retrieve details about any aspect of Collections Account Update")
    RetrieveCollectionsAccountUpdateResponse retrieveCollectionsAccountUpdate(RetrieveCollectionsAccountUpdateRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Collections Account Update")
    UpdateCollectionsAccountUpdateResponse updateCollectionsAccountUpdate(UpdateCollectionsAccountUpdateRequest req);
}