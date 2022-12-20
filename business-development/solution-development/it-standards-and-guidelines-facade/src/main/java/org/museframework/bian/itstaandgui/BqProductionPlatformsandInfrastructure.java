package org.museframework.bian.itstaandgui;

import org.museframework.bian.itstaandgui.dto.CaptureProductionPlatformsandInfrastructureRequest;
import org.museframework.bian.itstaandgui.dto.CaptureProductionPlatformsandInfrastructureResponse;
import org.museframework.bian.itstaandgui.dto.ExchangeProductionPlatformsandInfrastructureRequest;
import org.museframework.bian.itstaandgui.dto.ExchangeProductionPlatformsandInfrastructureResponse;
import org.museframework.bian.itstaandgui.dto.InitiateProductionPlatformsandInfrastructureRequest;
import org.museframework.bian.itstaandgui.dto.InitiateProductionPlatformsandInfrastructureResponse;
import org.museframework.bian.itstaandgui.dto.RequestProductionPlatformsandInfrastructureRequest;
import org.museframework.bian.itstaandgui.dto.RequestProductionPlatformsandInfrastructureResponse;
import org.museframework.bian.itstaandgui.dto.RetrieveProductionPlatformsandInfrastructureRequest;
import org.museframework.bian.itstaandgui.dto.RetrieveProductionPlatformsandInfrastructureResponse;
import org.museframework.bian.itstaandgui.dto.UpdateProductionPlatformsandInfrastructureRequest;
import org.museframework.bian.itstaandgui.dto.UpdateProductionPlatformsandInfrastructureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="ITStandardsAndGuidelines", group="ProductionPlatformsandInfrastructure")
public interface BqProductionPlatformsandInfrastructure {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Production Platforms and Infrastructure activity or event related information")
    CaptureProductionPlatformsandInfrastructureResponse captureProductionPlatformsandInfrastructure(CaptureProductionPlatformsandInfrastructureRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Production Platforms and Infrastructure processing")
    ExchangeProductionPlatformsandInfrastructureResponse exchangeProductionPlatformsandInfrastructure(ExchangeProductionPlatformsandInfrastructureRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Production Platforms and Infrastructure")
    InitiateProductionPlatformsandInfrastructureResponse initiateProductionPlatformsandInfrastructure(InitiateProductionPlatformsandInfrastructureRequest req);

    @Description("ReBQ Retrieve details about any aspect of Production Platforms and Infrastructure")
    RetrieveProductionPlatformsandInfrastructureResponse retrieveProductionPlatformsandInfrastructure(RetrieveProductionPlatformsandInfrastructureRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Production Platforms and Infrastructure")
    RequestProductionPlatformsandInfrastructureResponse requestProductionPlatformsandInfrastructure(RequestProductionPlatformsandInfrastructureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Production Platforms and Infrastructure")
    UpdateProductionPlatformsandInfrastructureResponse updateProductionPlatformsandInfrastructure(UpdateProductionPlatformsandInfrastructureRequest req);
}