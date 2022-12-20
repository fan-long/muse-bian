package org.museframework.bian.customersurveys;

import org.museframework.bian.customersurveys.dto.CaptureExecutionRequest;
import org.museframework.bian.customersurveys.dto.CaptureExecutionResponse;
import org.museframework.bian.customersurveys.dto.ExecuteExecutionRequest;
import org.museframework.bian.customersurveys.dto.ExecuteExecutionResponse;
import org.museframework.bian.customersurveys.dto.InitiateExecutionRequest;
import org.museframework.bian.customersurveys.dto.InitiateExecutionResponse;
import org.museframework.bian.customersurveys.dto.RequestExecutionRequest;
import org.museframework.bian.customersurveys.dto.RequestExecutionResponse;
import org.museframework.bian.customersurveys.dto.RetrieveExecutionRequest;
import org.museframework.bian.customersurveys.dto.RetrieveExecutionResponse;
import org.museframework.bian.customersurveys.dto.UpdateExecutionRequest;
import org.museframework.bian.customersurveys.dto.UpdateExecutionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerSurveys", group="Execution")
public interface BqExecution {
    @GenericDtxEndpoint
    @Description("InBQ Initiate customer survey execution task")
    InitiateExecutionResponse initiateExecution(InitiateExecutionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a survey execution task")
    UpdateExecutionResponse updateExecution(UpdateExecutionRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture input from a survey execution task")
    CaptureExecutionResponse captureExecution(CaptureExecutionRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action for survey execution")
    ExecuteExecutionResponse executeExecution(ExecuteExecutionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in survey execution")
    RequestExecutionResponse requestExecution(RequestExecutionRequest req);

    @Description("ReBQ Retrieve details about customer survey execution activity")
    RetrieveExecutionResponse retrieveExecution(RetrieveExecutionRequest req);
}