package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.RetrieveFinancialAccountingRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveFinancialAccountingResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateFinancialAccountingRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateFinancialAccountingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="FinancialAccounting")
public interface BqFinancialAccounting {
    @Description("ReBQ Retrieve details about any aspect of Financial Accounting")
    RetrieveFinancialAccountingResponse retrieveFinancialAccounting(RetrieveFinancialAccountingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Financial Accounting")
    UpdateFinancialAccountingResponse updateFinancialAccounting(UpdateFinancialAccountingRequest req);
}