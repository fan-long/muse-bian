package org.museframework.bian.directdebit;

import org.museframework.bian.directdebit.dto.ControlDirectDebitFacilityRequest;
import org.museframework.bian.directdebit.dto.ControlDirectDebitFacilityResponse;
import org.museframework.bian.directdebit.dto.ExchangeDirectDebitFacilityRequest;
import org.museframework.bian.directdebit.dto.ExchangeDirectDebitFacilityResponse;
import org.museframework.bian.directdebit.dto.ExecuteDirectDebitFacilityRequest;
import org.museframework.bian.directdebit.dto.ExecuteDirectDebitFacilityResponse;
import org.museframework.bian.directdebit.dto.InitiateDirectDebitFacilityRequest;
import org.museframework.bian.directdebit.dto.InitiateDirectDebitFacilityResponse;
import org.museframework.bian.directdebit.dto.RequestDirectDebitFacilityRequest;
import org.museframework.bian.directdebit.dto.RequestDirectDebitFacilityResponse;
import org.museframework.bian.directdebit.dto.RetrieveDirectDebitFacilityRequest;
import org.museframework.bian.directdebit.dto.RetrieveDirectDebitFacilityResponse;
import org.museframework.bian.directdebit.dto.UpdateDirectDebitFacilityRequest;
import org.museframework.bian.directdebit.dto.UpdateDirectDebitFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Direct Debit.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="DirectDebit", group="DirectDebitFacility")
public interface CrDirectDebitFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Direct Debit Facility")
    ControlDirectDebitFacilityResponse controlDirectDebitFacility(ControlDirectDebitFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Direct Debit Facility processing")
    ExchangeDirectDebitFacilityResponse exchangeDirectDebitFacility(ExchangeDirectDebitFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Direct Debit Facility")
    ExecuteDirectDebitFacilityResponse executeDirectDebitFacility(ExecuteDirectDebitFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Direct Debit Facility")
    InitiateDirectDebitFacilityResponse initiateDirectDebitFacility(InitiateDirectDebitFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Direct Debit Facility")
    RetrieveDirectDebitFacilityResponse retrieveDirectDebitFacility(RetrieveDirectDebitFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Direct Debit Facility")
    RequestDirectDebitFacilityResponse requestDirectDebitFacility(RequestDirectDebitFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Direct Debit Facility")
    UpdateDirectDebitFacilityResponse updateDirectDebitFacility(UpdateDirectDebitFacilityRequest req);
}