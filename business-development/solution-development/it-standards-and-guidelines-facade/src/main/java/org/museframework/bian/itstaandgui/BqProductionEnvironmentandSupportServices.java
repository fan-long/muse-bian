package org.museframework.bian.itstaandgui;

import org.museframework.bian.itstaandgui.dto.CaptureProductionEnvironmentandSupportServicesRequest;
import org.museframework.bian.itstaandgui.dto.CaptureProductionEnvironmentandSupportServicesResponse;
import org.museframework.bian.itstaandgui.dto.ExchangeProductionEnvironmentandSupportServicesRequest;
import org.museframework.bian.itstaandgui.dto.ExchangeProductionEnvironmentandSupportServicesResponse;
import org.museframework.bian.itstaandgui.dto.InitiateProductionEnvironmentandSupportServicesRequest;
import org.museframework.bian.itstaandgui.dto.InitiateProductionEnvironmentandSupportServicesResponse;
import org.museframework.bian.itstaandgui.dto.RequestProductionEnvironmentandSupportServicesRequest;
import org.museframework.bian.itstaandgui.dto.RequestProductionEnvironmentandSupportServicesResponse;
import org.museframework.bian.itstaandgui.dto.RetrieveProductionEnvironmentandSupportServicesRequest;
import org.museframework.bian.itstaandgui.dto.RetrieveProductionEnvironmentandSupportServicesResponse;
import org.museframework.bian.itstaandgui.dto.UpdateProductionEnvironmentandSupportServicesRequest;
import org.museframework.bian.itstaandgui.dto.UpdateProductionEnvironmentandSupportServicesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="ITStandardsAndGuidelines", group="ProductionEnvironmentandSupportServices")
public interface BqProductionEnvironmentandSupportServices {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Production Environment and Support Services activity or event related information")
    CaptureProductionEnvironmentandSupportServicesResponse captureProductionEnvironmentandSupportServices(CaptureProductionEnvironmentandSupportServicesRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Production Environment and Support Services processing")
    ExchangeProductionEnvironmentandSupportServicesResponse exchangeProductionEnvironmentandSupportServices(ExchangeProductionEnvironmentandSupportServicesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Production Environment and Support Services")
    InitiateProductionEnvironmentandSupportServicesResponse initiateProductionEnvironmentandSupportServices(InitiateProductionEnvironmentandSupportServicesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Production Environment and Support Services")
    RetrieveProductionEnvironmentandSupportServicesResponse retrieveProductionEnvironmentandSupportServices(RetrieveProductionEnvironmentandSupportServicesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Production Environment and Support Services")
    RequestProductionEnvironmentandSupportServicesResponse requestProductionEnvironmentandSupportServices(RequestProductionEnvironmentandSupportServicesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Production Environment and Support Services")
    UpdateProductionEnvironmentandSupportServicesResponse updateProductionEnvironmentandSupportServices(UpdateProductionEnvironmentandSupportServicesRequest req);
}