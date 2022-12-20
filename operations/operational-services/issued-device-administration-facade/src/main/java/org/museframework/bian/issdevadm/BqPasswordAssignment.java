package org.museframework.bian.issdevadm;

import org.museframework.bian.issdevadm.dto.CapturePasswordAssignmentRequest;
import org.museframework.bian.issdevadm.dto.CapturePasswordAssignmentResponse;
import org.museframework.bian.issdevadm.dto.InitiatePasswordAssignmentRequest;
import org.museframework.bian.issdevadm.dto.InitiatePasswordAssignmentResponse;
import org.museframework.bian.issdevadm.dto.RetrievePasswordAssignmentRequest;
import org.museframework.bian.issdevadm.dto.RetrievePasswordAssignmentResponse;
import org.museframework.bian.issdevadm.dto.UpdatePasswordAssignmentRequest;
import org.museframework.bian.issdevadm.dto.UpdatePasswordAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="IssuedDeviceAdministration", group="PasswordAssignment")
public interface BqPasswordAssignment {
    @GenericDtxEndpoint
    @Description("PrBQ Provide a password assignment")
    InitiatePasswordAssignmentResponse initiatePasswordAssignment(InitiatePasswordAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an assigned password")
    UpdatePasswordAssignmentResponse updatePasswordAssignment(UpdatePasswordAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture usage details of an assigned password")
    CapturePasswordAssignmentResponse capturePasswordAssignment(CapturePasswordAssignmentRequest req);

    @Description("ReBQ Retrieve details about an assigned password")
    RetrievePasswordAssignmentResponse retrievePasswordAssignment(RetrievePasswordAssignmentRequest req);
}