package org.museframework.bian.chequeprocessing;

import org.museframework.bian.chequeprocessing.dto.ExchangeFinancialTransactionInitiationRequest;
import org.museframework.bian.chequeprocessing.dto.ExchangeFinancialTransactionInitiationResponse;
import org.museframework.bian.chequeprocessing.dto.RetrieveFinancialTransactionInitiationRequest;
import org.museframework.bian.chequeprocessing.dto.RetrieveFinancialTransactionInitiationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Cheque Processing.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ChequeProcessing", group="FinancialTransactionInitiation")
public interface BqFinancialTransactionInitiation {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Financial Transaction Initiation processing")
    ExchangeFinancialTransactionInitiationResponse exchangeFinancialTransactionInitiation(ExchangeFinancialTransactionInitiationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Financial Transaction Initiation")
    RetrieveFinancialTransactionInitiationResponse retrieveFinancialTransactionInitiation(RetrieveFinancialTransactionInitiationRequest req);
}