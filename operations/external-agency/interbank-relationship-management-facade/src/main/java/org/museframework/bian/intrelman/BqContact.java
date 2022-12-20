package org.museframework.bian.intrelman;

import org.museframework.bian.intrelman.dto.CreateContactRequest;
import org.museframework.bian.intrelman.dto.CreateContactResponse;
import org.museframework.bian.intrelman.dto.RequestContactRequest;
import org.museframework.bian.intrelman.dto.RequestContactResponse;
import org.museframework.bian.intrelman.dto.RetrieveContactRequest;
import org.museframework.bian.intrelman.dto.RetrieveContactResponse;
import org.museframework.bian.intrelman.dto.UpdateContactRequest;
import org.museframework.bian.intrelman.dto.UpdateContactResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="InterbankRelationshipManagement", group="Contact")
public interface BqContact {
    @GenericDtxEndpoint
    @Description("CrBQ Create a bank contact")
    CreateContactResponse createContact(CreateContactRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about the bank contact schedule or a contact record")
    UpdateContactResponse updateContact(UpdateContactRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention with the bank relationship")
    RequestContactResponse requestContact(RequestContactRequest req);

    @Description("ReBQ Retrieve details about the contact schedule or specific contacts")
    RetrieveContactResponse retrieveContact(RetrieveContactRequest req);
}