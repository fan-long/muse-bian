package org.museframework.bian.corporatetreasury;

import org.museframework.bian.corporatetreasury.dto.CaptureLiquidityRequest;
import org.museframework.bian.corporatetreasury.dto.CaptureLiquidityResponse;
import org.museframework.bian.corporatetreasury.dto.RetrieveLiquidityRequest;
import org.museframework.bian.corporatetreasury.dto.RetrieveLiquidityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CorporateTreasury", group="Liquidity")
public interface BqLiquidity {
    @GenericDtxEndpoint
    @Description("CaBQ Capture transactions feeding into liquidity analysis")
    CaptureLiquidityResponse captureLiquidity(CaptureLiquidityRequest req);

    @Description("ReBQ Retrieve liquidity analysis details")
    RetrieveLiquidityResponse retrieveLiquidity(RetrieveLiquidityRequest req);
}