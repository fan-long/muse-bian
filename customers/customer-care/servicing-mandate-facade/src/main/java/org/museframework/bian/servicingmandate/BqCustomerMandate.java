package org.museframework.bian.servicingmandate;

import org.museframework.bian.servicingmandate.dto.EvaluateCustomerMandateRequest;
import org.museframework.bian.servicingmandate.dto.EvaluateCustomerMandateResponse;
import org.museframework.bian.servicingmandate.dto.RetrieveCustomerMandateRequest;
import org.museframework.bian.servicingmandate.dto.RetrieveCustomerMandateResponse;
import org.museframework.bian.servicingmandate.dto.UpdateCustomerMandateRequest;
import org.museframework.bian.servicingmandate.dto.UpdateCustomerMandateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Reference to the terms in force for a specific customer for this service provider")
@GenericDomain(name="ServicingMandate", group="CustomerMandate")
public interface BqCustomerMandate {
    @GenericDtxEndpoint
    @Description("EvBQ Agree terms for a customer mandate under the service mandate")
    EvaluateCustomerMandateResponse evaluateCustomerMandate(EvaluateCustomerMandateRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of the customer mandate")
    UpdateCustomerMandateResponse updateCustomerMandate(UpdateCustomerMandateRequest req);

    @Description("ReBQ Retrieve details about the customer mandate")
    RetrieveCustomerMandateResponse retrieveCustomerMandate(RetrieveCustomerMandateRequest req);
}