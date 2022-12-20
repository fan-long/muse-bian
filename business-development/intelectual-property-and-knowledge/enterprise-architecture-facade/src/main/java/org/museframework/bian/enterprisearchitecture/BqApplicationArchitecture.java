package org.museframework.bian.enterprisearchitecture;

import org.museframework.bian.enterprisearchitecture.dto.CaptureApplicationArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.CaptureApplicationArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.RequestApplicationArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.RequestApplicationArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveApplicationArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveApplicationArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.UpdateApplicationArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.UpdateApplicationArchitectureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="EnterpriseArchitecture", group="ApplicationArchitecture")
public interface BqApplicationArchitecture {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Application Architecture activity or event related information")
    CaptureApplicationArchitectureResponse captureApplicationArchitecture(CaptureApplicationArchitectureRequest req);

    @Description("ReBQ Retrieve details about any aspect of Application Architecture")
    RetrieveApplicationArchitectureResponse retrieveApplicationArchitecture(RetrieveApplicationArchitectureRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Application Architecture")
    RequestApplicationArchitectureResponse requestApplicationArchitecture(RequestApplicationArchitectureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Application Architecture")
    UpdateApplicationArchitectureResponse updateApplicationArchitecture(UpdateApplicationArchitectureRequest req);
}