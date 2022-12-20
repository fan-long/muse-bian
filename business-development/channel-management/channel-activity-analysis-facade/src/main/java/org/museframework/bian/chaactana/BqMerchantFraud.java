package org.museframework.bian.chaactana;

import org.museframework.bian.chaactana.dto.ExecuteMerchantFraudRequest;
import org.museframework.bian.chaactana.dto.ExecuteMerchantFraudResponse;
import org.museframework.bian.chaactana.dto.RetrieveMerchantFraudRequest;
import org.museframework.bian.chaactana.dto.RetrieveMerchantFraudResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="ChannelActivityAnalysis", group="MerchantFraud")
public interface BqMerchantFraud {
    @GenericDtxEndpoint
    @Description("ExBQ Obtain an automated refresh of merchant fraud analysis")
    ExecuteMerchantFraudResponse executeMerchantFraud(ExecuteMerchantFraudRequest req);

    @Description("ReBQ Retrieve details about merchant fraud analysis, including recent results")
    RetrieveMerchantFraudResponse retrieveMerchantFraud(RetrieveMerchantFraudRequest req);
}