package org.museframework.bian.proexpsalsup;

import org.museframework.bian.proexpsalsup.dto.CaptureAssignmentRequest;
import org.museframework.bian.proexpsalsup.dto.CaptureAssignmentResponse;
import org.museframework.bian.proexpsalsup.dto.CreateAssignmentRequest;
import org.museframework.bian.proexpsalsup.dto.CreateAssignmentResponse;
import org.museframework.bian.proexpsalsup.dto.RequestAssignmentRequest;
import org.museframework.bian.proexpsalsup.dto.RequestAssignmentResponse;
import org.museframework.bian.proexpsalsup.dto.RetrieveAssignmentRequest;
import org.museframework.bian.proexpsalsup.dto.RetrieveAssignmentResponse;
import org.museframework.bian.proexpsalsup.dto.UpdateAssignmentRequest;
import org.museframework.bian.proexpsalsup.dto.UpdateAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="ProductExpertSalesSupport", group="Assignment")
public interface BqAssignment {
    @GenericDtxEndpoint
    @Description("CrBQ Create a sales specialist support assignment")
    CreateAssignmentResponse createAssignment(CreateAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a support assignment task")
    UpdateAssignmentResponse updateAssignment(UpdateAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Provide feedback relating to a sales support assignment")
    CaptureAssignmentResponse captureAssignment(CaptureAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in an assignment")
    RequestAssignmentResponse requestAssignment(RequestAssignmentRequest req);

    @Description("ReBQ Retrieve details about a sales specialist support assignment")
    RetrieveAssignmentResponse retrieveAssignment(RetrieveAssignmentRequest req);
}