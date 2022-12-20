package org.museframework.bian.corporatetreasury;

import org.museframework.bian.corporatetreasury.dto.CaptureStrategicFundingRequest;
import org.museframework.bian.corporatetreasury.dto.CaptureStrategicFundingResponse;
import org.museframework.bian.corporatetreasury.dto.RetrieveStrategicFundingRequest;
import org.museframework.bian.corporatetreasury.dto.RetrieveStrategicFundingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CorporateTreasury", group="StrategicFunding")
public interface BqStrategicFunding {
    @GenericDtxEndpoint
    @Description("CaBQ Capture details of large strategic transactions")
    CaptureStrategicFundingResponse captureStrategicFunding(CaptureStrategicFundingRequest req);

    @Description("ReBQ Retrieve strategic funding details")
    RetrieveStrategicFundingResponse retrieveStrategicFunding(RetrieveStrategicFundingRequest req);
}