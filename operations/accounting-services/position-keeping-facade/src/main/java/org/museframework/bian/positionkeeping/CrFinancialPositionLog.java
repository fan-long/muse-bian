package org.museframework.bian.positionkeeping;

import org.museframework.bian.positionkeeping.dto.InitiateFinancialPositionLogRequest;
import org.museframework.bian.positionkeeping.dto.InitiateFinancialPositionLogResponse;
import org.museframework.bian.positionkeeping.dto.RetrieveFinancialPositionLogRequest;
import org.museframework.bian.positionkeeping.dto.RetrieveFinancialPositionLogResponse;
import org.museframework.bian.positionkeeping.dto.UpdateFinancialPositionLogRequest;
import org.museframework.bian.positionkeeping.dto.UpdateFinancialPositionLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Position Keeping. ")
@GenericDomain(name="PositionKeeping", group="FinancialPositionLog")
public interface CrFinancialPositionLog {
    @GenericDtxEndpoint
    @Description("InCR Initiate a position keeping transaction log")
    InitiateFinancialPositionLogResponse initiateFinancialPositionLog(InitiateFinancialPositionLogRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an active financial transaction log, including reflecting an account block")
    UpdateFinancialPositionLogResponse updateFinancialPositionLog(UpdateFinancialPositionLogRequest req);

    @Description("ReCR Retrieve information about the log")
    RetrieveFinancialPositionLogResponse retrieveFinancialPositionLog(RetrieveFinancialPositionLogRequest req);
}