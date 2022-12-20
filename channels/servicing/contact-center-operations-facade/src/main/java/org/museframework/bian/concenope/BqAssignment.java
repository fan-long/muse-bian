package org.museframework.bian.concenope;

import org.museframework.bian.concenope.dto.CreateAssignmentRequest;
import org.museframework.bian.concenope.dto.CreateAssignmentResponse;
import org.museframework.bian.concenope.dto.RequestAssignmentRequest;
import org.museframework.bian.concenope.dto.RequestAssignmentResponse;
import org.museframework.bian.concenope.dto.RetrieveAssignmentRequest;
import org.museframework.bian.concenope.dto.RetrieveAssignmentResponse;
import org.museframework.bian.concenope.dto.UpdateAssignmentRequest;
import org.museframework.bian.concenope.dto.UpdateAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="ContactCenterOperations", group="Assignment")
public interface BqAssignment {
    @GenericDtxEndpoint
    @Description("CrBQ Create an assignment request")
    CreateAssignmentResponse createAssignment(CreateAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a servicing representatives assignment")
    UpdateAssignmentResponse updateAssignment(UpdateAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request changes to the servicing representative's assignment")
    RequestAssignmentResponse requestAssignment(RequestAssignmentRequest req);

    @Description("ReBQ Retrieve details about a contact center assignment")
    RetrieveAssignmentResponse retrieveAssignment(RetrieveAssignmentRequest req);
}