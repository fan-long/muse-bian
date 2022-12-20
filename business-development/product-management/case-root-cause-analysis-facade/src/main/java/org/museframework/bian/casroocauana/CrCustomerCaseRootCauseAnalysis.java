package org.museframework.bian.casroocauana;

import org.museframework.bian.casroocauana.dto.ExecuteCustomerCaseRootCauseAnalysisRequest;
import org.museframework.bian.casroocauana.dto.ExecuteCustomerCaseRootCauseAnalysisResponse;
import org.museframework.bian.casroocauana.dto.InitiateCustomerCaseRootCauseAnalysisRequest;
import org.museframework.bian.casroocauana.dto.InitiateCustomerCaseRootCauseAnalysisResponse;
import org.museframework.bian.casroocauana.dto.RequestCustomerCaseRootCauseAnalysisRequest;
import org.museframework.bian.casroocauana.dto.RequestCustomerCaseRootCauseAnalysisResponse;
import org.museframework.bian.casroocauana.dto.RetrieveCustomerCaseRootCauseAnalysisRequest;
import org.museframework.bian.casroocauana.dto.RetrieveCustomerCaseRootCauseAnalysisResponse;
import org.museframework.bian.casroocauana.dto.UpdateCustomerCaseRootCauseAnalysisRequest;
import org.museframework.bian.casroocauana.dto.UpdateCustomerCaseRootCauseAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Case Root Cause Analysis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="CaseRootCauseAnalysis", group="CustomerCaseRootCauseAnalysis")
public interface CrCustomerCaseRootCauseAnalysis {
    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Customer Case Root Cause Analysis")
    ExecuteCustomerCaseRootCauseAnalysisResponse executeCustomerCaseRootCauseAnalysis(ExecuteCustomerCaseRootCauseAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Customer Case Root Cause Analysis")
    InitiateCustomerCaseRootCauseAnalysisResponse initiateCustomerCaseRootCauseAnalysis(InitiateCustomerCaseRootCauseAnalysisRequest req);

    @Description("ReCR Retrieve details about any aspect of Customer Case Root Cause Analysis")
    RetrieveCustomerCaseRootCauseAnalysisResponse retrieveCustomerCaseRootCauseAnalysis(RetrieveCustomerCaseRootCauseAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Customer Case Root Cause Analysis")
    RequestCustomerCaseRootCauseAnalysisResponse requestCustomerCaseRootCauseAnalysis(RequestCustomerCaseRootCauseAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Customer Case Root Cause Analysis")
    UpdateCustomerCaseRootCauseAnalysisResponse updateCustomerCaseRootCauseAnalysis(UpdateCustomerCaseRootCauseAnalysisRequest req);
}