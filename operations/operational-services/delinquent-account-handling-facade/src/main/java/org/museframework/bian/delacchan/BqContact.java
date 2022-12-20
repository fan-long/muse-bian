package org.museframework.bian.delacchan;

import org.museframework.bian.delacchan.dto.InitiateContactRequest;
import org.museframework.bian.delacchan.dto.InitiateContactResponse;
import org.museframework.bian.delacchan.dto.RequestContactRequest;
import org.museframework.bian.delacchan.dto.RequestContactResponse;
import org.museframework.bian.delacchan.dto.RetrieveContactRequest;
import org.museframework.bian.delacchan.dto.RetrieveContactResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="DelinquentAccountHandling", group="Contact")
public interface BqContact {
    @GenericDtxEndpoint
    @Description("InBQ Initiate contact with the customer for a delinquent account")
    InitiateContactResponse initiateContact(InitiateContactRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request contact processing for an active delinquent account procedure")
    RequestContactResponse requestContact(RequestContactRequest req);

    @Description("ReBQ Retrieve details about a contact")
    RetrieveContactResponse retrieveContact(RetrieveContactRequest req);
}