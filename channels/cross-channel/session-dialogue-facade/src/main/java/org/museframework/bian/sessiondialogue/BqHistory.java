package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.RetrieveHistoryRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveHistoryResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateHistoryRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateHistoryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="History")
public interface BqHistory {
    @GenericDtxEndpoint
    @Description("UpBQ Update details for customer history recording")
    UpdateHistoryResponse updateHistory(UpdateHistoryRequest req);

    @Description("ReBQ Retrieve details about customer history recording")
    RetrieveHistoryResponse retrieveHistory(RetrieveHistoryRequest req);
}