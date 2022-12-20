package org.museframework.bian.atmnetope;

import org.museframework.bian.atmnetope.dto.ExchangeCashDistributionRequest;
import org.museframework.bian.atmnetope.dto.ExchangeCashDistributionResponse;
import org.museframework.bian.atmnetope.dto.RequestCashDistributionRequest;
import org.museframework.bian.atmnetope.dto.RequestCashDistributionResponse;
import org.museframework.bian.atmnetope.dto.RetrieveCashDistributionRequest;
import org.museframework.bian.atmnetope.dto.RetrieveCashDistributionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within ATM Network Operations.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ATMNetworkOperations", group="CashDistribution")
public interface BqCashDistribution {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Cash Distribution processing")
    ExchangeCashDistributionResponse exchangeCashDistribution(ExchangeCashDistributionRequest req);

    @Description("ReBQ Retrieve details about any aspect of Cash Distribution")
    RetrieveCashDistributionResponse retrieveCashDistribution(RetrieveCashDistributionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Cash Distribution")
    RequestCashDistributionResponse requestCashDistribution(RequestCashDistributionRequest req);
}