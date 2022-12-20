package org.museframework.bian.currencyexchange;

import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange.  Example: Execute a payment transaction.")
@GenericDomain(name="CurrencyExchange", group="CurrencyExchangeOutcome")
public interface BqCurrencyExchangeOutcome {
}