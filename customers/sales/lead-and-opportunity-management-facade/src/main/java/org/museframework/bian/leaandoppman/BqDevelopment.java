package org.museframework.bian.leaandoppman;

import org.museframework.bian.leaandoppman.dto.ExecuteDevelopmentRequest;
import org.museframework.bian.leaandoppman.dto.ExecuteDevelopmentResponse;
import org.museframework.bian.leaandoppman.dto.InitiateDevelopmentRequest;
import org.museframework.bian.leaandoppman.dto.InitiateDevelopmentResponse;
import org.museframework.bian.leaandoppman.dto.RequestDevelopmentRequest;
import org.museframework.bian.leaandoppman.dto.RequestDevelopmentResponse;
import org.museframework.bian.leaandoppman.dto.RetrieveDevelopmentRequest;
import org.museframework.bian.leaandoppman.dto.RetrieveDevelopmentResponse;
import org.museframework.bian.leaandoppman.dto.UpdateDevelopmentRequest;
import org.museframework.bian.leaandoppman.dto.UpdateDevelopmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="LeadandOpportunityManagement", group="Development")
public interface BqDevelopment {
    @GenericDtxEndpoint
    @Description("InBQ Initiate, assign development of a lead/opportunity")
    InitiateDevelopmentResponse initiateDevelopment(InitiateDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about lean/opportunity development task")
    UpdateDevelopmentResponse updateDevelopment(UpdateDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute automated action against a lead opportunity development task (e.g. generate message)")
    ExecuteDevelopmentResponse executeDevelopment(ExecuteDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in development (e.g. prospect contact)")
    RequestDevelopmentResponse requestDevelopment(RequestDevelopmentRequest req);

    @Description("ReBQ Retrieve details about lead/opportunity development")
    RetrieveDevelopmentResponse retrieveDevelopment(RetrieveDevelopmentRequest req);
}