package org.museframework.bian.positionmanagement;

import org.museframework.bian.positionmanagement.dto.InitiateTrialTransactionRequest;
import org.museframework.bian.positionmanagement.dto.InitiateTrialTransactionResponse;
import org.museframework.bian.positionmanagement.dto.RetrieveTrialTransactionRequest;
import org.museframework.bian.positionmanagement.dto.RetrieveTrialTransactionResponse;
import org.museframework.bian.positionmanagement.dto.UpdateTrialTransactionRequest;
import org.museframework.bian.positionmanagement.dto.UpdateTrialTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="PositionManagement", group="TrialTransaction")
public interface BqTrialTransaction {
    @GenericDtxEndpoint
    @Description("InBQ Initiate the evaluation impact of a trial transaction")
    InitiateTrialTransactionResponse initiateTrialTransaction(InitiateTrialTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a trial transaction")
    UpdateTrialTransactionResponse updateTrialTransaction(UpdateTrialTransactionRequest req);

    @Description("ReBQ Retrieve details about a trial transaction and its position impact")
    RetrieveTrialTransactionResponse retrieveTrialTransaction(RetrieveTrialTransactionRequest req);
}