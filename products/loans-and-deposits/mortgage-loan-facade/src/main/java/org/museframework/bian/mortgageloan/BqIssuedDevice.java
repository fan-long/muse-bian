package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.InitiateIssuedDeviceRequest;
import org.museframework.bian.mortgageloan.dto.InitiateIssuedDeviceResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveIssuedDeviceRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveIssuedDeviceResponse;
import org.museframework.bian.mortgageloan.dto.UpdateIssuedDeviceRequest;
import org.museframework.bian.mortgageloan.dto.UpdateIssuedDeviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="IssuedDevice")
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