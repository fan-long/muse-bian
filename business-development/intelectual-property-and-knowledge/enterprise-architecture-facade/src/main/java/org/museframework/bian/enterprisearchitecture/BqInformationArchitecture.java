package org.museframework.bian.enterprisearchitecture;

import org.museframework.bian.enterprisearchitecture.dto.CaptureInformationArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.CaptureInformationArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.RequestInformationArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.RequestInformationArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveInformationArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveInformationArchitectureResponse;
import org.museframework.bian.enterprisearchitecture.dto.UpdateInformationArchitectureRequest;
import org.museframework.bian.enterprisearchitecture.dto.UpdateInformationArchitectureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="EnterpriseArchitecture", group="InformationArchitecture")
public interface BqInformationArchitecture {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Information Architecture activity or event related information")
    CaptureInformationArchitectureResponse captureInformationArchitecture(CaptureInformationArchitectureRequest req);

    @Description("ReBQ Retrieve details about any aspect of Information Architecture")
    RetrieveInformationArchitectureResponse retrieveInformationArchitecture(RetrieveInformationArchitectureRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Information Architecture")
    RequestInformationArchitectureResponse requestInformationArchitecture(RequestInformationArchitectureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Information Architecture")
    UpdateInformationArchitectureResponse updateInformationArchitecture(UpdateInformationArchitectureRequest req);
}