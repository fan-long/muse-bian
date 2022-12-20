package org.museframework.bian.ecmanddcm;

import org.museframework.bian.ecmanddcm.dto.InitiateECMAndDCMFacilityRequest;
import org.museframework.bian.ecmanddcm.dto.InitiateECMAndDCMFacilityResponse;
import org.museframework.bian.ecmanddcm.dto.RequestECMAndDCMFacilityRequest;
import org.museframework.bian.ecmanddcm.dto.RequestECMAndDCMFacilityResponse;
import org.museframework.bian.ecmanddcm.dto.RetrieveECMAndDCMFacilityRequest;
import org.museframework.bian.ecmanddcm.dto.RetrieveECMAndDCMFacilityResponse;
import org.museframework.bian.ecmanddcm.dto.UpdateECMAndDCMFacilityRequest;
import org.museframework.bian.ecmanddcm.dto.UpdateECMAndDCMFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within ECM And DCM. ")
@GenericDomain(name="ECMAndDCM", group="ECMAndDCMFacility")
public interface CrECMAndDCMFacility {
    @GenericDtxEndpoint
    @Description("InCR initiate an ECM And DCM transaction for a corporate customer")
    InitiateECMAndDCMFacilityResponse initiateECMAndDCMFacility(InitiateECMAndDCMFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active ECM And DCM transaction")
    UpdateECMAndDCMFacilityResponse updateECMAndDCMFacility(UpdateECMAndDCMFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention to an active ECM And DCM transaction")
    RequestECMAndDCMFacilityResponse requestECMAndDCMFacility(RequestECMAndDCMFacilityRequest req);

    @Description("ReCR Retrieve details about an active ECM And DCM transaction")
    RetrieveECMAndDCMFacilityResponse retrieveECMAndDCMFacility(RetrieveECMAndDCMFacilityRequest req);
}