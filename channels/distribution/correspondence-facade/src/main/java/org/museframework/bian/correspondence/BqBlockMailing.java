package org.museframework.bian.correspondence;

import org.museframework.bian.correspondence.dto.InitiateBlockMailingRequest;
import org.museframework.bian.correspondence.dto.InitiateBlockMailingResponse;
import org.museframework.bian.correspondence.dto.RetrieveBlockMailingRequest;
import org.museframework.bian.correspondence.dto.RetrieveBlockMailingResponse;
import org.museframework.bian.correspondence.dto.UpdateBlockMailingRequest;
import org.museframework.bian.correspondence.dto.UpdateBlockMailingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="Correspondence", group="BlockMailing")
public interface BqBlockMailing {
    @GenericDtxEndpoint
    @Description("InBQ Initiate processing an outbound correspondence block")
    InitiateBlockMailingResponse initiateBlockMailing(InitiateBlockMailingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an outbound correspondence block")
    UpdateBlockMailingResponse updateBlockMailing(UpdateBlockMailingRequest req);

    @Description("ReBQ Retrieve details about an outbound correspondence block")
    RetrieveBlockMailingResponse retrieveBlockMailing(RetrieveBlockMailingRequest req);
}