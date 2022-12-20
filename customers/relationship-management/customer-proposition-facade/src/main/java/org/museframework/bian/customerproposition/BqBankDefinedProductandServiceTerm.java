package org.museframework.bian.customerproposition;

import org.museframework.bian.customerproposition.dto.EvaluateBankDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.EvaluateBankDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.ExchangeBankDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.ExchangeBankDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.NotifyBankDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.NotifyBankDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.RequestBankDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.RequestBankDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.RetrieveBankDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.RetrieveBankDefinedProductandServiceTermResponse;
import org.museframework.bian.customerproposition.dto.UpdateBankDefinedProductandServiceTermRequest;
import org.museframework.bian.customerproposition.dto.UpdateBankDefinedProductandServiceTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Defined Product and Service Term reflects the application of a specific rule or regulation that is an aspect of the Customer Defined Product and Service Term")
@GenericDomain(name="CustomerProposition", group="BankDefinedProductandServiceTerm")
public interface BqBankDefinedProductandServiceTerm {
    @GenericDtxEndpoint
    @Description("Evaluate Bank Defined Product and Service Term")
    EvaluateBankDefinedProductandServiceTermResponse evaluateBankDefinedProductandServiceTerm(EvaluateBankDefinedProductandServiceTermRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Bank Defined Product and Service Term")
    ExchangeBankDefinedProductandServiceTermResponse exchangeBankDefinedProductandServiceTerm(ExchangeBankDefinedProductandServiceTermRequest req);

    @Description("Notify Bank Defined Product and Service Term")
    NotifyBankDefinedProductandServiceTermResponse notifyBankDefinedProductandServiceTerm(NotifyBankDefinedProductandServiceTermRequest req);

    @GenericDtxEndpoint
    @Description("Request Bank Defined Product and Service Term")
    RequestBankDefinedProductandServiceTermResponse requestBankDefinedProductandServiceTerm(RequestBankDefinedProductandServiceTermRequest req);

    @Description("Retrieve Bank Defined Product and Service Term")
    RetrieveBankDefinedProductandServiceTermResponse retrieveBankDefinedProductandServiceTerm(RetrieveBankDefinedProductandServiceTermRequest req);

    @GenericDtxEndpoint
    @Description("Update Bank Defined Product and Service Term")
    UpdateBankDefinedProductandServiceTermResponse updateBankDefinedProductandServiceTerm(UpdateBankDefinedProductandServiceTermRequest req);
}