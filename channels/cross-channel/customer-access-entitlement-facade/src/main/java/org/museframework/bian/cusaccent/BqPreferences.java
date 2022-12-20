package org.museframework.bian.cusaccent;

import org.museframework.bian.cusaccent.dto.EvaluatePreferencesRequest;
import org.museframework.bian.cusaccent.dto.EvaluatePreferencesResponse;
import org.museframework.bian.cusaccent.dto.RetrievePreferencesRequest;
import org.museframework.bian.cusaccent.dto.RetrievePreferencesResponse;
import org.museframework.bian.cusaccent.dto.UpdatePreferencesRequest;
import org.museframework.bian.cusaccent.dto.UpdatePreferencesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="CustomerAccessEntitlement", group="Preferences")
public interface BqPreferences {
    @GenericDtxEndpoint
    @Description("EvBQ Establish preferences for the access profile agreement")
    EvaluatePreferencesResponse evaluatePreferences(EvaluatePreferencesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for the preferences in the agreement")
    UpdatePreferencesResponse updatePreferences(UpdatePreferencesRequest req);

    @Description("ReBQ Retrieve details about the preferences in the agreement")
    RetrievePreferencesResponse retrievePreferences(RetrievePreferencesRequest req);
}