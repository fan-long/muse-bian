package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.ExchangePaymentsRequest;
import org.museframework.bian.mortgageloan.dto.ExchangePaymentsResponse;
import org.museframework.bian.mortgageloan.dto.InitiatePaymentsRequest;
import org.museframework.bian.mortgageloan.dto.InitiatePaymentsResponse;
import org.museframework.bian.mortgageloan.dto.RetrievePaymentsRequest;
import org.museframework.bian.mortgageloan.dto.RetrievePaymentsResponse;
import org.museframework.bian.mortgageloan.dto.UpdatePaymentsRequest;
import org.museframework.bian.mortgageloan.dto.UpdatePaymentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Payments")
public interface BqPayments {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Payments processing")
    ExchangePaymentsResponse exchangePayments(ExchangePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Payments")
    InitiatePaymentsResponse initiatePayments(InitiatePaymentsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Payments")
    RetrievePaymentsResponse retrievePayments(RetrievePaymentsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Payments")
    UpdatePaymentsResponse updatePayments(UpdatePaymentsRequest req);
}