package org.museframework.bian.crerismod;

import org.museframework.bian.crerismod.dto.CaptureProductionRequest;
import org.museframework.bian.crerismod.dto.CaptureProductionResponse;
import org.museframework.bian.crerismod.dto.RequestProductionRequest;
import org.museframework.bian.crerismod.dto.RequestProductionResponse;
import org.museframework.bian.crerismod.dto.RetrieveProductionRequest;
import org.museframework.bian.crerismod.dto.RetrieveProductionResponse;
import org.museframework.bian.crerismod.dto.UpdateProductionRequest;
import org.museframework.bian.crerismod.dto.UpdateProductionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="CreditRiskModels", group="Production")
public interface BqProduction {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Production activity or event related information")
    CaptureProductionResponse captureProduction(CaptureProductionRequest req);

    @Description("ReBQ Retrieve details about any aspect of Production")
    RetrieveProductionResponse retrieveProduction(RetrieveProductionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Production")
    RequestProductionResponse requestProduction(RequestProductionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Production")
    UpdateProductionResponse updateProduction(UpdateProductionRequest req);
}