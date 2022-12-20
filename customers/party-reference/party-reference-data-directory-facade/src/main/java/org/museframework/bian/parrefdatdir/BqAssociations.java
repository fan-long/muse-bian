package org.museframework.bian.parrefdatdir;

import org.museframework.bian.parrefdatdir.dto.RetrieveAssociationsRequest;
import org.museframework.bian.parrefdatdir.dto.RetrieveAssociationsResponse;
import org.museframework.bian.parrefdatdir.dto.UpdateAssociationsRequest;
import org.museframework.bian.parrefdatdir.dto.UpdateAssociationsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="PartyReferenceDataDirectory", group="Associations")
public interface BqAssociations {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about an association entry for the customer")
    UpdateAssociationsResponse updateAssociations(UpdateAssociationsRequest req);

    @Description("ReBQ Retrieve details about association entries in the directory record")
    RetrieveAssociationsResponse retrieveAssociations(RetrieveAssociationsRequest req);
}