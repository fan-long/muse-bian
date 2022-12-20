package org.museframework.bian.issdevadm;

import org.museframework.bian.issdevadm.dto.CaptureTokenAssignmentRequest;
import org.museframework.bian.issdevadm.dto.CaptureTokenAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="IssuedDeviceAdministration", group="TokenAssignment")
public interface BqTokenAssignment {
    @GenericDtxEndpoint
    @Description("Capture Assigned Token")
    CaptureTokenAssignmentResponse captureTokenAssignment(CaptureTokenAssignmentRequest req);
}