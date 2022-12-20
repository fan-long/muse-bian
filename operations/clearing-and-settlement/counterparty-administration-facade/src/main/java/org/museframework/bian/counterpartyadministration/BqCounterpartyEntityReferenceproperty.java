package org.museframework.bian.counterpartyadministration;

import org.museframework.bian.counterpartyadministration.dto.ExecuteCounterpartyEntityReferencepropertyRequest;
import org.museframework.bian.counterpartyadministration.dto.ExecuteCounterpartyEntityReferencepropertyResponse;
import org.museframework.bian.counterpartyadministration.dto.NotifyCounterpartyEntityReferencepropertyRequest;
import org.museframework.bian.counterpartyadministration.dto.NotifyCounterpartyEntityReferencepropertyResponse;
import org.museframework.bian.counterpartyadministration.dto.RegisterCounterpartyEntityReferencepropertyRequest;
import org.museframework.bian.counterpartyadministration.dto.RegisterCounterpartyEntityReferencepropertyResponse;
import org.museframework.bian.counterpartyadministration.dto.RequestCounterpartyEntityReferencepropertyRequest;
import org.museframework.bian.counterpartyadministration.dto.RequestCounterpartyEntityReferencepropertyResponse;
import org.museframework.bian.counterpartyadministration.dto.RetrieveCounterpartyEntityReferencepropertyRequest;
import org.museframework.bian.counterpartyadministration.dto.RetrieveCounterpartyEntityReferencepropertyResponse;
import org.museframework.bian.counterpartyadministration.dto.UpdateCounterpartyEntityReferencepropertyRequest;
import org.museframework.bian.counterpartyadministration.dto.UpdateCounterpartyEntityReferencepropertyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Counterparty Entity Reference property properties that represent a discrete aspect of the Counterparty Entity Reference property")
@GenericDomain(name="CounterpartyAdministration", group="CounterpartyEntityReferenceproperty")
public interface BqCounterpartyEntityReferenceproperty {
    @GenericDtxEndpoint
    @Description("Execute Counterparty Entity Reference property")
    ExecuteCounterpartyEntityReferencepropertyResponse executeCounterpartyEntityReferenceproperty(ExecuteCounterpartyEntityReferencepropertyRequest req);

    @Description("Notify Counterparty Entity Reference property")
    NotifyCounterpartyEntityReferencepropertyResponse notifyCounterpartyEntityReferenceproperty(NotifyCounterpartyEntityReferencepropertyRequest req);

    @GenericDtxEndpoint
    @Description("Register Counterparty Entity Reference property")
    RegisterCounterpartyEntityReferencepropertyResponse registerCounterpartyEntityReferenceproperty(RegisterCounterpartyEntityReferencepropertyRequest req);

    @GenericDtxEndpoint
    @Description("Request Counterparty Entity Reference property")
    RequestCounterpartyEntityReferencepropertyResponse requestCounterpartyEntityReferenceproperty(RequestCounterpartyEntityReferencepropertyRequest req);

    @Description("Retrieve Counterparty Entity Reference property")
    RetrieveCounterpartyEntityReferencepropertyResponse retrieveCounterpartyEntityReferenceproperty(RetrieveCounterpartyEntityReferencepropertyRequest req);

    @GenericDtxEndpoint
    @Description("Update Counterparty Entity Reference property")
    UpdateCounterpartyEntityReferencepropertyResponse updateCounterpartyEntityReferenceproperty(UpdateCounterpartyEntityReferencepropertyRequest req);
}