package org.museframework.bian.accountsreceivable;

import org.museframework.bian.accountsreceivable.dto.ControlAccountsReceivableProcedureRequest;
import org.museframework.bian.accountsreceivable.dto.ControlAccountsReceivableProcedureResponse;
import org.museframework.bian.accountsreceivable.dto.ExchangeAccountsReceivableProcedureRequest;
import org.museframework.bian.accountsreceivable.dto.ExchangeAccountsReceivableProcedureResponse;
import org.museframework.bian.accountsreceivable.dto.ExecuteAccountsReceivableProcedureRequest;
import org.museframework.bian.accountsreceivable.dto.ExecuteAccountsReceivableProcedureResponse;
import org.museframework.bian.accountsreceivable.dto.InitiateAccountsReceivableProcedureRequest;
import org.museframework.bian.accountsreceivable.dto.InitiateAccountsReceivableProcedureResponse;
import org.museframework.bian.accountsreceivable.dto.RequestAccountsReceivableProcedureRequest;
import org.museframework.bian.accountsreceivable.dto.RequestAccountsReceivableProcedureResponse;
import org.museframework.bian.accountsreceivable.dto.RetrieveAccountsReceivableProcedureRequest;
import org.museframework.bian.accountsreceivable.dto.RetrieveAccountsReceivableProcedureResponse;
import org.museframework.bian.accountsreceivable.dto.UpdateAccountsReceivableProcedureRequest;
import org.museframework.bian.accountsreceivable.dto.UpdateAccountsReceivableProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="AccountsReceivable", group="AccountsReceivableProcedure")
public interface CrAccountsReceivableProcedure {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Accounts Receivable Procedure")
    ControlAccountsReceivableProcedureResponse controlAccountsReceivableProcedure(ControlAccountsReceivableProcedureRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Accounts Receivable Procedure processing")
    ExchangeAccountsReceivableProcedureResponse exchangeAccountsReceivableProcedure(ExchangeAccountsReceivableProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Accounts Receivable Procedure")
    ExecuteAccountsReceivableProcedureResponse executeAccountsReceivableProcedure(ExecuteAccountsReceivableProcedureRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Accounts Receivable Procedure")
    InitiateAccountsReceivableProcedureResponse initiateAccountsReceivableProcedure(InitiateAccountsReceivableProcedureRequest req);

    @Description("ReCR Retrieve details about any aspect of Accounts Receivable Procedure")
    RetrieveAccountsReceivableProcedureResponse retrieveAccountsReceivableProcedure(RetrieveAccountsReceivableProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Accounts Receivable Procedure")
    RequestAccountsReceivableProcedureResponse requestAccountsReceivableProcedure(RequestAccountsReceivableProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Accounts Receivable Procedure")
    UpdateAccountsReceivableProcedureResponse updateAccountsReceivableProcedure(UpdateAccountsReceivableProcedureRequest req);
}