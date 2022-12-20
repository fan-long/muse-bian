package org.museframework.bian.customerworkbench;

import org.museframework.bian.customerworkbench.dto.InitiateSWUpdateRequest;
import org.museframework.bian.customerworkbench.dto.InitiateSWUpdateResponse;
import org.museframework.bian.customerworkbench.dto.RetrieveSWUpdateRequest;
import org.museframework.bian.customerworkbench.dto.RetrieveSWUpdateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CustomerWorkbench", group="SWUpdate")
public interface BqSWUpdate {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a SW update")
    InitiateSWUpdateResponse initiateSWUpdate(InitiateSWUpdateRequest req);

    @Description("ReBQ Retrieve details about a SW update")
    RetrieveSWUpdateResponse retrieveSWUpdate(RetrieveSWUpdateRequest req);
}