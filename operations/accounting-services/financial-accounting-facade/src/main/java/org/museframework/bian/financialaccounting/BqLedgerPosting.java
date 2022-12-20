package org.museframework.bian.financialaccounting;

import org.museframework.bian.financialaccounting.dto.CaptureLedgerPostingRequest;
import org.museframework.bian.financialaccounting.dto.CaptureLedgerPostingResponse;
import org.museframework.bian.financialaccounting.dto.RetrieveLedgerPostingRequest;
import org.museframework.bian.financialaccounting.dto.RetrieveLedgerPostingResponse;
import org.museframework.bian.financialaccounting.dto.UpdateLedgerPostingRequest;
import org.museframework.bian.financialaccounting.dto.UpdateLedgerPostingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="FinancialAccounting", group="LedgerPosting")
public interface BqLedgerPosting {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a posting (repair)")
    UpdateLedgerPostingResponse updateLedgerPosting(UpdateLedgerPostingRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Post to the financial account")
    CaptureLedgerPostingResponse captureLedgerPosting(CaptureLedgerPostingRequest req);

    @Description("ReBQ Retrieve details of postings from the account")
    RetrieveLedgerPostingResponse retrieveLedgerPosting(RetrieveLedgerPostingRequest req);
}