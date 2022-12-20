package org.museframework.bian.customerproposition;

import org.museframework.bian.customerproposition.dto.EvaluateCustomerDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.EvaluateCustomerDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.ExchangeCustomerDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.ExchangeCustomerDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.NotifyCustomerDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.NotifyCustomerDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.RequestCustomerDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.RequestCustomerDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.RetrieveCustomerDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.RetrieveCustomerDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.UpdateCustomerDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.UpdateCustomerDefinedProductandServiceTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Defined Product and Service Term reflects the application of a specific rule or regulation that is an aspect of the Customer Defined Product and Service Term")
@GenericDomain(name="CustomerProposition", group="CustomerDefinedProductandServiceTerm")
public interface BqCustomerDefinedProductandServiceTerm {
    @GenericDtxEndpoint
    @Description("Evaluate Customer Defined Product and Service Term")
    EvaluateCustomerDefinedProductandServiceTermResponse evaluateCustomerDefinedProductandServiceTerm(EvaluateCustomerDefinedProductandServiceTermRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Customer Defined Product and Service Term")
    ExchangeCustomerDefinedProductandServiceTermResponse exchangeCustomerDefinedProductandServiceTerm(ExchangeCustomerDefinedProductandServiceTermRequest req);

    @Description("Notify Customer Defined Product and Service Term")
    NotifyCustomerDefinedProductandServiceTermResponse notifyCustomerDefinedProductandServiceTerm(NotifyCustomerDefinedProductandServiceTermRequest req);

    @GenericDtxEndpoint
    @Description("Request Customer Defined Product and Service Term")
    RequestCustomerDefinedProductandServiceTermResponse requestCustomerDefinedProductandServiceTerm(RequestCustomerDefinedProductandServiceTermRequest req);

    @Description("Retrieve Customer Defined Product and Service Term")
    RetrieveCustomerDefinedProductandServiceTermResponse retrieveCustomerDefinedProductandServiceTerm(RetrieveCustomerDefinedProductandServiceTermRequest req);

    @GenericDtxEndpoint
    @Description("Update Customer Defined Product and Service Term")
    UpdateCustomerDefinedProductandServiceTermResponse updateCustomerDefinedProductandServiceTerm(UpdateCustomerDefinedProductandServiceTermRequest req);
}