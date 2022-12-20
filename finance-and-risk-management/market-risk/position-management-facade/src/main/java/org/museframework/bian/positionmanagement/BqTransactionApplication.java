package org.museframework.bian.positionmanagement;

import org.museframework.bian.positionmanagement.dto.InitiateTransactionApplicationRequest;
import org.museframework.bian.positionmanagement.dto.InitiateTransactionApplicationResponse;
import org.museframework.bian.positionmanagement.dto.RetrieveTransactionApplicationRequest;
import org.museframework.bian.positionmanagement.dto.RetrieveTransactionApplicationResponse;
import org.museframework.bian.positionmanagement.dto.UpdateTransactionApplicationRequest;
import org.museframework.bian.positionmanagement.dto.UpdateTransactionApplicationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="PositionManagement", group="TransactionApplication")
public interface BqTransactionApplication {
    @GenericDtxEndpoint
    @Description("InBQ Initiate the registering of a transaction against the position")
    InitiateTransactionApplicationResponse initiateTransactionApplication(InitiateTransactionApplicationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a registered transaction")
    UpdateTransactionApplicationResponse updateTransactionApplication(UpdateTransactionApplicationRequest req);

    @Description("ReBQ Retrieve details about a registered transaction and its position impact")
    RetrieveTransactionApplicationResponse retrieveTransactionApplication(RetrieveTransactionApplicationRequest req);
}