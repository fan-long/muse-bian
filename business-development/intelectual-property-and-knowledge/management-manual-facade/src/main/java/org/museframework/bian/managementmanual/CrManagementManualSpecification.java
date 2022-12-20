package org.museframework.bian.managementmanual;

import org.museframework.bian.managementmanual.dto.CaptureManagementManualSpecificationRequest;
import org.museframework.bian.managementmanual.dto.CaptureManagementManualSpecificationResponse;
import org.museframework.bian.managementmanual.dto.ControlManagementManualSpecificationRequest;
import org.museframework.bian.managementmanual.dto.ControlManagementManualSpecificationResponse;
import org.museframework.bian.managementmanual.dto.ExchangeManagementManualSpecificationRequest;
import org.museframework.bian.managementmanual.dto.ExchangeManagementManualSpecificationResponse;
import org.museframework.bian.managementmanual.dto.InitiateManagementManualSpecificationRequest;
import org.museframework.bian.managementmanual.dto.InitiateManagementManualSpecificationResponse;
import org.museframework.bian.managementmanual.dto.RequestManagementManualSpecificationRequest;
import org.museframework.bian.managementmanual.dto.RequestManagementManualSpecificationResponse;
import org.museframework.bian.managementmanual.dto.RetrieveManagementManualSpecificationRequest;
import org.museframework.bian.managementmanual.dto.RetrieveManagementManualSpecificationResponse;
import org.museframework.bian.managementmanual.dto.UpdateManagementManualSpecificationRequest;
import org.museframework.bian.managementmanual.dto.UpdateManagementManualSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ManagementManual", group="ManagementManualSpecification")
public interface CrManagementManualSpecification {
    @GenericDtxEndpoint
    @Description("CaCR Capture Management Manual Specification activity or event related information")
    CaptureManagementManualSpecificationResponse captureManagementManualSpecification(CaptureManagementManualSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Management Manual Specification")
    ControlManagementManualSpecificationResponse controlManagementManualSpecification(ControlManagementManualSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Management Manual Specification processing")
    ExchangeManagementManualSpecificationResponse exchangeManagementManualSpecification(ExchangeManagementManualSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Management Manual Specification")
    InitiateManagementManualSpecificationResponse initiateManagementManualSpecification(InitiateManagementManualSpecificationRequest req);

    @Description("ReCR Retrieve details about any aspect of Management Manual Specification")
    RetrieveManagementManualSpecificationResponse retrieveManagementManualSpecification(RetrieveManagementManualSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Management Manual Specification")
    RequestManagementManualSpecificationResponse requestManagementManualSpecification(RequestManagementManualSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Management Manual Specification")
    UpdateManagementManualSpecificationResponse updateManagementManualSpecification(UpdateManagementManualSpecificationRequest req);
}