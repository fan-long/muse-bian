package org.museframework.bian.cashconcentration;

import org.museframework.bian.cashconcentration.dto.ControlAccountBalanceSweepingFacilityRequest;
import org.museframework.bian.cashconcentration.dto.ControlAccountBalanceSweepingFacilityResponse;
import org.museframework.bian.cashconcentration.dto.ExchangeAccountBalanceSweepingFacilityRequest;
import org.museframework.bian.cashconcentration.dto.ExchangeAccountBalanceSweepingFacilityResponse;
import org.museframework.bian.cashconcentration.dto.NotifyAccountBalanceSweepingFacilityRequest;
import org.museframework.bian.cashconcentration.dto.NotifyAccountBalanceSweepingFacilityResponse;
import org.museframework.bian.cashconcentration.dto.RequestAccountBalanceSweepingFacilityRequest;
import org.museframework.bian.cashconcentration.dto.RequestAccountBalanceSweepingFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Cash Concentration. ")
@GenericDomain(name="CashConcentration", group="AccountBalanceSweepingFacility")
public interface CrAccountBalanceSweepingFacility {
    @GenericDtxEndpoint
    @Description("Control Account Balance Sweeping Facility")
    ControlAccountBalanceSweepingFacilityResponse controlAccountBalanceSweepingFacility(ControlAccountBalanceSweepingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Account Balance Sweeping Facility")
    ExchangeAccountBalanceSweepingFacilityResponse exchangeAccountBalanceSweepingFacility(ExchangeAccountBalanceSweepingFacilityRequest req);

    @Description("Notify Account Balance Sweeping Facility")
    NotifyAccountBalanceSweepingFacilityResponse notifyAccountBalanceSweepingFacility(NotifyAccountBalanceSweepingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Account Balance Sweeping Facility")
    RequestAccountBalanceSweepingFacilityResponse requestAccountBalanceSweepingFacility(RequestAccountBalanceSweepingFacilityRequest req);
}