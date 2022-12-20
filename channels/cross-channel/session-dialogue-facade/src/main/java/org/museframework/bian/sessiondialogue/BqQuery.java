package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.InitiateQueryRequest;
import org.museframework.bian.sessiondialogue.dto.InitiateQueryResponse;
import org.museframework.bian.sessiondialogue.dto.RetrieveQueryRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveQueryResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateQueryRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateQueryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="Query")
public interface BqQuery {
    @GenericDtxEndpoint
    @Description("InBQ Initiate customer query handling")
    InitiateQueryResponse initiateQuery(InitiateQueryRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for query handling")
    UpdateQueryResponse updateQuery(UpdateQueryRequest req);

    @Description("ReBQ Retrieve details about query handling")
    RetrieveQueryResponse retrieveQuery(RetrieveQueryRequest req);
}