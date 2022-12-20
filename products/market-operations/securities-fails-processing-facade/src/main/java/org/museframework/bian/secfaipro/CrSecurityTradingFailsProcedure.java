package org.museframework.bian.secfaipro;

import org.museframework.bian.secfaipro.dto.ControlSecurityTradingFailsProcedureRequest;
import org.museframework.bian.secfaipro.dto.ControlSecurityTradingFailsProcedureResponse;
import org.museframework.bian.secfaipro.dto.ExchangeSecurityTradingFailsProcedureRequest;
import org.museframework.bian.secfaipro.dto.ExchangeSecurityTradingFailsProcedureResponse;
import org.museframework.bian.secfaipro.dto.ExecuteSecurityTradingFailsProcedureRequest;
import org.museframework.bian.secfaipro.dto.ExecuteSecurityTradingFailsProcedureResponse;
import org.museframework.bian.secfaipro.dto.InitiateSecurityTradingFailsProcedureRequest;
import org.museframework.bian.secfaipro.dto.InitiateSecurityTradingFailsProcedureResponse;
import org.museframework.bian.secfaipro.dto.NotifySecurityTradingFailsProcedureRequest;
import org.museframework.bian.secfaipro.dto.NotifySecurityTradingFailsProcedureResponse;
import org.museframework.bian.secfaipro.dto.RequestSecurityTradingFailsProcedureRequest;
import org.museframework.bian.secfaipro.dto.RequestSecurityTradingFailsProcedureResponse;
import org.museframework.bian.secfaipro.dto.RetrieveSecurityTradingFailsProcedureRequest;
import org.museframework.bian.secfaipro.dto.RetrieveSecurityTradingFailsProcedureResponse;
import org.museframework.bian.secfaipro.dto.UpdateSecurityTradingFailsProcedureRequest;
import org.museframework.bian.secfaipro.dto.UpdateSecurityTradingFailsProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Securities Fails Processing. ")
@GenericDomain(name="SecuritiesFailsProcessing", group="SecurityTradingFailsProcedure")
public interface CrSecurityTradingFailsProcedure {
    @GenericDtxEndpoint
    @Description("Control Security Trading Fails Procedure")
    ControlSecurityTradingFailsProcedureResponse controlSecurityTradingFailsProcedure(ControlSecurityTradingFailsProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Security Trading Fails Procedure")
    ExchangeSecurityTradingFailsProcedureResponse exchangeSecurityTradingFailsProcedure(ExchangeSecurityTradingFailsProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Security Trading Fails Procedure")
    ExecuteSecurityTradingFailsProcedureResponse executeSecurityTradingFailsProcedure(ExecuteSecurityTradingFailsProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Security Trading Fails Procedure")
    InitiateSecurityTradingFailsProcedureResponse initiateSecurityTradingFailsProcedure(InitiateSecurityTradingFailsProcedureRequest req);

    @Description("Notify Security Trading Fails Procedure")
    NotifySecurityTradingFailsProcedureResponse notifySecurityTradingFailsProcedure(NotifySecurityTradingFailsProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Security Trading Fails Procedure")
    RequestSecurityTradingFailsProcedureResponse requestSecurityTradingFailsProcedure(RequestSecurityTradingFailsProcedureRequest req);

    @Description("Retrieve Security Trading Fails Procedure")
    RetrieveSecurityTradingFailsProcedureResponse retrieveSecurityTradingFailsProcedure(RetrieveSecurityTradingFailsProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Security Trading Fails Procedure")
    UpdateSecurityTradingFailsProcedureResponse updateSecurityTradingFailsProcedure(UpdateSecurityTradingFailsProcedureRequest req);
}