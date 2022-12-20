package org.museframework.bian.virtualaccount;

import org.museframework.bian.virtualaccount.dto.ExchangeStatementRequest;
import org.museframework.bian.virtualaccount.dto.ExchangeStatementResponse;
import org.museframework.bian.virtualaccount.dto.GrantStatementRequest;
import org.museframework.bian.virtualaccount.dto.GrantStatementResponse;
import org.museframework.bian.virtualaccount.dto.InitiateStatementRequest;
import org.museframework.bian.virtualaccount.dto.InitiateStatementResponse;
import org.museframework.bian.virtualaccount.dto.RequestStatementRequest;
import org.museframework.bian.virtualaccount.dto.RequestStatementResponse;
import org.museframework.bian.virtualaccount.dto.RetrieveStatementRequest;
import org.museframework.bian.virtualaccount.dto.RetrieveStatementResponse;
import org.museframework.bian.virtualaccount.dto.UpdateStatementRequest;
import org.museframework.bian.virtualaccount.dto.UpdateStatementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment")
@GenericDomain(name="VirtualAccount", group="Statement")
public interface BqStatement {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Statement processing")
    ExchangeStatementResponse exchangeStatement(ExchangeStatementRequest req);

    @GenericDtxEndpoint
    @Description("GrBQ Obtain permission to act in relation to Statement")
    GrantStatementResponse grantStatement(GrantStatementRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Statement")
    InitiateStatementResponse initiateStatement(InitiateStatementRequest req);

    @Description("ReBQ Retrieve details about any aspect of Statement")
    RetrieveStatementResponse retrieveStatement(RetrieveStatementRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Statement")
    RequestStatementResponse requestStatement(RequestStatementRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Statement")
    UpdateStatementResponse updateStatement(UpdateStatementRequest req);
}