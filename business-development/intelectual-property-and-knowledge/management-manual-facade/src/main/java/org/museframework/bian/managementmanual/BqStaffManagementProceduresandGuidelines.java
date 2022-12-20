package org.museframework.bian.managementmanual;

import org.museframework.bian.managementmanual.dto.CaptureStaffManagementProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.CaptureStaffManagementProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.InitiateStaffManagementProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.InitiateStaffManagementProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.RetrieveStaffManagementProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.RetrieveStaffManagementProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.UpdateStaffManagementProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.UpdateStaffManagementProceduresandGuidelinesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ManagementManual", group="StaffManagementProceduresandGuidelines")
public interface BqStaffManagementProceduresandGuidelines {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Staff Management Procedures and Guidelines activity or event related information")
    CaptureStaffManagementProceduresandGuidelinesResponse captureStaffManagementProceduresandGuidelines(CaptureStaffManagementProceduresandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Staff Management Procedures and Guidelines")
    InitiateStaffManagementProceduresandGuidelinesResponse initiateStaffManagementProceduresandGuidelines(InitiateStaffManagementProceduresandGuidelinesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Staff Management Procedures and Guidelines")
    RetrieveStaffManagementProceduresandGuidelinesResponse retrieveStaffManagementProceduresandGuidelines(RetrieveStaffManagementProceduresandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Staff Management Procedures and Guidelines")
    UpdateStaffManagementProceduresandGuidelinesResponse updateStaffManagementProceduresandGuidelines(UpdateStaffManagementProceduresandGuidelinesRequest req);
}