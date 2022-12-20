package org.museframework.bian.mutfunadm;

import org.museframework.bian.mutfunadm.dto.ExchangeFundFinancialReportingRoutineRequest;
import org.museframework.bian.mutfunadm.dto.ExchangeFundFinancialReportingRoutineResponse;
import org.museframework.bian.mutfunadm.dto.GrantFundFinancialReportingRoutineRequest;
import org.museframework.bian.mutfunadm.dto.GrantFundFinancialReportingRoutineResponse;
import org.museframework.bian.mutfunadm.dto.NotifyFundFinancialReportingRoutineRequest;
import org.museframework.bian.mutfunadm.dto.NotifyFundFinancialReportingRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RequestFundFinancialReportingRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RequestFundFinancialReportingRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RetrieveFundFinancialReportingRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RetrieveFundFinancialReportingRoutineResponse;
import org.museframework.bian.mutfunadm.dto.UpdateFundFinancialReportingRoutineRequest;
import org.museframework.bian.mutfunadm.dto.UpdateFundFinancialReportingRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="MutualFundAdministration", group="FundFinancialReportingRoutine")
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