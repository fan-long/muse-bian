package org.museframework.bian.syndicatedloan;

import org.museframework.bian.syndicatedloan.dto.ControlSyndicatedLoanFacilityRequest;
import org.museframework.bian.syndicatedloan.dto.ControlSyndicatedLoanFacilityResponse;
import org.museframework.bian.syndicatedloan.dto.ExchangeSyndicatedLoanFacilityRequest;
import org.museframework.bian.syndicatedloan.dto.ExchangeSyndicatedLoanFacilityResponse;
import org.museframework.bian.syndicatedloan.dto.ExecuteSyndicatedLoanFacilityRequest;
import org.museframework.bian.syndicatedloan.dto.ExecuteSyndicatedLoanFacilityResponse;
import org.museframework.bian.syndicatedloan.dto.InitiateSyndicatedLoanFacilityRequest;
import org.museframework.bian.syndicatedloan.dto.InitiateSyndicatedLoanFacilityResponse;
import org.museframework.bian.syndicatedloan.dto.RequestSyndicatedLoanFacilityRequest;
import org.museframework.bian.syndicatedloan.dto.RequestSyndicatedLoanFacilityResponse;
import org.museframework.bian.syndicatedloan.dto.RetrieveSyndicatedLoanFacilityRequest;
import org.museframework.bian.syndicatedloan.dto.RetrieveSyndicatedLoanFacilityResponse;
import org.museframework.bian.syndicatedloan.dto.UpdateSyndicatedLoanFacilityRequest;
import org.museframework.bian.syndicatedloan.dto.UpdateSyndicatedLoanFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="SyndicatedLoan", group="SyndicatedLoanFacility")
public interface CrSyndicatedLoanFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Syndicated Loan Facility")
    ControlSyndicatedLoanFacilityResponse controlSyndicatedLoanFacility(ControlSyndicatedLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Syndicated Loan Facility processing")
    ExchangeSyndicatedLoanFacilityResponse exchangeSyndicatedLoanFacility(ExchangeSyndicatedLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Syndicated Loan Facility")
    ExecuteSyndicatedLoanFacilityResponse executeSyndicatedLoanFacility(ExecuteSyndicatedLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Syndicated Loan Facility")
    InitiateSyndicatedLoanFacilityResponse initiateSyndicatedLoanFacility(InitiateSyndicatedLoanFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Syndicated Loan Facility")
    RetrieveSyndicatedLoanFacilityResponse retrieveSyndicatedLoanFacility(RetrieveSyndicatedLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Syndicated Loan Facility")
    RequestSyndicatedLoanFacilityResponse requestSyndicatedLoanFacility(RequestSyndicatedLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Syndicated Loan Facility")
    UpdateSyndicatedLoanFacilityResponse updateSyndicatedLoanFacility(UpdateSyndicatedLoanFacilityRequest req);
}