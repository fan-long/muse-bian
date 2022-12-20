package org.museframework.bian.customerworkbench;

import org.museframework.bian.customerworkbench.dto.InitiateCustomerWorkbenchOperatingSessionRequest;
import org.museframework.bian.customerworkbench.dto.InitiateCustomerWorkbenchOperatingSessionResponse;
import org.museframework.bian.customerworkbench.dto.RetrieveCustomerWorkbenchOperatingSessionRequest;
import org.museframework.bian.customerworkbench.dto.RetrieveCustomerWorkbenchOperatingSessionResponse;
import org.museframework.bian.customerworkbench.dto.UpdateCustomerWorkbenchOperatingSessionRequest;
import org.museframework.bian.customerworkbench.dto.UpdateCustomerWorkbenchOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Customer Workbench. ")
@GenericDomain(name="CustomerWorkbench", group="CustomerWorkbenchOperatingSession")
public interface CrCustomerWorkbenchOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate a customer workbench operating session")
    InitiateCustomerWorkbenchOperatingSessionResponse initiateCustomerWorkbenchOperatingSession(InitiateCustomerWorkbenchOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a workbench session")
    UpdateCustomerWorkbenchOperatingSessionResponse updateCustomerWorkbenchOperatingSession(UpdateCustomerWorkbenchOperatingSessionRequest req);

    @Description("ReCR Retrieve details about the workbench session")
    RetrieveCustomerWorkbenchOperatingSessionResponse retrieveCustomerWorkbenchOperatingSession(RetrieveCustomerWorkbenchOperatingSessionRequest req);
}