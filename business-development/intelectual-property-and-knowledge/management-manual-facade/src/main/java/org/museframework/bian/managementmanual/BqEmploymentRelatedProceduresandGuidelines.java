package org.museframework.bian.managementmanual;

import org.museframework.bian.managementmanual.dto.CaptureEmploymentRelatedProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.CaptureEmploymentRelatedProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.InitiateEmploymentRelatedProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.InitiateEmploymentRelatedProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.RetrieveEmploymentRelatedProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.RetrieveEmploymentRelatedProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.UpdateEmploymentRelatedProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.UpdateEmploymentRelatedProceduresandGuidelinesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ManagementManual", group="EmploymentRelatedProceduresandGuidelines")
public interface BqEmploymentRelatedProceduresandGuidelines {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Employment Related Procedures and Guidelines activity or event related information")
    CaptureEmploymentRelatedProceduresandGuidelinesResponse captureEmploymentRelatedProceduresandGuidelines(CaptureEmploymentRelatedProceduresandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Employment Related Procedures and Guidelines")
    InitiateEmploymentRelatedProceduresandGuidelinesResponse initiateEmploymentRelatedProceduresandGuidelines(InitiateEmploymentRelatedProceduresandGuidelinesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Employment Related Procedures and Guidelines")
    RetrieveEmploymentRelatedProceduresandGuidelinesResponse retrieveEmploymentRelatedProceduresandGuidelines(RetrieveEmploymentRelatedProceduresandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Employment Related Procedures and Guidelines")
    UpdateEmploymentRelatedProceduresandGuidelinesResponse updateEmploymentRelatedProceduresandGuidelines(UpdateEmploymentRelatedProceduresandGuidelinesRequest req);
}