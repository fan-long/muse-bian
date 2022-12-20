package org.museframework.bian.parlifman;

import org.museframework.bian.parlifman.dto.RetrieveQualificationRequest;
import org.museframework.bian.parlifman.dto.RetrieveQualificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="PartyLifecycleManagement", group="Qualification")
public interface BqQualification {
    @Description("ReBQ Retrieve details about a party qualification procedure")
    RetrieveQualificationResponse retrieveQualification(RetrieveQualificationRequest req);
}