package org.museframework.bian.proquaass;

import org.museframework.bian.proquaass.dto.InitiateUsabilityChecksRequest;
import org.museframework.bian.proquaass.dto.InitiateUsabilityChecksResponse;
import org.museframework.bian.proquaass.dto.RetrieveUsabilityChecksRequest;
import org.museframework.bian.proquaass.dto.RetrieveUsabilityChecksResponse;
import org.museframework.bian.proquaass.dto.UpdateUsabilityChecksRequest;
import org.museframework.bian.proquaass.dto.UpdateUsabilityChecksResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductQualityAssurance", group="UsabilityChecks")
public interface BqUsabilityChecks {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Usability Checks")
    InitiateUsabilityChecksResponse initiateUsabilityChecks(InitiateUsabilityChecksRequest req);

    @Description("ReBQ Retrieve details about any aspect of Usability Checks")
    RetrieveUsabilityChecksResponse retrieveUsabilityChecks(RetrieveUsabilityChecksRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Usability Checks")
    UpdateUsabilityChecksResponse updateUsabilityChecks(UpdateUsabilityChecksRequest req);
}