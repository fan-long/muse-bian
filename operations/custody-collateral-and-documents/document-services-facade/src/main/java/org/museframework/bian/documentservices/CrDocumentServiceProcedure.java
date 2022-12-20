package org.museframework.bian.documentservices;

import org.museframework.bian.documentservices.dto.ControlDocumentServiceProcedureRequest;
import org.museframework.bian.documentservices.dto.ControlDocumentServiceProcedureResponse;
import org.museframework.bian.documentservices.dto.ExchangeDocumentServiceProcedureRequest;
import org.museframework.bian.documentservices.dto.ExchangeDocumentServiceProcedureResponse;
import org.museframework.bian.documentservices.dto.ExecuteDocumentServiceProcedureRequest;
import org.museframework.bian.documentservices.dto.ExecuteDocumentServiceProcedureResponse;
import org.museframework.bian.documentservices.dto.InitiateDocumentServiceProcedureRequest;
import org.museframework.bian.documentservices.dto.InitiateDocumentServiceProcedureResponse;
import org.museframework.bian.documentservices.dto.NotifyDocumentServiceProcedureRequest;
import org.museframework.bian.documentservices.dto.NotifyDocumentServiceProcedureResponse;
import org.museframework.bian.documentservices.dto.RequestDocumentServiceProcedureRequest;
import org.museframework.bian.documentservices.dto.RequestDocumentServiceProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Document Services. ")
@GenericDomain(name="DocumentServices", group="DocumentServiceProcedure")
public interface CrDocumentServiceProcedure {
    @GenericDtxEndpoint
    @Description("Control Document Service Procedure")
    ControlDocumentServiceProcedureResponse controlDocumentServiceProcedure(ControlDocumentServiceProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Document Service Procedure")
    ExchangeDocumentServiceProcedureResponse exchangeDocumentServiceProcedure(ExchangeDocumentServiceProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Document Service Procedure")
    ExecuteDocumentServiceProcedureResponse executeDocumentServiceProcedure(ExecuteDocumentServiceProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Document Service Procedure")
    InitiateDocumentServiceProcedureResponse initiateDocumentServiceProcedure(InitiateDocumentServiceProcedureRequest req);

    @Description("Notify Document Service Procedure")
    NotifyDocumentServiceProcedureResponse notifyDocumentServiceProcedure(NotifyDocumentServiceProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Service Procedure")
    RequestDocumentServiceProcedureResponse requestDocumentServiceProcedure(RequestDocumentServiceProcedureRequest req);
}