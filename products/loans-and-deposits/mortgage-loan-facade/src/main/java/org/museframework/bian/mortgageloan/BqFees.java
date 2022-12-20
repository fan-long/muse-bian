package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.ExchangeFeesRequest;
import org.museframework.bian.mortgageloan.dto.ExchangeFeesResponse;
import org.museframework.bian.mortgageloan.dto.InitiateFeesRequest;
import org.museframework.bian.mortgageloan.dto.InitiateFeesResponse;
import org.museframework.bian.mortgageloan.dto.RequestFeesRequest;
import org.museframework.bian.mortgageloan.dto.RequestFeesResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveFeesRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveFeesResponse;
import org.museframework.bian.mortgageloan.dto.UpdateFeesRequest;
import org.museframework.bian.mortgageloan.dto.UpdateFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Fees")
public interface BqFees {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fees processing")
    ExchangeFeesResponse exchangeFees(ExchangeFeesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Fees")
    InitiateFeesResponse initiateFees(InitiateFeesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fees")
    RetrieveFeesResponse retrieveFees(RetrieveFeesRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fees")
    RequestFeesResponse requestFees(RequestFeesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Fees")
    UpdateFeesResponse updateFees(UpdateFeesRequest req);
}