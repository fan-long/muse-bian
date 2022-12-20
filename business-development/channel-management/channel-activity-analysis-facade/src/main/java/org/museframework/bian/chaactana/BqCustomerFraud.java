package org.museframework.bian.chaactana;

import org.museframework.bian.chaactana.dto.ExecuteCustomerFraudRequest;
import org.museframework.bian.chaactana.dto.ExecuteCustomerFraudResponse;
import org.museframework.bian.chaactana.dto.RetrieveCustomerFraudRequest;
import org.museframework.bian.chaactana.dto.RetrieveCustomerFraudResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of models/calculations/algoritms that can be applied to a subject or activity  Examples: Average balance calculation, Propensity to buy")
@GenericDomain(name="ChannelActivityAnalysis", group="CustomerFraud")
public interface BqCustomerFraud {
    @GenericDtxEndpoint
    @Description("ExBQ Obtain an automated refresh of customer fraud analysis")
    ExecuteCustomerFraudResponse executeCustomerFraud(ExecuteCustomerFraudRequest req);

    @Description("ReBQ Retrieve details about customer fraud analysis, including recent results")
    RetrieveCustomerFraudResponse retrieveCustomerFraud(RetrieveCustomerFraudRequest req);
}