package org.museframework.bian.legentdir;

import org.museframework.bian.legentdir.dto.RetrieveAssociationsRequest;
import org.museframework.bian.legentdir.dto.RetrieveAssociationsResponse;
import org.museframework.bian.legentdir.dto.UpdateAssociationsRequest;
import org.museframework.bian.legentdir.dto.UpdateAssociationsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="LegalEntityDirectory", group="Associations")
public interface BqAssociations {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about an association entry for the legal entity")
    UpdateAssociationsResponse updateAssociations(UpdateAssociationsRequest req);

    @Description("ReBQ Retrieve details about association entries in the directory record")
    RetrieveAssociationsResponse retrieveAssociations(RetrieveAssociationsRequest req);
}