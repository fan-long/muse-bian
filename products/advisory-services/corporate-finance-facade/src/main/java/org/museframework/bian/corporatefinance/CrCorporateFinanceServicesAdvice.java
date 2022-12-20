package org.museframework.bian.corporatefinance;

import org.museframework.bian.corporatefinance.dto.ControlCorporateFinanceServicesAdviceRequest;
import org.museframework.bian.corporatefinance.dto.ControlCorporateFinanceServicesAdviceResponse;
import org.museframework.bian.corporatefinance.dto.ExchangeCorporateFinanceServicesAdviceRequest;
import org.museframework.bian.corporatefinance.dto.ExchangeCorporateFinanceServicesAdviceResponse;
import org.museframework.bian.corporatefinance.dto.ExecuteCorporateFinanceServicesAdviceRequest;
import org.museframework.bian.corporatefinance.dto.ExecuteCorporateFinanceServicesAdviceResponse;
import org.museframework.bian.corporatefinance.dto.InitiateCorporateFinanceServicesAdviceRequest;
import org.museframework.bian.corporatefinance.dto.InitiateCorporateFinanceServicesAdviceResponse;
import org.museframework.bian.corporatefinance.dto.NotifyCorporateFinanceServicesAdviceRequest;
import org.museframework.bian.corporatefinance.dto.NotifyCorporateFinanceServicesAdviceResponse;
import org.museframework.bian.corporatefinance.dto.RequestCorporateFinanceServicesAdviceRequest;
import org.museframework.bian.corporatefinance.dto.RequestCorporateFinanceServicesAdviceResponse;
import org.museframework.bian.corporatefinance.dto.RetrieveCorporateFinanceServicesAdviceRequest;
import org.museframework.bian.corporatefinance.dto.RetrieveCorporateFinanceServicesAdviceResponse;
import org.museframework.bian.corporatefinance.dto.UpdateCorporateFinanceServicesAdviceRequest;
import org.museframework.bian.corporatefinance.dto.UpdateCorporateFinanceServicesAdviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Provide specialist advice and/or support as an ongoing service or for a specific task/event within Corporate Finance")
@GenericDomain(name="CorporateFinance", group="CorporateFinanceServicesAdvice")
public interface CrCorporateFinanceServicesAdvice {
    @GenericDtxEndpoint
    @Description("Control Corporate Finance Services Advice")
    ControlCorporateFinanceServicesAdviceResponse controlCorporateFinanceServicesAdvice(ControlCorporateFinanceServicesAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Corporate Finance Services Advice")
    ExchangeCorporateFinanceServicesAdviceResponse exchangeCorporateFinanceServicesAdvice(ExchangeCorporateFinanceServicesAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Execute Corporate Finance Services Advice")
    ExecuteCorporateFinanceServicesAdviceResponse executeCorporateFinanceServicesAdvice(ExecuteCorporateFinanceServicesAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Corporate Finance Services Advice")
    InitiateCorporateFinanceServicesAdviceResponse initiateCorporateFinanceServicesAdvice(InitiateCorporateFinanceServicesAdviceRequest req);

    @Description("Notify Corporate Finance Services Advice")
    NotifyCorporateFinanceServicesAdviceResponse notifyCorporateFinanceServicesAdvice(NotifyCorporateFinanceServicesAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Request Corporate Finance Services Advice")
    RequestCorporateFinanceServicesAdviceResponse requestCorporateFinanceServicesAdvice(RequestCorporateFinanceServicesAdviceRequest req);

    @Description("Retrieve Corporate Finance Services Advice")
    RetrieveCorporateFinanceServicesAdviceResponse retrieveCorporateFinanceServicesAdvice(RetrieveCorporateFinanceServicesAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Update Corporate Finance Services Advice")
    UpdateCorporateFinanceServicesAdviceResponse updateCorporateFinanceServicesAdvice(UpdateCorporateFinanceServicesAdviceRequest req);
}