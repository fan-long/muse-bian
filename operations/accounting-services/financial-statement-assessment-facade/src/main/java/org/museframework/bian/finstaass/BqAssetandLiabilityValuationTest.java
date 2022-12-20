package org.museframework.bian.finstaass;

import org.museframework.bian.finstaass.dto.EvaluateAssetandLiabilityValuationTestRequest;
import org.museframework.bian.finstaass.dto.EvaluateAssetandLiabilityValuationTestResponse;
import org.museframework.bian.finstaass.dto.ExecuteAssetandLiabilityValuationTestRequest;
import org.museframework.bian.finstaass.dto.ExecuteAssetandLiabilityValuationTestResponse;
import org.museframework.bian.finstaass.dto.NotifyAssetandLiabilityValuationTestRequest;
import org.museframework.bian.finstaass.dto.NotifyAssetandLiabilityValuationTestResponse;
import org.museframework.bian.finstaass.dto.RequestAssetandLiabilityValuationTestRequest;
import org.museframework.bian.finstaass.dto.RequestAssetandLiabilityValuationTestResponse;
import org.museframework.bian.finstaass.dto.RetrieveAssetandLiabilityValuationTestRequest;
import org.museframework.bian.finstaass.dto.RetrieveAssetandLiabilityValuationTestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Sensitivity Test test is one aspect that can be intergrated into the overall Sensitivity Test")
@GenericDomain(name="FinancialStatementAssessment", group="AssetandLiabilityValuationTest")
public interface BqAssetandLiabilityValuationTest {
    @GenericDtxEndpoint
    @Description("Evaluate Asset and Liability Valuation Test")
    EvaluateAssetandLiabilityValuationTestResponse evaluateAssetandLiabilityValuationTest(EvaluateAssetandLiabilityValuationTestRequest req);

    @GenericDtxEndpoint
    @Description("Execute Asset and Liability Valuation Test")
    ExecuteAssetandLiabilityValuationTestResponse executeAssetandLiabilityValuationTest(ExecuteAssetandLiabilityValuationTestRequest req);

    @Description("Notify Asset and Liability Valuation Test")
    NotifyAssetandLiabilityValuationTestResponse notifyAssetandLiabilityValuationTest(NotifyAssetandLiabilityValuationTestRequest req);

    @GenericDtxEndpoint
    @Description("Request Asset and Liability Valuation Test")
    RequestAssetandLiabilityValuationTestResponse requestAssetandLiabilityValuationTest(RequestAssetandLiabilityValuationTestRequest req);

    @Description("Retrieve Asset and Liability Valuation Test")
    RetrieveAssetandLiabilityValuationTestResponse retrieveAssetandLiabilityValuationTest(RetrieveAssetandLiabilityValuationTestRequest req);
}