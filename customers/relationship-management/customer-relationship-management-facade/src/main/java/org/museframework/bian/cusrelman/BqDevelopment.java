package org.museframework.bian.cusrelman;

import org.museframework.bian.cusrelman.dto.CreateDevelopmentRequest;
import org.museframework.bian.cusrelman.dto.CreateDevelopmentResponse;
import org.museframework.bian.cusrelman.dto.RequestDevelopmentRequest;
import org.museframework.bian.cusrelman.dto.RequestDevelopmentResponse;
import org.museframework.bian.cusrelman.dto.RetrieveDevelopmentRequest;
import org.museframework.bian.cusrelman.dto.RetrieveDevelopmentResponse;
import org.museframework.bian.cusrelman.dto.UpdateDevelopmentRequest;
import org.museframework.bian.cusrelman.dto.UpdateDevelopmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CustomerRelationshipManagement", group="Development")
public interface BqDevelopment {
    @GenericDtxEndpoint
    @Description("CrBQ Create customer development capability  (initialize the capability)")
    CreateDevelopmentResponse createDevelopment(CreateDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about a relationship development task")
    UpdateDevelopmentResponse updateDevelopment(UpdateDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request a relationship development task")
    RequestDevelopmentResponse requestDevelopment(RequestDevelopmentRequest req);

    @Description("ReBQ Retrieve details about relationship development activity")
    RetrieveDevelopmentResponse retrieveDevelopment(RetrieveDevelopmentRequest req);
}