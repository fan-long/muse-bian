package org.museframework.bian.cardclearing;

import org.museframework.bian.cardclearing.dto.RetrieveReconciliationRequest;
import org.museframework.bian.cardclearing.dto.RetrieveReconciliationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardClearing", group="Reconciliation")
public interface BqReconciliation {
    @Description("ReBQ Retrieve details about card transaction reconciliation")
    RetrieveReconciliationResponse retrieveReconciliation(RetrieveReconciliationRequest req);
}