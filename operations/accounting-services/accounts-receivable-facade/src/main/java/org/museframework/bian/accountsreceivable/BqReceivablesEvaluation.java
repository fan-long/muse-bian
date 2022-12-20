package org.museframework.bian.accountsreceivable;

import org.museframework.bian.accountsreceivable.dto.ExchangeReceivablesEvaluationRequest;
import org.museframework.bian.accountsreceivable.dto.ExchangeReceivablesEvaluationResponse;
import org.museframework.bian.accountsreceivable.dto.InitiateReceivablesEvaluationRequest;
import org.museframework.bian.accountsreceivable.dto.InitiateReceivablesEvaluationResponse;
import org.museframework.bian.accountsreceivable.dto.RetrieveReceivablesEvaluationRequest;
import org.museframework.bian.accountsreceivable.dto.RetrieveReceivablesEvaluationResponse;
import org.museframework.bian.accountsreceivable.dto.UpdateReceivablesEvaluationRequest;
import org.museframework.bian.accountsreceivable.dto.UpdateReceivablesEvaluationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="AccountsReceivable", group="ReceivablesEvaluation")
public interface BqReceivablesEvaluation {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Receivables Evaluation processing")
    ExchangeReceivablesEvaluationResponse exchangeReceivablesEvaluation(ExchangeReceivablesEvaluationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Receivables Evaluation")
    InitiateReceivablesEvaluationResponse initiateReceivablesEvaluation(InitiateReceivablesEvaluationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Receivables Evaluation")
    RetrieveReceivablesEvaluationResponse retrieveReceivablesEvaluation(RetrieveReceivablesEvaluationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Receivables Evaluation")
    UpdateReceivablesEvaluationResponse updateReceivablesEvaluation(UpdateReceivablesEvaluationRequest req);
}