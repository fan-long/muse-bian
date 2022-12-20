package org.museframework.bian.contacthandler;

import org.museframework.bian.contacthandler.dto.ExecuteCustomerContactOperatingSessionRequest;
import org.museframework.bian.contacthandler.dto.ExecuteCustomerContactOperatingSessionResponse;
import org.museframework.bian.contacthandler.dto.InitiateCustomerContactOperatingSessionRequest;
import org.museframework.bian.contacthandler.dto.InitiateCustomerContactOperatingSessionResponse;
import org.museframework.bian.contacthandler.dto.RequestCustomerContactOperatingSessionRequest;
import org.museframework.bian.contacthandler.dto.RequestCustomerContactOperatingSessionResponse;
import org.museframework.bian.contacthandler.dto.RetrieveCustomerContactOperatingSessionRequest;
import org.museframework.bian.contacthandler.dto.RetrieveCustomerContactOperatingSessionResponse;
import org.museframework.bian.contacthandler.dto.UpdateCustomerContactOperatingSessionRequest;
import org.museframework.bian.contacthandler.dto.UpdateCustomerContactOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Contact Handler. ")
@GenericDomain(name="ContactHandler", group="CustomerContactOperatingSession")
public interface CrCustomerContactOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate a contact (can be inbound or outbound)")
    InitiateCustomerContactOperatingSessionResponse initiateCustomerContactOperatingSession(InitiateCustomerContactOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for a customer contact")
    UpdateCustomerContactOperatingSessionResponse updateCustomerContactOperatingSession(UpdateCustomerContactOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task for a contact (e.g. route to specialist)")
    ExecuteCustomerContactOperatingSessionResponse executeCustomerContactOperatingSession(ExecuteCustomerContactOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in a contact (e.g. override routing decision)")
    RequestCustomerContactOperatingSessionResponse requestCustomerContactOperatingSession(RequestCustomerContactOperatingSessionRequest req);

    @Description("ReCR Retrieve details about a customer contact")
    RetrieveCustomerContactOperatingSessionResponse retrieveCustomerContactOperatingSession(RetrieveCustomerContactOperatingSessionRequest req);
}