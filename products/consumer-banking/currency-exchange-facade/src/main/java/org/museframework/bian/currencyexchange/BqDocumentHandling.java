package org.museframework.bian.currencyexchange;

import org.museframework.bian.currencyexchange.dto.ExecuteDocumentHandlingRequest;
import org.museframework.bian.currencyexchange.dto.ExecuteDocumentHandlingResponse;
import org.museframework.bian.currencyexchange.dto.InitiateDocumentHandlingRequest;
import org.museframework.bian.currencyexchange.dto.InitiateDocumentHandlingResponse;
import org.museframework.bian.currencyexchange.dto.RetrieveDocumentHandlingRequest;
import org.museframework.bian.currencyexchange.dto.RetrieveDocumentHandlingResponse;
import org.museframework.bian.currencyexchange.dto.UpdateDocumentHandlingRequest;
import org.museframework.bian.currencyexchange.dto.UpdateDocumentHandlingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange.  Example: Execute a payment transaction.")
@GenericDomain(name="CurrencyExchange", group="DocumentHandling")
public interface BqDocumentHandling {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Document Handling")
    ExecuteDocumentHandlingResponse executeDocumentHandling(ExecuteDocumentHandlingRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Document Handling")
    InitiateDocumentHandlingResponse initiateDocumentHandling(InitiateDocumentHandlingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Document Handling")
    RetrieveDocumentHandlingResponse retrieveDocumentHandling(RetrieveDocumentHandlingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Document Handling")
    UpdateDocumentHandlingResponse updateDocumentHandling(UpdateDocumentHandlingRequest req);
}