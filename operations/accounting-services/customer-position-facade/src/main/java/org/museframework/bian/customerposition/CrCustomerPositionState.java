package org.museframework.bian.customerposition;

import org.museframework.bian.customerposition.dto.InitiateCustomerPositionStateRequest;
import org.museframework.bian.customerposition.dto.InitiateCustomerPositionStateResponse;
import org.museframework.bian.customerposition.dto.RetrieveCustomerPositionStateRequest;
import org.museframework.bian.customerposition.dto.RetrieveCustomerPositionStateResponse;
import org.museframework.bian.customerposition.dto.UpdateCustomerPositionStateRequest;
import org.museframework.bian.customerposition.dto.UpdateCustomerPositionStateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Monitor and define the status/rating of some entity within Customer Position. ")
@GenericDomain(name="CustomerPosition", group="CustomerPositionState")
public interface CrCustomerPositionState {
    @GenericDtxEndpoint
    @Description("InCR Initiation position monitoring for a customer")
    InitiateCustomerPositionStateResponse initiateCustomerPositionState(InitiateCustomerPositionStateRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the settings for customer position tracking")
    UpdateCustomerPositionStateResponse updateCustomerPositionState(UpdateCustomerPositionStateRequest req);

    @Description("ReCR Retrieve details about a customer position")
    RetrieveCustomerPositionStateResponse retrieveCustomerPositionState(RetrieveCustomerPositionStateRequest req);
}