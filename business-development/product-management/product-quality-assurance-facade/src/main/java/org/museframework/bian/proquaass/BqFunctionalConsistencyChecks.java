package org.museframework.bian.proquaass;

import org.museframework.bian.proquaass.dto.InitiateFunctionalConsistencyChecksRequest;
import org.museframework.bian.proquaass.dto.InitiateFunctionalConsistencyChecksResponse;
import org.museframework.bian.proquaass.dto.RetrieveFunctionalConsistencyChecksRequest;
import org.museframework.bian.proquaass.dto.RetrieveFunctionalConsistencyChecksResponse;
import org.museframework.bian.proquaass.dto.UpdateFunctionalConsistencyChecksRequest;
import org.museframework.bian.proquaass.dto.UpdateFunctionalConsistencyChecksResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductQualityAssurance", group="FunctionalConsistencyChecks")
public interface BqFunctionalConsistencyChecks {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Functional Consistency Checks")
    InitiateFunctionalConsistencyChecksResponse initiateFunctionalConsistencyChecks(InitiateFunctionalConsistencyChecksRequest req);

    @Description("ReBQ Retrieve details about any aspect of Functional Consistency Checks")
    RetrieveFunctionalConsistencyChecksResponse retrieveFunctionalConsistencyChecks(RetrieveFunctionalConsistencyChecksRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Functional Consistency Checks")
    UpdateFunctionalConsistencyChecksResponse updateFunctionalConsistencyChecks(UpdateFunctionalConsistencyChecksRequest req);
}