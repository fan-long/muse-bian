package org.museframework.bian.issdevadm;

import org.museframework.bian.issdevadm.dto.CaptureReaderAssignmentRequest;
import org.museframework.bian.issdevadm.dto.CaptureReaderAssignmentResponse;
import org.museframework.bian.issdevadm.dto.RetrieveReaderAssignmentRequest;
import org.museframework.bian.issdevadm.dto.RetrieveReaderAssignmentResponse;
import org.museframework.bian.issdevadm.dto.UpdateReaderAssignmentRequest;
import org.museframework.bian.issdevadm.dto.UpdateReaderAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="IssuedDeviceAdministration", group="ReaderAssignment")
public interface BqReaderAssignment {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of an assigned reader device")
    UpdateReaderAssignmentResponse updateReaderAssignment(UpdateReaderAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture usage details of an assigned reader")
    CaptureReaderAssignmentResponse captureReaderAssignment(CaptureReaderAssignmentRequest req);

    @Description("ReBQ Retrieve details about an assigned reader")
    RetrieveReaderAssignmentResponse retrieveReaderAssignment(RetrieveReaderAssignmentRequest req);
}