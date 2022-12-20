package org.museframework.bian.legentdir;

import org.museframework.bian.legentdir.dto.RetrieveProfileRequest;
import org.museframework.bian.legentdir.dto.RetrieveProfileResponse;
import org.museframework.bian.legentdir.dto.UpdateProfileRequest;
import org.museframework.bian.legentdir.dto.UpdateProfileResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="LegalEntityDirectory", group="Profile")
public interface BqProfile {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a profile entry for the legal entity")
    UpdateProfileResponse updateProfile(UpdateProfileRequest req);

    @Description("ReBQ Retrieve details about profile entries in the directory record")
    RetrieveProfileResponse retrieveProfile(RetrieveProfileRequest req);
}