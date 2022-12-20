package org.museframework.bian.cuscamexe;

import org.museframework.bian.cuscamexe.dto.InitiateExecutionRequest;
import org.museframework.bian.cuscamexe.dto.InitiateExecutionResponse;
import org.museframework.bian.cuscamexe.dto.RequestExecutionRequest;
import org.museframework.bian.cuscamexe.dto.RequestExecutionResponse;
import org.museframework.bian.cuscamexe.dto.RetrieveExecutionRequest;
import org.museframework.bian.cuscamexe.dto.RetrieveExecutionResponse;
import org.museframework.bian.cuscamexe.dto.UpdateExecutionRequest;
import org.museframework.bian.cuscamexe.dto.UpdateExecutionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerCampaignExecution", group="Execution")
public interface BqExecution {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a campaign execution task")
    InitiateExecutionResponse initiateExecution(InitiateExecutionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a campaign execution task")
    UpdateExecutionResponse updateExecution(UpdateExecutionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a campaign execution task")
    RequestExecutionResponse requestExecution(RequestExecutionRequest req);

    @Description("ReBQ Retrieve details about a campaign execution task")
    RetrieveExecutionResponse retrieveExecution(RetrieveExecutionRequest req);
}