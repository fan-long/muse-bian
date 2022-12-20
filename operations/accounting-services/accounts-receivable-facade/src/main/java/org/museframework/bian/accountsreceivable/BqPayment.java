package org.museframework.bian.accountsreceivable;

import org.museframework.bian.accountsreceivable.dto.InitiatePaymentRequest;
import org.museframework.bian.accountsreceivable.dto.InitiatePaymentResponse;
import org.museframework.bian.accountsreceivable.dto.RetrievePaymentRequest;
import org.museframework.bian.accountsreceivable.dto.RetrievePaymentResponse;
import org.museframework.bian.accountsreceivable.dto.UpdatePaymentRequest;
import org.museframework.bian.accountsreceivable.dto.UpdatePaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="AccountsReceivable", group="Payment")
public interface BqPayment {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Payment")
    InitiatePaymentResponse initiatePayment(InitiatePaymentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Payment")
    RetrievePaymentResponse retrievePayment(RetrievePaymentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Payment")
    UpdatePaymentResponse updatePayment(UpdatePaymentRequest req);
}