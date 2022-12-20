package org.museframework.bian.financialaccounting;

import org.museframework.bian.financialaccounting.dto.InitiateFinancialBookingLogRequest;
import org.museframework.bian.financialaccounting.dto.InitiateFinancialBookingLogResponse;
import org.museframework.bian.financialaccounting.dto.RetrieveFinancialBookingLogRequest;
import org.museframework.bian.financialaccounting.dto.RetrieveFinancialBookingLogResponse;
import org.museframework.bian.financialaccounting.dto.UpdateFinancialBookingLogRequest;
import org.museframework.bian.financialaccounting.dto.UpdateFinancialBookingLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Financial Accounting. ")
@GenericDomain(name="FinancialAccounting", group="FinancialBookingLog")
public interface CrFinancialBookingLog {
    @GenericDtxEndpoint
    @Description("InCR Initiate a financial accounting log (account)")
    InitiateFinancialBookingLogResponse initiateFinancialBookingLog(InitiateFinancialBookingLogRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an active financial account")
    UpdateFinancialBookingLogResponse updateFinancialBookingLog(UpdateFinancialBookingLogRequest req);

    @Description("ReCR Retrieve information about the log")
    RetrieveFinancialBookingLogResponse retrieveFinancialBookingLog(RetrieveFinancialBookingLogRequest req);
}