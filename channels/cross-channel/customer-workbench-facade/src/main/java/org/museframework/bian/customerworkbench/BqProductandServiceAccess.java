package org.museframework.bian.customerworkbench;

import org.museframework.bian.customerworkbench.dto.ExecuteProductandServiceAccessRequest;
import org.museframework.bian.customerworkbench.dto.ExecuteProductandServiceAccessResponse;
import org.museframework.bian.customerworkbench.dto.InitiateProductandServiceAccessRequest;
import org.museframework.bian.customerworkbench.dto.InitiateProductandServiceAccessResponse;
import org.museframework.bian.customerworkbench.dto.RequestProductandServiceAccessRequest;
import org.museframework.bian.customerworkbench.dto.RequestProductandServiceAccessResponse;
import org.museframework.bian.customerworkbench.dto.RetrieveProductandServiceAccessRequest;
import org.museframework.bian.customerworkbench.dto.RetrieveProductandServiceAccessResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CustomerWorkbench", group="ProductandServiceAccess")
public interface BqProductandServiceAccess {
    @GenericDtxEndpoint
    @Description("InBQ Initiate product/service access within the contact")
    InitiateProductandServiceAccessResponse initiateProductandServiceAccess(InitiateProductandServiceAccessRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action with the product/service access (e.g. self serve)")
    ExecuteProductandServiceAccessResponse executeProductandServiceAccess(ExecuteProductandServiceAccessRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a product/service access (e.g. request service)")
    RequestProductandServiceAccessResponse requestProductandServiceAccess(RequestProductandServiceAccessRequest req);

    @Description("ReBQ Retrieve details about product/service access")
    RetrieveProductandServiceAccessResponse retrieveProductandServiceAccess(RetrieveProductandServiceAccessRequest req);
}