package org.museframework.bian.itstaandgui;

import org.museframework.bian.itstaandgui.dto.CaptureDevelopmentToolingandEnvironmentRequest;
import org.museframework.bian.itstaandgui.dto.CaptureDevelopmentToolingandEnvironmentResponse;
import org.museframework.bian.itstaandgui.dto.ExchangeDevelopmentToolingandEnvironmentRequest;
import org.museframework.bian.itstaandgui.dto.ExchangeDevelopmentToolingandEnvironmentResponse;
import org.museframework.bian.itstaandgui.dto.InitiateDevelopmentToolingandEnvironmentRequest;
import org.museframework.bian.itstaandgui.dto.InitiateDevelopmentToolingandEnvironmentResponse;
import org.museframework.bian.itstaandgui.dto.RequestDevelopmentToolingandEnvironmentRequest;
import org.museframework.bian.itstaandgui.dto.RequestDevelopmentToolingandEnvironmentResponse;
import org.museframework.bian.itstaandgui.dto.RetrieveDevelopmentToolingandEnvironmentRequest;
import org.museframework.bian.itstaandgui.dto.RetrieveDevelopmentToolingandEnvironmentResponse;
import org.museframework.bian.itstaandgui.dto.UpdateDevelopmentToolingandEnvironmentRequest;
import org.museframework.bian.itstaandgui.dto.UpdateDevelopmentToolingandEnvironmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="ITStandardsAndGuidelines", group="DevelopmentToolingandEnvironment")
public interface BqDevelopmentToolingandEnvironment {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Development Tooling and Environment activity or event related information")
    CaptureDevelopmentToolingandEnvironmentResponse captureDevelopmentToolingandEnvironment(CaptureDevelopmentToolingandEnvironmentRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Development Tooling and Environment processing")
    ExchangeDevelopmentToolingandEnvironmentResponse exchangeDevelopmentToolingandEnvironment(ExchangeDevelopmentToolingandEnvironmentRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Development Tooling and Environment")
    InitiateDevelopmentToolingandEnvironmentResponse initiateDevelopmentToolingandEnvironment(InitiateDevelopmentToolingandEnvironmentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Development Tooling and Environment")
    RetrieveDevelopmentToolingandEnvironmentResponse retrieveDevelopmentToolingandEnvironment(RetrieveDevelopmentToolingandEnvironmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Development Tooling and Environment")
    RequestDevelopmentToolingandEnvironmentResponse requestDevelopmentToolingandEnvironment(RequestDevelopmentToolingandEnvironmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Development Tooling and Environment")
    UpdateDevelopmentToolingandEnvironmentResponse updateDevelopmentToolingandEnvironment(UpdateDevelopmentToolingandEnvironmentRequest req);
}