package org.museframework.bian.assetsecuritization;

import org.museframework.bian.assetsecuritization.dto.ExchangeSelectionRequest;
import org.museframework.bian.assetsecuritization.dto.ExchangeSelectionResponse;
import org.museframework.bian.assetsecuritization.dto.InitiateSelectionRequest;
import org.museframework.bian.assetsecuritization.dto.InitiateSelectionResponse;
import org.museframework.bian.assetsecuritization.dto.RequestSelectionRequest;
import org.museframework.bian.assetsecuritization.dto.RequestSelectionResponse;
import org.museframework.bian.assetsecuritization.dto.RetrieveSelectionRequest;
import org.museframework.bian.assetsecuritization.dto.RetrieveSelectionResponse;
import org.museframework.bian.assetsecuritization.dto.UpdateSelectionRequest;
import org.museframework.bian.assetsecuritization.dto.UpdateSelectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization.  Example: Execute a payment transaction.")
@GenericDomain(name="AssetSecuritization", group="Selection")
public interface BqSelection {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Selection processing")
    ExchangeSelectionResponse exchangeSelection(ExchangeSelectionRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Selection")
    InitiateSelectionResponse initiateSelection(InitiateSelectionRequest req);

    @Description("ReBQ Retrieve details about any aspect of Selection")
    RetrieveSelectionResponse retrieveSelection(RetrieveSelectionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Selection")
    RequestSelectionResponse requestSelection(RequestSelectionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Selection")
    UpdateSelectionResponse updateSelection(UpdateSelectionRequest req);
}