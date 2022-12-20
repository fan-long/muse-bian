package org.museframework.bian.issdevadm;

import org.museframework.bian.issdevadm.dto.InitiateBiometricAssignmentRequest;
import org.museframework.bian.issdevadm.dto.InitiateBiometricAssignmentResponse;
import org.museframework.bian.issdevadm.dto.RetrieveBiometricAssignmentRequest;
import org.museframework.bian.issdevadm.dto.RetrieveBiometricAssignmentResponse;
import org.museframework.bian.issdevadm.dto.UpdateBiometricAssignmentRequest;
import org.museframework.bian.issdevadm.dto.UpdateBiometricAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="IssuedDeviceAdministration", group="BiometricAssignment")
public interface BqBiometricAssignment {
    @GenericDtxEndpoint
    @Description("PrBQ Provide a biometric assignment")
    InitiateBiometricAssignmentResponse initiateBiometricAssignment(InitiateBiometricAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an assigned biometric")
    UpdateBiometricAssignmentResponse updateBiometricAssignment(UpdateBiometricAssignmentRequest req);

    @Description("ReBQ Retrieve details about an assigned biometric")
    RetrieveBiometricAssignmentResponse retrieveBiometricAssignment(RetrieveBiometricAssignmentRequest req);
}