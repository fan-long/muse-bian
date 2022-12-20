package org.museframework.bian.cusevehis;

import org.museframework.bian.cusevehis.dto.CaptureLifeRequest;
import org.museframework.bian.cusevehis.dto.CaptureLifeResponse;
import org.museframework.bian.cusevehis.dto.RetrieveLifeRequest;
import org.museframework.bian.cusevehis.dto.RetrieveLifeResponse;
import org.museframework.bian.cusevehis.dto.UpdateLifeRequest;
import org.museframework.bian.cusevehis.dto.UpdateLifeResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="CustomerEventHistory", group="Life")
public interface BqLife {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured customer life event details")
    UpdateLifeResponse updateLife(UpdateLifeRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture customer life event details")
    CaptureLifeResponse captureLife(CaptureLifeRequest req);

    @Description("ReBQ Retrieve customer life event details")
    RetrieveLifeResponse retrieveLife(RetrieveLifeRequest req);
}