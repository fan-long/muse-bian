package org.museframework.bian.pubrefdatman;

import org.museframework.bian.pubrefdatman.dto.InitiateGlobalReferenceDataRequest;
import org.museframework.bian.pubrefdatman.dto.InitiateGlobalReferenceDataResponse;
import org.museframework.bian.pubrefdatman.dto.RetrieveGlobalReferenceDataRequest;
import org.museframework.bian.pubrefdatman.dto.RetrieveGlobalReferenceDataResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Public Reference Data Management.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="PublicReferenceDataManagement", group="GlobalReferenceData")
public interface BqGlobalReferenceData {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Global Reference Data")
    InitiateGlobalReferenceDataResponse initiateGlobalReferenceData(InitiateGlobalReferenceDataRequest req);

    @Description("ReBQ Retrieve details about any aspect of Global Reference Data")
    RetrieveGlobalReferenceDataResponse retrieveGlobalReferenceData(RetrieveGlobalReferenceDataRequest req);
}