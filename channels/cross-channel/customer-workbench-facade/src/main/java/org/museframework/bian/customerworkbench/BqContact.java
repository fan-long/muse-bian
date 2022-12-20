package org.museframework.bian.customerworkbench;

import org.museframework.bian.customerworkbench.dto.ExecuteContactRequest;
import org.museframework.bian.customerworkbench.dto.ExecuteContactResponse;
import org.museframework.bian.customerworkbench.dto.InitiateContactRequest;
import org.museframework.bian.customerworkbench.dto.InitiateContactResponse;
import org.museframework.bian.customerworkbench.dto.RequestContactRequest;
import org.museframework.bian.customerworkbench.dto.RequestContactResponse;
import org.museframework.bian.customerworkbench.dto.RetrieveContactRequest;
import org.museframework.bian.customerworkbench.dto.RetrieveContactResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CustomerWorkbench", group="Contact")
public interface BqContact {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a contact with the bank")
    InitiateContactResponse initiateContact(InitiateContactRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action within the contact (e.g. self serve)")
    ExecuteContactResponse executeContact(ExecuteContactRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a contact (e.g. request service)")
    RequestContactResponse requestContact(RequestContactRequest req);

    @Description("ReBQ Retrieve details about a contact")
    RetrieveContactResponse retrieveContact(RetrieveContactRequest req);
}