package org.museframework.bian.chaactana;

import org.museframework.bian.chaactana.dto.ExecuteMerchantBehaviorRequest;
import org.museframework.bian.chaactana.dto.ExecuteMerchantBehaviorResponse;
import org.museframework.bian.chaactana.dto.RetrieveMerchantBehaviorRequest;
import org.museframework.bian.chaactana.dto.RetrieveMerchantBehaviorResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="ChannelActivityAnalysis", group="MerchantBehavior")
public interface BqMerchantBehavior {
    @GenericDtxEndpoint
    @Description("ExBQ Obtain an automated refresh of merchant out of pattern behavior analysis")
    ExecuteMerchantBehaviorResponse executeMerchantBehavior(ExecuteMerchantBehaviorRequest req);

    @Description("ReBQ Retrieve details about merchant out of pattern behavior analysis, including recent results")
    RetrieveMerchantBehaviorResponse retrieveMerchantBehavior(RetrieveMerchantBehaviorRequest req);
}