package org.museframework.bian.atmnetope;

import org.museframework.bian.atmnetope.dto.ExchangeFinancialDocumentHandlingRequest;
import org.museframework.bian.atmnetope.dto.ExchangeFinancialDocumentHandlingResponse;
import org.museframework.bian.atmnetope.dto.ExecuteFinancialDocumentHandlingRequest;
import org.museframework.bian.atmnetope.dto.ExecuteFinancialDocumentHandlingResponse;
import org.museframework.bian.atmnetope.dto.InitiateFinancialDocumentHandlingRequest;
import org.museframework.bian.atmnetope.dto.InitiateFinancialDocumentHandlingResponse;
import org.museframework.bian.atmnetope.dto.RetrieveFinancialDocumentHandlingRequest;
import org.museframework.bian.atmnetope.dto.RetrieveFinancialDocumentHandlingResponse;
import org.museframework.bian.atmnetope.dto.UpdateFinancialDocumentHandlingRequest;
import org.museframework.bian.atmnetope.dto.UpdateFinancialDocumentHandlingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within ATM Network Operations.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ATMNetworkOperations", group="FinancialDocumentHandling")
public interface BqFinancialDocumentHandling {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Financial Document Handling processing")
    ExchangeFinancialDocumentHandlingResponse exchangeFinancialDocumentHandling(ExchangeFinancialDocumentHandlingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Financial Document Handling")
    ExecuteFinancialDocumentHandlingResponse executeFinancialDocumentHandling(ExecuteFinancialDocumentHandlingRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Financial Document Handling")
    InitiateFinancialDocumentHandlingResponse initiateFinancialDocumentHandling(InitiateFinancialDocumentHandlingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Financial Document Handling")
    RetrieveFinancialDocumentHandlingResponse retrieveFinancialDocumentHandling(RetrieveFinancialDocumentHandlingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Financial Document Handling")
    UpdateFinancialDocumentHandlingResponse updateFinancialDocumentHandling(UpdateFinancialDocumentHandlingRequest req);
}