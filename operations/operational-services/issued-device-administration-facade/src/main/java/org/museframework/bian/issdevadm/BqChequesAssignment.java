package org.museframework.bian.issdevadm;

import org.museframework.bian.issdevadm.dto.InitiateChequesAssignmentRequest;
import org.museframework.bian.issdevadm.dto.InitiateChequesAssignmentResponse;
import org.museframework.bian.issdevadm.dto.RetrieveChequesAssignmentRequest;
import org.museframework.bian.issdevadm.dto.RetrieveChequesAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="IssuedDeviceAdministration", group="ChequesAssignment")
public interface BqChequesAssignment {
    @GenericDtxEndpoint
    @Description("PrBQ Provide cheques")
    InitiateChequesAssignmentResponse initiateChequesAssignment(InitiateChequesAssignmentRequest req);

    @Description("ReBQ Retrieve details about issued cheques")
    RetrieveChequesAssignmentResponse retrieveChequesAssignment(RetrieveChequesAssignmentRequest req);
}