package org.museframework.bian.managementmanual;

import org.museframework.bian.managementmanual.dto.CaptureOperationalSecurityProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.CaptureOperationalSecurityProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.InitiateOperationalSecurityProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.InitiateOperationalSecurityProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.RetrieveOperationalSecurityProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.RetrieveOperationalSecurityProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.UpdateOperationalSecurityProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.UpdateOperationalSecurityProceduresandGuidelinesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ManagementManual", group="OperationalSecurityProceduresandGuidelines")
public interface BqOperationalSecurityProceduresandGuidelines {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Operational Security Procedures and Guidelines activity or event related information")
    CaptureOperationalSecurityProceduresandGuidelinesResponse captureOperationalSecurityProceduresandGuidelines(CaptureOperationalSecurityProceduresandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Operational Security Procedures and Guidelines")
    InitiateOperationalSecurityProceduresandGuidelinesResponse initiateOperationalSecurityProceduresandGuidelines(InitiateOperationalSecurityProceduresandGuidelinesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Operational Security Procedures and Guidelines")
    RetrieveOperationalSecurityProceduresandGuidelinesResponse retrieveOperationalSecurityProceduresandGuidelines(RetrieveOperationalSecurityProceduresandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Operational Security Procedures and Guidelines")
    UpdateOperationalSecurityProceduresandGuidelinesResponse updateOperationalSecurityProceduresandGuidelines(UpdateOperationalSecurityProceduresandGuidelinesRequest req);
}