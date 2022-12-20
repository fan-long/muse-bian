package org.museframework.bian.poiofser;

import org.museframework.bian.poiofser.dto.InitiateAssistedRequest;
import org.museframework.bian.poiofser.dto.InitiateAssistedResponse;
import org.museframework.bian.poiofser.dto.RetrieveAssistedRequest;
import org.museframework.bian.poiofser.dto.RetrieveAssistedResponse;
import org.museframework.bian.poiofser.dto.UpdateAssistedRequest;
import org.museframework.bian.poiofser.dto.UpdateAssistedResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="PointofService", group="Assisted")
public interface BqAssisted {
    @GenericDtxEndpoint
    @Description("InBQ Initiate an assisted contact")
    InitiateAssistedResponse initiateAssisted(InitiateAssistedRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about an assisted contact")
    UpdateAssistedResponse updateAssisted(UpdateAssistedRequest req);

    @Description("ReBQ Retrieve details about an assisted contact")
    RetrieveAssistedResponse retrieveAssisted(RetrieveAssistedRequest req);
}