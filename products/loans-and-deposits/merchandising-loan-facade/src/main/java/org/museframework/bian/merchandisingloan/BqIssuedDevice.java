package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.InitiateIssuedDeviceRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateIssuedDeviceResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveIssuedDeviceRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveIssuedDeviceResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateIssuedDeviceRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateIssuedDeviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="IssuedDevice")
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