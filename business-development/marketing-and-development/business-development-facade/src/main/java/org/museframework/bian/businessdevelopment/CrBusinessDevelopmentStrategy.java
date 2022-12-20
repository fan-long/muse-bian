package org.museframework.bian.businessdevelopment;

import org.museframework.bian.businessdevelopment.dto.CaptureBusinessDevelopmentStrategyRequest;
import org.museframework.bian.businessdevelopment.dto.CaptureBusinessDevelopmentStrategyResponse;
import org.museframework.bian.businessdevelopment.dto.CreateBusinessDevelopmentStrategyRequest;
import org.museframework.bian.businessdevelopment.dto.CreateBusinessDevelopmentStrategyResponse;
import org.museframework.bian.businessdevelopment.dto.RequestBusinessDevelopmentStrategyRequest;
import org.museframework.bian.businessdevelopment.dto.RequestBusinessDevelopmentStrategyResponse;
import org.museframework.bian.businessdevelopment.dto.RetrieveBusinessDevelopmentStrategyRequest;
import org.museframework.bian.businessdevelopment.dto.RetrieveBusinessDevelopmentStrategyResponse;
import org.museframework.bian.businessdevelopment.dto.UpdateBusinessDevelopmentStrategyRequest;
import org.museframework.bian.businessdevelopment.dto.UpdateBusinessDevelopmentStrategyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Define the policies, goals & objectives and strategies for an organizational entity or unit  within Business Development.  Example: Direct a division of the enterprise.")
@GenericDomain(name="BusinessDevelopment", group="BusinessDevelopmentStrategy")
public interface CrBusinessDevelopmentStrategy {
    @GenericDtxEndpoint
    @Description("CrCR Create a business development strategy for the enterprise or division")
    CreateBusinessDevelopmentStrategyResponse createBusinessDevelopmentStrategy(CreateBusinessDevelopmentStrategyRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of the business development strategy")
    UpdateBusinessDevelopmentStrategyResponse updateBusinessDevelopmentStrategy(UpdateBusinessDevelopmentStrategyRequest req);

    @GenericDtxEndpoint
    @Description("CaCR Capture activity details related to implementation of the strategy")
    CaptureBusinessDevelopmentStrategyResponse captureBusinessDevelopmentStrategy(CaptureBusinessDevelopmentStrategyRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention")
    RequestBusinessDevelopmentStrategyResponse requestBusinessDevelopmentStrategy(RequestBusinessDevelopmentStrategyRequest req);

    @Description("ReCR Retrieve details relating to the strategy and any supporting activities")
    RetrieveBusinessDevelopmentStrategyResponse retrieveBusinessDevelopmentStrategy(RetrieveBusinessDevelopmentStrategyRequest req);
}