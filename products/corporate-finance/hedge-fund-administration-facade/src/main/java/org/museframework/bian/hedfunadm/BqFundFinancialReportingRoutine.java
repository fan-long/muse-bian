package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ExchangeFundFinancialReportingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeFundFinancialReportingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.GrantFundFinancialReportingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.GrantFundFinancialReportingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.NotifyFundFinancialReportingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.NotifyFundFinancialReportingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RequestFundFinancialReportingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RequestFundFinancialReportingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveFundFinancialReportingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveFundFinancialReportingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.UpdateFundFinancialReportingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.UpdateFundFinancialReportingRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine")
@GenericDomain(name="HedgeFundAdministration", group="FundFinancialReportingRoutine")
public interface BqFundFinancialReportingRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Financial Reporting Routine")
    ExchangeFundFinancialReportingRoutineResponse exchangeFundFinancialReportingRoutine(ExchangeFundFinancialReportingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Financial Reporting Routine")
    GrantFundFinancialReportingRoutineResponse grantFundFinancialReportingRoutine(GrantFundFinancialReportingRoutineRequest req);

    @Description("Notify Fund Financial Reporting Routine")
    NotifyFundFinancialReportingRoutineResponse notifyFundFinancialReportingRoutine(NotifyFundFinancialReportingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Financial Reporting Routine")
    RequestFundFinancialReportingRoutineResponse requestFundFinancialReportingRoutine(RequestFundFinancialReportingRoutineRequest req);

    @Description("Retrieve Fund Financial Reporting Routine")
    RetrieveFundFinancialReportingRoutineResponse retrieveFundFinancialReportingRoutine(RetrieveFundFinancialReportingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Financial Reporting Routine")
    UpdateFundFinancialReportingRoutineResponse updateFundFinancialReportingRoutine(UpdateFundFinancialReportingRoutineRequest req);
}