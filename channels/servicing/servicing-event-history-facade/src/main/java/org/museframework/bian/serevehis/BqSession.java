package org.museframework.bian.serevehis;

import org.museframework.bian.serevehis.dto.CaptureSessionRequest;
import org.museframework.bian.serevehis.dto.CaptureSessionResponse;
import org.museframework.bian.serevehis.dto.RetrieveSessionRequest;
import org.museframework.bian.serevehis.dto.RetrieveSessionResponse;
import org.museframework.bian.serevehis.dto.UpdateSessionRequest;
import org.museframework.bian.serevehis.dto.UpdateSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="ServicingEventHistory", group="Session")
public interface BqSession {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured customer servicing session event details")
    UpdateSessionResponse updateSession(UpdateSessionRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture customer servicing session event details")
    CaptureSessionResponse captureSession(CaptureSessionRequest req);

    @Description("ReBQ Retrieve customer servicing event details")
    RetrieveSessionResponse retrieveSession(RetrieveSessionRequest req);
}