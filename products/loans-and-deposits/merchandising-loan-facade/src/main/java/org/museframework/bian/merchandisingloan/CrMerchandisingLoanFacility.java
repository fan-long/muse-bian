package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.ControlMerchandisingLoanFacilityRequest;
import org.museframework.bian.merchandisingloan.dto.ControlMerchandisingLoanFacilityResponse;
import org.museframework.bian.merchandisingloan.dto.ExchangeMerchandisingLoanFacilityRequest;
import org.museframework.bian.merchandisingloan.dto.ExchangeMerchandisingLoanFacilityResponse;
import org.museframework.bian.merchandisingloan.dto.ExecuteMerchandisingLoanFacilityRequest;
import org.museframework.bian.merchandisingloan.dto.ExecuteMerchandisingLoanFacilityResponse;
import org.museframework.bian.merchandisingloan.dto.InitiateMerchandisingLoanFacilityRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateMerchandisingLoanFacilityResponse;
import org.museframework.bian.merchandisingloan.dto.RequestMerchandisingLoanFacilityRequest;
import org.museframework.bian.merchandisingloan.dto.RequestMerchandisingLoanFacilityResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveMerchandisingLoanFacilityRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveMerchandisingLoanFacilityResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateMerchandisingLoanFacilityRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateMerchandisingLoanFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Merchandising Loan.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="MerchandisingLoan", group="MerchandisingLoanFacility")
public interface CrMerchandisingLoanFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Merchandising Loan Facility")
    ControlMerchandisingLoanFacilityResponse controlMerchandisingLoanFacility(ControlMerchandisingLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Merchandising Loan Facility processing")
    ExchangeMerchandisingLoanFacilityResponse exchangeMerchandisingLoanFacility(ExchangeMerchandisingLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Merchandising Loan Facility")
    ExecuteMerchandisingLoanFacilityResponse executeMerchandisingLoanFacility(ExecuteMerchandisingLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Merchandising Loan Facility")
    InitiateMerchandisingLoanFacilityResponse initiateMerchandisingLoanFacility(InitiateMerchandisingLoanFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Merchandising Loan Facility")
    RetrieveMerchandisingLoanFacilityResponse retrieveMerchandisingLoanFacility(RetrieveMerchandisingLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Merchandising Loan Facility")
    RequestMerchandisingLoanFacilityResponse requestMerchandisingLoanFacility(RequestMerchandisingLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Merchandising Loan Facility")
    UpdateMerchandisingLoanFacilityResponse updateMerchandisingLoanFacility(UpdateMerchandisingLoanFacilityRequest req);
}