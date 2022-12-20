package org.museframework.bian.commissions;

import org.museframework.bian.commissions.dto.ControlCommissionTransactionRequest;
import org.museframework.bian.commissions.dto.ControlCommissionTransactionResponse;
import org.museframework.bian.commissions.dto.ExchangeCommissionTransactionRequest;
import org.museframework.bian.commissions.dto.ExchangeCommissionTransactionResponse;
import org.museframework.bian.commissions.dto.ExecuteCommissionTransactionRequest;
import org.museframework.bian.commissions.dto.ExecuteCommissionTransactionResponse;
import org.museframework.bian.commissions.dto.InitiateCommissionTransactionRequest;
import org.museframework.bian.commissions.dto.InitiateCommissionTransactionResponse;
import org.museframework.bian.commissions.dto.RequestCommissionTransactionRequest;
import org.museframework.bian.commissions.dto.RequestCommissionTransactionResponse;
import org.museframework.bian.commissions.dto.RetrieveCommissionTransactionRequest;
import org.museframework.bian.commissions.dto.RetrieveCommissionTransactionResponse;
import org.museframework.bian.commissions.dto.UpdateCommissionTransactionRequest;
import org.museframework.bian.commissions.dto.UpdateCommissionTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions.  Example: Execute a payment transaction.")
@GenericDomain(name="Commissions", group="CommissionTransaction")
public interface CrCommissionTransaction {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Commission Transaction")
    ControlCommissionTransactionResponse controlCommissionTransaction(ControlCommissionTransactionRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Commission Transaction processing")
    ExchangeCommissionTransactionResponse exchangeCommissionTransaction(ExchangeCommissionTransactionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Commission Transaction")
    ExecuteCommissionTransactionResponse executeCommissionTransaction(ExecuteCommissionTransactionRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Commission Transaction")
    InitiateCommissionTransactionResponse initiateCommissionTransaction(InitiateCommissionTransactionRequest req);

    @Description("ReCR Retrieve details about any aspect of Commission Transaction")
    RetrieveCommissionTransactionResponse retrieveCommissionTransaction(RetrieveCommissionTransactionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Commission Transaction")
    RequestCommissionTransactionResponse requestCommissionTransaction(RequestCommissionTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Commission Transaction")
    UpdateCommissionTransactionResponse updateCommissionTransaction(UpdateCommissionTransactionRequest req);
}