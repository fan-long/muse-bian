package org.museframework.bian.accountreconciliation;

import org.museframework.bian.accountreconciliation.dto.ControlAccountReconciliationProcedureRequest;
import org.museframework.bian.accountreconciliation.dto.ControlAccountReconciliationProcedureResponse;
import org.museframework.bian.accountreconciliation.dto.ExchangeAccountReconciliationProcedureRequest;
import org.museframework.bian.accountreconciliation.dto.ExchangeAccountReconciliationProcedureResponse;
import org.museframework.bian.accountreconciliation.dto.ExecuteAccountReconciliationProcedureRequest;
import org.museframework.bian.accountreconciliation.dto.ExecuteAccountReconciliationProcedureResponse;
import org.museframework.bian.accountreconciliation.dto.InitiateAccountReconciliationProcedureRequest;
import org.museframework.bian.accountreconciliation.dto.InitiateAccountReconciliationProcedureResponse;
import org.museframework.bian.accountreconciliation.dto.NotifyAccountReconciliationProcedureRequest;
import org.museframework.bian.accountreconciliation.dto.NotifyAccountReconciliationProcedureResponse;
import org.museframework.bian.accountreconciliation.dto.RequestAccountReconciliationProcedureRequest;
import org.museframework.bian.accountreconciliation.dto.RequestAccountReconciliationProcedureResponse;
import org.museframework.bian.accountreconciliation.dto.RetrieveAccountReconciliationProcedureRequest;
import org.museframework.bian.accountreconciliation.dto.RetrieveAccountReconciliationProcedureResponse;
import org.museframework.bian.accountreconciliation.dto.UpdateAccountReconciliationProcedureRequest;
import org.museframework.bian.accountreconciliation.dto.UpdateAccountReconciliationProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Account Reconciliation. ")
@GenericDomain(name="AccountReconciliation", group="AccountReconciliationProcedure")
public interface CrAccountReconciliationProcedure {
    @GenericDtxEndpoint
    @Description("Control Account Reconciliation Procedure")
    ControlAccountReconciliationProcedureResponse controlAccountReconciliationProcedure(ControlAccountReconciliationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Account Reconciliation Procedure")
    ExchangeAccountReconciliationProcedureResponse exchangeAccountReconciliationProcedure(ExchangeAccountReconciliationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Account Reconciliation Procedure")
    ExecuteAccountReconciliationProcedureResponse executeAccountReconciliationProcedure(ExecuteAccountReconciliationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Account Reconciliation Procedure")
    InitiateAccountReconciliationProcedureResponse initiateAccountReconciliationProcedure(InitiateAccountReconciliationProcedureRequest req);

    @Description("Notify Account Reconciliation Procedure")
    NotifyAccountReconciliationProcedureResponse notifyAccountReconciliationProcedure(NotifyAccountReconciliationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Account Reconciliation Procedure")
    RequestAccountReconciliationProcedureResponse requestAccountReconciliationProcedure(RequestAccountReconciliationProcedureRequest req);

    @Description("Retrieve Account Reconciliation Procedure")
    RetrieveAccountReconciliationProcedureResponse retrieveAccountReconciliationProcedure(RetrieveAccountReconciliationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Account Reconciliation Procedure")
    UpdateAccountReconciliationProcedureResponse updateAccountReconciliationProcedure(UpdateAccountReconciliationProcedureRequest req);
}