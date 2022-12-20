package org.museframework.bian.syndicatedloan;

import org.museframework.bian.syndicatedloan.dto.ExchangeSyndicateAssemblyRequest;
import org.museframework.bian.syndicatedloan.dto.ExchangeSyndicateAssemblyResponse;
import org.museframework.bian.syndicatedloan.dto.RequestSyndicateAssemblyRequest;
import org.museframework.bian.syndicatedloan.dto.RequestSyndicateAssemblyResponse;
import org.museframework.bian.syndicatedloan.dto.RetrieveSyndicateAssemblyRequest;
import org.museframework.bian.syndicatedloan.dto.RetrieveSyndicateAssemblyResponse;
import org.museframework.bian.syndicatedloan.dto.UpdateSyndicateAssemblyRequest;
import org.museframework.bian.syndicatedloan.dto.UpdateSyndicateAssemblyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="SyndicatedLoan", group="SyndicateAssembly")
public interface BqSyndicateAssembly {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Syndicate Assembly processing")
    ExchangeSyndicateAssemblyResponse exchangeSyndicateAssembly(ExchangeSyndicateAssemblyRequest req);

    @Description("ReBQ Retrieve details about any aspect of Syndicate Assembly")
    RetrieveSyndicateAssemblyResponse retrieveSyndicateAssembly(RetrieveSyndicateAssemblyRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Syndicate Assembly")
    RequestSyndicateAssemblyResponse requestSyndicateAssembly(RequestSyndicateAssemblyRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Syndicate Assembly")
    UpdateSyndicateAssemblyResponse updateSyndicateAssembly(UpdateSyndicateAssemblyRequest req);
}