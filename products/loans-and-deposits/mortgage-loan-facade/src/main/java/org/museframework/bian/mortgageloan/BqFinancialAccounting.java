package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.RetrieveFinancialAccountingRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveFinancialAccountingResponse;
import org.museframework.bian.mortgageloan.dto.UpdateFinancialAccountingRequest;
import org.museframework.bian.mortgageloan.dto.UpdateFinancialAccountingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="FinancialAccounting")
public interface BqFinancialAccounting {
    @Description("ReBQ Retrieve details about any aspect of Financial Accounting")
    RetrieveFinancialAccountingResponse retrieveFinancialAccounting(RetrieveFinancialAccountingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Financial Accounting")
    UpdateFinancialAccountingResponse updateFinancialAccounting(UpdateFinancialAccountingRequest req);
}