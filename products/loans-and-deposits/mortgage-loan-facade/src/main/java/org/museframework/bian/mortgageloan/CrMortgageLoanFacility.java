package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.ControlMortgageLoanFacilityRequest;
import org.museframework.bian.mortgageloan.dto.ControlMortgageLoanFacilityResponse;
import org.museframework.bian.mortgageloan.dto.ExchangeMortgageLoanFacilityRequest;
import org.museframework.bian.mortgageloan.dto.ExchangeMortgageLoanFacilityResponse;
import org.museframework.bian.mortgageloan.dto.ExecuteMortgageLoanFacilityRequest;
import org.museframework.bian.mortgageloan.dto.ExecuteMortgageLoanFacilityResponse;
import org.museframework.bian.mortgageloan.dto.InitiateMortgageLoanFacilityRequest;
import org.museframework.bian.mortgageloan.dto.InitiateMortgageLoanFacilityResponse;
import org.museframework.bian.mortgageloan.dto.RequestMortgageLoanFacilityRequest;
import org.museframework.bian.mortgageloan.dto.RequestMortgageLoanFacilityResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveMortgageLoanFacilityRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveMortgageLoanFacilityResponse;
import org.museframework.bian.mortgageloan.dto.UpdateMortgageLoanFacilityRequest;
import org.museframework.bian.mortgageloan.dto.UpdateMortgageLoanFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Mortgage Loan.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="MortgageLoan", group="MortgageLoanFacility")
public interface CrMortgageLoanFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Mortgage Loan Arrangement")
    ControlMortgageLoanFacilityResponse controlMortgageLoanFacility(ControlMortgageLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Mortgage Loan Arrangement processing")
    ExchangeMortgageLoanFacilityResponse exchangeMortgageLoanFacility(ExchangeMortgageLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Mortgage Loan Arrangement")
    ExecuteMortgageLoanFacilityResponse executeMortgageLoanFacility(ExecuteMortgageLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Mortgage Loan Facility")
    InitiateMortgageLoanFacilityResponse initiateMortgageLoanFacility(InitiateMortgageLoanFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Mortgage Loan Arrangement")
    RetrieveMortgageLoanFacilityResponse retrieveMortgageLoanFacility(RetrieveMortgageLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Mortgage Loan Arrangement")
    RequestMortgageLoanFacilityResponse requestMortgageLoanFacility(RequestMortgageLoanFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Mortgage Loan Arrangement")
    UpdateMortgageLoanFacilityResponse updateMortgageLoanFacility(UpdateMortgageLoanFacilityRequest req);
}