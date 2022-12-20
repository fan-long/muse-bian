package org.museframework.bian.carfinset;

import org.museframework.bian.carfinset.dto.RetrievePaymentRequest;
import org.museframework.bian.carfinset.dto.RetrievePaymentResponse;
import org.museframework.bian.carfinset.dto.UpdatePaymentRequest;
import org.museframework.bian.carfinset.dto.UpdatePaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardFinancialSettlement", group="Payment")
public interface BqPayment {
    @GenericDtxEndpoint
    @Description("UpBQ Update payment processing details for a settlement procedure")
    UpdatePaymentResponse updatePayment(UpdatePaymentRequest req);

    @Description("ReBQ Retrieve payment processing details for a settlement procedure")
    RetrievePaymentResponse retrievePayment(RetrievePaymentRequest req);
}