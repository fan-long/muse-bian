package org.museframework.bian.itstaandgui;

import org.museframework.bian.itstaandgui.dto.CaptureITPoliciesandGuidelinesRequest;
import org.museframework.bian.itstaandgui.dto.CaptureITPoliciesandGuidelinesResponse;
import org.museframework.bian.itstaandgui.dto.ExchangeITPoliciesandGuidelinesRequest;
import org.museframework.bian.itstaandgui.dto.ExchangeITPoliciesandGuidelinesResponse;
import org.museframework.bian.itstaandgui.dto.InitiateITPoliciesandGuidelinesRequest;
import org.museframework.bian.itstaandgui.dto.InitiateITPoliciesandGuidelinesResponse;
import org.museframework.bian.itstaandgui.dto.RequestITPoliciesandGuidelinesRequest;
import org.museframework.bian.itstaandgui.dto.RequestITPoliciesandGuidelinesResponse;
import org.museframework.bian.itstaandgui.dto.RetrieveITPoliciesandGuidelinesRequest;
import org.museframework.bian.itstaandgui.dto.RetrieveITPoliciesandGuidelinesResponse;
import org.museframework.bian.itstaandgui.dto.UpdateITPoliciesandGuidelinesRequest;
import org.museframework.bian.itstaandgui.dto.UpdateITPoliciesandGuidelinesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="ITStandardsAndGuidelines", group="ITPoliciesandGuidelines")
public interface BqITPoliciesandGuidelines {
    @GenericDtxEndpoint
    @Description("CaBQ Capture IT Policies and Guidelines activity or event related information")
    CaptureITPoliciesandGuidelinesResponse captureITPoliciesandGuidelines(CaptureITPoliciesandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of IT Policies and Guidelines processing")
    ExchangeITPoliciesandGuidelinesResponse exchangeITPoliciesandGuidelines(ExchangeITPoliciesandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new IT Policies and Guidelines")
    InitiateITPoliciesandGuidelinesResponse initiateITPoliciesandGuidelines(InitiateITPoliciesandGuidelinesRequest req);

    @Description("ReBQ Retrieve details about any aspect of IT Policies and Guidelines")
    RetrieveITPoliciesandGuidelinesResponse retrieveITPoliciesandGuidelines(RetrieveITPoliciesandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to IT Policies and Guidelines")
    RequestITPoliciesandGuidelinesResponse requestITPoliciesandGuidelines(RequestITPoliciesandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to IT Policies and Guidelines")
    UpdateITPoliciesandGuidelinesResponse updateITPoliciesandGuidelines(UpdateITPoliciesandGuidelinesRequest req);
}