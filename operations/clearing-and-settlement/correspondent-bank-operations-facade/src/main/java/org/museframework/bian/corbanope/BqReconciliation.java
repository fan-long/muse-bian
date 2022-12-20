package org.museframework.bian.corbanope;

import org.museframework.bian.corbanope.dto.ExecuteReconciliationRequest;
import org.museframework.bian.corbanope.dto.ExecuteReconciliationResponse;
import org.museframework.bian.corbanope.dto.NotifyReconciliationRequest;
import org.museframework.bian.corbanope.dto.NotifyReconciliationResponse;
import org.museframework.bian.corbanope.dto.RequestReconciliationRequest;
import org.museframework.bian.corbanope.dto.RequestReconciliationResponse;
import org.museframework.bian.corbanope.dto.RetrieveReconciliationRequest;
import org.museframework.bian.corbanope.dto.RetrieveReconciliationResponse;
import org.museframework.bian.corbanope.dto.UpdateReconciliationRequest;
import org.museframework.bian.corbanope.dto.UpdateReconciliationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CorrespondentBankOperations", group="Reconciliation")
public interface BqReconciliation {
    @GenericDtxEndpoint
    @Description("Update a reconciliation task")
    UpdateReconciliationResponse updateReconciliation(UpdateReconciliationRequest req);

    @GenericDtxEndpoint
    @Description("Request reconciliation processing for a correspondent")
    RequestReconciliationResponse requestReconciliation(RequestReconciliationRequest req);

    @Description("Retrieve reconciliation activity with a correspondent")
    RetrieveReconciliationResponse retrieveReconciliation(RetrieveReconciliationRequest req);

    @GenericDtxEndpoint
    @Description("Execute Reconciliation")
    ExecuteReconciliationResponse executeReconciliation(ExecuteReconciliationRequest req);

    @Description("Notify Reconciliation")
    NotifyReconciliationResponse notifyReconciliation(NotifyReconciliationRequest req);
}