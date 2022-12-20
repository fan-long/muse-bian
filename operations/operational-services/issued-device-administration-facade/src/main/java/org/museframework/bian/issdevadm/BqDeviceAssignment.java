package org.museframework.bian.issdevadm;

import org.museframework.bian.issdevadm.dto.CaptureDeviceAssignmentRequest;
import org.museframework.bian.issdevadm.dto.CaptureDeviceAssignmentResponse;
import org.museframework.bian.issdevadm.dto.RetrieveDeviceAssignmentRequest;
import org.museframework.bian.issdevadm.dto.RetrieveDeviceAssignmentResponse;
import org.museframework.bian.issdevadm.dto.UpdateDeviceAssignmentRequest;
import org.museframework.bian.issdevadm.dto.UpdateDeviceAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="IssuedDeviceAdministration", group="DeviceAssignment")
public interface BqDeviceAssignment {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of an assigned device")
    UpdateDeviceAssignmentResponse updateDeviceAssignment(UpdateDeviceAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture usage details of an assigned device")
    CaptureDeviceAssignmentResponse captureDeviceAssignment(CaptureDeviceAssignmentRequest req);

    @Description("ReBQ Retrieve details about an assigned device")
    RetrieveDeviceAssignmentResponse retrieveDeviceAssignment(RetrieveDeviceAssignmentRequest req);
}