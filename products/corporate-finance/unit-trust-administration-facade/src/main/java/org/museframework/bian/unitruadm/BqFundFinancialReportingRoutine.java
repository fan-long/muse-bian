package org.museframework.bian.unitruadm;

import org.museframework.bian.unitruadm.dto.ExchangeFundFinancialReportingRoutineRequest;
import org.museframework.bian.unitruadm.dto.ExchangeFundFinancialReportingRoutineResponse;
import org.museframework.bian.unitruadm.dto.GrantFundFinancialReportingRoutineRequest;
import org.museframework.bian.unitruadm.dto.GrantFundFinancialReportingRoutineResponse;
import org.museframework.bian.unitruadm.dto.NotifyFundFinancialReportingRoutineRequest;
import org.museframework.bian.unitruadm.dto.NotifyFundFinancialReportingRoutineResponse;
import org.museframework.bian.unitruadm.dto.RequestFundFinancialReportingRoutineRequest;
import org.museframework.bian.unitruadm.dto.RequestFundFinancialReportingRoutineResponse;
import org.museframework.bian.unitruadm.dto.RetrieveFundFinancialReportingRoutineRequest;
import org.museframework.bian.unitruadm.dto.RetrieveFundFinancialReportingRoutineResponse;
import org.museframework.bian.unitruadm.dto.UpdateFundFinancialReportingRoutineRequest;
import org.museframework.bian.unitruadm.dto.UpdateFundFinancialReportingRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="UnitTrustAdministration", group="FundFinancialReportingRoutine")
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