package org.museframework.bian.commissions;

import org.museframework.bian.commissions.dto.ExchangeCheckRequest;
import org.museframework.bian.commissions.dto.ExchangeCheckResponse;
import org.museframework.bian.commissions.dto.InitiateCheckRequest;
import org.museframework.bian.commissions.dto.InitiateCheckResponse;
import org.museframework.bian.commissions.dto.RetrieveCheckRequest;
import org.museframework.bian.commissions.dto.RetrieveCheckResponse;
import org.museframework.bian.commissions.dto.UpdateCheckRequest;
import org.museframework.bian.commissions.dto.UpdateCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions.  Example: Execute a payment transaction.")
@GenericDomain(name="Commissions", group="Check")
public interface BqCheck {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Check processing")
    ExchangeCheckResponse exchangeCheck(ExchangeCheckRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Check")
    InitiateCheckResponse initiateCheck(InitiateCheckRequest req);

    @Description("ReBQ Retrieve details about any aspect of Check")
    RetrieveCheckResponse retrieveCheck(RetrieveCheckRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Check")
    UpdateCheckResponse updateCheck(UpdateCheckRequest req);
}