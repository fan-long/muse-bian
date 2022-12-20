package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.InitiateIssuedDeviceRequest;
import org.museframework.bian.leasing.dto.InitiateIssuedDeviceResponse;
import org.museframework.bian.leasing.dto.RetrieveIssuedDeviceRequest;
import org.museframework.bian.leasing.dto.RetrieveIssuedDeviceResponse;
import org.museframework.bian.leasing.dto.UpdateIssuedDeviceRequest;
import org.museframework.bian.leasing.dto.UpdateIssuedDeviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="IssuedDevice")
public interface BqIssuedDevice {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Issued Device")
    InitiateIssuedDeviceResponse initiateIssuedDevice(InitiateIssuedDeviceRequest req);

    @Description("ReBQ Retrieve details about any aspect of Issued Device")
    RetrieveIssuedDeviceResponse retrieveIssuedDevice(RetrieveIssuedDeviceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Issued Device")
    UpdateIssuedDeviceResponse updateIssuedDevice(UpdateIssuedDeviceRequest req);
}