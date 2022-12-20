package org.museframework.bian.casroocauana;

import org.museframework.bian.casroocauana.dto.ExecuteOperationsandServicingIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.ExecuteOperationsandServicingIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.InitiateOperationsandServicingIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.InitiateOperationsandServicingIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.RequestOperationsandServicingIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.RequestOperationsandServicingIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.RetrieveOperationsandServicingIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.RetrieveOperationsandServicingIssueAnalysisResponse;
import org.museframework.bian.casroocauana.dto.UpdateOperationsandServicingIssueAnalysisRequest;
import org.museframework.bian.casroocauana.dto.UpdateOperationsandServicingIssueAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="CaseRootCauseAnalysis", group="OperationsandServicingIssueAnalysis")
public interface BqOperationsandServicingIssueAnalysis {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Operations and Servicing Issue Analysis")
    ExecuteOperationsandServicingIssueAnalysisResponse executeOperationsandServicingIssueAnalysis(ExecuteOperationsandServicingIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Operations and Servicing Issue Analysis")
    InitiateOperationsandServicingIssueAnalysisResponse initiateOperationsandServicingIssueAnalysis(InitiateOperationsandServicingIssueAnalysisRequest req);

    @Description("ReBQ Retrieve details about any aspect of Operations and Servicing Issue Analysis")
    RetrieveOperationsandServicingIssueAnalysisResponse retrieveOperationsandServicingIssueAnalysis(RetrieveOperationsandServicingIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Operations and Servicing Issue Analysis")
    RequestOperationsandServicingIssueAnalysisResponse requestOperationsandServicingIssueAnalysis(RequestOperationsandServicingIssueAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Operations and Servicing Issue Analysis")
    UpdateOperationsandServicingIssueAnalysisResponse updateOperationsandServicingIssueAnalysis(UpdateOperationsandServicingIssueAnalysisRequest req);
}