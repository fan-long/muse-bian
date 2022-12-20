package org.museframework.bian.creditcard;

import org.museframework.bian.creditcard.dto.InitiateIssuedDeviceRequest;
import org.museframework.bian.creditcard.dto.InitiateIssuedDeviceResponse;
import org.museframework.bian.creditcard.dto.RequestIssuedDeviceRequest;
import org.museframework.bian.creditcard.dto.RequestIssuedDeviceResponse;
import org.museframework.bian.creditcard.dto.RetrieveIssuedDeviceRequest;
import org.museframework.bian.creditcard.dto.RetrieveIssuedDeviceResponse;
import org.museframework.bian.creditcard.dto.UpdateIssuedDeviceRequest;
import org.museframework.bian.creditcard.dto.UpdateIssuedDeviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CreditCard", group="IssuedDevice")
public interface BqIssuedDevice {
    @GenericDtxEndpoint
    @Description("InBQ Initiate/enable a type of device for the card account")
    InitiateIssuedDeviceResponse initiateIssuedDevice(InitiateIssuedDeviceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about an issued device")
    UpdateIssuedDeviceResponse updateIssuedDevice(UpdateIssuedDeviceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request the issuance of a device (e.g. a new card)")
    RequestIssuedDeviceResponse requestIssuedDevice(RequestIssuedDeviceRequest req);

    @Description("ReBQ Retrieve details about an issued device")
    RetrieveIssuedDeviceResponse retrieveIssuedDevice(RetrieveIssuedDeviceRequest req);
}