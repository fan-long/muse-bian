package org.museframework.bian.customerworkbench;

import org.museframework.bian.customerworkbench.dto.ExecuteBrowsingRequest;
import org.museframework.bian.customerworkbench.dto.ExecuteBrowsingResponse;
import org.museframework.bian.customerworkbench.dto.InitiateBrowsingRequest;
import org.museframework.bian.customerworkbench.dto.InitiateBrowsingResponse;
import org.museframework.bian.customerworkbench.dto.RetrieveBrowsingRequest;
import org.museframework.bian.customerworkbench.dto.RetrieveBrowsingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CustomerWorkbench", group="Browsing")
public interface BqBrowsing {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a browsing session")
    InitiateBrowsingResponse initiateBrowsing(InitiateBrowsingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute tasks within a browsing session (e.g. extract data)")
    ExecuteBrowsingResponse executeBrowsing(ExecuteBrowsingRequest req);

    @Description("ReBQ Retrieve details about a browsing session")
    RetrieveBrowsingResponse retrieveBrowsing(RetrieveBrowsingRequest req);
}