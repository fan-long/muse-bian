package org.museframework.bian.enterprisearchitecture;

import org.museframework.bian.enterprisearchitecture.dto.CaptureTechnologyInfrastructureRequest;
import org.museframework.bian.enterprisearchitecture.dto.CaptureTechnologyInfrastructureResponse;
import org.museframework.bian.enterprisearchitecture.dto.RequestTechnologyInfrastructureRequest;
import org.museframework.bian.enterprisearchitecture.dto.RequestTechnologyInfrastructureResponse;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveTechnologyInfrastructureRequest;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveTechnologyInfrastructureResponse;
import org.museframework.bian.enterprisearchitecture.dto.UpdateTechnologyInfrastructureRequest;
import org.museframework.bian.enterprisearchitecture.dto.UpdateTechnologyInfrastructureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="EnterpriseArchitecture", group="TechnologyInfrastructure")
public interface BqTechnologyInfrastructure {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Technology Infrastructure activity or event related information")
    CaptureTechnologyInfrastructureResponse captureTechnologyInfrastructure(CaptureTechnologyInfrastructureRequest req);

    @Description("ReBQ Retrieve details about any aspect of Technology Infrastructure")
    RetrieveTechnologyInfrastructureResponse retrieveTechnologyInfrastructure(RetrieveTechnologyInfrastructureRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Technology Infrastructure")
    RequestTechnologyInfrastructureResponse requestTechnologyInfrastructure(RequestTechnologyInfrastructureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Technology Infrastructure")
    UpdateTechnologyInfrastructureResponse updateTechnologyInfrastructure(UpdateTechnologyInfrastructureRequest req);
}