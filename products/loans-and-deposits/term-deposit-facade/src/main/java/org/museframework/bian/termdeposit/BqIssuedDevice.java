package org.museframework.bian.termdeposit;

import org.museframework.bian.termdeposit.dto.InitiateIssuedDeviceRequest;
import org.museframework.bian.termdeposit.dto.InitiateIssuedDeviceResponse;
import org.museframework.bian.termdeposit.dto.RequestIssuedDeviceRequest;
import org.museframework.bian.termdeposit.dto.RequestIssuedDeviceResponse;
import org.museframework.bian.termdeposit.dto.RetrieveIssuedDeviceRequest;
import org.museframework.bian.termdeposit.dto.RetrieveIssuedDeviceResponse;
import org.museframework.bian.termdeposit.dto.UpdateIssuedDeviceRequest;
import org.museframework.bian.termdeposit.dto.UpdateIssuedDeviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="TermDeposit", group="IssuedDevice")
public interface BqIssuedDevice {
    @GenericDtxEndpoint
    @Description("InBQ Initiate the provision of issued inventory for the account (include initial issuance)")
    InitiateIssuedDeviceResponse initiateIssuedDevice(InitiateIssuedDeviceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the issued inventory details and provisioning configuration or status")
    UpdateIssuedDeviceResponse updateIssuedDevice(UpdateIssuedDeviceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request changes or replacement device or inventory")
    RequestIssuedDeviceResponse requestIssuedDevice(RequestIssuedDeviceRequest req);

    @Description("ReBQ Retrieve details about issued devices or inventory")
    RetrieveIssuedDeviceResponse retrieveIssuedDevice(RetrieveIssuedDeviceRequest req);
}