package org.museframework.bian.intpropor;

import org.museframework.bian.intpropor.dto.InitiateAssignmentRequest;
import org.museframework.bian.intpropor.dto.InitiateAssignmentResponse;
import org.museframework.bian.intpropor.dto.RequestAssignmentRequest;
import org.museframework.bian.intpropor.dto.RequestAssignmentResponse;
import org.museframework.bian.intpropor.dto.RetrieveAssignmentRequest;
import org.museframework.bian.intpropor.dto.RetrieveAssignmentResponse;
import org.museframework.bian.intpropor.dto.UpdateAssignmentRequest;
import org.museframework.bian.intpropor.dto.UpdateAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="IntellectualPropertyPortfolio", group="Assignment")
public interface BqAssignment {
    @GenericDtxEndpoint
    @Description("InBQ Initiate the assignment of an intellectual property asset")
    InitiateAssignmentResponse initiateAssignment(InitiateAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about an intellectual property asset assignment")
    UpdateAssignmentResponse updateAssignment(UpdateAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in an assignment")
    RequestAssignmentResponse requestAssignment(RequestAssignmentRequest req);

    @Description("ReBQ Retrieve details about an intellectual property asset assignment")
    RetrieveAssignmentResponse retrieveAssignment(RetrieveAssignmentRequest req);
}