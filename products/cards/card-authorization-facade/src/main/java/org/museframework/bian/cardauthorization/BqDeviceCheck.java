package org.museframework.bian.cardauthorization;

import org.museframework.bian.cardauthorization.dto.RetrieveDeviceCheckRequest;
import org.museframework.bian.cardauthorization.dto.RetrieveDeviceCheckResponse;
import org.museframework.bian.cardauthorization.dto.UpdateDeviceCheckRequest;
import org.museframework.bian.cardauthorization.dto.UpdateDeviceCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="CardAuthorization", group="DeviceCheck")
public interface BqDeviceCheck {
    @GenericDtxEndpoint
    @Description("UpBQ Update details for the device check")
    UpdateDeviceCheckResponse updateDeviceCheck(UpdateDeviceCheckRequest req);

    @Description("ReBQ Retrieve details about the device check")
    RetrieveDeviceCheckResponse retrieveDeviceCheck(RetrieveDeviceCheckRequest req);
}