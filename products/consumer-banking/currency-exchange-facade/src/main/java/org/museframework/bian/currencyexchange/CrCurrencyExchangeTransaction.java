package org.museframework.bian.currencyexchange;

import org.museframework.bian.currencyexchange.dto.ControlCurrencyExchangeTransactionRequest;
import org.museframework.bian.currencyexchange.dto.ControlCurrencyExchangeTransactionResponse;
import org.museframework.bian.currencyexchange.dto.ExchangeCurrencyExchangeTransactionRequest;
import org.museframework.bian.currencyexchange.dto.ExchangeCurrencyExchangeTransactionResponse;
import org.museframework.bian.currencyexchange.dto.ExecuteCurrencyExchangeTransactionRequest;
import org.museframework.bian.currencyexchange.dto.ExecuteCurrencyExchangeTransactionResponse;
import org.museframework.bian.currencyexchange.dto.InitiateCurrencyExchangeTransactionRequest;
import org.museframework.bian.currencyexchange.dto.InitiateCurrencyExchangeTransactionResponse;
import org.museframework.bian.currencyexchange.dto.RequestCurrencyExchangeTransactionRequest;
import org.museframework.bian.currencyexchange.dto.RequestCurrencyExchangeTransactionResponse;
import org.museframework.bian.currencyexchange.dto.RetrieveCurrencyExchangeTransactionRequest;
import org.museframework.bian.currencyexchange.dto.RetrieveCurrencyExchangeTransactionResponse;
import org.museframework.bian.currencyexchange.dto.UpdateCurrencyExchangeTransactionRequest;
import org.museframework.bian.currencyexchange.dto.UpdateCurrencyExchangeTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange.  Example: Execute a payment transaction.")
@GenericDomain(name="CurrencyExchange", group="CurrencyExchangeTransaction")
public interface CrCurrencyExchangeTransaction {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Currency Exchange Transaction")
    ControlCurrencyExchangeTransactionResponse controlCurrencyExchangeTransaction(ControlCurrencyExchangeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Currency Exchange Transaction processing")
    ExchangeCurrencyExchangeTransactionResponse exchangeCurrencyExchangeTransaction(ExchangeCurrencyExchangeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Currency Exchange Transaction")
    ExecuteCurrencyExchangeTransactionResponse executeCurrencyExchangeTransaction(ExecuteCurrencyExchangeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Currency Exchange Transaction")
    InitiateCurrencyExchangeTransactionResponse initiateCurrencyExchangeTransaction(InitiateCurrencyExchangeTransactionRequest req);

    @Description("ReCR Retrieve details about any aspect of Currency Exchange Transaction")
    RetrieveCurrencyExchangeTransactionResponse retrieveCurrencyExchangeTransaction(RetrieveCurrencyExchangeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Currency Exchange Transaction")
    RequestCurrencyExchangeTransactionResponse requestCurrencyExchangeTransaction(RequestCurrencyExchangeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Currency Exchange Transaction")
    UpdateCurrencyExchangeTransactionResponse updateCurrencyExchangeTransaction(UpdateCurrencyExchangeTransactionRequest req);
}