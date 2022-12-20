package org.museframework.bian.syndicatedloan;

import org.museframework.bian.syndicatedloan.dto.ExchangeStructuringRequest;
import org.museframework.bian.syndicatedloan.dto.ExchangeStructuringResponse;
import org.museframework.bian.syndicatedloan.dto.InitiateStructuringRequest;
import org.museframework.bian.syndicatedloan.dto.InitiateStructuringResponse;
import org.museframework.bian.syndicatedloan.dto.RequestStructuringRequest;
import org.museframework.bian.syndicatedloan.dto.RequestStructuringResponse;
import org.museframework.bian.syndicatedloan.dto.RetrieveStructuringRequest;
import org.museframework.bian.syndicatedloan.dto.RetrieveStructuringResponse;
import org.museframework.bian.syndicatedloan.dto.UpdateStructuringRequest;
import org.museframework.bian.syndicatedloan.dto.UpdateStructuringResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="SyndicatedLoan", group="Structuring")
public interface BqStructuring {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Structuring processing")
    ExchangeStructuringResponse exchangeStructuring(ExchangeStructuringRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Structuring")
    InitiateStructuringResponse initiateStructuring(InitiateStructuringRequest req);

    @Description("ReBQ Retrieve details about any aspect of Structuring")
    RetrieveStructuringResponse retrieveStructuring(RetrieveStructuringRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Structuring")
    RequestStructuringResponse requestStructuring(RequestStructuringRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Structuring")
    UpdateStructuringResponse updateStructuring(UpdateStructuringRequest req);
}