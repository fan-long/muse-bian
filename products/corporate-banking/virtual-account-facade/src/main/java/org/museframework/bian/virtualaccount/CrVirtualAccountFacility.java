package org.museframework.bian.virtualaccount;

import org.museframework.bian.virtualaccount.dto.CaptureVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.CaptureVirtualAccountFacilityResponse;
import org.museframework.bian.virtualaccount.dto.ControlVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.ControlVirtualAccountFacilityResponse;
import org.museframework.bian.virtualaccount.dto.ExchangeVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.ExchangeVirtualAccountFacilityResponse;
import org.museframework.bian.virtualaccount.dto.ExecuteVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.ExecuteVirtualAccountFacilityResponse;
import org.museframework.bian.virtualaccount.dto.GrantVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.GrantVirtualAccountFacilityResponse;
import org.museframework.bian.virtualaccount.dto.InitiateVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.InitiateVirtualAccountFacilityResponse;
import org.museframework.bian.virtualaccount.dto.RequestVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.RequestVirtualAccountFacilityResponse;
import org.museframework.bian.virtualaccount.dto.RetrieveVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.RetrieveVirtualAccountFacilityResponse;
import org.museframework.bian.virtualaccount.dto.UpdateVirtualAccountFacilityRequest;
import org.museframework.bian.virtualaccount.dto.UpdateVirtualAccountFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Virtual Account. ")
@GenericDomain(name="VirtualAccount", group="VirtualAccountFacility")
public interface CrVirtualAccountFacility {
    @GenericDtxEndpoint
    @Description("CaCR Capture Virtual Account Facility activity or event related information")
    CaptureVirtualAccountFacilityResponse captureVirtualAccountFacility(CaptureVirtualAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Virtual Account Facility")
    ControlVirtualAccountFacilityResponse controlVirtualAccountFacility(ControlVirtualAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Virtual Account Facility processing")
    ExchangeVirtualAccountFacilityResponse exchangeVirtualAccountFacility(ExchangeVirtualAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Virtual Account Facility")
    ExecuteVirtualAccountFacilityResponse executeVirtualAccountFacility(ExecuteVirtualAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Virtual Account Facility")
    GrantVirtualAccountFacilityResponse grantVirtualAccountFacility(GrantVirtualAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Virtual Account Facility")
    InitiateVirtualAccountFacilityResponse initiateVirtualAccountFacility(InitiateVirtualAccountFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Virtual Account Facility")
    RetrieveVirtualAccountFacilityResponse retrieveVirtualAccountFacility(RetrieveVirtualAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Virtual Account Facility")
    RequestVirtualAccountFacilityResponse requestVirtualAccountFacility(RequestVirtualAccountFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Virtual Account Facility")
    UpdateVirtualAccountFacilityResponse updateVirtualAccountFacility(UpdateVirtualAccountFacilityRequest req);
}