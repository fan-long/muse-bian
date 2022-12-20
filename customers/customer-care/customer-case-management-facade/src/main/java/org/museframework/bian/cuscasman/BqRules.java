package org.museframework.bian.cuscasman;

import org.museframework.bian.cuscasman.dto.RequestRulesRequest;
import org.museframework.bian.cuscasman.dto.RequestRulesResponse;
import org.museframework.bian.cuscasman.dto.RetrieveRulesRequest;
import org.museframework.bian.cuscasman.dto.RetrieveRulesResponse;
import org.museframework.bian.cuscasman.dto.UpdateRulesRequest;
import org.museframework.bian.cuscasman.dto.UpdateRulesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CustomerCaseManagement", group="Rules")
public interface BqRules {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the case resolution criterion")
    UpdateRulesResponse updateRules(UpdateRulesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in the case resolution rules")
    RequestRulesResponse requestRules(RequestRulesRequest req);

    @Description("ReBQ Retrieve details about the customer case criterion")
    RetrieveRulesResponse retrieveRules(RetrieveRulesRequest req);
}