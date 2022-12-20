package org.museframework.bian.parrefdatdir;

import org.museframework.bian.parrefdatdir.dto.RetrieveReferenceRequest;
import org.museframework.bian.parrefdatdir.dto.RetrieveReferenceResponse;
import org.museframework.bian.parrefdatdir.dto.UpdateReferenceRequest;
import org.museframework.bian.parrefdatdir.dto.UpdateReferenceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="PartyReferenceDataDirectory", group="Reference")
public interface BqReference {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a reference entry for the customer")
    UpdateReferenceResponse updateReference(UpdateReferenceRequest req);

    @Description("ReBQ Retrieve details about reference entries in the directory")
    RetrieveReferenceResponse retrieveReference(RetrieveReferenceRequest req);
}