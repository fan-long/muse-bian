package org.museframework.bian.cusrelman;

import org.museframework.bian.cusrelman.dto.CreateContactRequest;
import org.museframework.bian.cusrelman.dto.CreateContactResponse;
import org.museframework.bian.cusrelman.dto.RequestContactRequest;
import org.museframework.bian.cusrelman.dto.RequestContactResponse;
import org.museframework.bian.cusrelman.dto.RetrieveContactRequest;
import org.museframework.bian.cusrelman.dto.RetrieveContactResponse;
import org.museframework.bian.cusrelman.dto.UpdateContactRequest;
import org.museframework.bian.cusrelman.dto.UpdateContactResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CustomerRelationshipManagement", group="Contact")
public interface BqContact {
    @GenericDtxEndpoint
    @Description("CrBQ Create contact handling capability (initialize and track)")
    CreateContactResponse createContact(CreateContactRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a customer contact")
    UpdateContactResponse updateContact(UpdateContactRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request a customer contact")
    RequestContactResponse requestContact(RequestContactRequest req);

    @Description("ReBQ Retrieve details about customer contacts")
    RetrieveContactResponse retrieveContact(RetrieveContactRequest req);
}