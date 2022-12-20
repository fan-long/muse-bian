package org.museframework.bian.legentdir;

import org.museframework.bian.legentdir.dto.RetrieveReferenceRequest;
import org.museframework.bian.legentdir.dto.RetrieveReferenceResponse;
import org.museframework.bian.legentdir.dto.UpdateReferenceRequest;
import org.museframework.bian.legentdir.dto.UpdateReferenceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="LegalEntityDirectory", group="Reference")
public interface BqReference {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a reference entry for the legal entity")
    UpdateReferenceResponse updateReference(UpdateReferenceRequest req);

    @Description("ReBQ Retrieve details about reference entries in the directory record")
    RetrieveReferenceResponse retrieveReference(RetrieveReferenceRequest req);
}