package org.museframework.bian.mardatswiope;

import org.museframework.bian.mardatswiope.dto.InitiateInternalPublicationRequest;
import org.museframework.bian.mardatswiope.dto.InitiateInternalPublicationResponse;
import org.museframework.bian.mardatswiope.dto.RetrieveInternalPublicationRequest;
import org.museframework.bian.mardatswiope.dto.RetrieveInternalPublicationResponse;
import org.museframework.bian.mardatswiope.dto.UpdateInternalPublicationRequest;
import org.museframework.bian.mardatswiope.dto.UpdateInternalPublicationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="MarketDataSwitchOperation", group="InternalPublication")
public interface BqInternalPublication {
    @GenericDtxEndpoint
    @Description("InBQ Initiate internal publication of information")
    InitiateInternalPublicationResponse initiateInternalPublication(InitiateInternalPublicationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of internal publication")
    UpdateInternalPublicationResponse updateInternalPublication(UpdateInternalPublicationRequest req);

    @Description("ReBQ Retrieve details about the internal publication task")
    RetrieveInternalPublicationResponse retrieveInternalPublication(RetrieveInternalPublicationRequest req);
}