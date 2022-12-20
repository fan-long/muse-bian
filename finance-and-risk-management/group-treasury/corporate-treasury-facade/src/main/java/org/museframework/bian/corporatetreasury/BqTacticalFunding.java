package org.museframework.bian.corporatetreasury;

import org.museframework.bian.corporatetreasury.dto.RetrieveTacticalFundingRequest;
import org.museframework.bian.corporatetreasury.dto.RetrieveTacticalFundingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CorporateTreasury", group="TacticalFunding")
public interface BqTacticalFunding {
    @Description("ReBQ Retrieve tactical funding details")
    RetrieveTacticalFundingResponse retrieveTacticalFunding(RetrieveTacticalFundingRequest req);
}