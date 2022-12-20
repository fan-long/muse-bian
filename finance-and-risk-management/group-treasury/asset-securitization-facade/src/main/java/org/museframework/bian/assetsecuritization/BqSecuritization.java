package org.museframework.bian.assetsecuritization;

import org.museframework.bian.assetsecuritization.dto.ExchangeSecuritizationRequest;
import org.museframework.bian.assetsecuritization.dto.ExchangeSecuritizationResponse;
import org.museframework.bian.assetsecuritization.dto.InitiateSecuritizationRequest;
import org.museframework.bian.assetsecuritization.dto.InitiateSecuritizationResponse;
import org.museframework.bian.assetsecuritization.dto.RequestSecuritizationRequest;
import org.museframework.bian.assetsecuritization.dto.RequestSecuritizationResponse;
import org.museframework.bian.assetsecuritization.dto.RetrieveSecuritizationRequest;
import org.museframework.bian.assetsecuritization.dto.RetrieveSecuritizationResponse;
import org.museframework.bian.assetsecuritization.dto.UpdateSecuritizationRequest;
import org.museframework.bian.assetsecuritization.dto.UpdateSecuritizationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization.  Example: Execute a payment transaction.")
@GenericDomain(name="AssetSecuritization", group="Securitization")
public interface BqSecuritization {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Securitization processing")
    ExchangeSecuritizationResponse exchangeSecuritization(ExchangeSecuritizationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Securitization")
    InitiateSecuritizationResponse initiateSecuritization(InitiateSecuritizationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Securitization")
    RetrieveSecuritizationResponse retrieveSecuritization(RetrieveSecuritizationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Securitization")
    RequestSecuritizationResponse requestSecuritization(RequestSecuritizationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Securitization")
    UpdateSecuritizationResponse updateSecuritization(UpdateSecuritizationRequest req);
}