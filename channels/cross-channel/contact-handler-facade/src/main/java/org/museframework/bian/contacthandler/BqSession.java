package org.museframework.bian.contacthandler;

import org.museframework.bian.contacthandler.dto.ExecuteSessionRequest;
import org.museframework.bian.contacthandler.dto.ExecuteSessionResponse;
import org.museframework.bian.contacthandler.dto.InitiateSessionRequest;
import org.museframework.bian.contacthandler.dto.InitiateSessionResponse;
import org.museframework.bian.contacthandler.dto.RetrieveSessionRequest;
import org.museframework.bian.contacthandler.dto.RetrieveSessionResponse;
import org.museframework.bian.contacthandler.dto.UpdateSessionRequest;
import org.museframework.bian.contacthandler.dto.UpdateSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ContactHandler", group="Session")
public interface BqSession {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a servicing session (from within an active contact)")
    InitiateSessionResponse initiateSession(InitiateSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about a servicing session")
    UpdateSessionResponse updateSession(UpdateSessionRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated task in a session (e.g. re-authenticate)")
    ExecuteSessionResponse executeSession(ExecuteSessionRequest req);

    @Description("ReBQ Retrieve details about a customer servicing session")
    RetrieveSessionResponse retrieveSession(RetrieveSessionRequest req);
}