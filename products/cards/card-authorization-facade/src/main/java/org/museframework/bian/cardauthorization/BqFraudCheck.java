package org.museframework.bian.cardauthorization;

import org.museframework.bian.cardauthorization.dto.RetrieveFraudCheckRequest;
import org.museframework.bian.cardauthorization.dto.RetrieveFraudCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="CardAuthorization", group="FraudCheck")
public interface BqFraudCheck {
    @Description("ReBQ Retrieve details about the fraud check")
    RetrieveFraudCheckResponse retrieveFraudCheck(RetrieveFraudCheckRequest req);
}