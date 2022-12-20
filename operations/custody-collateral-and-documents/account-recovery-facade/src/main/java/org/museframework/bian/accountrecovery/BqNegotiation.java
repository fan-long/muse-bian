package org.museframework.bian.accountrecovery;

import org.museframework.bian.accountrecovery.dto.RetrieveNegotiationRequest;
import org.museframework.bian.accountrecovery.dto.RetrieveNegotiationResponse;
import org.museframework.bian.accountrecovery.dto.UpdateNegotiationRequest;
import org.museframework.bian.accountrecovery.dto.UpdateNegotiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="AccountRecovery", group="Negotiation")
public interface BqNegotiation {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of an active case negotiation")
    UpdateNegotiationResponse updateNegotiation(UpdateNegotiationRequest req);

    @Description("ReBQ Retrieve details of an active case negotiation")
    RetrieveNegotiationResponse retrieveNegotiation(RetrieveNegotiationRequest req);
}