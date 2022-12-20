package org.museframework.bian.finstaass;

import org.museframework.bian.finstaass.dto.EvaluateRiskTestRequest;
import org.museframework.bian.finstaass.dto.EvaluateRiskTestResponse;
import org.museframework.bian.finstaass.dto.ExecuteRiskTestRequest;
import org.museframework.bian.finstaass.dto.ExecuteRiskTestResponse;
import org.museframework.bian.finstaass.dto.NotifyRiskTestRequest;
import org.museframework.bian.finstaass.dto.NotifyRiskTestResponse;
import org.museframework.bian.finstaass.dto.RequestRiskTestRequest;
import org.museframework.bian.finstaass.dto.RequestRiskTestResponse;
import org.museframework.bian.finstaass.dto.RetrieveRiskTestRequest;
import org.museframework.bian.finstaass.dto.RetrieveRiskTestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Sensitivity Test test is one aspect that can be intergrated into the overall Sensitivity Test")
@GenericDomain(name="FinancialStatementAssessment", group="RiskTest")
public interface BqRiskTest {
    @GenericDtxEndpoint
    @Description("Evaluate Risk Test")
    EvaluateRiskTestResponse evaluateRiskTest(EvaluateRiskTestRequest req);

    @GenericDtxEndpoint
    @Description("Execute Risk Test")
    ExecuteRiskTestResponse executeRiskTest(ExecuteRiskTestRequest req);

    @Description("Notify Risk Test")
    NotifyRiskTestResponse notifyRiskTest(NotifyRiskTestRequest req);

    @GenericDtxEndpoint
    @Description("Request Risk Test")
    RequestRiskTestResponse requestRiskTest(RequestRiskTestRequest req);

    @Description("Retrieve Risk Test")
    RetrieveRiskTestResponse retrieveRiskTest(RetrieveRiskTestRequest req);
}