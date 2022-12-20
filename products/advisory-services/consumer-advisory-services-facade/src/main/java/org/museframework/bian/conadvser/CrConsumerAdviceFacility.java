package org.museframework.bian.conadvser;

import org.museframework.bian.conadvser.dto.InitiateConsumerAdviceFacilityRequest;
import org.museframework.bian.conadvser.dto.InitiateConsumerAdviceFacilityResponse;
import org.museframework.bian.conadvser.dto.RequestConsumerAdviceFacilityRequest;
import org.museframework.bian.conadvser.dto.RequestConsumerAdviceFacilityResponse;
import org.museframework.bian.conadvser.dto.RetrieveConsumerAdviceFacilityRequest;
import org.museframework.bian.conadvser.dto.RetrieveConsumerAdviceFacilityResponse;
import org.museframework.bian.conadvser.dto.UpdateConsumerAdviceFacilityRequest;
import org.museframework.bian.conadvser.dto.UpdateConsumerAdviceFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Consumer Advisory Services. ")
@GenericDomain(name="ConsumerAdvisoryServices", group="ConsumerAdviceFacility")
public interface CrConsumerAdviceFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a consumer advisory session")
    InitiateConsumerAdviceFacilityResponse initiateConsumerAdviceFacility(InitiateConsumerAdviceFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for a consumer advisory session")
    UpdateConsumerAdviceFacilityResponse updateConsumerAdviceFacility(UpdateConsumerAdviceFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in a session")
    RequestConsumerAdviceFacilityResponse requestConsumerAdviceFacility(RequestConsumerAdviceFacilityRequest req);

    @Description("ReCR Retrieve details about a consumer advisory session")
    RetrieveConsumerAdviceFacilityResponse retrieveConsumerAdviceFacility(RetrieveConsumerAdviceFacilityRequest req);
}