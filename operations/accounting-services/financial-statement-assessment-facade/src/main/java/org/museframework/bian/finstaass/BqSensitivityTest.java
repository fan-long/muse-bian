package org.museframework.bian.finstaass;

import org.museframework.bian.finstaass.dto.EvaluateSensitivityTestRequest;
import org.museframework.bian.finstaass.dto.EvaluateSensitivityTestResponse;
import org.museframework.bian.finstaass.dto.ExecuteSensitivityTestRequest;
import org.museframework.bian.finstaass.dto.ExecuteSensitivityTestResponse;
import org.museframework.bian.finstaass.dto.NotifySensitivityTestRequest;
import org.museframework.bian.finstaass.dto.NotifySensitivityTestResponse;
import org.museframework.bian.finstaass.dto.RequestSensitivityTestRequest;
import org.museframework.bian.finstaass.dto.RequestSensitivityTestResponse;
import org.museframework.bian.finstaass.dto.RetrieveSensitivityTestRequest;
import org.museframework.bian.finstaass.dto.RetrieveSensitivityTestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Sensitivity Test test is one aspect that can be intergrated into the overall Sensitivity Test")
@GenericDomain(name="FinancialStatementAssessment", group="SensitivityTest")
public interface BqSensitivityTest {
    @GenericDtxEndpoint
    @Description("Evaluate Sensitivity Test")
    EvaluateSensitivityTestResponse evaluateSensitivityTest(EvaluateSensitivityTestRequest req);

    @GenericDtxEndpoint
    @Description("Execute Sensitivity Test")
    ExecuteSensitivityTestResponse executeSensitivityTest(ExecuteSensitivityTestRequest req);

    @Description("Notify Sensitivity Test")
    NotifySensitivityTestResponse notifySensitivityTest(NotifySensitivityTestRequest req);

    @GenericDtxEndpoint
    @Description("Request Sensitivity Test")
    RequestSensitivityTestResponse requestSensitivityTest(RequestSensitivityTestRequest req);

    @Description("Retrieve Sensitivity Test")
    RetrieveSensitivityTestResponse retrieveSensitivityTest(RetrieveSensitivityTestRequest req);
}