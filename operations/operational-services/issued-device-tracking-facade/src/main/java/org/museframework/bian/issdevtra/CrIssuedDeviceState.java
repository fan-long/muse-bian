package org.museframework.bian.issdevtra;

import org.museframework.bian.issdevtra.dto.InitiateIssuedDeviceStateRequest;
import org.museframework.bian.issdevtra.dto.InitiateIssuedDeviceStateResponse;
import org.museframework.bian.issdevtra.dto.RetrieveIssuedDeviceStateRequest;
import org.museframework.bian.issdevtra.dto.RetrieveIssuedDeviceStateResponse;
import org.museframework.bian.issdevtra.dto.UpdateIssuedDeviceStateRequest;
import org.museframework.bian.issdevtra.dto.UpdateIssuedDeviceStateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Monitor and define the status/rating of some entity within Issued Device Tracking. ")
@GenericDomain(name="IssuedDeviceTracking", group="IssuedDeviceState")
public interface CrIssuedDeviceState {
    @GenericDtxEndpoint
    @Description("InCR Initiate tracking for an allocated issued device")
    InitiateIssuedDeviceStateResponse initiateIssuedDeviceState(InitiateIssuedDeviceStateRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a tracked issued device")
    UpdateIssuedDeviceStateResponse updateIssuedDeviceState(UpdateIssuedDeviceStateRequest req);

    @Description("ReCR Retrieve details about a tracked device")
    RetrieveIssuedDeviceStateResponse retrieveIssuedDeviceState(RetrieveIssuedDeviceStateRequest req);
}