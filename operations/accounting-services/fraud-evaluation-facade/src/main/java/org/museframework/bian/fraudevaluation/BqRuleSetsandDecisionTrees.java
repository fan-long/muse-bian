package org.museframework.bian.fraudevaluation;

import org.museframework.bian.fraudevaluation.dto.RetrieveRuleSetsandDecisionTreesRequest;
import org.museframework.bian.fraudevaluation.dto.RetrieveRuleSetsandDecisionTreesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="FraudEvaluation", group="RuleSetsandDecisionTrees")
public interface BqRuleSetsandDecisionTrees {
    @Description("ReBQ Retrieve details about rule set or decision tree based tests applied")
    RetrieveRuleSetsandDecisionTreesResponse retrieveRuleSetsandDecisionTrees(RetrieveRuleSetsandDecisionTreesRequest req);
}