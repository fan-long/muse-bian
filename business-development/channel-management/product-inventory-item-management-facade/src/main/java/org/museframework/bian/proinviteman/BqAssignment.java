package org.museframework.bian.proinviteman;

import org.museframework.bian.proinviteman.dto.ProvideAssignmentRequest;
import org.museframework.bian.proinviteman.dto.ProvideAssignmentResponse;
import org.museframework.bian.proinviteman.dto.RequestAssignmentRequest;
import org.museframework.bian.proinviteman.dto.RequestAssignmentResponse;
import org.museframework.bian.proinviteman.dto.RetrieveAssignmentRequest;
import org.museframework.bian.proinviteman.dto.RetrieveAssignmentResponse;
import org.museframework.bian.proinviteman.dto.UpdateAssignmentRequest;
import org.museframework.bian.proinviteman.dto.UpdateAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Set of rules for the purpose of deciding if or if not something is applicable  Examples: Staff assignment, Facility allocation.")
@GenericDomain(name="ProductInventoryItemManagement", group="Assignment")
public interface BqAssignment {
    @GenericDtxEndpoint
    @Description("PrBQ Obtain the provision of product inventory")
    ProvideAssignmentResponse provideAssignment(ProvideAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a scheduled item assignment")
    UpdateAssignmentResponse updateAssignment(UpdateAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention with a product inventory item assignment")
    RequestAssignmentResponse requestAssignment(RequestAssignmentRequest req);

    @Description("ReBQ Retrieve details about a product inventory item's distribution")
    RetrieveAssignmentResponse retrieveAssignment(RetrieveAssignmentRequest req);
}