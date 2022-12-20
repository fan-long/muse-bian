package org.museframework.bian.atmnetope;

import org.museframework.bian.atmnetope.dto.ControlNetworkOperationRequest;
import org.museframework.bian.atmnetope.dto.ControlNetworkOperationResponse;
import org.museframework.bian.atmnetope.dto.InitiateNetworkOperationRequest;
import org.museframework.bian.atmnetope.dto.InitiateNetworkOperationResponse;
import org.museframework.bian.atmnetope.dto.RetrieveNetworkOperationRequest;
import org.museframework.bian.atmnetope.dto.RetrieveNetworkOperationResponse;
import org.museframework.bian.atmnetope.dto.UpdateNetworkOperationRequest;
import org.museframework.bian.atmnetope.dto.UpdateNetworkOperationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within ATM Network Operations.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ATMNetworkOperations", group="NetworkOperation")
public interface BqNetworkOperation {
    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Network Operation")
    ControlNetworkOperationResponse controlNetworkOperation(ControlNetworkOperationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Network Operation")
    InitiateNetworkOperationResponse initiateNetworkOperation(InitiateNetworkOperationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Network Operation")
    RetrieveNetworkOperationResponse retrieveNetworkOperation(RetrieveNetworkOperationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Network Operation")
    UpdateNetworkOperationResponse updateNetworkOperation(UpdateNetworkOperationRequest req);
}