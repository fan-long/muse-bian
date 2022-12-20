package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.InitiateIssuedDeviceRequest;
import org.museframework.bian.casmanandaccser.dto.InitiateIssuedDeviceResponse;
import org.museframework.bian.casmanandaccser.dto.RequestIssuedDeviceRequest;
import org.museframework.bian.casmanandaccser.dto.RequestIssuedDeviceResponse;
import org.museframework.bian.casmanandaccser.dto.RetrieveIssuedDeviceRequest;
import org.museframework.bian.casmanandaccser.dto.RetrieveIssuedDeviceResponse;
import org.museframework.bian.casmanandaccser.dto.UpdateIssuedDeviceRequest;
import org.museframework.bian.casmanandaccser.dto.UpdateIssuedDeviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CashManagementAndAccountServices", group="IssuedDevice")
public interface BqIssuedDevice {
    @GenericDtxEndpoint
    @Description("InBQ Initiate the provision of issued inventory for the account")
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