package org.museframework.bian.proquaass;

import org.museframework.bian.proquaass.dto.InitiateProcessingErrorandIntegrityChecksRequest;
import org.museframework.bian.proquaass.dto.InitiateProcessingErrorandIntegrityChecksResponse;
import org.museframework.bian.proquaass.dto.RetrieveProcessingErrorandIntegrityChecksRequest;
import org.museframework.bian.proquaass.dto.RetrieveProcessingErrorandIntegrityChecksResponse;
import org.museframework.bian.proquaass.dto.UpdateProcessingErrorandIntegrityChecksRequest;
import org.museframework.bian.proquaass.dto.UpdateProcessingErrorandIntegrityChecksResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductQualityAssurance", group="ProcessingErrorandIntegrityChecks")
public interface BqProcessingErrorandIntegrityChecks {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Processing Error and Integrity Checks")
    InitiateProcessingErrorandIntegrityChecksResponse initiateProcessingErrorandIntegrityChecks(InitiateProcessingErrorandIntegrityChecksRequest req);

    @Description("ReBQ Retrieve details about any aspect of Processing Error and Integrity Checks")
    RetrieveProcessingErrorandIntegrityChecksResponse retrieveProcessingErrorandIntegrityChecks(RetrieveProcessingErrorandIntegrityChecksRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Processing Error and Integrity Checks")
    UpdateProcessingErrorandIntegrityChecksResponse updateProcessingErrorandIntegrityChecks(UpdateProcessingErrorandIntegrityChecksRequest req);
}