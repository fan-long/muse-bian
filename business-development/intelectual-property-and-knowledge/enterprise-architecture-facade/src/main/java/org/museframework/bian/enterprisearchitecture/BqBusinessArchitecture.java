package org.museframework.bian.enterprisearchitecture;

import org.museframework.bian.enterprisearchitecture.dto.CaptureBusinessArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.CaptureBusinessArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.RequestBusinessArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.RequestBusinessArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveBusinessArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveBusinessArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.UpdateBusinessArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.UpdateBusinessArchitectureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="EnterpriseArchitecture", group="BusinessArchitecture")
public interface BqBusinessArchitecture {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Business Architecture activity or event related information")
    CaptureBusinessArchitectureResponse captureBusinessArchitecture(CaptureBusinessArchitectureRequest req);

    @Description("ReBQ Retrieve details about any aspect of Business Architecture")
    RetrieveBusinessArchitectureResponse retrieveBusinessArchitecture(RetrieveBusinessArchitectureRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Business Architecture")
    RequestBusinessArchitectureResponse requestBusinessArchitecture(RequestBusinessArchitectureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Business Architecture")
    UpdateBusinessArchitectureResponse updateBusinessArchitecture(UpdateBusinessArchitectureRequest req);
}