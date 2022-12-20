package org.museframework.bian.enterprisearchitecture;

import org.museframework.bian.enterprisearchitecture.dto.CaptureOrganizationRequest;
import org.museframework.bian.enterprisearchitecture.dto.CaptureOrganizationResponse;
import org.museframework.bian.enterprisearchitecture.dto.RequestOrganizationRequest;
import org.museframework.bian.enterprisearchitecture.dto.RequestOrganizationResponse;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveOrganizationRequest;
import org.museframework.bian.enterprisearchitecture.dto.RetrieveOrganizationResponse;
import org.museframework.bian.enterprisearchitecture.dto.UpdateOrganizationRequest;
import org.museframework.bian.enterprisearchitecture.dto.UpdateOrganizationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="EnterpriseArchitecture", group="Organization")
public interface BqOrganization {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Organization activity or event related information")
    CaptureOrganizationResponse captureOrganization(CaptureOrganizationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Organization")
    RetrieveOrganizationResponse retrieveOrganization(RetrieveOrganizationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Organization")
    RequestOrganizationResponse requestOrganization(RequestOrganizationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Organization")
    UpdateOrganizationResponse updateOrganization(UpdateOrganizationRequest req);
}