package org.museframework.bian.achoperations;

import org.museframework.bian.achoperations.dto.InitiateReconciliationRequest;
import org.museframework.bian.achoperations.dto.InitiateReconciliationResponse;
import org.museframework.bian.achoperations.dto.RetrieveReconciliationRequest;
import org.museframework.bian.achoperations.dto.RetrieveReconciliationResponse;
import org.museframework.bian.achoperations.dto.UpdateReconciliationRequest;
import org.museframework.bian.achoperations.dto.UpdateReconciliationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ACHOperations", group="Reconciliation")
public interface BqReconciliation {
    @GenericDtxEndpoint
    @Description("InBQ Initiate the reconciliation of ACH transactions")
    InitiateReconciliationResponse initiateReconciliation(InitiateReconciliationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update an transaction in reconciliations")
    UpdateReconciliationResponse updateReconciliation(UpdateReconciliationRequest req);

    @Description("ReBQ Retrieve details about ACH transaction reconciliations")
    RetrieveReconciliationResponse retrieveReconciliation(RetrieveReconciliationRequest req);
}