package org.museframework.bian.paymentinitiation;

import org.museframework.bian.paymentinitiation.dto.RetrieveFundingCheckRequest;
import org.museframework.bian.paymentinitiation.dto.RetrieveFundingCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="PaymentInitiation", group="FundingCheck")
public interface BqFundingCheck {
    @Description("ReBQ Retrieve details about a payment transaction funds available")
    RetrieveFundingCheckResponse retrieveFundingCheck(RetrieveFundingCheckRequest req);
}