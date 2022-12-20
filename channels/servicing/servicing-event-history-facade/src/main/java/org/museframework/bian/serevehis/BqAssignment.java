package org.museframework.bian.serevehis;

import org.museframework.bian.serevehis.dto.CaptureAssignmentRequest;
import org.museframework.bian.serevehis.dto.CaptureAssignmentResponse;
import org.museframework.bian.serevehis.dto.RetrieveAssignmentRequest;
import org.museframework.bian.serevehis.dto.RetrieveAssignmentResponse;
import org.museframework.bian.serevehis.dto.UpdateAssignmentRequest;
import org.museframework.bian.serevehis.dto.UpdateAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="ServicingEventHistory", group="Assignment")
public interface BqAssignment {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured assignment event details")
    UpdateAssignmentResponse updateAssignment(UpdateAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture servicing position assignment event details")
    CaptureAssignmentResponse captureAssignment(CaptureAssignmentRequest req);

    @Description("ReBQ Retrieve servicing position assignment event details")
    RetrieveAssignmentResponse retrieveAssignment(RetrieveAssignmentRequest req);
}