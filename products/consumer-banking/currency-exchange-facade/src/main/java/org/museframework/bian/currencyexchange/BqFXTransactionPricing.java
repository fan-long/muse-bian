package org.museframework.bian.currencyexchange;

import org.museframework.bian.currencyexchange.dto.InitiateFXTransactionPricingRequest;
import org.museframework.bian.currencyexchange.dto.InitiateFXTransactionPricingResponse;
import org.museframework.bian.currencyexchange.dto.RetrieveFXTransactionPricingRequest;
import org.museframework.bian.currencyexchange.dto.RetrieveFXTransactionPricingResponse;
import org.museframework.bian.currencyexchange.dto.UpdateFXTransactionPricingRequest;
import org.museframework.bian.currencyexchange.dto.UpdateFXTransactionPricingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange.  Example: Execute a payment transaction.")
@GenericDomain(name="CurrencyExchange", group="FXTransactionPricing")
public interface BqFXTransactionPricing {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new FX Transaction Pricing")
    InitiateFXTransactionPricingResponse initiateFXTransactionPricing(InitiateFXTransactionPricingRequest req);

    @Description("ReBQ Retrieve details about any aspect of FX Transaction Pricing")
    RetrieveFXTransactionPricingResponse retrieveFXTransactionPricing(RetrieveFXTransactionPricingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to FX Transaction Pricing")
    UpdateFXTransactionPricingResponse updateFXTransactionPricing(UpdateFXTransactionPricingRequest req);
}