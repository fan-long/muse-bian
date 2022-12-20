package org.museframework.bian.rewpoiacc;

import org.museframework.bian.rewpoiacc.dto.CaptureExpirationRequest;
import org.museframework.bian.rewpoiacc.dto.CaptureExpirationResponse;
import org.museframework.bian.rewpoiacc.dto.InitiateExpirationRequest;
import org.museframework.bian.rewpoiacc.dto.InitiateExpirationResponse;
import org.museframework.bian.rewpoiacc.dto.RetrieveExpirationRequest;
import org.museframework.bian.rewpoiacc.dto.RetrieveExpirationResponse;
import org.museframework.bian.rewpoiacc.dto.UpdateExpirationRequest;
import org.museframework.bian.rewpoiacc.dto.UpdateExpirationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="RewardPointsAccount", group="Expiration")
public interface BqExpiration {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Expiration activity or event related information")
    CaptureExpirationResponse captureExpiration(CaptureExpirationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Expiration")
    InitiateExpirationResponse initiateExpiration(InitiateExpirationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Expiration")
    RetrieveExpirationResponse retrieveExpiration(RetrieveExpirationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Expiration")
    UpdateExpirationResponse updateExpiration(UpdateExpirationRequest req);
}