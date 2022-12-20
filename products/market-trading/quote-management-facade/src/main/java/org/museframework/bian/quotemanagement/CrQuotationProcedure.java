package org.museframework.bian.quotemanagement;

import org.museframework.bian.quotemanagement.dto.ControlQuotationProcedureRequest;
import org.museframework.bian.quotemanagement.dto.ControlQuotationProcedureResponse;
import org.museframework.bian.quotemanagement.dto.ExchangeQuotationProcedureRequest;
import org.museframework.bian.quotemanagement.dto.ExchangeQuotationProcedureResponse;
import org.museframework.bian.quotemanagement.dto.ExecuteQuotationProcedureRequest;
import org.museframework.bian.quotemanagement.dto.ExecuteQuotationProcedureResponse;
import org.museframework.bian.quotemanagement.dto.InitiateQuotationProcedureRequest;
import org.museframework.bian.quotemanagement.dto.InitiateQuotationProcedureResponse;
import org.museframework.bian.quotemanagement.dto.NotifyQuotationProcedureRequest;
import org.museframework.bian.quotemanagement.dto.NotifyQuotationProcedureResponse;
import org.museframework.bian.quotemanagement.dto.RequestQuotationProcedureRequest;
import org.museframework.bian.quotemanagement.dto.RequestQuotationProcedureResponse;
import org.museframework.bian.quotemanagement.dto.RetrieveQuotationProcedureRequest;
import org.museframework.bian.quotemanagement.dto.RetrieveQuotationProcedureResponse;
import org.museframework.bian.quotemanagement.dto.UpdateQuotationProcedureRequest;
import org.museframework.bian.quotemanagement.dto.UpdateQuotationProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Quote Management. ")
@GenericDomain(name="QuoteManagement", group="QuotationProcedure")
public interface CrQuotationProcedure {
    @GenericDtxEndpoint
    @Description("Control Quotation Procedure")
    ControlQuotationProcedureResponse controlQuotationProcedure(ControlQuotationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Quotation Procedure")
    ExchangeQuotationProcedureResponse exchangeQuotationProcedure(ExchangeQuotationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Quotation Procedure")
    ExecuteQuotationProcedureResponse executeQuotationProcedure(ExecuteQuotationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Quotation Procedure")
    InitiateQuotationProcedureResponse initiateQuotationProcedure(InitiateQuotationProcedureRequest req);

    @Description("Notify Quotation Procedure")
    NotifyQuotationProcedureResponse notifyQuotationProcedure(NotifyQuotationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Quotation Procedure")
    RequestQuotationProcedureResponse requestQuotationProcedure(RequestQuotationProcedureRequest req);

    @Description("Retrieve Quotation Procedure")
    RetrieveQuotationProcedureResponse retrieveQuotationProcedure(RetrieveQuotationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Quotation Procedure")
    UpdateQuotationProcedureResponse updateQuotationProcedure(UpdateQuotationProcedureRequest req);
}