package org.museframework.bian.customersurveys;

import org.museframework.bian.customersurveys.dto.RetrieveDefinitionRequest;
import org.museframework.bian.customersurveys.dto.RetrieveDefinitionResponse;
import org.museframework.bian.customersurveys.dto.UpdateDefinitionRequest;
import org.museframework.bian.customersurveys.dto.UpdateDefinitionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerSurveys", group="Definition")
public interface BqDefinition {
    @GenericDtxEndpoint
    @Description("UpBQ Update aspects of a customer survey definition/specification")
    UpdateDefinitionResponse updateDefinition(UpdateDefinitionRequest req);

    @Description("ReBQ Retrieve details about customer survey related activity")
    RetrieveDefinitionResponse retrieveDefinition(RetrieveDefinitionRequest req);
}