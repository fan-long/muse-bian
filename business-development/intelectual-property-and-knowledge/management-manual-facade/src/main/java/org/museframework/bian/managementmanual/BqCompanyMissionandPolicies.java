package org.museframework.bian.managementmanual;

import org.museframework.bian.managementmanual.dto.CaptureCompanyMissionandPoliciesRequest;
import org.museframework.bian.managementmanual.dto.CaptureCompanyMissionandPoliciesResponse;
import org.museframework.bian.managementmanual.dto.InitiateCompanyMissionandPoliciesRequest;
import org.museframework.bian.managementmanual.dto.InitiateCompanyMissionandPoliciesResponse;
import org.museframework.bian.managementmanual.dto.RetrieveCompanyMissionandPoliciesRequest;
import org.museframework.bian.managementmanual.dto.RetrieveCompanyMissionandPoliciesResponse;
import org.museframework.bian.managementmanual.dto.UpdateCompanyMissionandPoliciesRequest;
import org.museframework.bian.managementmanual.dto.UpdateCompanyMissionandPoliciesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ManagementManual", group="CompanyMissionandPolicies")
public interface BqCompanyMissionandPolicies {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Company Mission and Policies activity or event related information")
    CaptureCompanyMissionandPoliciesResponse captureCompanyMissionandPolicies(CaptureCompanyMissionandPoliciesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Company Mission and Policies")
    InitiateCompanyMissionandPoliciesResponse initiateCompanyMissionandPolicies(InitiateCompanyMissionandPoliciesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Company Mission and Policies")
    RetrieveCompanyMissionandPoliciesResponse retrieveCompanyMissionandPolicies(RetrieveCompanyMissionandPoliciesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Company Mission and Policies")
    UpdateCompanyMissionandPoliciesResponse updateCompanyMissionandPolicies(UpdateCompanyMissionandPoliciesRequest req);
}