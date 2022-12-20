package org.museframework.bian.chaactana;

import org.museframework.bian.chaactana.dto.ExecuteBotRequest;
import org.museframework.bian.chaactana.dto.ExecuteBotResponse;
import org.museframework.bian.chaactana.dto.RetrieveBotRequest;
import org.museframework.bian.chaactana.dto.RetrieveBotResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="ChannelActivityAnalysis", group="Bot")
public interface BqBot {
    @GenericDtxEndpoint
    @Description("ExBQ Obtain an automated refresh of bot detection analysis")
    ExecuteBotResponse executeBot(ExecuteBotRequest req);

    @Description("ReBQ Retrieve details about bot detection analysis, including recent results")
    RetrieveBotResponse retrieveBot(RetrieveBotRequest req);
}