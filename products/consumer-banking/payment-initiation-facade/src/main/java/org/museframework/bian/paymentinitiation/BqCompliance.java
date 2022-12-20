package org.museframework.bian.paymentinitiation;

import org.museframework.bian.paymentinitiation.dto.RetrieveComplianceRequest;
import org.museframework.bian.paymentinitiation.dto.RetrieveComplianceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The sub-tasks involved in the execution of the financial transaction")
@GenericDomain(name="PaymentInitiation", group="Compliance")
public interface BqCompliance {
    @Description("ReBQ Retrieve details about a payment transaction compliance check")
    RetrieveComplianceResponse retrieveCompliance(RetrieveComplianceRequest req);
}