package org.museframework.bian.atmnetope;

import org.museframework.bian.atmnetope.dto.ExchangeDeviceTrackingRequest;
import org.museframework.bian.atmnetope.dto.ExchangeDeviceTrackingResponse;
import org.museframework.bian.atmnetope.dto.ExecuteDeviceTrackingRequest;
import org.museframework.bian.atmnetope.dto.ExecuteDeviceTrackingResponse;
import org.museframework.bian.atmnetope.dto.RetrieveDeviceTrackingRequest;
import org.museframework.bian.atmnetope.dto.RetrieveDeviceTrackingResponse;
import org.museframework.bian.atmnetope.dto.UpdateDeviceTrackingRequest;
import org.museframework.bian.atmnetope.dto.UpdateDeviceTrackingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within ATM Network Operations.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ATMNetworkOperations", group="DeviceTracking")
public interface BqDeviceTracking {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Device Tracking processing")
    ExchangeDeviceTrackingResponse exchangeDeviceTracking(ExchangeDeviceTrackingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Device Tracking")
    ExecuteDeviceTrackingResponse executeDeviceTracking(ExecuteDeviceTrackingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Device Tracking")
    RetrieveDeviceTrackingResponse retrieveDeviceTracking(RetrieveDeviceTrackingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Device Tracking")
    UpdateDeviceTrackingResponse updateDeviceTracking(UpdateDeviceTrackingRequest req);
}