package org.museframework.bian.contacthandler;

import org.museframework.bian.contacthandler.dto.RetrieveHistoryRequest;
import org.museframework.bian.contacthandler.dto.RetrieveHistoryResponse;
import org.museframework.bian.contacthandler.dto.UpdateHistoryRequest;
import org.museframework.bian.contacthandler.dto.UpdateHistoryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ContactHandler", group="History")
public interface BqHistory {
    @GenericDtxEndpoint
    @Description("UpBQ Update a contact history record content")
    UpdateHistoryResponse updateHistory(UpdateHistoryRequest req);

    @Description("ReBQ Retrieve historical details about a contact event")
    RetrieveHistoryResponse retrieveHistory(RetrieveHistoryRequest req);
}