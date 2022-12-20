package org.museframework.bian.finstaass;

import org.museframework.bian.finstaass.dto.EvaluateLiquidityandCashFlowTestRequest;
import org.museframework.bian.finstaass.dto.EvaluateLiquidityandCashFlowTestResponse;
import org.museframework.bian.finstaass.dto.ExecuteLiquidityandCashFlowTestRequest;
import org.museframework.bian.finstaass.dto.ExecuteLiquidityandCashFlowTestResponse;
import org.museframework.bian.finstaass.dto.NotifyLiquidityandCashFlowTestRequest;
import org.museframework.bian.finstaass.dto.NotifyLiquidityandCashFlowTestResponse;
import org.museframework.bian.finstaass.dto.RequestLiquidityandCashFlowTestRequest;
import org.museframework.bian.finstaass.dto.RequestLiquidityandCashFlowTestResponse;
import org.museframework.bian.finstaass.dto.RetrieveLiquidityandCashFlowTestRequest;
import org.museframework.bian.finstaass.dto.RetrieveLiquidityandCashFlowTestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Sensitivity Test test is one aspect that can be intergrated into the overall Sensitivity Test")
@GenericDomain(name="FinancialStatementAssessment", group="LiquidityandCashFlowTest")
public interface BqLiquidityandCashFlowTest {
    @GenericDtxEndpoint
    @Description("Evaluate Liquidity and Cash Flow Test")
    EvaluateLiquidityandCashFlowTestResponse evaluateLiquidityandCashFlowTest(EvaluateLiquidityandCashFlowTestRequest req);

    @GenericDtxEndpoint
    @Description("Execute Liquidity and Cash Flow Test")
    ExecuteLiquidityandCashFlowTestResponse executeLiquidityandCashFlowTest(ExecuteLiquidityandCashFlowTestRequest req);

    @Description("Notify Liquidity and Cash Flow Test")
    NotifyLiquidityandCashFlowTestResponse notifyLiquidityandCashFlowTest(NotifyLiquidityandCashFlowTestRequest req);

    @GenericDtxEndpoint
    @Description("Request Liquidity and Cash Flow Test")
    RequestLiquidityandCashFlowTestResponse requestLiquidityandCashFlowTest(RequestLiquidityandCashFlowTestRequest req);

    @Description("Retrieve Liquidity and Cash Flow Test")
    RetrieveLiquidityandCashFlowTestResponse retrieveLiquidityandCashFlowTest(RetrieveLiquidityandCashFlowTestRequest req);
}