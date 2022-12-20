package org.museframework.bian.cardcollections;

import org.museframework.bian.cardcollections.dto.RetrieveAssignmentRequest;
import org.museframework.bian.cardcollections.dto.RetrieveAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardCollections", group="Assignment")
public interface BqAssignment {
    @Description("ReBQ Retrieve details about a card collections assignment")
    RetrieveAssignmentResponse retrieveAssignment(RetrieveAssignmentRequest req);
}