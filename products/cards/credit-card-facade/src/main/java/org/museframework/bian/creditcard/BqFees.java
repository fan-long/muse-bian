package org.museframework.bian.creditcard;

import org.museframework.bian.creditcard.dto.ExecuteFeesRequest;
import org.museframework.bian.creditcard.dto.ExecuteFeesResponse;
import org.museframework.bian.creditcard.dto.RetrieveFeesRequest;
import org.museframework.bian.creditcard.dto.RetrieveFeesResponse;
import org.museframework.bian.creditcard.dto.UpdateFeesRequest;
import org.museframework.bian.creditcard.dto.UpdateFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CreditCard", group="Fees")
public interface BqFees {
    @GenericDtxEndpoint
    @Description("UpBQ Update a fee transaction applied to a card account")
    UpdateFeesResponse updateFees(UpdateFeesRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Apply fees to a card account")
    ExecuteFeesResponse executeFees(ExecuteFeesRequest req);

    @Description("ReBQ Retrieve details about fees applied to an account")
    RetrieveFeesResponse retrieveFees(RetrieveFeesRequest req);
}