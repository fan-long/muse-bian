package org.museframework.bian.cusaccent;

import org.museframework.bian.cusaccent.dto.EvaluateRestrictionsRequest;
import org.museframework.bian.cusaccent.dto.EvaluateRestrictionsResponse;
import org.museframework.bian.cusaccent.dto.RetrieveRestrictionsRequest;
import org.museframework.bian.cusaccent.dto.RetrieveRestrictionsResponse;
import org.museframework.bian.cusaccent.dto.UpdateRestrictionsRequest;
import org.museframework.bian.cusaccent.dto.UpdateRestrictionsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="CustomerAccessEntitlement", group="Restrictions")
public interface BqRestrictions {
    @GenericDtxEndpoint
    @Description("EvBQ Establish restrictions for the access profile agreement")
    EvaluateRestrictionsResponse evaluateRestrictions(EvaluateRestrictionsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for the restrictions in the agreement")
    UpdateRestrictionsResponse updateRestrictions(UpdateRestrictionsRequest req);

    @Description("ReBQ Retrieve details about the restrictions in the agreement")
    RetrieveRestrictionsResponse retrieveRestrictions(RetrieveRestrictionsRequest req);
}