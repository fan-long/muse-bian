package org.museframework.bian.currentaccount;

import org.museframework.bian.currentaccount.dto.InitiateIssuedDeviceRequest;
import org.museframework.bian.currentaccount.dto.InitiateIssuedDeviceResponse;
import org.museframework.bian.currentaccount.dto.RequestIssuedDeviceRequest;
import org.museframework.bian.currentaccount.dto.RequestIssuedDeviceResponse;
import org.museframework.bian.currentaccount.dto.RetrieveIssuedDeviceRequest;
import org.museframework.bian.currentaccount.dto.RetrieveIssuedDeviceResponse;
import org.museframework.bian.currentaccount.dto.UpdateIssuedDeviceRequest;
import org.museframework.bian.currentaccount.dto.UpdateIssuedDeviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CurrentAccount", group="IssuedDevice")
public interface BqIssuedDevice {
    @GenericDtxEndpoint
    @Description("InBQ Initiate the provision of issued inventory for the account (include initial issuance)")
    InitiateIssuedDeviceResponse initiateIssuedDevice(InitiateIssuedDeviceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the issued inventory details and provisioning configuration or status")
    UpdateIssuedDeviceResponse updateIssuedDevice(UpdateIssuedDeviceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request changes or replacement device/inventory")
    RequestIssuedDeviceResponse requestIssuedDevice(RequestIssuedDeviceRequest req);

    @Description("ReBQ Retrieve details about issued device/inventory")
    RetrieveIssuedDeviceResponse retrieveIssuedDevice(RetrieveIssuedDeviceRequest req);
}