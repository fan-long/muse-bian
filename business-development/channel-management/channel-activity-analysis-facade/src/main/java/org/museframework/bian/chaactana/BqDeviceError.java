package org.museframework.bian.chaactana;

import org.museframework.bian.chaactana.dto.ExecuteDeviceErrorRequest;
import org.museframework.bian.chaactana.dto.ExecuteDeviceErrorResponse;
import org.museframework.bian.chaactana.dto.RetrieveDeviceErrorRequest;
import org.museframework.bian.chaactana.dto.RetrieveDeviceErrorResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="ChannelActivityAnalysis", group="DeviceError")
public interface BqDeviceError {
    @GenericDtxEndpoint
    @Description("ExBQ Obtain an automated refresh of device error detection analysis")
    ExecuteDeviceErrorResponse executeDeviceError(ExecuteDeviceErrorRequest req);

    @Description("ReBQ Retrieve details about device error detection analysis, including recent results")
    RetrieveDeviceErrorResponse retrieveDeviceError(RetrieveDeviceErrorRequest req);
}