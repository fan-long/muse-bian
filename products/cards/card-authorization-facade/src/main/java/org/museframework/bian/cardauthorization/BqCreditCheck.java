package org.museframework.bian.cardauthorization;

import org.museframework.bian.cardauthorization.dto.RetrieveCreditCheckRequest;
import org.museframework.bian.cardauthorization.dto.RetrieveCreditCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="CardAuthorization", group="CreditCheck")
public interface BqCreditCheck {
    @Description("ReBQ Retrieve details about the credit check")
    RetrieveCreditCheckResponse retrieveCreditCheck(RetrieveCreditCheckRequest req);
}