package org.museframework.bian.assetsecuritization;

import org.museframework.bian.assetsecuritization.dto.ExchangePlacementRequest;
import org.museframework.bian.assetsecuritization.dto.ExchangePlacementResponse;
import org.museframework.bian.assetsecuritization.dto.InitiatePlacementRequest;
import org.museframework.bian.assetsecuritization.dto.InitiatePlacementResponse;
import org.museframework.bian.assetsecuritization.dto.RequestPlacementRequest;
import org.museframework.bian.assetsecuritization.dto.RequestPlacementResponse;
import org.museframework.bian.assetsecuritization.dto.RetrievePlacementRequest;
import org.museframework.bian.assetsecuritization.dto.RetrievePlacementResponse;
import org.museframework.bian.assetsecuritization.dto.UpdatePlacementRequest;
import org.museframework.bian.assetsecuritization.dto.UpdatePlacementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization.  Example: Execute a payment transaction.")
@GenericDomain(name="AssetSecuritization", group="Placement")
public interface BqPlacement {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Placement processing")
    ExchangePlacementResponse exchangePlacement(ExchangePlacementRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Placement")
    InitiatePlacementResponse initiatePlacement(InitiatePlacementRequest req);

    @Description("ReBQ Retrieve details about any aspect of Placement")
    RetrievePlacementResponse retrievePlacement(RetrievePlacementRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Placement")
    RequestPlacementResponse requestPlacement(RequestPlacementRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Placement")
    UpdatePlacementResponse updatePlacement(UpdatePlacementRequest req);
}