package org.museframework.bian.partyauthentication;

import org.museframework.bian.partyauthentication.dto.EvaluateDeviceRequest;
import org.museframework.bian.partyauthentication.dto.EvaluateDeviceResponse;
import org.museframework.bian.partyauthentication.dto.RetrieveDeviceRequest;
import org.museframework.bian.partyauthentication.dto.RetrieveDeviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="PartyAuthentication", group="Device")
public interface BqDevice {
    @GenericDtxEndpoint
    @Description("EvBQ Evaluate customer authenticity using a device")
    EvaluateDeviceResponse evaluateDevice(EvaluateDeviceRequest req);

    @Description("ReBQ Retrieve details about a device evaluation")
    RetrieveDeviceResponse retrieveDevice(RetrieveDeviceRequest req);
}