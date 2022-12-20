package org.museframework.bian.cusevehis;

import org.museframework.bian.cusevehis.dto.CaptureFraudRequest;
import org.museframework.bian.cusevehis.dto.CaptureFraudResponse;
import org.museframework.bian.cusevehis.dto.RetrieveFraudRequest;
import org.museframework.bian.cusevehis.dto.RetrieveFraudResponse;
import org.museframework.bian.cusevehis.dto.UpdateFraudRequest;
import org.museframework.bian.cusevehis.dto.UpdateFraudResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="CustomerEventHistory", group="Fraud")
public interface BqFraud {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured fraud event details")
    UpdateFraudResponse updateFraud(UpdateFraudRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture fraud event details")
    CaptureFraudResponse captureFraud(CaptureFraudRequest req);

    @Description("ReBQ Retrieve fraud event details")
    RetrieveFraudResponse retrieveFraud(RetrieveFraudRequest req);
}