package org.museframework.bian.managementmanual;

import org.museframework.bian.managementmanual.dto.CaptureOperationalandProductionProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.CaptureOperationalandProductionProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.InitiateOperationalandProductionProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.InitiateOperationalandProductionProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.RetrieveOperationalandProductionProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.RetrieveOperationalandProductionProceduresandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.UpdateOperationalandProductionProceduresandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.UpdateOperationalandProductionProceduresandGuidelinesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ManagementManual", group="OperationalandProductionProceduresandGuidelines")
public interface BqOperationalandProductionProceduresandGuidelines {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Operational and Production Procedures and Guidelines activity or event related information")
    CaptureOperationalandProductionProceduresandGuidelinesResponse captureOperationalandProductionProceduresandGuidelines(CaptureOperationalandProductionProceduresandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Operational and Production Procedures and Guidelines")
    InitiateOperationalandProductionProceduresandGuidelinesResponse initiateOperationalandProductionProceduresandGuidelines(InitiateOperationalandProductionProceduresandGuidelinesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Operational and Production Procedures and Guidelines")
    RetrieveOperationalandProductionProceduresandGuidelinesResponse retrieveOperationalandProductionProceduresandGuidelines(RetrieveOperationalandProductionProceduresandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Operational and Production Procedures and Guidelines")
    UpdateOperationalandProductionProceduresandGuidelinesResponse updateOperationalandProductionProceduresandGuidelines(UpdateOperationalandProductionProceduresandGuidelinesRequest req);
}