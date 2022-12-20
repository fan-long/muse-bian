package org.museframework.bian.cardclearing;

import org.museframework.bian.cardclearing.dto.RetrieveFeesRequest;
import org.museframework.bian.cardclearing.dto.RetrieveFeesResponse;
import org.museframework.bian.cardclearing.dto.UpdateFeesRequest;
import org.museframework.bian.cardclearing.dto.UpdateFeesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardClearing", group="Fees")
public interface BqFees {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of applied fees")
    UpdateFeesResponse updateFees(UpdateFeesRequest req);

    @Description("ReBQ Retrieve details about card transaction intercharge fees")
    RetrieveFeesResponse retrieveFees(RetrieveFeesRequest req);
}